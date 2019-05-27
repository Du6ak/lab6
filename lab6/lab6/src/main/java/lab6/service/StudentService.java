package lab6.service;

import java.util.List;

import lab6.entity.Student;

public interface StudentService extends Service<Student> {

    List<Student> readByGroupId(Long groupId);

    List<Student> readBySurname(String surname);

}
