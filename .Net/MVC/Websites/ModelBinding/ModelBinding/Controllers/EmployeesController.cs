using System.Data;
using System.Data.SqlClient;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using ModelBinding.Models;

namespace ModelBinding.Controllers
{
    public class EmployeesController : Controller
    {
        // GET: EmployeesController
        public ActionResult Index()
        {
            List<Employee> emplist = Employee.GetAlEmployees();
            return View(emplist);
        }

        // GET: EmployeesController/Details/5
        public ActionResult Details(int id)
        {
            Employee obj = Employee.GetSingleEmployee(id);
           return View(obj);
        }

        // GET: EmployeesController/Create
        public ActionResult Create()
        {

            return View();
        }

        // POST: EmployeesController/Create
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Employee obj)
        {
            try
            {
                Employee.InsertEmployee(obj);
                return RedirectToAction(nameof(Index));
            }
            catch(Exception ex)
            {
                ViewBag.message = ex.Message;
                return View();
            }
        }

        // GET: EmployeesController/Edit/5
        public ActionResult Edit(int id)
        {
            Employee emp = Employee.GetSingleEmployee(id);
            return View(emp);
        }

        // POST: EmployeesController/Edit/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Edit(int id, Employee obj)
        {
            try
            {
                Employee.UpdateEmployee(obj);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }

        // GET: EmployeesController/Delete/5
        public ActionResult Delete(int id)
        {
            Employee obj = Employee.GetSingleEmployee(id);
            return View(obj);
        }

        // POST: EmployeesController/Delete/5
        [HttpPost]
        [ValidateAntiForgeryToken]
        public ActionResult Delete(int id, IFormCollection collection)
        {
            try
            {
                Employee.DeleteEmployee(id);
                return RedirectToAction(nameof(Index));
            }
            catch
            {
                return View();
            }
        }
    }
}
