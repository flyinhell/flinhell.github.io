package advanced.topic;

public class jsonParserTest {
    public static void main(String[] args){
        String dbString ="[WH_Facebook_2%201902%, WH_Forum_3%201902%, WH_Youtube_13%201901%, WH_Facebook_Reply_6%201902%, WH_Youtube_12%201902%, WH_Facebook_Reply_13%201901%, WH_News_Reply_1%201902%, WH_News_1%201901%, WH_Facebook_1%201902%, WH_News_Today, WH_Youtube_12%201901%, WH_Bbs_Reply_1%201901%, WH_News_Reply_Today, WH_Facebook_Reply_9%201901%, WH_Youtube_3%201901%, WH_Bbs_Reply_2%201902%, WH_Bbs_1%201902%, WH_Forum_3%201901%, WH_Facebook_2%201901%, WH_Youtube_6%201901%, WH_Blog_1%201902%, WH_Facebook_Reply_2%201901%, WH_Youtube_5%201901%, WH_Facebook_Reply_13%201902%, WH_Facebook_1%201901%, WH_Facebook_Reply_4%201902%, WH_Youtube_9%201902%, WH_Bbs_Today, WH_Facebook_Reply_2%201902%, WH_Youtube_4%201901%, WH_Youtube_2%201902%, WH_Youtube_14%201901%, WH_Facebook_Reply_4%201901%, WH_Social_Today, WH_Facebook_Reply_14%201901%, WH_Facebook_Reply_17%201901%, WH_Facebook_Reply_16%201901%, WH_Facebook_Reply_6%201901%, WH_Bbs_Reply_1%201902%, WH_Today, WH_News_Reply_1%201901%, WH_News_2%201901%, WH_Youtube_10%201902%, WH_Youtube_11%201902%, WH_Facebook_Reply_17%201902%, WH_Bbs_Reply_2%201901%, WH_Facebook_Reply_16%201902%, WH_Facebook_Reply_9%201902%, WH_Youtube_7%201901%, WH_Facebook_Reply_14%201902%, WH_Youtube_11%201901%, WH_Facebook_Reply_7%201901%, WH_Facebook_Reply_12%201901%, WH_Youtube_7%201902%, WH_Youtube_14%201902%, WH_Social_1%201902%, WH_QA_1%201902%, WH_News_2%201902%, WH_Youtube_8%201901%, WH_Youtube_2%201901%, WH_Facebook_Reply_11%201901%, WH_News_1%201902%, WH_Forum_2%201901%, WH_Facebook_Reply_5%201901%, WH_Youtube_10%201901%, WH_Facebook_Reply_12%201902%, WH_Facebook_Reply_3%201901%, WH_Social_1%201901%, WH_QA_1%201901%, WH_Youtube_8%201902%, WH_Facebook_Reply_1%201901%, WH_Facebook_Reply_11%201902%, WH_Bbs_Reply_1_Today, WH_Bbs_Reply_3%201901%, WH_Bbs_Reply_2_Today, WH_Bbs_Reply_4%201901%, WH_News_Reply_2%201901%, WH_Forum_2%201902%, WH_Facebook_Reply_8%201902%, WH_Facebook_Reply_3%201902%, WH_Youtube_1%201902%, WH_Youtube_9%201901%, WH_Youtube_6%201902%, WH_Blog_1%201901%, WH_Facebook_Reply_15%201902%, WH_Bbs_Reply_3%201902%, WH_Youtube_5%201902%, WH_News_Reply_2%201902%, WH_Facebook_Reply_1%201902%, WH_Facebook_Reply_10%201901%, WH_Forum_1%201901%, WH_Youtube_1%201901%, WH_Facebook_Reply_8%201901%, WH_Youtube_4%201902%, WH_Bbs_Reply_4%201902%, WH_Youtube_3%201902%, WH_Facebook_Reply_15%201901%, WH_Facebook_Reply_7%201902%, WH_Forum_1%201902%, WH_Facebook_Reply_10%201902%, WH_Facebook_Reply_5%201902%, WH_FacebookToday, WH_Youtube_13%201902%, WH_Bbs_1%201901%]\n";
        int typeNumber =0;


        if(dbString.indexOf("WH_Forum")!=-1)    {
           // model.setTypeForum(1);
           // type = type + "Forum,";
            typeNumber++;
        }
        if(dbString.indexOf("WH_Bbs_")!=-1)    {
          //  model.setTypeBbs(1);
          //  type = type + "Bbs,";
            typeNumber++;
        }
        if(dbString.indexOf("WH_Bbs_Reply")!=-1)    {
           // model.setTypeBbsReply(1);
          //  type = type + "Bbs_Reply,";
            typeNumber++;
        }
        if(dbString.indexOf("WH_Social")!=-1)    {
           // model.setTypeSocial(1);
           // type = type + "Social,";
            typeNumber++;
        }
        if(dbString.indexOf("WH_Facebook_")!=-1 )  {
           // model.setTypeFacebook(1);
           // type = type + "Facebook,";
            typeNumber++;
        }
        if(dbString.indexOf("WH_Facebook_Reply")!=-1)    {
          //  model.setTypeFacebookReply(1);
          //  type = type + "Facebook_Reply,";
            typeNumber++;
        }
        if(dbString.indexOf("WH_Blog")!=-1) {
          //  model.setTypeBlog(1);
          //  type = type + "Blog,";
            typeNumber++;
        }
        if(dbString.indexOf("WH_News_")!=-1)    {
          //  model.setTypeNews(1);
          //  type = type + "News,";
            typeNumber++;
        }
        if(dbString.indexOf("WH_News_Reply")!=-1)    {
          //  model.setTypeNewsReply(1);
          //  type = type + "News_Reply,";
            typeNumber++;
        }
        if(dbString.indexOf("WH_Youtube")!=-1)    {
          //  model.setTypeYoutube(1);
          //  type = type + "Youtube,";
//                typeNumber++;
        }
        if(dbString.indexOf("WH_QA")!=-1)    {
          //  model.setTypeQA(1);
          //  type = type + "QA,";
            typeNumber++;
        }
        System.out.println(typeNumber);
    }

}
