package ma.pfe.services;

import ma.pfe.dto.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mapper.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "service1")
public class StudentServiceImp implements StudentService{

    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImp.class);

    private StudentRepository repository;
    private StudentMapper mapper;


    public StudentServiceImp(@Qualifier("repo1") StudentRepository repository, @Qualifier("mapp1") StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    @Override
    public StudentDto create(StudentDto dto) {
        LOGGER.debug("start methode create");
        StudentEntity entity = mapper.convertToEntity(dto);
        StudentEntity respense = repository.create(entity);
        StudentDto dtoResponse = mapper.convertToDto(respense);
        return dtoResponse;
    }

    @Override
    public StudentDto update(StudentDto dto) {
        LOGGER.debug("start methode update");
        /* return mapper.convertToDto(repository.update(mapper.convertToEntity(dto))); */
        StudentEntity entity = mapper.convertToEntity(dto);
        StudentEntity respense = repository.update(entity);
        StudentDto dtoResponse = mapper.convertToDto(respense);
        return dtoResponse;
    }

    @Override
    public StudentDto delete(long id) {
        LOGGER.debug("start methode delete");
        return repository.delete(id);
    }

    @Override
    public List<StudentDto> selectAll() {
        LOGGER.debug("start methode selectAll");
        List<StudentEntity> entities = repository.selectAll();
        List<StudentDto> dtos =mapper.convertToDtos(entities);
        return dtos;
    }
}
