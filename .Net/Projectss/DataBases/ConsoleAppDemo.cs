using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Data.SqlClient;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataBases
{
    internal class ConsoleAppDemo
    {
        static DataSet ds;
        public static void Main()
        {
            Console.WriteLine("Enter Operation to be perform : ");
            Console.WriteLine("1.Insert 2.Update 3.Delete 4.Display");
            int ch = int.Parse(Console.ReadLine());
            
            switch(ch)
            {
                case 1:
                    //InsertEmployee();
                    break;
                case 2:
                    //UpdateEmployee();
                    break;
                case 3:
                    //DeleteEmployee();
                    break;
                case 4:
                    Display(ds);
                    break;
                default: 
                    Console.WriteLine("Invalid Choice");
                    break;
            }
        }

        public static void Display(DataSet ds)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True;";
            try
            {
                cn.Open();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = cn;
                cmd.CommandType = System.Data.CommandType.Text;

                SqlDataAdapter da = new SqlDataAdapter();
                da.SelectCommand = cmd;

                ds = new DataSet();

                cmd.CommandText = "select * from Employees";
                da.Fill(ds, "Emps");

                //cmd.CommandText = "select * from Departments";
                //da.Fill(ds,"Deps");

                //primary key constraint
                DataColumn[] arrCols = new DataColumn[1];
                arrCols[0] = ds.Tables["Emps"].Columns["EmpNo"];
                ds.Tables["Emps"].PrimaryKey = arrCols;


                //column level constraint
                //ds.Tables["Deps"].Columns["DeptName"].Unique = true;

                Console.WriteLine(ds.Tables[0].Rows[1]);
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

        public static void DeleteEmployee()
        {
            throw new NotImplementedException();
        }

        public static void UpdateEmployee()
        {
            throw new NotImplementedException();
        }

        public static void InsertEmployee()
        {
            throw new NotImplementedException();
        }
    }
}
