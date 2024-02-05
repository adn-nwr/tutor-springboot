package tutorpzn.tutorspringboot.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HakAkses {

    HakAkses() {
        log.info("Constructor HakAkses dijalankan");
    }

    public void adaHakAkses() {
        log.info("Hak akses tersedia");
    }

}
