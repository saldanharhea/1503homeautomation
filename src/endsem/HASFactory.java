package endsem;

public class HASFactory {
	
	
	
	
	public HAS getAppliance(String appliance){
	      if(appliance == null){
	         return null;
	      }		
	      if(appliance.equalsIgnoreCase("HOMELIGHTS")){
	         return new HomeLights();
	         
	      } else if(appliance.equalsIgnoreCase("AIRCONDITONER")){
	         return new AirConditioner();
	         
	      } else if(appliance.equalsIgnoreCase("WASHINGMACHINE")){
	         return new WashingMachine();
	      }
	      
	      if(appliance.equalsIgnoreCase("TV")){
		         return new Tv();
		         
		      } 
	      if(appliance.equalsIgnoreCase("AUDIOSYSTEM")){
		         return new AudioSystem();
		         
		      } 
	      
	      return null;
	   }

}
