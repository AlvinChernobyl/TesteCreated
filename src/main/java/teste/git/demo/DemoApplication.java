package teste.git.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Scanner sc = new Scanner(System.in);

		int valor = 20;
		String nome = "Lucas";
		double altura = 1.75;
		boolean ativo = true;

	}

}
