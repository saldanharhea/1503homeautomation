package endsem;

public class Tv implements HAS {
	
	
	

	
	   @Override
	   public int OnOff(int flag) {
	      System.out.println("this is a TV");
	      
	      
	      
	      
	      if(flag==0)
	      {
	    	  System.out.println("Tv have been turned on");
	    	  flag = 1;
	      }
	      else{
	    	  System.out.println("Tv have been turned off");
	    	  flag = 0;
	      }
return flag;
	   }
	   
	   
	   public int VolumeUp(int vol)
	   {
		   if(vol<100)
		   {
		   vol= vol+1;
		   System.out.println("the Volume of the Tv is  "+vol);
		   }
		   else
		   {
			   System.out.println("the Volume is at its maximum .. so cant increase vol" );
		   }
		   return vol;
	   }
	   
	   
	   
	   
	   
	   public int VolumeDown(int vol)
	   {
		   if(vol>0)
		   {
		   vol= vol-1;
		   System.out.println("the Volume of the Tv is  "+vol);
		   }
		   else
		   {
			   System.out.println("the Volume is at its minimum... so cant decress the volume" );
		   }
		   return vol;
	   }
	   
	   
	   
	   
	   public int ChannelUp(int chan)
	   {
		   chan= chan+1;
		   System.out.println("the Current Channel is  "+chan);
		   return chan;
	   }
	   
	   public int ChannelDown(int chan)
	   {
		  
		   if(chan>0){
		   chan= chan-1;
		   System.out.println("the Current Channel is  "+chan);
		   }
		   else
		   {
			   System.out.println("its the minimum channel");
		   }
		   return chan;
	   }
	   
	}

