package edu.miu.cs.cs425.demowebapps.eregistrar.repository;

import edu.miu.cs.cs425.demowebapps.eregistrar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
