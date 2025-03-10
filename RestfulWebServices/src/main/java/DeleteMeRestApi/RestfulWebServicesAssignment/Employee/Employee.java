package DeleteMeRestApi.RestfulWebServicesAssignment.Employee;

import jakarta.validation.constraints.*;
import org.springframework.stereotype.Component;

//Created Employee Bean

public class Employee {

    @NotNull(message="The id can not be null")
//    @Min(value=1,message="id cannot be negative or zero")
    private int id;

    @NotNull(message="Name cannot be null")
    @NotBlank(message="Name cannot be blank")
    @Size(min = 1,message="Name should at least contain one character")
    private String name;

    @Min(value = 18, message = "Age must be at least 18")
    private int age;

    public Employee(int id, String name,int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
