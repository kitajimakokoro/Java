class Soft8 {
  public static void main(String[] args) {

    int[] num = new int[20];

    //num[0] = 0*5 =0
    //num[1] = 1*5 =5
    //num[2] = 2*5 =10
    //num[3] = 3*5 =15...
    for (int i=0; i<num.length; i++) {
      num[i] = i * 5;
    }

    for (int i = 0; i<=10; i++) {
      if (num[i] % 2 != 0) {
        System.out.print(num[i]);
        if (i != 10) {
          System.out.print(",");
        }
      }
    }

    for (int i = 11;i<20;i++) {
      if (num[i] % 2 == 0) {
        System.out.print(num[i]);
        //カンマ調整したけどこの書き方はたぶんあんまよくない
        if(i != 18) {
          System.out.print(",");
        }
      }
    }
  }
}