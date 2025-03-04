package SpringFrameworkQues1.Ques1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ques1Application {

	public static void main(String[] args) {

		int[]nums=new int[4];
		nums[0]=1;
		nums[1]=6;
		nums[2]=5;
		nums[3]=2;


		BinarySearchImpl obj = new BinarySearchImpl(new BubbleSort(nums));

	}

}
