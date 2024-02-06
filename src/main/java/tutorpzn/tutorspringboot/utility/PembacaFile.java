package tutorpzn.tutorspringboot.utility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;

@Slf4j
@Component
public class PembacaFile {

    private BufferedReader bufferedReader;

    public void BacaFile(String pathFile) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathFile))) {
            log.info("Isi file {}:",pathFile);
            while(true) {
                String line = bufferedReader.readLine();
                if(line==null) {
                    break;
                }
                log.info(line);
            }
            log.info("<<endoffile>>");
        } catch (Throwable throwable) {
            log.warn("Error membaca file {}",pathFile);
        }

    }

}
