package ra.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.model.untity.Student;

@Repository
public interface StudentRepository  extends JpaRepository<Student,Integer> {
}
