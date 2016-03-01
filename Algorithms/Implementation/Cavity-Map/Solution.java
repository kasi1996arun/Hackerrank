//https://www.hackerrank.com/challenges/cavity-map

import java.util.*;
class Solution
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=m;
		int[][] a=new int[m][n];
		//int rot=in.nextInt();
		for(int i=0;i<m;i++)
		{
			String x=in.next();
			char[] x1=x.toCharArray();
			for(int j=0;j<n;j++)
			{
				String abc=x1[j]+"";
				a[i][j]=Integer.parseInt(abc);
			}
		}
		//int[][] b=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j!=0 && j!=(n-1) && i!=0 && i!=(m-1))
				{
					if(a[i][j]>a[i-1][j] && a[i][j]>a[i+1][j] && a[i][j]>a[i][j-1] && a[i][j]>a[i][j+1])
					{
						a[i][j]=101;
					}
				}
			}
		}
		for(int i=0;i<m;i++)
		{
			String str="";
			for(int j=0;j<n;j++)
			{
				if(a[i][j]==101)
				{
					str=str+"X";
				}
				else
				{
					str=str+a[i][j];
				}
			}
			System.out.println(str);
		}
	}
}
