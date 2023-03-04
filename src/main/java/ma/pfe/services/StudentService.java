package ma.pfe.services;

import ma.pfe.dto.StudentDto;
import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentService {

    StudentDto create(StudentDto dto);

    StudentDto update(StudentDto dto);

    StudentDto delete(long id);

    List<StudentDto> selectAll();

}