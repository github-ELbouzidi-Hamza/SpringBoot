package ma.pfe.services;

import ma.pfe.dto.StudentDto;

import java.util.List;

public interface StudentService {

    /*StudentDto create(StudentDto dto);*/

    StudentDto save(StudentDto dto);

    StudentDto update(StudentDto dto);

    boolean delete(long id);

    List<StudentDto> selectAll();

}