package cristhiansouzadev.crudspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import cristhiansouzadev.crudspring.model.Course;
import cristhiansouzadev.crudspring.repository.CourseRepository;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

    @Bean
    CommandLineRunner initDataBase(CourseRepository courseRepository){
        return args -> {
            courseRepository.deleteAll();

            Course c = new Course();
            c.setName("Angular");
            c.setCategory("Front-end");

            courseRepository.save(c);
        };

    }

}
