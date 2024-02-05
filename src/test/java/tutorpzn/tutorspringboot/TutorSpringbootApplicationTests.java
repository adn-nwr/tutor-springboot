package tutorpzn.tutorspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tutorpzn.tutorspringboot.data.User;

@SpringBootTest(classes = TutorSpringbootApplication.class)
class TutorSpringbootApplicationTests {

    @Autowired
    User user;

    @Test
    void contextLoads() {
        user.sayHello("Hai");
        user.getHakAkses().adaHakAkses();
    }

}
