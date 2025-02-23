import java.util.*;
class InvalidPasswordException extends Exception
{
	String message;
	public InvalidPasswordException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
}
class Password
{
	private String pass;
  public Password( String pass)
  {
	this.pass=pass;
  }
  public void checkPass() throws InvalidPasswordException
	{
		if(pass.length()< 8)
		{
			throw new InvalidPasswordException("password must be at least 8 character");
		}
		char passaar[]=pass.toCharArray();
		boolean isupper=false,islower=false,isdigit=false,issymbol=false;
		for(int i=0;i<passaar.length;i++)
		{
			if(passaar[i]>=65 && passaar[i]<=90)
			{
				isupper=true;
			}
			else if(passaar[i]>=97 && passaar[i]<=122)
			{
				islower=true;
			}
			else if(passaar[i]>=48 && passaar[i]<=57)
			{
				isdigit=true;
			}
			else if(passaar[i]>=33 && passaar[i]<=126)
			{
				issymbol=true;
			}
		}	
	if(!isupper)throw new InvalidPasswordException("Password must be contain at least one upper case letter");
	if(!islower)throw new InvalidPasswordException("Password must be contain at least one lower case letter");
	if(!isdigit)throw new InvalidPasswordException("Password must be contain at least one digit");
	if(!issymbol)throw new InvalidPasswordException("Password must be contain at least one symbol");

	System.out.println("Valid Password");	
		}
	}
public class InvalidPasswordExcep
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter password: ");
		String pass=xyz.nextLine();
		
		Password p=new Password(pass);
		
		try{
			p.checkPass();
		}
		catch(InvalidPasswordException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
