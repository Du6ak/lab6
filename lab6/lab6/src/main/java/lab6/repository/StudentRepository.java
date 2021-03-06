package lab6.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lab6.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	List<Student> findByGroup_id(Long id);

	List<Student> findBySurname(String name);

}
