package basic.topic;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import java.io.*;
import java.nio.channels.Channel;

public class JavaB10 {
    public static void main(String args[]) {
/*
請撰寫程式讀取一指定檔案並將指定的文字檔裡面的字通通讀出來印在Console上，最後執行關閉檔案的動作：
 */

        /**
         FileWriter writer;
         File file;


         file = new File("Hello1.txt");
         writer = new FileWriter(file);
         writer.write("This is an example 3");

         writer.flush();
         writer.close();
         */
        FileReader fileTest = null;
        BufferedReader brFiletest = null;
        try {
            fileTest = new FileReader("Hello.txt"); //讀取指定檔案
            brFiletest = new BufferedReader(fileTest);

            while (brFiletest.ready()) {
                System.out.println(brFiletest.readLine());
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {
                brFiletest.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //關檔
        }


    }
}
