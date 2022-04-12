package advanced.topic;

import advanced.topic.test.readFile;
import advanced.topic.test.WriteFile;
import org.apache.log4j.Logger;

class JavaA4 {
    private static Logger logger1 = Logger.getLogger("logger1");
    /*
    A.請寫出一個程式，接受命令列的一個參數做為properties主檔名，以Properties API開啟該檔後，
        使用log4j方法印出該檔內所有Name及Value。
        (請自行先製作一份properties檔，裡面內含key及value需2至N組，其中的Value須包含中文，
          印出來也必須是中文字，提示JAVA IO中可指定檔案編碼格式。)

    B.程式讀取之properties檔，以Writer或其子類別的方法寫入另一個新文字檔內，
        新文字檔的檔名是採用命令列提供的第二個參數，且讓每個Name, Value成為一行，格式為[Name, Value]。

     */


    public static void main(String[] args) {


        logger1.info("-------------JavaA4 Start -------------");

        String fileContext;
        String configPath;              //configPath = configResourcePath+configNamePath
        String configResourcePath;      //Resource Path
        String configNamePath; //接受命令列的一個參數做為properties主檔名
        String newFileName ;   //新檔案的檔名為命令列提供的第二個參數

        //  System.out.println(strTest);
        try {
            configNamePath = args[0];
            newFileName = args[1];
            configResourcePath = "C:\\Users\\zhenfuliao\\IdeaProjects\\Project_2\\resource\\";
            //填入執行程式路徑
            configPath = configResourcePath + configNamePath;
            readFile readFile = new readFile();
            fileContext = readFile.readFile(configPath);
            // logger.info(fileContext);
            WriteFile writeFile =new WriteFile();
            writeFile.writeFile(newFileName, fileContext);

        } catch (Exception e) {
            logger1.error(e.getMessage(),e);
        }
        logger1.info("-------------JavaA4 End -------------");
    }




}