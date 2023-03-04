package ma.pfe.contoller;

import ma.pfe.dto.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.services.StudentService;
import ma.pfe.services.StudentServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    private StudentService service;


    public StudentController(@Qualifier("service1") StudentService service) {
        this.service = service;
    }

    @PostMapping("")
    StudentDto create(@RequestBody StudentDto dto) {
        LOGGER.debug("start methode create");
        return service.create(dto);
    }

    @PutMapping
    StudentDto update(StudentDto dto) {
        LOGGER.debug("start methode update");
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    StudentDto delete(long id) {
        LOGGER.debug("start methode delete");
        return service.delete(id);
    }

    @GetMapping
    List<StudentDto> selectAll() {
        LOGGER.debug("start methode selectAll");
        return service.selectAll();
    };

}
