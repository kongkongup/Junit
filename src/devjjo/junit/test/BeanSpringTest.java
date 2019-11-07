package devjjo.junit.test;



import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import devjjo.junit.dto.Hello;
import devjjo.junit.dto.Printer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/springbeans.xml")
public class BeanSpringTest {
	
	@Autowired
	@Qualifier("helloPrinter")
	Hello hello;
	
	@Autowired
	@Qualifier("stringPrinter")
	Printer printer;

	@Test
	public void helloBeanTest_OK() {
		Assert.assertEquals("Hello ã‡ÉàÉìÉqÉáÉì", hello.sayHello());
		hello.print();	
	}
	
	@Test
	public void helloBeanTest_Error() {
		Assert.assertEquals("Hello ÉGÉâÅ[", printer.toString());
		hello.print();
	}
	

}
