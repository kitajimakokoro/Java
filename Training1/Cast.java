class Cast {
  public static void main(String[] args) {
    int price = Integer.parseInt(args[0]);
    double rate = 0.08; //消費税率8%
    int amount;

    amount = (int)(price * (1 + rate));
    //(1 + rate)=1.08
    //計算結果の小数点を切り捨てるためにint型にキャストしている
    System.out.println("税込金額：" + amount + "円");
  }
}