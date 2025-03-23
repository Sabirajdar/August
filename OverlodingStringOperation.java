import java.util.*;
public class OverlodingStringOperation
{
	
	public void sortSString(String s)
	{
		char[]ch=s.toCharArray();
	}
	for(int i=0;i<ch.length-1;i++)
	{
		for(int j=0;j<ch.length-i-1;j++)
		{
			if(ch[j]>ch[j+1])
			{
				char temp=ch[j];
				ch[j]=ch[i];
				ch[i]=temp;
			}
		}
	}
		String sort=new String(ch);
		System.out.println("sorting array"+sort);
	public static void main(String x[])
	{
		OverlodingStringOperation str=new OverlodingStringOperation();
		str.sortSString("shraddha");
	}
}