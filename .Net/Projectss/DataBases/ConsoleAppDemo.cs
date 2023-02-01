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
            int i;
            do
            {
                Console.WriteLine("Enter Operation to be perform : ");
                Console.WriteLine("1.Insert 2.Update 3.Delete 4.Display");
                int ch = int.Parse(Console.ReadLine());
                i = 0;
            
                    switch (ch)
                    {
                        case 1:
                            InsertEmployee(ds);
                            break;
                        case 2:
                            UpdateEmployee(ds);
                            break;
                        case 3:
                            DeleteEmployee(ds);
                            break;
                        case 4:
                            Display(ds);
                            break;
                        default:
                            Console.WriteLine("Invalid Choice");
                            break;
                    }
                    Console.WriteLine("Enter 0 to continue");
                    i = int.Parse(Console.ReadLine());
            } while (i == 0);
            
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

                foreach (DataTable table in ds.Tables)
                {
                    foreach (DataRow row in table.Rows)
                    {
                        foreach (DataColumn column in table.Columns)
                        {
                            object item = row[column];
                            // read column and item
							Console.Write(item+"    |   ");
                        }
                        Console.WriteLine();
                    }
                }
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

        public static void DeleteEmployee(DataSet ds)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True;";
            Console.WriteLine("Enter empno to be deleted : ");
            int del = int.Parse(Console.ReadLine());
            try
            {
                cn.Open();
                SqlCommand cmdDelete = new SqlCommand();
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = cn;
                cmd.CommandType = System.Data.CommandType.Text;
                SqlDataAdapter da;
                da = new SqlDataAdapter();
                da.SelectCommand = cmd;

                ds = new DataSet();

                cmd.CommandText = "select * from Employees";
                da.Fill(ds, "Emps");

                cmdDelete.Connection = cn;

                cmdDelete.CommandType = System.Data.CommandType.StoredProcedure;
                cmdDelete.CommandText = "DeleteEmployee";
                cmdDelete.Parameters.Add(new SqlParameter { ParameterName = "@EmpNo", SourceColumn = "EmpNo", SourceVersion = DataRowVersion.Original });

                DataRowCollection drc = ds.Tables["Emps"].Rows;

                foreach (DataRow dr in drc)
                {
                    if (Convert.ToInt32(dr["EmpNo"]) == del)
                    {

                        dr.Delete();
                        break;
                    }
                }
                da.DeleteCommand = cmdDelete;
                da.Update(ds, "Emps");

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

        public static void UpdateEmployee(DataSet ds)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True;";
            try
            {
                cn.Open();
                SqlCommand cmdUpdate = new SqlCommand();

                cmdUpdate.Connection = cn;

                cmdUpdate.CommandType = System.Data.CommandType.StoredProcedure;
                cmdUpdate.CommandText = "UpdateEmployee";

                cmdUpdate.Parameters.Add(new SqlParameter { ParameterName = "@Name", SourceColumn = "Name", SourceVersion = DataRowVersion.Current });
                cmdUpdate.Parameters.Add(new SqlParameter { ParameterName = "@Basic", SourceColumn = "Basic", SourceVersion = DataRowVersion.Current });
                cmdUpdate.Parameters.Add(new SqlParameter { ParameterName = "@DeptNo", SourceColumn = "DeptNo", SourceVersion = DataRowVersion.Current });
                cmdUpdate.Parameters.Add(new SqlParameter { ParameterName = "@EmpNo", SourceColumn = "EmpNo", SourceVersion = DataRowVersion.Original });

               
                SqlDataAdapter da = new SqlDataAdapter();
                da.UpdateCommand = cmdUpdate;

                da.Update(ds, "Emps");

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

        public static void InsertEmployee(DataSet ds)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True;";
            try
            {
                cn.Open();

                SqlCommand cmdInsert = new SqlCommand();
                cmdInsert.Connection = cn;
                SqlCommand cmd = new SqlCommand();
                cmd.Connection = cn;
                cmd.CommandType = System.Data.CommandType.Text;
                SqlDataAdapter da;
                da = new SqlDataAdapter();
                da.SelectCommand = cmd;

                ds = new DataSet();

                cmd.CommandText = "select * from Employees";
                da.Fill(ds, "Emps");

                cmdInsert.CommandType = System.Data.CommandType.StoredProcedure;
                cmdInsert.CommandText = "InsertEmployee";
                cmdInsert.Parameters.Add(new SqlParameter { ParameterName = "@Name", SourceColumn = "Name", SourceVersion = DataRowVersion.Current });
                cmdInsert.Parameters.Add(new SqlParameter { ParameterName = "@Basic", SourceColumn = "Basic", SourceVersion = DataRowVersion.Current });
                cmdInsert.Parameters.Add(new SqlParameter { ParameterName = "@DeptNo", SourceColumn = "DeptNo", SourceVersion = DataRowVersion.Current });
                cmdInsert.Parameters.Add(new SqlParameter { ParameterName = "@EmpNo", SourceColumn = "EmpNo", SourceVersion = DataRowVersion.Current });


                ds.Tables["Emp"].Rows.Add(new object[] { int.Parse(Console.ReadLine()), Console.ReadLine(), decimal.Parse(Console.ReadLine()), int.Parse(Console.ReadLine()) });
                
                da.InsertCommand = cmdInsert;
                da.Update(ds, "Emps");
                Console.WriteLine("Completed Insert Into Employees");

                cn.Close();

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
    }
}
