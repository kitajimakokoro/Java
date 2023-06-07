class Soft3 {
  public static void main(String[] args) {

  int x = 1;

  for (int i=1;i<=8;i++) {
    //1回目 xは1 1*2=2
    //2回目 xは2 2*2=4
    //3回目 xは4 4*2=8  xの値が変化していく
    x = 2*x;
    System.out.println(x);
  }

  }
}