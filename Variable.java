class Variable{
  public static void main(String[] args){
    int month; //➀データ型にintを指定し、変数にmonthを指定
    month = 9; //➁変数monthに9を代入
    int day = 16; //上記の１、２を同時に行うこともできる

    //画面に表示する
    System.out.println("このチャンネルは、");
    System.out.println(month + "月" + day + "日に公開しました！");
  }
}