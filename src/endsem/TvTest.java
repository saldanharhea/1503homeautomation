package endsem;

import static org.junit.Assert.*;

import org.junit.Test;

public class TvTest {

	@Test
	public void test() {
		Tv t1= new Tv();
		int res2= t1.OnOff(0);
		int res3=t1.VolumeUp(100);
		int res4=t1.VolumeDown(10);
		int res5=t1.ChannelUp(10);
		int res6=t1.ChannelDown(29);
		
		assertEquals(1,res2);
		assertEquals(100,res3);
		assertEquals(9,res4);
		assertEquals(11,res5);
		assertEquals(28,res6);
	}

}
