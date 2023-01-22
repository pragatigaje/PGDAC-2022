using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CollectionsDemo
{
    internal class HashTable
    {
        static void Main2()
        {
            //Hashtable objDictionary = new Hashtable();
            SortedList objDictionary = new SortedList();
            objDictionary.Add(2, "Pratik");
            objDictionary.Add(1, "Yogesh");
            objDictionary.Add(3, "Shubham");
            objDictionary.Add(4, "Shubham");

            objDictionary[4] = "changed";
            objDictionary[5] = "new";

            //objDictionary.Remove(1);  //key
            //objDictionary.RemoveAt(1);  //index

            //bool isPresent = objDictionary.Contains(1);  //key
            //isPresent = objDictionary.ContainsKey(1);  //key
            //objDictionary.ContainsValue("Shubham"); //value

            //objDictionary.GetByIndex(index);//value
            //objDictionary.GetKey(index);  //key
            IList objIList = objDictionary.GetKeyList();  //returns IList of keys
            foreach (object item in objIList)
            {
                Console.WriteLine(item);
            }
            //objDictionary.GetValueList(); //returns IList of values

            //ICollection objICollection = objDictionary.Keys;
            //ICollection objICollection2 = objDictionary.Values;

            //objDictionary.IndexOfKey
            //objDictionary.IndexOfValue
            //objDictionary.SetByIndex(index, value)

            foreach (DictionaryEntry item in objDictionary)
            {
                Console.WriteLine($"key is {item.Key}, value is {item.Value}");
            }

        }
    }
}
