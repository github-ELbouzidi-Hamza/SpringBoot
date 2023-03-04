package ma.pfe;

import ma.pfe.services.StudentServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PFEApplication {
    private final static Logger LOGGER = LoggerFactory.getLogger(PFEApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(PFEApplication.class, args);
    }
}
