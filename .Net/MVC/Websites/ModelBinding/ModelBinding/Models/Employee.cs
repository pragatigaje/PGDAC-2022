using System.Data.SqlClient;
using System.Data;

namespace ModelBinding.Models
{
    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public static List<Employee> GetAlEmployees()
        {
        SqlConnection cn = new SqlConnection();
        cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";
        List<Employee> list = new List<Employee>();
        try
        {
            cn.Open();

            Employee emp = new Employee();
            SqlCommand cmdSingleVal = new SqlCommand();
            cmdSingleVal.Connection = cn;
            cmdSingleVal.CommandType = CommandType.Text;
            cmdSingleVal.CommandText = "select * from Employees";

            SqlDataReader dr = cmdSingleVal.ExecuteReader();

            while (dr.Read())
            {
                emp = new Employee() { EmpNo = dr.GetInt32(0), Name = dr.GetString(1), Basic = dr.GetDecimal(2), DeptNo = dr.GetInt32(3) };
                list.Add(emp);
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
        return list;
        }
        public static Employee GetSingleEmployee(int id)
    {
        Employee emp = null;
        SqlConnection cn = new SqlConnection();
        cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";
        try
        {
            cn.Open();
            SqlCommand cmdSingleVal = new SqlCommand();
            cmdSingleVal.Connection = cn;
            cmdSingleVal.CommandType = CommandType.Text;
            cmdSingleVal.CommandText = "select * from Employees where EmpNo = @id";
            cmdSingleVal.Parameters.AddWithValue("id", id);

            SqlDataReader dr = cmdSingleVal.ExecuteReader();
                
            if(dr!=null)
            {
                while (dr.Read())
                {
                    emp = new Employee() { EmpNo = dr.GetInt32(0), Name = dr.GetString(1), Basic = dr.GetDecimal(2), DeptNo = dr.GetInt32(3) } ;
                }
            }
            else
            {
                emp = null;
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
        return emp;
    }
        public static void InsertEmployee(Employee obj)
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
            }
            catch (Exception)
            {
                throw;
            }
            finally
            {
                cn.Close();
            }

        }
        public static void UpdateEmployee(Employee obj)
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
        public static void DeleteEmployee(int EmpNo)
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
