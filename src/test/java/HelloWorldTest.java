import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sample.HelloWorld;

public class HelloWorldTest {

	@Test
	public void testSayHello() {
		HelloWorld hw = new HelloWorld();
		assertEquals("Incorrect return value for sayHello", "Hello!", hw.sayHello());
	}

}
