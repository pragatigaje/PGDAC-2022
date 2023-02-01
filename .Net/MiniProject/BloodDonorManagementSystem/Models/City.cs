using System;
using System.Collections.Generic;

namespace BloodDonorManagementSystem.Models
{
    public partial class City
    {
        public City()
        {
            Donors = new HashSet<Donor>();
        }

        public int CityId { get; set; }
        public string CityName { get; set; } = null!;
        public string State { get; set; } = null!;

        public virtual ICollection<Donor> Donors { get; set; }
    }
}
