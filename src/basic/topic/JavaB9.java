package basic.topic;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.IOException;

public class JavaB9 {
    public static void main(String[] args)  {
/**
 * 請寫一個程式接受命令列第一個參數作為執行檔檔名，然後執行此參數代表之執行檔。
 */
        try {
            String[] cmd = new String[3];
            cmd[0] = "cmd.exe";
            cmd[1] = "/C";
            //填入執行程式路徑
            cmd[2] = args[0];
            System.out.println(cmd);
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
