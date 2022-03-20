package pl.coderslab.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.coderslab.CustomerLogger;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@Component
@Primary
public class FileCustomerLogger implements CustomerLogger {


    private final String filename;

    public FileCustomerLogger(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

//    public void setFilename(String filename) {
//        this.filename = filename;
//    }

    @Override
    public void log() {

        try {

            PrintWriter printWriter = new PrintWriter(getFilename());
            printWriter.println("zapis do pliku" + LocalDateTime.now());
            printWriter.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
