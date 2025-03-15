package SpringDataJpa.HibernateSpringDataJpa.Entities;


import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class
Employee {

  private String name;

  @Id
  private int id;
  private int age;
  private String location;
//  @Embedded
//  private Address address;

//    public Employee( int id, String name ,int age, String location) {
//        this.name = name;
//        this.id = id;
//        this.age = age;
//        this.location = location;
//    }

    public Employee(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public Address getAddress() {
//        return address;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }
}
