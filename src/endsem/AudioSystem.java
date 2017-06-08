package endsem;

public class AudioSystem implements HAS {

	   @Override
	   public int OnOff(int flag) {
	      System.out.println("this is an audio system ");
	      
	      
	      if(flag==0)
	      {
	    	  System.out.println("Audio have been turned on");
	    	  flag = 1;
	      }
	      else{
	    	  System.out.println("Audio have been turned off");
	    	  flag = 0;
	      }
	      
	      return flag;
	   }
	   
	   public void VolumeUp(int vol)
	   {
		   
		   vol= vol+1;
		   System.out.println("the Volume of the System is  "+vol);
	   }
	}
