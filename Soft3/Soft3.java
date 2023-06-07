class Soft3 {
  public static void main(String[] args){

    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

    if (x > y) {
      System.out.println("xはyより大きい");
    }
    else if (x < y) {
      System.out.println("xはyより小さい");
    }
  }
}