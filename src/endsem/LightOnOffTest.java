package endsem;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightOnOffTest {

	@Test
	public void LightOnOffTest() {
		HomeLights l1= new HomeLights();
		int res= l1.OnOff(1);
		assertEquals(0,res);
	}

}
