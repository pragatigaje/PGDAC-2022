namespace Arrays
{
    internal class Program
    {
        static void Main1()
        {
            //array
            //int[] arr1 = new int[] { 1, 2, 3 };
            //int[] arr2 = new int[3] { 1, 2, 3};
            int[] arr = new int[5];           //arr[0].....arr[4]
            for (int i = 0; i < arr.Length; i++)
            {
                //Console.WriteLine("Enter element no : " + i.ToString());  //string concatenation
                //Console.WriteLine("Enter element no : {0}", i);  //placeholders
                Console.Write($"Enter element no : {i} : ");  //string interpolation
                arr[i] = int.Parse(Console.ReadLine());
                //arr[i] = Convert.ToInt32(Console.ReadLine());
            }
            Console.WriteLine();
            foreach (int item in arr)
            {
                Console.WriteLine($"array element is {item} ");
            }
        }
        static void Main2()
        {
            int[] arr = new int[] { 10, 20, 30, 10, 50 };

            //Array.Clear(arr); 
            //int pos = Array.IndexOf(arr, 10);
           
            int pos = Array.LastIndexOf(arr, 10);
            pos = Array.IndexOf(arr, 10000);
            //pos = Array.BinarySearch(arr, 10);
           
            if(pos == -1)
            {
                Console.WriteLine("not found");
            }

            //int[] arr2 = (int[]) Array.CreateInstance(typeof(int), 5);

            //Array.Sort(arr);
            //Array.Reverse(arr);

            Console.WriteLine();
            foreach (int item in arr)
            {
                Console.WriteLine($"array element is {item} ");
            }
        }
        static void Main3()
        {
            object[] arr1 = { 10, 20, "abc" };
            int[] arr2 = new int[5] { 1, 2, 3, 4, 5 };

            try
            {
                Array.Copy(arr1, 0, arr2, 2, 3);
                //Array.ConstrainedCopy(arr1, 0, arr2, 2, 3);
            }
            catch (Exception ex )
            {
            }
            Console.WriteLine();
            foreach (int item in arr2)
            {
                Console.WriteLine(item);
            }
        }

        static void Main4()
        {
            int[,] arr = new int[3, 5];
            //int[,,] arr2 = new int[2, 120, 5];

            Console.WriteLine(arr.Rank);  //2
            Console.WriteLine(arr.Length);  //15
            Console.WriteLine(arr.GetLength(0));  //length of first dimension - 3
            Console.WriteLine(arr.GetLength(1));  //length of second dimension - 5

            Console.WriteLine(arr.GetUpperBound(0));  //2
            Console.WriteLine(arr.GetUpperBound(1));  //4

            //arr[0,0]......[0,4]
            //arr[1,0]......[1,4]
            //arr[2,0]......[2,4]

            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    //Console.Write($"Enter element no : {i} : ");  //string interpolation
                    Console.Write($"Enter element no : arr[{i},{j}] : ");
                    arr[i,j] = int.Parse(Console.ReadLine());
                }
            }
            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    Console.WriteLine($"element no : {i},{j} is {arr[i,j]} ");
                }
            }
        }
        static void Main5()
        {
            Employee[] arr = new Employee[5];
            for (int i = 0; i < arr.Length; i++)
            {
                arr[i] = new Employee();

                Console.WriteLine(arr[i].EmpNo);
                Console.WriteLine(arr[i].Name);
            }
            foreach (Employee item in arr)
            {
                //item = new Employee();
                item.EmpNo = 10;
                Console.WriteLine(item.EmpNo);
            }
        }
        static void Main()
        {
            //jagged
            int[][] arr = new int[4][];
            //for (int i = 0; i < arr.Length; i++)
            //{
            //    arr[i] = new int[x]
            //}

            arr[0] = new int[3]; // arr[0][0] arr[0][1] arr[0][2]
            arr[1] = new int[4]; // arr[1][0] arr[1][1] arr[1][2] arr[1][3]
            arr[2] = new int[2];//  arr[2][0] - arr [2][1]
            arr[3] = new int[3];//  arr[3][0] arr[3][1] arr[3][2]

            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.Write("enter value for subscript [{0}][{1}] : ", i, j);
                    arr[i][j] = Convert.ToInt32(Console.ReadLine());
                }
                Console.WriteLine();
                Console.WriteLine();
            }
            Console.WriteLine();
            Console.WriteLine();
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.WriteLine("value for subscript {0},{1} is {2}  ", i, j, arr[i][j]);

                }
            }
            Console.ReadLine();
        }


    }


    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }

    }
}