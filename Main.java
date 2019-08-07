import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String S=sc.nextLine();
	String str="";
	for(int i=0;i<S.length();i++)
	{
	    if(str.indexOf(S.charAt(i))==-1)
	    {
	        str+=S.charAt(i);
	    }
	    
	    
	}
		int count = str.length();
	System.out.println(count);
	}

}
