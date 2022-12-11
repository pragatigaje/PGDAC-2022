//20. String Constructor Program in Java
import java.util.*;
public class StringConstructor_20  { 
	public static void main(String[ ] args)  { 
		char chars[ ] = { 's', 'c', 'i', 'e', 'n', 'c', 'e' }; 
		String s1 = new String(chars); 
		System.out.println(s1);                     //science
		
		char chars1[] = { 'w', 'i', 'n', 'd', 'o', 'w', 's' }; 
		String s2 = new String(chars1, 0,4); 
		System.out.println(s2);                     //wind
		
		char chars2[] = { 'F', 'A', 'N' }; 
	   String s3 = new String(chars2); 
	  
	   String s4 = new String(s3); 
	   System.out.println(s3);                    //FAN
	   System.out.println(s4);                   //FAN
    } 
}