package ma.pfe.mapper;

import ma.pfe.dto.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component(value = "mapp1")
public class StudentMapper {

    public StudentDto convertToDto(StudentEntity entity) {
        StudentDto dto = new StudentDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public StudentEntity convertToEntity(StudentDto dto) {
        StudentEntity entity = new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }

    public List<StudentDto> convertToDtos(List<StudentEntity> entities) {
        return entities.stream().map(entity -> convertToDto(entity)).collect(Collectors.toList());
    }

    public List<StudentEntity> convertToEntities(List<StudentDto> dtos) {
        return dtos.stream().map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }


}
