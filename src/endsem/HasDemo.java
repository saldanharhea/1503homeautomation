package endsem;

public class HasDemo {

	

	
	public static void main(String[] args) {
	      HASFactory hasfac = new HASFactory();

	      
	      HAS app1 = hasfac.getAppliance("HOMELIGHTS");

	    
	      app1.OnOff();

	     
	      HAS app2 = hasfac.getAppliance("AIRCONDITONER");

	      
	      app2.OnOff();

	      
	      HAS app3 = hasfac.getAppliance("WASHINGMACHINE");

	     
	      app3.OnOff();
	      
	      
	      
	   }
	
	
	

}
