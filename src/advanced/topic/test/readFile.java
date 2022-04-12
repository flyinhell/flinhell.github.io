package advanced.topic.test;

import org.apache.log4j.Logger;

import java.io.*;


public class readFile {
    private Logger logger1 = Logger.getLogger("logger1");

    public String readFile(String fileName) {  //讀取檔案

        String fileContent = "";
        String outputfileContent = "";
        BufferedReader buReader = null;
        try {
            File file = new File(fileName);

            if (file.isFile() && file.exists()) {
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), "UTF-8");
                buReader = new BufferedReader(read);
                String line;
                while ((line = buReader.readLine()) != null) {
                    fileContent += line + "\r\n";
                    outputfileContent += "[" + line + "]" + "\r\n";
                }
                logger1.info(fileContent);

            }
        } catch (Exception e) {
            logger1.error(e.getMessage(), e);
        } finally {

            try {
                buReader.close();
            } catch (IOException e) {
                logger1.error(e.getMessage(), e);

            }
        }
        return outputfileContent;
    }
}
