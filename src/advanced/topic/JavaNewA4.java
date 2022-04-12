package advanced.topic;

import advanced.topic.test.WriteFile;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class JavaNewA4 {
    private static org.apache.log4j.Logger logger1 = Logger.getLogger("logger1");


    public static void main(String args[]) {
        logger1.info("JavaNewA4 Start...");

        String configPath;              //configPath = configResourcePath+configNamePath
        String configResourcePath = "C:\\Users\\zhenfuliao\\IdeaProjects\\Project_2\\resource\\";
        String configNamePath; //接受命令列的一個參數做為properties主檔名
        String newFileName = "";

        Properties properties = new Properties();
        try {
            configNamePath = args[0]; //接受命令列的一個參數做為properties主檔名
            newFileName = args[1]; //新檔案的檔名為命令列提供的第二個參數
            configPath = configResourcePath + configNamePath;
            InputStream inputStream = new FileInputStream(new File(configPath));
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");

            properties.load(inputStreamReader);

        } catch (Exception e) {

            logger1.error(e.getMessage(), e);
        }



        Set<Object> keySet;
        String newFileContent = "";
        String fileContent="";


        try {
            keySet= properties.keySet();
            for(Object key:keySet){
                fileContent = key+"="+properties.getProperty(key.toString());
                logger1.info(fileContent);
                newFileContent = newFileContent + "[" + fileContent + "]" + "\n";
            }


            WriteFile writeFile = new WriteFile();
            writeFile.writeFile(newFileName, newFileContent);
        } catch (Exception e) {
           logger1.error(e.getMessage(),e);
        }

        logger1.info("JavaNewA4 End...");
    }

}


