import java.util.Scanner;

 class bankAcc
{
	 int accNo;
	 String name;
	 int balance;
	 static int tempNo;
	
	Scanner sc= new Scanner(System.in);
	 public void getaccount()
	{
		accNo=getAccountNumber();
		System.out.println("ENTER DATA FOR ACCOUNT NO -->"+accNo);
		System.out.println("ENETR NAME");
		name=sc.next();
		System.out.println("ENTER OPENING BALANCE");
		balance=sc.nextInt();
	}
	
	 private int getAccountNumber()
	{
		return ++tempNo;
	}
	 
	 public void showAccount()
	 {
		 System.out.println("ACCNO= " + accNo+ "\t NAME= " + name + "\tBALANCE=" + balance);
	 }
	
}


public class BankApp {

	public static void main(String[] args) {
		
		Scanner sc1= new Scanner(System.in);
		
		bankAcc[] BankARR= new bankAcc[3];

		for(int i=0; i<BankARR.length; i++)
		{
		BankARR[i] = new bankAcc();
		}
		
		
		for(int i=0; i<BankARR.length; i++)
		{
		BankARR[i].getaccount();
		}
		
		
		for(int i=0; i<BankARR.length; i++)
		{
		BankARR[i].showAccount();
		}
		
		System.out.println("WANT TO DEPOSIT?? ENTER ACC NO");
		
		int no= sc1.nextInt();
		System.out.println(no);
		
		
		for(int i=0; i<BankARR.length; i++)
		{
			//System.out.println(BankARR[i].name);
			
			if(BankARR[i].accNo==no)
			{
				System.out.println("FOUND");
			
				BankARR[i].showAccount();
				break;
			}
		}
		
			System.out.println("ACCOUNT NOT FOUND");
			
		
	}

	
	
}
