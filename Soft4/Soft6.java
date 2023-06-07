class Soft6 {
  public static void main(String[] args) {

    int count = 0;
    int total = 0;

    for (int i=1;i<=10;i++) {
      if ((i%2)==0) {
        count++; // 偶数の場合、個数をインクリメント(1づつ増やす)
        total = i + total; // 偶数の場合、合計に加算
      }
    }

    System.out.println("偶数の個数" + count);
    System.out.println("偶数の合計" + total);
  }
}