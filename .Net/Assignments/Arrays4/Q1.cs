namespace Arrays4
{
    internal class Q1
    {
        static void Main1(string[] args)
        {

            Console.WriteLine("Welcome to Cdac Mumbai !!!");
            Console.WriteLine("Enter no of batches ");
            int batch = int.Parse(Console.ReadLine());

            int[][] arr = new int[batch][];

            for (int i = 0; i < arr.GetLength(0); i++)
            {
                Console.WriteLine($"Enter no students for Batch {i + 1}:");
                int s = int.Parse(Console.ReadLine());

                Student[] stud = new Student[s];
                for (int si = 0; si < stud.Length; si++)
                {
                    Console.WriteLine("Enter marks for student  {0}: ", si + 1);
                    int m = int.Parse(Console.ReadLine());

                    stud[si] = new Student();
                    stud[si].marks = m;
                }

                Console.WriteLine("Student marks of Batch {0}", i + 1);
                Console.WriteLine("Marks of Students : ");
                foreach (Student std in stud)
                {
                    Console.Write(std.marks.ToString() + " ");
                }
                Console.WriteLine();

            }

            /*
            Console.WriteLine("Welcome to Cdac Mumbai !!!");
            Console.WriteLine("Enter no of batches ");
            int batch = int.Parse(Console.ReadLine());

            Object[][] arr = new Object[batch][];

            for(int i = 0; i < batch ; i++)
            {
                Console.WriteLine($"Enter no students for Batch {i+1}:");
                int s = int.Parse(Console.ReadLine());

                arr[i] = new Student[s];
                for(int si = 0; si < arr.Length; si++)
                {
                    Console.WriteLine("Enter marks for student  {0}: ",si+1);
                    int m = int.Parse(Console.ReadLine());

                    arr[si] = new Student(m);

                    Console.WriteLine();
                }

                Console.WriteLine("Student marks of Batch {0}", i+1);
                Console.WriteLine("Marks of Students : ");
                foreach (Student std in stud)
                {
                   Console.Write(std.marks+" ");
                }
            }
            */

            //Display 


            //first success
            /*
            Console.WriteLine("Welcome to Cdac Mumbai !!!");
            Console.WriteLine("Enter no of batches ");
            int batch = int.Parse(Console.ReadLine());

            int[][] arr = new int[batch][];

            for(int i = 0; i < arr.GetLength(0) ; i++)
            {
                Console.WriteLine($"Enter no students for Batch {i+1}:");
                int s = int.Parse(Console.ReadLine());

                Student[] stud = new Student[s];
                for(int si = 0; si < stud.Length; si++)
                {
                    Console.WriteLine("Enter marks for student  {0}: ",si+1);
                    int m = int.Parse(Console.ReadLine());

                    stud[si] = new Student();
                    stud[si].marks = m;
                }

            } 
            */
        }

        public class Student
        {
            public int marks;
        }
    }
}