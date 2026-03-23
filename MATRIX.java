import java.util.*;
import java.lang.*;
public class Matrix
{
	public static void main(String args[])
	{
		int i,j,row,col,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the row size ");
		row=sc.nextInt();
		int a[][]=new int[row][];
		for(i=0;i<row;i++)
		{
			System.out.println("Enter the column size for row "+(i+1));
			col=sc.nextInt();
			System.out.println("enter the row values ");
			a[i]=new int[col];
			for(j=0;j<col;j++)
			a[i][j]=sc.nextInt();
		}
		System.out.println("input matrix ");
		for(int first[]:a)
			{
				for(int second:first)
					{
						System.out.println(second\t);
					}
				System.out.print("");
			}
		for(int first[]:a)
		{
			sum=0;
			for(int second:first)
			{
				sum=sum+second;
			}
		System.out.println("the sum of each row is "+sum);
		}
	}
}