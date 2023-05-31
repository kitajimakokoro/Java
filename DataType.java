class DataType{
  public static void main(String[] args){
    int month = 7;
    int day = 6;
    float weight = 45.0f; //f付ける
    double height = 153.5;
    char bloodType = 'O'; //シングルクォーテーションで囲む

    String name = "こころ"; //ダブルクォーテーションで囲む

    System.out.println("こんにちは！" + name + "です。");
    System.out.println("身長は" + height + "cm、体重は" + weight + "kg、");
    System.out.println("誕生日は" + month + "月" + day + "日、");
    System.out.println("血液型は" + bloodType + "型です。");
    System.out.println("よろしくお願いします！");
  }
}