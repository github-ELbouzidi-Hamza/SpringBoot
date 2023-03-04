package ma.pfe.repositories;

import ma.pfe.dto.StudentDto;
import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {

    StudentEntity create(StudentEntity entity);

    StudentEntity update(StudentEntity entity);

    StudentDto delete(long id);

    List<StudentEntity> selectAll();

}
