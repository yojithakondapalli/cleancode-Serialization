import java.util.*;
public class input {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		float p= sc.nextFloat();
		System.out.println("Enter rate of interest:");
		int r=sc.nextInt();
		System.out.println("Enter time in years");
		int t = sc.nextInt();
		Simpleintrest  si= new Simpleintrest();
		System.out.println("The  Simple Interest amount is:"+si.simpleinterest(p,r,t));
		compoundintrest ci = new compoundintrest();
		System.out.println("The Compound Ingterest amount is:"+ci.compoundinterest(p,r,t));
	System.out.format("%s","select a number\n");
	System.out.format("%s","1.if you use standard materials\n");
	System.out.format("%s","2.if you use above standard materials\n");
	System.out.format("%s", "3.if you use high standard material\n");
	System.out.format("%s"," 4.if you use high standard material and fully automated home\n");
	int a = sc.nextInt();
	System.out.format("%s","enter the area of the field");
	float area= sc.nextFloat();
	constructioncost cc=new constructioncost();
	System.out.format("%s","The Construction Cost is"+cc.costofconstruction(a,area));
}
}