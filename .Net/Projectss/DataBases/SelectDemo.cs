using System;
using System.Collections.Generic;
using System.Data.SqlClient;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataBases
{
    internal class SelectDemo
    {
        public static void Main3()
        {
            //SingleValue();
            //MultipleValues();

            /*
            Employee e1 = GetSingleValueWithDataReader(10);
            if (e1 != null)
                Console.WriteLine(e1.ToString());
            else
                Console.WriteLine("Invalid EmpNo");
            */

            //GetMultipleResultsValueWithDataReader();

            MARS();

            Transactions(); 
        }

        public static void SingleValue()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmdSingleVal= new SqlCommand();
                cmdSingleVal.Connection = cn;
                cmdSingleVal.CommandType = CommandType.Text;
                //cmdSingleVal.CommandText = "select * from Employees";
                //cmdSingleVal.CommandText = "select * from Employees where EmpNo = 1";
                cmdSingleVal.CommandText = "select count(*) from Employees";

                object retVal = cmdSingleVal.ExecuteScalar();
                Console.WriteLine(retVal);
                Console.WriteLine("Okay!");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }
        public static void MultipleValues()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmdSingleVal = new SqlCommand();
                cmdSingleVal.Connection = cn;
                cmdSingleVal.CommandType = CommandType.Text;
                cmdSingleVal.CommandText = "select * from Employees";

                SqlDataReader dr = cmdSingleVal.ExecuteReader();
                
                while(dr.Read())
                {
                    //object
                    Console.WriteLine(dr["EmpNo"]+" " + dr["Name"]+"    " + dr["Basic"]+"   " + dr["DeptNo"]);

                    //specific data type
                    //Console.WriteLine(dr.GetString(1));
                }
                dr.Close();
                Console.WriteLine("Okay!");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }
        public static Employee GetSingleValueWithDataReader(int EmpNo)
        {
            Employee emp = new Employee();
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = cn;
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "select * from Employees where EmpNo = @EmpNo";
                cmd.Parameters.AddWithValue("EmpNo", EmpNo);

                SqlDataReader dr = cmd.ExecuteReader();

                if(dr.Read())
                {
                    emp.EmpNo = dr.GetInt32("EmpNo");
                    emp.Name = dr.GetString("Name");
                    emp.Basic = dr.GetDecimal("Basic");
                    emp.DeptNo = dr.GetInt32("DeptNO");
                }
                else
                {
                    Console.WriteLine("Employee Not Found!");
                    emp = null;
                }
                dr.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
            return emp;
        }
        public static void GetMultipleResultsValueWithDataReader()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = cn;
                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "select * from Employees; select * from Departments;";

                SqlDataReader dr = cmd.ExecuteReader();
                while(dr.Read())
                {
                    Console.WriteLine(dr["EmpNo"] + " " + dr["Name"] + "    " + dr["Basic"] + "   " + dr["DeptNo"]);
                }
                //moves to next resukt return true or false
                dr.NextResult();
                while (dr.Read())
                {
                    Console.WriteLine(dr["DeptNo"] + "    " + dr["DeptName"]);
                }

                dr.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }
        public static void MARS()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MsSqlLocalDb;Initial Catalog=JkJan23;Integrated Security=true;MultipleActiveResultSets=true;";
            cn.Open();

            SqlCommand cmdDepts = new SqlCommand();
            cmdDepts.Connection = cn;
            cmdDepts.CommandType = CommandType.Text;
            cmdDepts.CommandText = "Select * from Departments";

            SqlCommand cmdEmps = new SqlCommand();
            cmdEmps.Connection = cn;
            cmdEmps.CommandType = CommandType.Text;

            SqlDataReader drDepts = cmdDepts.ExecuteReader();
            while (drDepts.Read())
            {
                Console.WriteLine((drDepts["DeptName"]));

                cmdEmps.CommandText = "Select * from Employees where DeptNo = " + drDepts["DeptNo"];
                SqlDataReader drEmps = cmdEmps.ExecuteReader();
                while (drEmps.Read())
                {
                    Console.WriteLine(("    " + drEmps["Name"]));
                }
                drEmps.Close();
            }
            drDepts.Close();
            cn.Close();
        }
        static void Transactions()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JKJan23;Integrated Security=True";
            cn.Open();
            SqlTransaction t = cn.BeginTransaction();

            SqlCommand cmdInsert = new SqlCommand();
            cmdInsert.Connection = cn;
            cmdInsert.Transaction = t;

            cmdInsert.CommandType = System.Data.CommandType.Text;
            cmdInsert.CommandText = "insert into Employees values(10, 'Shweta', 12345, 30)";

            SqlCommand cmdInsert2 = new SqlCommand();
            cmdInsert2.Connection = cn;
            cmdInsert2.Transaction = t;

            cmdInsert2.CommandType = System.Data.CommandType.Text;
            cmdInsert2.CommandText = "insert into Employees values(1, 'Shweta', 12345, 30)";
            try
            {
                cmdInsert.ExecuteNonQuery();

                cmdInsert2.ExecuteNonQuery();
                t.Commit();
                Console.WriteLine("no errors- commit");
            }
            catch (Exception ex)
            {
                t.Rollback();
                Console.WriteLine("Rollback");
                Console.WriteLine(ex.Message);
            }
            cn.Close();

        }





    } 
}
