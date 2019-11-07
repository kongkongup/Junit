package devjjo.junit.dto;


import org.springframework.stereotype.Component;

@Component
public class Hello {
	
	String name;
	
	Printer printer;

	public Hello() {
		System.out.println("Helloのコンストラクタ呼び出し");
	}

	public Hello(String name, Printer printer) {
		this.name = name;
		this.printer = printer;
	}

	public void setName(String name) {
		System.out.println("setNames : " + name);
		this.name = name;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public String sayHello() {
		return "Hello " + name;
	}

	public void print() {
		this.printer.print(sayHello());
	}

}
