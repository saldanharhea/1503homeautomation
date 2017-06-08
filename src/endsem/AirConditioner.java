package endsem;

public class AirConditioner implements HAS {

	
	
	   @Override
	   public int OnOff(int flag) {
	      System.out.println("this is an airConditioner");
	      
	      
	      if(flag==0)
	      {
	    	  System.out.println("AirConditioner have been turned on");
	    	  flag = 1;
	      }
	      else{
	    	  System.out.println("Airconditioner have been turned off");
	    	  flag = 0;
	      }
	      return flag;
	   }
	}

