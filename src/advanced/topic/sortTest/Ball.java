package advanced.topic.sortTest;

class Ball {
    //建構子的名稱必須與類別(class)相同，後面接小括弧，類似方法(method)
    //可以提供參數(parameter)


    String name;

    public Ball() {
        this("NO BALL"); // 會使用Ball("No name")來建構
    }

    public Ball(String name) { //建構子的概念，定義物件傳入的參數
        this.name = name;
    }

    public void setName(String nana) {
        name = nana;
    }

    public String getName() {
        return name;

    }
}
