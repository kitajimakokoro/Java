class Soft10 {
  public static void main(String[] args) {

    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

    if ((x < y) && ((x % 2) == 0) && ((y % 2) == 0)) {
      System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
    }

    if ((x == y) && (x < 0)) { //数が等しいのでy分を書く必要はない
      System.out.println("xとyは等しく、かつ、負の数である。");
    }

    if ((x < y) || ((x % 2) == 0)) {
      System.out.println("xはyより小さい、または、xは偶数である。");
    }

    if (((x <= 10) || (x >= 100)) && ((y >= 10) && (y <= 100))) {
      System.out.println("xは10以下または100以上で、かつ、yは10以上かつ100以下である。");
    }

    if (!(x < 0 && y < 0)){
      System.out.println("xもyも負の数である、ではない。");
    }
  }
}