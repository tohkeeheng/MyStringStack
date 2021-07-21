import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStringStackTest {

	private String s1,s2;
	private MyStringStack stack;
	
	@Before
	public void setUp() throws Exception{
		s1 = "Hello";
		s2 = "World!";
		stack = new MyStringStack();		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPush(){
		//Empty stack is still empty after pushing a null element 
		assertTrue(stack.isEmpty());
		String o1 = null;
		stack.push(o1);
		assertTrue(stack.isEmpty());
		
		//New stack is empty, after pushing an s1 element, stack is no longer empty
		assertTrue(stack.isEmpty());
		stack.push(s1);
		assertFalse(stack.isEmpty());	
	}


}
