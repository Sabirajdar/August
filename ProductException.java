import java.util.*;
class ProductOutOfstocksException extends RuntimeException
{
	String message;
	public ProductOutOfstocksException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
}
class StockManagement
{
	private String name;
	private int stockCount;
	
	public StockManagement(String name,int stockCount)
	{
		this.name=name;
		this.stockCount=stockCount;
	}
	public void reduceStock(int qty)
	{
		if(stockCount - qty < 0)
		{
			throw new ProductOutOfstocksException("Product "+name+"is out of stock !");	
		}
		stockCount =stockCount-qty;
		System.out.println("stock update.Remaining stock of "+name+":"+stockCount);
	}
	public int getStock()
	{
		return stockCount;
	}
}
public class ProductException
{
	public static void main (String x[])
	{
		StockManagement st=new StockManagement("laptop",5);
		
		try{
			st.reduceStock(6);
		}
		catch(ProductOutOfstocksException ex)
		{
			System.out.println("Exception: "+ex.getMessage());
		}
	}
}