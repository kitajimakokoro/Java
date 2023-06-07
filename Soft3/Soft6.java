class Soft6 {
  public static void main(String[] args) {

    int x = Integer.parseInt(args[0]);

    // xを2で割って余りがでるかどうか
    if ( (x % 2) == 0) {
      // ➔余りがでない＝偶数確定
      // xは0より大きい場合
      if(x >= 0) {
      System.out.println("正の偶数");
      }
      // そうでない場合
      else {
      System.out.println("負の遇数");
      }
    }
    // ➔余りがでた＝奇数確定
    else {
      // xは0より大きい場合
      if (x >= 0) {
      System.out.println("正の奇数");
      }
      // そうでない場合
      else {
      System.out.println("負の奇数");
      }
    }
  }
}