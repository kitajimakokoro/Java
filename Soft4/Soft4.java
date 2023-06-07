class Soft4 {
  public static void main(String[] args) {

  int x = 1;

  for (int i=2;i<=7;i++) {
    // 1*2=2 2*3=6 6*4=24 24*5=120 120*6=720 720*7=5040
    x = x * i;
    System.out.println(x);
  }

  }
}

/*
1! = 1
2! = 2
3! = 6
4! = 24
5! = 120
6! = 720
7! = 5040
/*