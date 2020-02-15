package PizzaPackage;



public class Driver {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Pizza pizza = new Pizza();
		System.out.println("Order a pizza\n");
		System.out.println(pizza.getDescription());
		System.out.println("Changing my order\n");
		pizza.setSize(PizzaSize.large); 
		pizza.setPepTops(4); 
		pizza.setBeefTops(1);
		pizza.setCheeseTops(2);
		System.out.println(pizza.getDescription());
		System.out.println("Order a special pizza"); 
		SpecialPizza specialPizza = new SpecialPizza();
		specialPizza.setSize(PizzaSize.small);
		specialPizza.setCheeseTops(3);
		specialPizza.setBeefTops(4);
		specialPizza.setPepTops(1); 
		System.out.println(specialPizza.bellsAndWhistles());
	}

}
