package pe.cibertec.ecommerce.ApiShoppingCart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiShoppingCartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiShoppingCartApplication.class, args);
	}

}
