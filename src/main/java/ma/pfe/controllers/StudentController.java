package ma.pfe.controllers;

import ma.pfe.dto.StudentDto;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    @PostMapping
    StudentDto create(@RequestBody StudentDto dto) {
        LOGGER.debug("start method save dto : {} ",dto);
        return service.save(dto);
    }

    @PutMapping
    StudentDto update(@RequestBody StudentDto dto) {
        LOGGER.debug("start method update dto : {} ",dto);
        return service.update(dto);
    }

    @DeleteMapping("/{ids}")
    boolean delete(@PathVariable("ids") long id) {
        LOGGER.debug("start method delete id : {} ",id);
        return service.delete(id);
    }

    @GetMapping
    List<StudentDto> selectAll() {
        LOGGER.debug("start methode selectAll");
        return service.selectAll();
    };

}
