package DeleteMeSpring.SpringTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringTestApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBootApplication.class);



	public static void main(String[] args) {
		int[]nums=new int[4];
		nums[0]=1;
		nums[1]=0;
		nums[2]=3;
		nums[3]=5;



//		BinarySearchImpl obj = new BinarySearchImpl(new QuickSort());
//
//		int number = obj.binarySearch(nums,3);
//		System.out.println(number);

		ApplicationContext context = SpringApplication.run(SpringTestApplication.class,args);
		BinarySearchImpl obj = context.getBean(BinarySearchImpl.class);
		int result =obj.binarySearch(nums,3);
		System.out.println(result);
		LOGGER.info(obj.toString());

		
	}

}
