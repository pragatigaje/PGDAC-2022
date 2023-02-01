using Microsoft.AspNetCore.Mvc.Rendering;

namespace BloodDonorManagementSystem.Models
{
    public class DonorViewModel
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
        public IEnumerable<SelectListItem>? Cities { get; set; }
    }
}
