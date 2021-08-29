
import java.util.Scanner;
public class ArrayDemo65
	{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[][] stud = new int[5][4];
		int r;
		System.out.println("\n\t Enter Records :");
		for(int i=0; i<stud.length; i++)
		{
			r = i+1;
			System.out.print("\n\t Record No. : " + r);
			System.out.print("\n\t Enter Roll No. :");
			stud[i][0] = scan.nextInt();
			
			System.out.print("\n\t Enter Sub1 :");
			stud[i][1] = scan.nextInt();
			
			System.out.print("\n\t Enter Sub2 :");
			stud[i][2] = scan.nextInt();
			
			System.out.print("\n\t Enter Sub3 :");
			stud[i][3] = scan.nextInt();
			
		}
			System.out.println("\n\tRollNO\tSub1\tSub3\tSub4");
			System.out.println("\n\t---------------------\n\t");
			for(int i=0; i<stud.length; i++)
			{
				for(int j=0; j<stud[i].length; j++)
				{
				System.out.print("\t" + stud[i][j]);
				}
				System.out.println();
			}
}
}