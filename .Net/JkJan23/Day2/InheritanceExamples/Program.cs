namespace InheritanceExamples1
{
    class Program
    {
        static void Main1()
        {
            //BaseClass o = new BaseClass();
            //o.
            
            DerivedClass o = new DerivedClass();
            //o.
        }
    }
    public class BaseClass
    {
        public int i;
    }
    public class DerivedClass : BaseClass
    {
        public int j;
    }
}
//access specifiers
namespace InheritanceExamples2
{
    //at namespace level , default access specifier is internal
    class Program
    {
        static void Main1()
        {
            //BaseClass o = new BaseClass();
            //o.
            TestAccessSpecifiers.BaseClass o = new TestAccessSpecifiers.BaseClass();
            //o.
        }
    }
    //public -> everywhere
    //private -> same class
    //protected -> same class, derived class
    //internal -> same class, same assembly(same project)
    //protected internal -> same class, derived class, same assembly
    //private protected - same class, derived class which is in the same assembly
    public class BaseClass
    {
        public int PUBLIC;
        private int PRIVATE;
        protected int PROTECTED;
        internal int INTERNAL;
        protected internal int PROTECTED_INTERNAL;
        private protected int PRIVATE_PROTECTED;
        int o;  //def access specifier is private for members of a class
    }
    public class DerivedClass  : TestAccessSpecifiers.BaseClass   //: BaseClass
    {

        void DoNothing()
        {
            //this.
        }
    }
}

