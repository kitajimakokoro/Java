class Soft9 {
  public static void main(String[] args) {

    int day = Integer.parseInt(args[0]);
    int time = Integer.parseInt(args[1]);

    if ((time == 0) && ((day == 0)||(day == 2)||(day == 5))) {
      System.out.println("休診です");
    }
    else if ((time == 1) && ((day == 0)||(day == 6))) {
      System.out.println("休診です");
    }
    else if ((time == 2) && ((day == 0)||(day == 3)||(day == 6))) {
      System.out.println("休診です");
    }
    else {
      System.out.println("通常営業です");
    }
  }
}

// 0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜
// 0=午前、1=午後、2=夜間