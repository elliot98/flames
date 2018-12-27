package la_flame;
import java.io.*;
import java.util.*;

public class yung_la_flame {
	
	public static void printer(String[] a, String[] b)
	{
		System.out.print("\n");
		
		for(String str: a)
		{
			System.out.print(str);
		}
		
		System.out.print("\n");
		
		for(String str: b)
		{
			System.out.print(str);
		}
		
		System.out.print("\n");
	}
	
	public static void main(String[] args) throws IOException
	{
		//NAME COLLECTION PHASE BEGINS HERE
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first name (without spaces):");
		String nam1 = scan.nextLine();
		nam1 = nam1.toLowerCase();
		String[] n1 = nam1.split("(?!^)");
		
		System.out.print("\n");
		
		System.out.println("Enter the second name (without spaces):");
		String nam2 = scan.nextLine();
		nam2 = nam2.toLowerCase();
		String[] n2 = nam2.split("(?!^)");
		
		printer(n1,n2);
		//NAME COLLECTION PHASE ENDS HERE
		
		//LETTER ELIMINATION PHASE BEGINS HERE
		for(int i=0;i<n1.length;i++)
		{
			for(int j=0;j<n2.length;j++)
			{
				if(n2[j].equals(n1[i]))
				{
					n2[j]="-";
					n1[i]="+";
				}
			}
		}
		
		printer(n1,n2);
		//LETTER ELIMINATION PHASE ENDS HERE
		
		//COUNTING PHASE BEGINS HERE
		int count=0;
		for(String str: n1)
		{
			if(!str.contentEquals("+")&&!str.contentEquals("-"))
				count++;
		}
		
		for(String str: n2)
		{
			if(!str.contentEquals("+")&&!str.contentEquals("-"))
				count++;
		}
		
		System.out.println("\n"+count);
		//COUNTING PHASE ENDS HERE
		
		//RESULT PHASE BEGINS HERE
		LinkedList<String> king = new LinkedList<String>();
		king.add("f");
		king.add("l");
		king.add("a");
		king.add("m");
		king.add("e");
		king.add("s");
		System.out.print("\n"+king.toString());
		String finale;
		
		int i,p,k,l;
		i=0;p=0;l=6;		
		
		while(p!=5)
		{
			i+=count;
//			System.out.print("\ninter i : "+i+"\t l :"+l);
			i=(i-1)%l;
			king.remove(i);
			p++;
			l--;
//			System.out.print("\nfinal i : "+i+"\t l :"+l+"\t"+king.toString()+
//					"\n--------------------------------------");
			System.out.print("\n"+king.toString());
		}
		
		System.out.print("\n\nComputer Ji says : ");
		
		finale = king.get(0);
		switch(finale) {
		case "f" : {
			System.out.print("Y'all homies so sweat not."); break;
		}
		
		case "l" : {
			System.out.print("There is love in the air fellas. Embrace it."); break;
		}
		
		case "a" : {
			System.out.print("Nothing wrong with some affection. Keep the good vibes up ya both."); break;
		}
		
		case "m" : {
			System.out.print("Shit, get a room already. Y'all married eh?"); break;
		}
		
		case "e" : {
			System.out.print("There is bad blood here. Break the enmity up huh."); break;
		}
		
		case "s" : {
			System.out.print("SOULMATES ffs yes please. Stay strong and together."); break;
		}
		}
		//RESULT PHASE ENDS HERE
		//FIN
	}
}
