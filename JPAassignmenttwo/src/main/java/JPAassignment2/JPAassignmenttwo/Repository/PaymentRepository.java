package JPAassignment2.JPAassignmenttwo.Repository;

import JPAassignment2.JPAassignmenttwo.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository  extends JpaRepository<Payment,Integer> {
}