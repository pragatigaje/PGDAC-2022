using System;

namespace Arrays
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            int[] arr = new int[5];

            for(int i=0; i < arr.Length; i++)
            {
                Console.WriteLine("Enter element {0} : ",i);
                //arr[i] = int.Parse(Console.ReadLine());
                arr[i] = Convert.ToInt32(Console.ReadLine());
            }

            foreach(int item in arr)
            {
                Console.WriteLine(item);
            }
            
        }

        static void Main2(string[] args)
        {
            int[,] arr = new int[3,5];

            for (int i = 0; i < arr.GetLength(0) ; i++)
            {
               for(int j = 0 ; j < arr.GetLength(1); j++)
                {
                    Console.Write($"Enter element no : arr[{i},{j}] : ");
                    arr[i, j] = int.Parse(Console.ReadLine());
                }
            }

            for (int i = 0; i < arr.GetLength(0); i++)
            {
                for (int j = 0; j < arr.GetLength(1); j++)
                {
                    Console.WriteLine($"element no : {i},{j} is {arr[i, j]} ");
                }
            }

        }

        static void Main(string[] args)
        {

        }

    }
}