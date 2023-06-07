class Soft7c {
  public static void main(String[] args) {

    int point = Integer.parseInt(args[0]);

    if (point >= 80) {
      System.out.println("優");
    }
    else if (point >= 70) {
      System.out.println("良");
    }
    else if (point >= 60) {
      System.out.println("可");
    }
    else {
      System.out.println("不可");
    }
  }
}