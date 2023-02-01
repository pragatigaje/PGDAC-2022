using System;
using System.Collections.Generic;

namespace EFDBFirst.Models
{
    public partial class Product
    {
        public int ProductId { get; set; }
        public string? ProductName { get; set; }
        public double? Rate { get; set; }
        public string? Description { get; set; }
        public int CategoryId { get; set; }
    }
}
