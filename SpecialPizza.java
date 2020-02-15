package PizzaPackage;

public class SpecialPizza extends Pizza{
	
	@Override
	public void setCheeseTops(int numofcheesetop)
	{
		this.numofcheesetop= numofcheesetop;
		
	}
	@Override
	public void setBeefTops(int numofbeeftop)
	{
		this.numofbeeftop= numofbeeftop;
		
	}
	@Override
	public void setPepTops(int numofpepptop)
	{
		this.numofpepptop= numofpepptop;
		
	}
	public String bellsAndWhistles()
	{
		
		return super.getDescription()+ " \nThank you for ordering a special Pizza";
	}


}
