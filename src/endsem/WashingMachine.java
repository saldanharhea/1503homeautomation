package endsem;

public class WashingMachine implements HAS {

	   @Override
	   public int OnOff(int flag) {
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
	      return flag;
	   }
	   
	   
	   
	   
	   public void SpeedUp(int speed)
	   {
		   if(speed<600)
		   {
		   speed= speed+1;
		   System.out.println("the speed of the Washining Machine is  "+speed);
		   }
		   else
		   {
			   System.out.println("the speed is at its maximum .. so cant increase speed" );
		   }
	   }
	   
	   
	   
	   public void SpeedDown(int speed)
	   {
		   if(speed>0)
		   {
		   speed= speed-1;
		   System.out.println("the spped of the Washing Machine is  "+speed);
		   }
		   else
		   {
			   System.out.println("the Speed is at its minimum... so cant decress the speed" );
		   }
	   }
	   
	   
	}
