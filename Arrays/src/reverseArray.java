import java.util.Scanner;
class color
{
	public String[] revrainbow(String[] str)
	{
		String [] result = new String[str.length];
		int j = result.length-1;
		for(int i=0; i<str.length; i++)
		{
		result[j] = str[i];
		j--;
		}
		for(String str3: str)
		{
			System.out.println(str3);
			
		}
		return result;
	}
}


public class reverseArray {
	
	
//	static String[] revrainbow(String[] str)
//	{
//		String [] result = new String[str.length];
//		int j = result.length-1;
//		for(int i=0; i<str.length; i++)
//		{
//		result[j] = str[i];
//		j--;
//		}
//		for(String str3: str)
//		{
//			System.out.println(str3);
//			
//		}
//		return result;
//	}

	public static void main(String[] args) {

		System.out.println("Enter Size");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		String [] rainbow= new String[n];
		
		for(int i=0; i<rainbow.length;i++)
		{
			System.out.println("Enter COLOR");
			rainbow[i]=sc.next();
			
		}
		
//		for(int i=0; i<rainbow.length;i++)
//		{
//			System.out.println(rainbow[i]);
//		}
		
		for(String str3: rainbow)
		{
			System.out.println(str3);
			
		}
		
		color c1=new color();
		
		String [] str1=c1.revrainbow(rainbow);
		
//		String [] str1;
//		str1= revrainbow(rainbow);
		for(String str: str1)
		{
			System.out.println(str);
			
		}

	}

}
