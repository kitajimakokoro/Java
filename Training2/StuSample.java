class StuSample{
  public static void main(String[] args){
    //呼び出すクラス名 オブジェクト名 = new 呼び出すクラス名();
    Student stu1 = new Student();

    //オブジェクト名.変数名
    stu1.name = "菅原";

    //オブジェクト名.メソッド名
    stu1.setScore(90, 80);

    stu1.display();
    System.out.println("平均" + stu1.getAvg() + "点");
  }
}