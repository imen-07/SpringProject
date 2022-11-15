package tn.enis.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import tn.enis.demo.beans.BonjourBean;
//import tn.enis.demo.beans.HelloBean;
import tn.enis.demo.beans.IHello;

@SpringBootApplication
public class SpringProjectApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("bonjourBean")
	IHello hello;
	public static void main(String[] args) {
		SpringApplication.run(SpringProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(hello.getMessage(" From ENIS Engineer "));
		
	}

}
