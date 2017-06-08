package endsem;

public class HomeLights implements HAS {

	   @Override
	   public void OnOff(int flag) {
		   
	      System.out.println("these are lights");
	      
	      if(flag==0)
	      {
	    	  System.out.println("Lights have been turned on");
	    	  flag = 1;
	      }
	      else{
	    	  System.out.println("Lights have been turned off");
	    	  flag = 0;
	      }
	   }
	}

