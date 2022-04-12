package basic.topic;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class JavaB2 {
    public static void main(String[] args) {
        /**
         請將字串”select * from abc ” 及字串”where id=2”加入同一個StringBuffer後，將StringBuffer內容印出
         */
        try {
            String strA = "select * from abc";

            String strB = " where id=2";
            StringBuffer newBuffer = new StringBuffer();
            newBuffer.append(strA); //將strA及strB加入newBuffer
            newBuffer.append(strB);

            System.out.println("newBuffer:" + newBuffer);
            newBuffer.delete(0, newBuffer.length());
            System.out.println("newBuffer:" + newBuffer);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
