class Soft7 {
  public static void main(String[] args) {

    int x , y, t;

    x = 3;
    y = 7;

    // tに3を代入
    t = x;
    // xに7を代入
    x = y;
    // yにt(1行目で3を代入したので)3を代入
    y = t;

    System.out.println("x=" + x + ",y=" + y);
  }
}