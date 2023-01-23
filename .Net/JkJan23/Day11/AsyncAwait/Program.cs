namespace AsyncAwait
{
    internal class Program
    {
        static async Task Main1()
        {
            Console.WriteLine("Before");
            //string message = t1.Start();  //will not work
            //string message = DoWorkAsync();  //sync call, waiting call, blocking call
            string message = await DoWorkAsync();  //async call, waiting call, non blocking call
            Console.WriteLine("After");
            Console.WriteLine(message);
        }
        static async Task<string> DoWorkAsync()
        {
            return await Task.Run(() =>
            {
                Thread.Sleep(5000);
                return "Work Done";
            });
        }
        static async Task Main()
        {
            Console.WriteLine("Before");
            Task<Task<string>> t1 = new Task<Task<string>>(DoWorkAsync);
            t1.Start();
            Console.WriteLine("After");
            string message = await t1.Result;
            Console.WriteLine(message);
        }
    }
}