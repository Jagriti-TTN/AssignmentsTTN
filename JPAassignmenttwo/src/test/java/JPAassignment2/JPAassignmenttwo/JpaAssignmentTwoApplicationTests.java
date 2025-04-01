package JPAassignment2.JPAassignmenttwo;

import JPAassignment2.JPAassignmenttwo.Entity.*;
import JPAassignment2.JPAassignmenttwo.Repository.EmployeeEmbeddedRepository;
import JPAassignment2.JPAassignmenttwo.Repository.EmployeeRepository;
import JPAassignment2.JPAassignmenttwo.Repository.PaymentRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
class JpaAssignmentTwoApplicationTests {

	Logger LOGGER = LoggerFactory.getLogger(JpaAssignmentTwoApplicationTests .class);
	@Autowired
	EmployeeRepository employeeRepository;
	@Test
	void contextLoads() {
	}
	@Test
	public void createEmployees(){
		Employee employee = new Employee();
		employee.setAge(48);
		employee.setFirstName("Naman");
		employee.setLastName("Tiwari");
		employee.setSalary(50000);
		employeeRepository.save(employee);

		Employee employee2 = new Employee();
		employee2.setAge(44);
		employee2.setFirstName("Aryan");
		employee2.setLastName("Shukla");
		employee2.setSalary(75000);

		employeeRepository.save(employee2);

	}

	@Test
	public void display(){
		System.out.println(employeeRepository.findAll());
	}

	@Test
	public void filterEmployees(){
		List<Object[]> list =employeeRepository.getEmployeesByCondition1();
		for(Object[] arr :list){
			System.out.println(arr[0]+" "+arr[1]);
		}
	}

	@Transactional
	@Test
	@Rollback(value = false)
	public void updateEmployeesWithPassedSalary(){
		Double avg_salary=employeeRepository.getAvgSalary();
		employeeRepository.updateSalary(avg_salary, 49500);

	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void deleteEmployee(){
		employeeRepository.deleteMinSalaryEmployee();

	}

	@Test
	public void findByLastName(){
		List<Object[]> list= employeeRepository.findAllEmployeesByLastnameSingh();

		for(Object [] arr : list){
			System.out.println(" id : "+arr[0]+" first name : "+arr[1]+" age : "+arr[2]);
		}
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void deleteEmployeesByAge(){
		employeeRepository.deleteAllEmployeesAgedGreaterThan45(45);
	}




	@Autowired
	PaymentRepository paymentRepository;

	@Autowired
	EmployeeEmbeddedRepository employeeEmbeddedRepository;


	//-------------------------- SINGLE CLASS TEST-----------------------------------------
	@Test
	public void makeCardPayment() {
		Card card = new Card();
		card.setCardNumber(12345678);
		card.setAmount(25000);
		card.setId(101);
		paymentRepository.save(card);
	}

	@Test
	public void makeCheckPayment(){
		Cheque cheque =new Cheque();
		cheque.setCheckNumber(12345678);
		cheque.setAmount(25000);
		cheque.setId(102);
		paymentRepository.save(cheque);
	}

	//----------------------- JOINED TESTs---------------------------


	@Test
	public void makeCardPaymentJoined() {
		Card card = new Card();
		card.setCardNumber(12345678);
		card.setAmount(25000);
		card.setId(101);
		paymentRepository.save(card);
	}
	@Test
	public void makeCheckPaymentJoined(){
		Cheque cheque =new Cheque();
		cheque.setCheckNumber(2345678);
		cheque.setAmount(45000);
		cheque.setId(102);
		paymentRepository.save(cheque);
	}

	//---------------------------- Class per table -----------------------------------

	@Test
	public void makeCardPaymentPerTable(){
		Card card =new Card();
		card.setCardNumber(12345678);
		card.setAmount(25000);
		card.setId(101);
		paymentRepository.save(card);
	}
	@Test
	public void makeCheckPaymentPerTable(){
		Cheque cheque =new Cheque();
		cheque.setCheckNumber(12345678);
		cheque.setAmount(25000);
		cheque.setId(101);
		paymentRepository.save(cheque);
	}

	// ------------------------------ Component Mapping tests ------------------------------

	@Test
	public void createEmployee(){
		EmployeeEmbedded employee2 = new EmployeeEmbedded();
		employee2.setAge(27);
		employee2.setFirstName("Devansh");
		employee2.setLastName("Gupta");
		employee2.setId(1);

		Salary salary = new Salary();
		salary.setBasicSalary(25000);
		salary.setBonusSalary(15000);
		salary.setTaxAmount(5000);
		salary.setSpecialAllowanceSalary(7000);
		employee2.setSalary(salary);

		employeeEmbeddedRepository.save(employee2);
	}


}
