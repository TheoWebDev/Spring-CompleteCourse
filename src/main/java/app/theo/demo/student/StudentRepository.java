package app.theo.demo.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    // Return Firstname because methode is containing
    List<Student> findAllByFirstnameContaining(String firstname);

}
