/*package com.simplilearn.TicketGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketGeneratorApplication.class, args);
	}

}

*/
package com.simplilearn.ticketGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketGeneratorApplication {
	    public static double getRandomTicketNumber(){
		       	 double min=1000;
			    	 double max=9999;
				    		 double x = (int)(Math.random()*((max-min)+1))+min;
						    		 return x;
								     }
	        public static void main(String[] args) {
			   	 SpringApplication.run(TicketGeneratorApplication.class, args);
				     }

}
