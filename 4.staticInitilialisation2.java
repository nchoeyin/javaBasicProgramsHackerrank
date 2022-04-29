import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Static initializer 2nd part

public class Solution {
static boolean flag = true;
static int B;
static int H;
static {
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    if(B<=0 || H<=0)
    {
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    
}
    

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

/* Output :
----------------------------------------------------------------------------------------------------------------------------------------------
Sample input 1
1
3
Sample output 1
3
----------------------------------------------------------------------------------------------------------------------------------------------
Sample input 2
-1
2
Sample output 2
java.lang.Exception: Breadth and height must be positive
----------------------------------------------------------------------------------------------------------------------------------------------
*/