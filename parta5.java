import java.util.*;
class distance
	{
	int feet,inches;
	distance(int feet,int inches)
	{
		this.feet=feet;
		this.inches=inches;
	}
	void sum(distance D1,distance D2)
		{
		if(D1.inches<12&&D2.inches<12)
			{
			inches=D1.inches+D2.inches;
			feet=D1.feet+D2.feet+(inches/12);
			inches=inches%12;
			System.out.println("total distance is \n feet :"+feet+"\n Inches :"+inches);
			}
		else
		System.out.println("inches should less than 12 !..");
		}
	}
class parta5
	{
	public static void main(String args[])
		{
		int feet1,feet2,inches1,inches2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter distance 1");
		System.out.println("enter feet 1 ");
		feet1=sc.nextInt();
		System.out.println("enter inches 1 ");
		inches1=sc.nextInt();
		System.out.println("Enter distance 2 ");
		System.out.println("enter feet 2 ");
		feet2=sc.nextInt();
		System.out.println("enter inches 2 ");
		inches2=sc.nextInt();
		distance D1=new distance(feet1,inches1);
		distance D2=new distance(feet2,inches2);
		D1.sum(D1,D2);
		sc.close();
		}
	}















	