package tutorpzn.tutorspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import tutorpzn.tutorspringboot.utility.PembacaFile;

@SpringBootTest(classes = SpringbootTanpaBannerTes.class)
@Import({
    PembacaFile.class
})
public class SpringbootTanpaBannerTes {

    @Autowired
    PembacaFile pembacaFile;
    @Test
    void tesBacaFile() {
        pembacaFile.BacaFile("HELP.md");
    }
}
