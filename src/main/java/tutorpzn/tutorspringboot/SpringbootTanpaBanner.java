package tutorpzn.tutorspringboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tutorpzn.tutorspringboot.data.User;

@SpringBootApplication
public class SpringbootTanpaBanner {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringbootTanpaBanner.class);
        app.setBannerMode(Banner.Mode.OFF);
        ApplicationContext appContext = app.run(args);
        User bean = appContext.getBean(User.class);
        bean.sayHello("");
    }

}
