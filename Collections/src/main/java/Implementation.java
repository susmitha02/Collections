import java.util.Scanner;

public class Implementation 
{
	public static void main(String[] args) 
	{
		Custom_Collection<Integer> mbp = new Custom_Collection<Integer>();
		Scanner sc=new Scanner(System.in);
		mbp.addElement(1);
		mbp.addElement(2);
		mbp.addElement(3);
		mbp.addElement(4);
		mbp.addElement(5);
		mbp.addElement(6);
		mbp.addElement(7);
		mbp.addElement(8);
		mbp.addElement(9);
		mbp.addElement(10);
		System.out.println("1. View Contents of the list");
		System.out.println("2. Size of the list");
		System.out.println("3. Add a element");
		System.out.println("4. Remove a element");
		System.out.println("5. Get element by index");
		while(true)
		{
			System.out.println("\n");
			System.out.println("Enter option");
			int x=sc.nextInt();
			if(x==1)
			{
				System.out.println("List: "+mbp);
			}
			else if(x==2)
			{
				System.out.println("Size: "+mbp.size());
			}
			else if(x==3)
			{
				System.out.println("Enter element:");
				int k=sc.nextInt();
				mbp.addElement(k);
				System.out.println("List: "+mbp);
			}
			else if(x==4)
			{
				System.out.println("Enter Index:");
				int k=sc.nextInt();
				mbp.removeElement(k);
				System.out.println("After removing, the list is "+mbp);
				System.out.println("Size of the list is " + mbp.size());
			}
			else if(x==5)
			{
				System.out.println("Enter Index:");
				int k=sc.nextInt();
				System.out.println(mbp.getElementByIndex(k));
			}
			else
			{
				break;
			}
		}
		sc.close();
	}
}