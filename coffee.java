import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int x=s.nextInt();
	    int p=s.nextInt();
	    int c=0;
	    while(x>0)
	    {
          c=c+x;
          x=x*(100-p)/100;
      }
		System.out.println(c);
	}
}
