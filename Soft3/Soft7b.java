class Soft7b {
  public static void main(String[] args) {

    int point = Integer.parseInt(args[0]);

    if (point >= 80) {
      System.out.println("たいへんよくできました。");
    }
    else if (point >= 60) {
      System.out.println("よくできました。");
    }
    else {
      System.out.println("ざんねんでした。");
    }
  }
}

//if 80点以上か？
//else if 80点以上じゃなければ60点以上か（60点以上80点未満）
//else 60点以上でもない