package Java;

public class ReverseOfString {

	public static void main(String args[])
	{
		String original = "sachin";
		String reverse="";
		
       for (int i=original.length()-1 ; i>=0; i--)             		
       {
    	   reverse=reverse + original.charAt(i);    	   
       }			
       System.out.print(""+reverse);
	}
}
