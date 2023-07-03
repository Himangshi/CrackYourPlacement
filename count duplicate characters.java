import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s;
	    Scanner in=new Scanner(System.in);
	    System.out.println("Enter your word");
	    s=in.nextLine().toLowerCase();
	    for(char i='a';i<='z';i++)
	    {
	        int c=0;
	        for(int j=0;j<s.length();j++)
	        {
	            if(i==s.charAt(j))
	            {
	                c++;
	            }
	        }
	         if(c>1)
	            {
	                 System.out.println(i + ",count=" + c);
	            }
	    }
	}
}
