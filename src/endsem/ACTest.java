package endsem;

import static org.junit.Assert.*;

import org.junit.Test;

public class ACTest {

	@Test
	public void ACTest1() {
		AirConditioner a1= new AirConditioner();
		int res1= a1.OnOff(0);
		assertEquals(1,res1);
	}

}
