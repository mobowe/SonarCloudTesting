package helloWorld;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class helloWorldTest {

	@Mock
	myHelloWorld mhw;
	
	@Test
	public void test() {

		String[] args = null;
		int ret = mhw.main(args);
		assertEquals(0, ret);
	}

}
