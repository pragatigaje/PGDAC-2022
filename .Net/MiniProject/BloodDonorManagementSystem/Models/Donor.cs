using System;
using System.Collections.Generic;
using System.Data;
using Microsoft.Data.SqlClient;

namespace BloodDonorManagementSystem.Models
{
    public partial class Donor
    {
        public int Id { get; set; }
        public string Username { get; set; } = null!;
        public string Name { get; set; } = null!;
        public string Password { get; set; } = null!;
        public string Gender { get; set; } = null!;
        public string Email { get; set; } = null!;
        public int Cityid { get; set; }
        public string Phone { get; set; } = null!;
        public string Bloodgroup { get; set; } = null!;
        public DateTime Dob { get; set; }
        public virtual City City { get; set; } = null!;

        public static List<Donor> GetAllDonors()
        {
            List<Donor> donors = new List<Donor>();
            using SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=DotNetProject;Integrated Security=True;";
            try
            {
                cn.Open();
                SqlCommand cmd = new SqlCommand("select * from Donors", cn);
                using (SqlDataReader reader = cmd.ExecuteReader())
                {
                    while (reader.Read())
                    {
                        donors.Add(new Donor
                        {
                            Id = reader.GetInt32(0),
                            Username = reader.GetString(1),
                            Name = reader.GetString(2),
                            Password = reader.GetString(3),
                            Gender = reader.GetString(4),
                            Email = reader.GetString(5),
                            Cityid = reader.GetInt32(6),
                            Phone = reader.GetString(7),
                            Bloodgroup = reader.GetString(8),
                            Dob = reader.GetDateTime(9)
                        });
                    }
                }
                return donors;
            }
            catch (Exception)
            {

                throw;
            }
        }
        public static Donor GetSingleDonor(int id)
        {
            Donor d = null;
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = "Data Source=(localdb)\\MSSQLLocalDB;Initial Catalog=JkJan23;Integrated Security=True";
            try
            {
                cn.Open();
                SqlCommand cmdSingleVal = new SqlCommand();
                cmdSingleVal.Connection = cn;
                cmdSingleVal.CommandType = CommandType.Text;
                cmdSingleVal.CommandText = "select * from Donors where id = @id";
                cmdSingleVal.Parameters.AddWithValue("id", id);

                SqlDataReader reader = cmdSingleVal.ExecuteReader();

                if (reader != null)
                {
                    while (reader.Read())
                    {
                        d = (new Donor
                        {
                            Id = reader.GetInt32(0),
                            Username = reader.GetString(1),
                            Name = reader.GetString(2),
                            Password = reader.GetString(3),
                            Gender = reader.GetString(4),
                            Email = reader.GetString(5),
                            Cityid = reader.GetInt32(6),
                            Phone = reader.GetString(7),
                            Bloodgroup = reader.GetString(8),
                            Dob = reader.GetDateTime(9)
                        });
                    }
                }
                else
                {
                    d = null;
                }

                reader.Close();
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
        public static void InsertDonor(Donor donor)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=DotNetProject;Integrated Security=True;";
            try
            {
                cn.Open();

                SqlCommand cmdInsert = new SqlCommand();
                cmdInsert.Connection = cn;
                cmdInsert.CommandType = CommandType.Text;
                cmdInsert.CommandText = "insert into Donors values (@id,@username, @name, @password, @gender, @email, @cityid, @phone, @bloodgroup, @dob)";
                cmdInsert.Parameters.AddWithValue("@Id", donor.Id);
                cmdInsert.Parameters.AddWithValue("@username", donor.Username);
                cmdInsert.Parameters.AddWithValue("@name", donor.Name);
                cmdInsert.Parameters.AddWithValue("Password", donor.Password);
                cmdInsert.Parameters.AddWithValue("@gender", donor.Gender);
                cmdInsert.Parameters.AddWithValue("@email", donor.Email);
                cmdInsert.Parameters.AddWithValue("@cityid", donor.Cityid);
                cmdInsert.Parameters.AddWithValue("@phone", donor.Phone);
                cmdInsert.Parameters.AddWithValue("@bloodgroup", donor.Bloodgroup);
                cmdInsert.Parameters.AddWithValue("@dob", donor.Dob);
                cmdInsert.ExecuteNonQuery();
            }
            catch
            {
                throw;
            }
            finally { cn.Close(); }
        }
        public static void UpdateDonor(int id, Donor donor)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=DotNetProject;Integrated Security=True;";
            try
            {
                cn.Open();

                SqlCommand cmdUpdate = new SqlCommand();
                cmdUpdate.Connection = cn;
                cmdUpdate.CommandType = CommandType.Text;
                cmdUpdate.CommandText = "UPDATE Donors SET name = @name, gender = @gender, email= @email, cityid = @cityid, phone= @phone, bloodgroup= @bloodgroup, dob = @dob WHERE Id = @id";
                cmdUpdate.Parameters.Add("@id", SqlDbType.Int).Value = id;
                cmdUpdate.Parameters.AddWithValue("@name", donor.Name);
                cmdUpdate.Parameters.AddWithValue("@gender", donor.Gender);
                cmdUpdate.Parameters.AddWithValue("@email", donor.Email);
                cmdUpdate.Parameters.AddWithValue("@cityid", donor.Cityid);
                cmdUpdate.Parameters.AddWithValue("@phone", donor.Phone);
                cmdUpdate.Parameters.AddWithValue("@bloodgroup", donor.Bloodgroup);
                cmdUpdate.Parameters.AddWithValue("@dob", donor.Dob);
                cmdUpdate.ExecuteNonQuery();
            }
            catch (Exception ex)
            {
                throw;
            }
            finally { cn.Close(); }
        }

        public static void DeleteDonor(int id)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source=(localdb)\MSSQLLocalDB;Initial Catalog=DotNetProject;Integrated Security=True;";
            try
            {
                cn.Open();

                SqlCommand cmdDelete = new SqlCommand();
                cmdDelete.Connection = cn;
                cmdDelete.CommandType = CommandType.Text;
                cmdDelete.CommandText = "Delete from Donors where id = @id;";
                cmdDelete.Parameters.Add("@id", SqlDbType.Int).Value = id;
                cmdDelete.ExecuteNonQuery();
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
