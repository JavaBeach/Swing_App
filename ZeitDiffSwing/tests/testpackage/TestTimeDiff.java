package testpackage;

import org.junit.Assert;
import org.junit.Test;

public class TestTimeDiff {
	
	@Test
	public void testHp() {
		String first = "10:10:10";
		String second = "11:11:11";
		String expected = "3661";
		String actual = new ZeitDiffGuiJemmyTest().execute(first, second);
		Assert.assertEquals(expected, actual);
	}
}
