package pe.cibertec.ecommerce.ApiAuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAuthApplication.class, args);
	}

}
