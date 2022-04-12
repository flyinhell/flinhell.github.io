package basic.topic;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class JavaB8 {
    public static boolean isNotFalse ;

    public static void main(String[] args) {
/**
 * 印出所有命令列參數。
 * 上述程式加上限制，當第一個參數為 -a時，若沒有提供第二個參數，則丟出訊息為”Argument 2 is required.”的Exception。
 */
        try {
            if (args[0].equals("-a")) {
                String strB = args[1]; //若是第一個arguments 為-a,第二個為空，則會exception 進入catch裡
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Argument 2 is required.");
            isNotFalse = true;
        }

        if (!isNotFalse) {
            for (int i = 0; i < args.length; i++) {

                System.out.print(args[i] + " ");    //印出所有命令列參數
            }

        }

    }
}
