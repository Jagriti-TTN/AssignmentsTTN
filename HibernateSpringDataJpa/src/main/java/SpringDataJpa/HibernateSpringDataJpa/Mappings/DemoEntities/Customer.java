//package SpringDataJpa.HibernateSpringDataJpa.Mappings.DemoEntities;
//
//import jakarta.persistence.*;
//
//import java.util.Set;
//
//@Entity
//public class Customer {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private long id;
//    private String name;
//    @OneToOne(mappedBy = "customer")
//    private PhoneNumber number;
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public PhoneNumber getNumbers() {
//        return number;
//    }
//
//    public void setNumbers(PhoneNumber number) {
//        this.number = number;
//    }
//}
