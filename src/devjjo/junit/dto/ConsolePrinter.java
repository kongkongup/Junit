package devjjo.junit.dto;

import org.springframework.stereotype.Component;

@Component("conPrinter")
public class ConsolePrinter implements Printer {
	public void print(String message) {
		System.out.println(message);
	}
}
