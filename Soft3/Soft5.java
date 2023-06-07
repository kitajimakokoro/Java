class Soft5 {
  public static void main(String[] args) {

    int x = Integer.parseInt(args[0]);

    //２で割って余りが0になるかどうか
    if ((x % 2) == 0) {
      System.out.println("偶数");
    }
    else {
      System.out.println("奇数");
    }
  }
}