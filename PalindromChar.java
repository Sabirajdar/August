import java.util.*;
public class PalindromChar
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter string");
	char[] word=xyz.next().toCharArray();
	boolean isPalindrome=true;
	for(int i=0;i<word.length/2;i++)
	{
		if(word[i]!=word[word.length-1-i])
		{
			isPalindrome=false;
			break;
		}
	}
	if(isPalindrome)
	{
		System.out.println("It is Palindrome");
	}
	else
	{
		System.out.println("It is not Palindrome");
	}
}
}