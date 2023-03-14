package ma.pfe.repositories;

import ma.pfe.dto.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("repo1")
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

    /*
    StudentEntity create(StudentEntity entity);

    StudentEntity update(StudentEntity entity);

    StudentDto delete(long id);

    List<StudentEntity> selectAll();
    */


}
