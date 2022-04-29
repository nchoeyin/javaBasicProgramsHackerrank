//Static initialization												dated: 23/04/2022
//static method runs first since it is created the moment the class is loaded and the main is executed by the program execution
//the order in which the static is created is important since the first static method is executed first and then the others 

public class Demo 
{	
   static {
	    System.out.println("Hello in static");
	  }
	
   public static void main(String args[])
    {
	System.out.println("Hello in main");
     }
   static {
	    System.out.println("Hello in static2");
	   }
}

// Output
//Hello in static
//Hello in static2
//Hello in main

/*public class Main 
{  
   static String s = "";	
   static {
	    s = "51";
	  }
	
   public static void main(String args[])
    {
	System.out.println("The value of s : " + s );
     }
}*/

//output : The value of s : 51