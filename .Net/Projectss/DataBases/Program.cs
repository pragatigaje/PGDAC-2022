using System.Data;
using System.Data.SqlClient;

namespace DataBases
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            //connect();
            //insert();

            //Employee obj = new Employee { EmpNo = 5, Name = "Nikita", Basic = 40500, DeptNo = 20 };
            //insertEmployee(obj);

            //Employee obj = new Employee { EmpNo = 6, Name = "Nikhil", Basic = 30500, DeptNo = 30 };
            //insertEmployeeWithParameters(obj);

            Employee obj = new Employee { EmpNo = 7, Name = "Shri", Basic = 25500, DeptNo = 30 };
            insertEmployeeWithParameters(obj);
        }
        static void Main2(string[] args)
        {
            Employee obj = new Employee { EmpNo = 7, Name = "SHRI", Basic = 25500, DeptNo = 30 };
            //updateEmployeeWithParameters(obj);
            //updateEmployeeWithParameters(obj);

            //deleteEmployeeWithParameters(6);
            //deletetWithStoredProcedure(7);
        }

        public static void connect()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally 
            { 
                cn.Close(); 
            }
                      
        }
        public static void insert()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmdinsert = new SqlCommand();
                cmdinsert.Connection= cn;
                cmdinsert.CommandType = CommandType.Text;
                cmdinsert.CommandText = "insert into Employees values (4,'Sneha', 50000.0, 30)";

                cmdinsert.ExecuteNonQuery();
                Console.WriteLine("Value inserted Suceessfully!");
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
        public static void insertEmployee(Employee obj)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmdinsert = new SqlCommand();
                cmdinsert.Connection = cn;
                cmdinsert.CommandType = CommandType.Text;
                cmdinsert.CommandText = $"insert into Employees values ({obj.EmpNo},'{obj.Name}',{obj.Basic},{obj.DeptNo})";

                cmdinsert.ExecuteNonQuery();
                Console.WriteLine("Value inserted Suceessfully!");
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
        public static void insertEmployeeWithParameters(Employee obj)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmdinsert = new SqlCommand();
                cmdinsert.Connection = cn;
                cmdinsert.CommandType = CommandType.Text;
                cmdinsert.CommandText = "insert into Employees values(@EmpNo,@Name,@Basic,@DeptNo)";
                cmdinsert.Parameters.AddWithValue("EmpNo", obj.EmpNo);
                cmdinsert.Parameters.AddWithValue("Name", obj.Name);
                cmdinsert.Parameters.AddWithValue("Basic", obj.Basic);
                cmdinsert.Parameters.AddWithValue("DeptNo", obj.DeptNo);

                cmdinsert.ExecuteNonQuery();
                Console.WriteLine("Value inserted Suceessfully!");
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
        public static void insertWithStoredProcedure(Employee obj)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmdinsert = new SqlCommand();
                cmdinsert.Connection = cn;
                cmdinsert.CommandType = CommandType.StoredProcedure;
                cmdinsert.CommandText = "InsertEmployee";
                cmdinsert.Parameters.AddWithValue("EmpNo", obj.EmpNo);
                cmdinsert.Parameters.AddWithValue("Name", obj.Name);
                cmdinsert.Parameters.AddWithValue("Basic", obj.Basic);
                cmdinsert.Parameters.AddWithValue("DeptNo", obj.DeptNo);

                cmdinsert.ExecuteNonQuery();
                Console.WriteLine("Value inserted Suceessfully!");
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
        public static void updateEmployeeWithParameters(Employee obj)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmdupdate = new SqlCommand();
                cmdupdate.Connection = cn;
                cmdupdate.CommandType = CommandType.Text;
                cmdupdate.CommandText = "update Employees set Name = @Name, Basic = @Basic , DeptNo = @DeptNo where EmpNo=@EmpNo";
                cmdupdate.Parameters.AddWithValue("EmpNo", obj.EmpNo);
                cmdupdate.Parameters.AddWithValue("Name", obj.Name);
                cmdupdate.Parameters.AddWithValue("Basic", obj.Basic);
                cmdupdate.Parameters.AddWithValue("DeptNo", obj.DeptNo);

                cmdupdate.ExecuteNonQuery();
                Console.WriteLine("Value Updated Suceessfully!");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.StackTrace);
            }
            finally
            {
                cn.Close();
            }

        }
        public static void updatetWithStoredProcedure(Employee obj)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmdupdate = new SqlCommand();
                cmdupdate.Connection = cn;
                cmdupdate.CommandType = CommandType.StoredProcedure;
                cmdupdate.CommandText = "UpdateEmployee";
                cmdupdate.Parameters.AddWithValue("EmpNo", obj.EmpNo);
                cmdupdate.Parameters.AddWithValue("Name", obj.Name);
                cmdupdate.Parameters.AddWithValue("Basic", obj.Basic);
                cmdupdate.Parameters.AddWithValue("DeptNo", obj.DeptNo);

                cmdupdate.ExecuteNonQuery();
                Console.WriteLine("Value Updated Suceessfully!");
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
        public static void deleteEmployeeWithParameters(int EmpNo)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmdupdate = new SqlCommand();
                cmdupdate.Connection = cn;
                cmdupdate.CommandType = CommandType.Text;
                cmdupdate.CommandText = "delete from Employees where EmpNo=@EmpNo";
                cmdupdate.Parameters.AddWithValue("EmpNo",EmpNo);

                cmdupdate.ExecuteNonQuery();
                Console.WriteLine("Employee deleted Suceessfully!");
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
        public static void deletetWithStoredProcedure(int EmpNo)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";

            try
            {
                cn.Open();
                Console.WriteLine("Connection Established!");
                SqlCommand cmdupdate = new SqlCommand();
                cmdupdate.Connection = cn;
                cmdupdate.CommandType = CommandType.StoredProcedure;
                cmdupdate.CommandText = "DeleteEmployee";
                cmdupdate.Parameters.AddWithValue("EmpNo", EmpNo);

                cmdupdate.ExecuteNonQuery();
                Console.WriteLine("Employee Deleted Suceessfully!");
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

    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }

        public override string ToString()
        {
            return this.EmpNo + " " + this.Name + " " + this.Basic + " " + this.DeptNo;
        }
    }
}