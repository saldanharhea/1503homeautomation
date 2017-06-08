package endsem;

public class HasDemo {

	

	
	public static void main(String[] args) {
		
		int flagOf=1;// appliance off
		int flagOn=0;//
	      HASFactory hasfac = new HASFactory();

	      
	      HAS app1 = hasfac.getAppliance("HOMELIGHTS");

	    
	      app1.OnOff(flagOf);
	      

	     
	      HAS app2 = hasfac.getAppliance("AIRCONDITONER");

	      
	      app2.OnOff(flagOn);

	      
	      HAS app3 = hasfac.getAppliance("WASHINGMACHINE");

	     
	      app3.OnOff(flagOf);
	      
	      HAS app4 = hasfac.getAppliance("TV");

		     
	      app4.OnOff(flagOn);
	      
	      // increasing the volume of the audio system
	      AudioSystem a1 = new AudioSystem();		  
	      a1.VolumeUp(20);
	      
	      // increase volume for the TV
	      Tv a2 = new Tv();		  
	      a2.VolumeDown(20);
	      a2.ChannelDown(80);
	      
	   }
	
	
	

}
