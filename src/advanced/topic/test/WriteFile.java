package advanced.topic.test;

import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class WriteFile {
    private static Logger logger1 = Logger.getLogger("logger1");

    public void writeFile(String fileName, String fileContent) { //寫入新檔案

        BufferedWriter buWriter = null;
        try {
            // System.out.println("fileName:"+fileName);

            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }

            OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(file), "UTF-8");
            buWriter = new BufferedWriter(write);
            buWriter.write(fileContent);

        } catch (Exception e) {
            logger1.error(e.getMessage(), e);
        } finally {

            try {
                buWriter.close();
            } catch (Exception e) {
                logger1.error(e.getMessage(), e);
            }
        }
    }
}
