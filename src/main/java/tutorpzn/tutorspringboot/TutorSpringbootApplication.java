package tutorpzn.tutorspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tutorpzn.tutorspringboot.data.User;

@SpringBootApplication
public class TutorSpringbootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext appContext = SpringApplication.run(TutorSpringbootApplication.class, args);
        User user = appContext.getBean(User.class);
        user.sayHello("");
        user.getHakAkses().adaHakAkses();
    }

}
