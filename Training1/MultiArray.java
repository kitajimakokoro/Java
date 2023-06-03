class MultiArray {
  public static void main(String[] args){
    int[][] allScore = { {10,20,30} , {40,50,60} };

    System.out.println(allScore[0][0] + "点");
    System.out.println(allScore[0][1] + "点");
    System.out.println(allScore[0][2] + "点");
    System.out.println(allScore[1][0] + "点");
    System.out.println(allScore[1][1] + "点");
    System.out.println(allScore[1][2] + "点");

    System.out.println("allScore：" + allScore.length);
    System.out.println("allScore[0]：" + allScore[0].length);
    System.out.println("allScore[1]：" + allScore[1].length);
  }
}