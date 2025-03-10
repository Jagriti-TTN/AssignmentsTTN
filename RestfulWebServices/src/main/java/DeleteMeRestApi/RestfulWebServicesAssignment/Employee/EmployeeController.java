package DeleteMeRestApi.RestfulWebServicesAssignment.Employee;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated //another way to validate
public class EmployeeController {

    private EmployeeService employeeservice;

    @Autowired
    public EmployeeController(EmployeeService employeeservice) {
        this.employeeservice = employeeservice;
    }

    //Ques1. Create a simple REST ful service in Spring Boot which returns
    // the Response "Welcome to spring boot".

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to spring boot";
    }

//get request mapping to get list of employees
    @GetMapping("/getAllEmployees")
    public List<Employee> findEmployees(){
        return employeeservice.retrieveEmployees();
    }

//GET http request using path variable top get one employee
    @GetMapping("/getEmployeeById/{id}")
    public Employee findEmployee(@Min(value=2,message="must be greater than 1")
                                     @PathVariable int id){
     Employee myemp= employeeservice.findOne(id);

     //handling exception
        if(myemp==null){
            throw new EmpNotFoundException("employee id not found");
        }

        return myemp;

    }
//POST http request for Employee to create a new employee.

    @PostMapping("/createEmployee")
    public void createEmployee(@Valid @RequestBody Employee emp){
        employeeservice.createOne(emp);

    }
    //DELETE http request for Employee to delete employee

    @DeleteMapping("/deleteEmployee/{id}")
    public void deleteEmployee(int id ){
        employeeservice.deleteOne(id);
    }


//PUT http request for Employee to update employee
    @PutMapping("alterEmployee/{id}")
    public void alterEmployee(@Valid @RequestBody (required = false)Employee emp,
                              @PathVariable int id){
        employeeservice.alterOne(emp,id);
    }

}
