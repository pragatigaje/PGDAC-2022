class WrapperDemo
{
        public static void main(String args[])
        {
                //Double dobj = new Double(53.5);
                //Double dobj = new Double("53.5");
                Double dobj = Double.valueOf("53.5");
                double dp = Double.parseDouble("53.5");
                
                Double dobj1 = new Double("53.5");
                
                int ip = Integer.parseInt("537");
                
                String s = dobj.toString();		//Returns String representation of the double value
                //System.out.println(d);		//System.out.println(d.toString());
                int res = dobj.compareTo(dobj1);
                System.out.println("dobj.compareTo(dobj1) : "+res);
                
                double dp1 = dobj1.doubleValue();
                byte bp = dobj1.byteValue();	//bp will have value 2
                int ip1 = dobj1.intValue();	//ip1 will have value 258
                
                System.out.println(dobj.equals(dobj1));
                
                Integer iobj = new Integer("567");
                Integer iobj1 = new Integer("567");
                System.out.println("iobj.equals(iobj1) : "+iobj.equals(iobj1));		//true, deep comparison
                System.out.println("iobj == iobj1 :"+ (iobj == iobj1));		//false, shallow comparison
                
                Boolean boolObj = new Boolean("true");
                Boolean boolObj1 = Boolean.valueOf("true");
                
                boolean boolp = Boolean.parseBoolean("true");
                
                boolObj.toString();		//"true"
                
                Character charObj = new Character('A');
                Character.isDigit('A');		//returns false
                Character.isDigit('9');		//returns true
         
         	int num = 31;       
                String binRes = Integer.toBinaryString(num);
                String octalRes = Integer.toOctalString(num);
                String hexaRes = Integer.toHexString(num);
                
                System.out.println("Binary of 31 : " + binRes);
                System.out.println("Octal of 31 : " + octalRes);
                System.out.println("Hexadecimal of 31 : " + hexaRes);
                
                Integer iobj2 = 10;
                int val = iobj2;
                
        }
}   
