package anonimoXYZ.comidaCalorias;

/**
 * Hello world!
 *
 */
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import anonimoXYZ.config.App_config;
import anonimoXYZ.service.servicioCaloria;

import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context=new AnnotationConfigApplicationContext(App_config.class);
    	servicioCaloria c=(servicioCaloria)context.getBean("Calorias");
    	//realiza la llamada a servicioCaloriasImp mediante el getBean
    	System.out.println("1-lentejas 2-judias 3-garbanzos 4-cacahuete");
    	c.caloriasComida(new Scanner(System.in).nextInt());
    	((ConfigurableApplicationContext) context).close();
    }
}
