import java.io.*;
import java.util.*;
 
class min_heap
{
	int[] a;int i=0;
	min_heap(int n)
	{
		a=new int[n+1];
	}
	void insert(int x)
	{
		i++;
		a[i]=x;int j=i;
		int par=(int)Math.floor(j/2);
		while(j>1 && a[j]<a[par])
		{
			int t=a[j];a[j]=a[par];a[par]=t;
			j=par;
			par=(int)Math.floor(j/2);
		}
	}
	void heapify(int j)
	{
		int left=j*2,right;right=left+1;int smal=j;
		if(left<=i && a[j]>a[left])
		{
			smal=left;
		}
		if(right<=i && a[smal]>a[right])
		{
			smal=right;
		}
		if(smal!=j)
		{
			int t=a[j];a[j]=a[smal];a[smal]=t;
			heapify(smal);
		}
	}
	void delete(int data)
	{
		int j=1;
		for(j=1;j<=i;j++)
		{
			if(a[j]==data)
				break;
		}
		a[j]=a[i];i--;
		heapify(j);
	}
}
 
class NN
{

	public static void main(String[] args)throws IOException {	
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

	int g=Integer.parseInt(bf.readLine());
	min_heap h=new min_heap(g+1);
	for(int h1=0;h1<g;h1++)
	{
		String[] s=bf.readLine().split(" ");
		if(s[0].equals("3"))
			System.out.println(h.a[1]);
		else if(s[0].equals("1"))
			h.insert(Integer.parseInt(s[1]));
		else
			h.delete(Integer.parseInt(s[1]));
	}
 
 
		
 
 
}
} 