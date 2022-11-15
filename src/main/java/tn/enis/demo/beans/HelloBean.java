package tn.enis.demo.beans;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class HelloBean implements IHello{
	
	public String getMessage(String msg) {
		return "Hello Spring" + msg; }

}