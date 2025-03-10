package DeleteMeRestApi.RestfulWebServicesAssignment.Employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {


    private static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(1, "jagriti", 23));
        employees.add(new Employee(2, "Devansh", 24));
        employees.add(new Employee(3, "Gauri", 24));


    }

    //Actions on employees

    public List<Employee> retrieveEmployees() {
        return employees;

    }

    public Employee findOne(int id) {

        return employees.stream().filter(e -> e.getId() == id).findFirst().get();
    }

    public Employee createOne(Employee emp) {
        employees.add(emp);
        return emp;
    }

    public Employee findOneWithException(int id) {

        return employees.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public void deleteOne(int id) {
        employees.removeIf(user -> user.getId() == id);
    }

    public void alterOne(Employee emp, int id) {

//        if (emp == null || id<0) {
//            throw new EmpNotFoundException("the employee is null");}
        if ( id >= employees.size()) {
            employees.add(emp);
        } else {
            employees.set(id-1, emp);
        }

    }
}