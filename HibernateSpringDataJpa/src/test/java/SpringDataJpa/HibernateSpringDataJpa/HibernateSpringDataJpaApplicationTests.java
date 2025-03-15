package SpringDataJpa.HibernateSpringDataJpa;

import SpringDataJpa.HibernateSpringDataJpa.EmpRepository.EmpRepo;
import SpringDataJpa.HibernateSpringDataJpa.Entities.Address;
import SpringDataJpa.HibernateSpringDataJpa.Entities.Employee;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.annotation.Rollback;

import java.util.List;

@SpringBootTest
class HibernateSpringDataJpaApplicationTests {


	public EmpRepo empRepo;

@Autowired
	public HibernateSpringDataJpaApplicationTests(EmpRepo empRepo) {
		this.empRepo = empRepo;
	}


	@Test
	public void insertEmp(){
//	emprepo.save(new Employee(1,"jags",18,"kanpur"));
	Employee emp = new Employee();
	emp.setId(1);
	emp.setAge(22);
	emp.setLocation("kanpur");
	emp.setName("jags");

	Employee emp2= new Employee();
	emp2.setName("dev");
	emp2.setAge(24);
	emp2.setLocation("delhi");
	emp2.setId(2);


		Employee emp3= new Employee();
		emp3.setName("aryan");
		emp3.setAge(24);
		emp3.setLocation("lucknow");
		emp3.setId(3);

		Employee emp4= new Employee();
		emp4.setName("preeti");
		emp4.setAge(23);
		emp4.setLocation("jammu");
		emp4.setId(4);

		empRepo.save(emp);
		empRepo.save(emp2);
		empRepo.save(emp3);
		empRepo.save(emp4);

		//to find the count of employees

		System.out.println("employee count is "+empRepo.count());

		//To find employee by name
		System.out.println(empRepo.findByName("dev").getName());

		//To find employees starting with "A"
		List<Employee> empStartingWithA=empRepo.findByNameStartingWith("A");
		for(Employee e:empStartingWithA){
			System.out.println(e.getName());
		}


		//To find employee between the age 28 and 32
		List<Employee> empByAge=empRepo.findByAgeBetween(28,32);
		if(empByAge.isEmpty()){
			System.out.println("No  employee withing the giving range");
		}
		for(Employee e:empByAge){
			System.out.println(e.getName());
		}

		Pageable pageable=PageRequest.of(0,2, Sort.Direction.DESC,"age");
		Page<Employee>page=empRepo.findAll(pageable);
		List<Employee> results=page.getContent();
		for(Employee e:results){
			System.out.println(e.getName());
		}
//		Employee e1=empRepo.findById(1).get();
//		System.out.println(e1.getName());
//		e1.setName("gauri");

//		empRepo.save(e1);

//		List<Employee> empList =empRepo.findAllEmp();
//		System.out.println(empList);

//		empRepo.deleteById(1);  //to delete



	}









	@Test
	public void findEmployeePartial(){
	List<Object[]> result = empRepo.findPartialData();
	for(Object[] obj:result){
		System.out.println(obj[0]);
		System.out.println(obj[1]);
	}
	}

	@Test
	public void findEmployeeByNameTest(){
		System.out.println(empRepo.findEmployeeByName("dev"));
	}
	@Test
	public void findEmployeeByNQ(){
		System.out.println(empRepo.findEmployeeNQ("dev"));
	}

	@Test
	public void findEmployeePartialNQ(){
		List<Object[]> result = empRepo.findPartialDataNQ();
		for(Object[] obj:result){
			System.out.println(obj[0]);
			System.out.println(obj[1]);
		}
	}


	@Test
	public void insertEmployeeComponentMap(){
	Employee random= new Employee();
	random.setId(1);
	random.setLocation("India");
	random.setAge(22);
	random.setName("jags");
	Address address= new Address();
	address.setCity("kanpur");
	address.setLandmark("near green park");
//	random.setAddress(address);
	empRepo.save(random);
	}

	@Test
	@Transactional
	@Rollback(value = false)
	public void deleteEmp(){
	empRepo.deleteEmpById(1);
	}
}
