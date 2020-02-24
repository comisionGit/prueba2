package anonimoXYZ.config;

import org.springframework.context.annotation.Configuration;

import anonimoXYZ.service.servicioCaloria;
import anonimoXYZ.service.servicioCaloriasImp;

// Permite el uso de la anotacion configuracion. 
//Registra los beans
import org.springframework.context.annotation.Bean;
@Configuration
public class App_config {

	@Bean(name="Calorias")
	
	public servicioCaloria dameCaloria() {
		return new servicioCaloriasImp();
	}
	
}
