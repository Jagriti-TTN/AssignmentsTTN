package SpringDataJpa.HibernateSpringDataJpa.EmpRepository;

import SpringDataJpa.HibernateSpringDataJpa.Entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer>{

    List<Employee> findByNameStartingWith(String character);

    Employee findByName(String name);

    List<Employee> findByAgeBetween(int min ,int max);

   @Query("from Employee")
    List<Employee> findAllEmp();

   @Query("select name , location from Employee")
   List<Object[]> findPartialData();

   @Query("from Employee where name=:Name")
    List<Employee> findEmployeeByName(@Param("Name")String empName);

   @Query(value="select * from employee where name=:name",nativeQuery = true)
    List<Employee> findEmployeeNQ(String name);

   @Query(value = "select name,location from employee",nativeQuery = true)
    List<Object[]> findPartialDataNQ();

   @Modifying
   @Query("delete from Employee where id=:id")
    public void deleteEmpById(int id);




    Page<Employee> findAll(Pageable pageable);
}
