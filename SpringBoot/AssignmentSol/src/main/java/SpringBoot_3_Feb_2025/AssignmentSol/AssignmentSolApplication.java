package SpringBoot_3_Feb_2025.AssignmentSol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AssignmentSolApplication {

	public static void main(String[] args) {
		ApplicationContext context =
		SpringApplication.run(AssignmentSolApplication.class, args);
		ServiceClass temp = context.getBean(ServiceClass.class);

		temp.printProperties();

	}

}
