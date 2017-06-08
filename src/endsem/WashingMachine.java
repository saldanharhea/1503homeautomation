package endsem;

public class WashingMachine implements HAS {

	   @Override
	   public void OnOff(int flag) {
	      System.out.println("this is a Washing Machine");
	      
	      
	      
	      if(flag==0)
	      {
	    	  System.out.println("Washining Machine have been turned on");
	    	  flag = 1;
	      }
	      else{
	    	  System.out.println("Washining Machine have been turned off");
	    	  flag = 0;
	      }
	   }
	}
