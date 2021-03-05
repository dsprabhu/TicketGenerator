/*package com.simplilearn.TicketGenerator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TicketGeneratorApplicationTests {

	@Test
	void contextLoads() {
	}

}
*/

package com.simplilearn.ticketGenerator;

import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TicketGeneratorApplicationTests {

	    private TicketGeneratorApplication ticketer = new TicketGeneratorApplication();
	        @Test	 
		    public void testRandomNumber() {     	 
			       	 assertTrue(ticketer.getRandomTicketNumber()>1000&&ticketer.getRandomTicketNumber()<9999);	 
				     }

}
