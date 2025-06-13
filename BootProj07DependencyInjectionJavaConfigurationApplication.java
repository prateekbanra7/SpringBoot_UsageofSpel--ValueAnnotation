package in.abc;



import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.abc.comp.BillGenerator;

@SpringBootApplication
public class BootProj07DependencyInjectionJavaConfigurationApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication
				.run(BootProj07DependencyInjectionJavaConfigurationApplication.class, args);

		System.out.println("Beans info are :: " + Arrays.toString(context.getBeanDefinitionNames()));
		System.out.println();
		
		BillGenerator billGenerator = context.getBean(BillGenerator.class);
		System.out.println(billGenerator);
		
		((ConfigurableApplicationContext) context).close();
	}

}
