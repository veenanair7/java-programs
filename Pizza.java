package PizzaPackage;

public class Pizza {
	
	protected PizzaSize size;
	protected int numofcheesetop;
	protected int numofpepptop;
	protected int numofbeeftop;
	
	
	public Pizza() {
		size=PizzaSize.medium;
		numofcheesetop=1;
		numofpepptop=0;
		numofbeeftop=0;
		
	}
	public void setCheeseTops(int numofcheesetop)
	{
		if(numofcheesetop<=2)
		this.numofcheesetop= numofcheesetop;
	}
	public void setBeefTops(int numofbeeftop)
	{
		if(numofbeeftop<=2)
		this.numofbeeftop=numofbeeftop;
	}
	public void setPepTops(int numofpepptop)
	{
		if(numofpepptop<=2)
		this.numofpepptop=numofpepptop;
	}
	
    public double calcCost()
    {
    	
    	switch(size)
    	{
    	case small: 
    		return 10+(numofcheesetop+numofbeeftop+numofpepptop)*2;
    		
    	case medium: 
    		 return 12+(numofcheesetop+numofbeeftop+numofpepptop)*2;
             
    		
    	case large: 
    		 return 14+(numofcheesetop+numofbeeftop+numofpepptop)*2;
    		
    		
    	}
    	return 0;
    	
    }
    
    public String getDescription()
    {
    	return "Pizza size: "+ size +"\nno of cheese toppings:"+numofcheesetop+"\nno of pepperoni toppings:"+numofpepptop+"\nno Beef toppings:"+numofbeeftop +"\ncost:"+calcCost()+"\n";
    }
	public void setSize(PizzaSize size) 
	{
	 this.size= size;
		
		
	}
	
	
	
		
    
     
}
