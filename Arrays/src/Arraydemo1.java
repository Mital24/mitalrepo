import java.util.Scanner;

public class Arraydemo1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("ENTER THE SIXE OF ARRAY");
		x=sc.nextInt();
		int [] intArray= new int[x];
		String [] s1=new String[x];
		String [] s2=new String[x];

		
		
		for (int i=0;i<x; i++)
		{
			//System.out.println("ENTER AGE ["+ i +"]");
			//intArray[i]=sc.nextInt();
			System.out.println("Poonam modifies code");
			System.out.println("ENTER NAME ["+ i +"]");
			s1[i]=sc.next();
		}
		System.out.println("STUDENT INFO");
		for (int i=0;i<s1.length; i++)
		{
			//System.out.println(intArray[i] + s1[i] );
			System.out.println(s1[i]);
		}
		
		System.out.println("\nHELLO");
		//System.arraycopy(s1, 0, s2, 4, s1.length);
		System.arraycopy(s1, 0, s2, 0, s1.length);
		for (int i=0;i<s2.length; i++)
		{
			//System.out.println(intArray[i] + s1[i] );
			System.out.println(s2[i]);
		}
	}
}
