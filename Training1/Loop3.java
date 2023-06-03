class Loop3 {
  public static void main(String[] args) {
    int[] score = {80,100,75};
    String[] name = {"北嶋", "山田", "中野"};

    for(int i=0; i<score.length; i++ ) {
      System.out.println(name[i] + "さん：" + score[i] + "点");
    }
    System.out.println("受験者数：" + score.length + "名");
  }
}