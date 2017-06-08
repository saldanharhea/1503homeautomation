package endsem;

import static org.junit.Assert.*;

import org.junit.Test;

public class WashingMachineTest {

	@Test
	public void test() {
		WashingMachine w1= new WashingMachine();
		int res2= w1.OnOff(0);
		int res3=w1.SpeedUp(20);
		int res4=w1.SpeedDown(0);
		
		assertEquals(1,res2);
		assertEquals(21,res3);
		assertEquals(0,res4);
	}
	
	
	


}
