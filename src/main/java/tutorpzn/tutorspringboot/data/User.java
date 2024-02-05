package tutorpzn.tutorspringboot.data;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Data
public class User {

    private String username;
    private String password;
    private HakAkses hakAkses;

    User(HakAkses hakAkses) {
        this.hakAkses = hakAkses;
    }

    public void sayHello(String msg) {
        if(msg.isEmpty())
            log.info("hello from User");
        else
            log.info("User say `" + msg + "`");
    }

}
