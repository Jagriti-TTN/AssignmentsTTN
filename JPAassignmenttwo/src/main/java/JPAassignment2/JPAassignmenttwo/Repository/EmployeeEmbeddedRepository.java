package JPAassignment2.JPAassignmenttwo.Repository;

import JPAassignment2.JPAassignmenttwo.Entity.EmployeeEmbedded;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeEmbeddedRepository extends JpaRepository<EmployeeEmbedded,Integer> {
}
