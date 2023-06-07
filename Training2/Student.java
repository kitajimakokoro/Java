class Student{
  //メンバ変数（属性）
  String name;
  int engScore;
  int mathScore;

  //メソッド（操作）
  //戻り値の型 メソッド名(引数（呼び出し元から受け取り値）リスト)
  void display(){
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
  }

  //呼び出し元に何も返さない場合、voidを指定ri
  void setScore(int eng, int math){
    engScore = eng;
    mathScore = math;
  }
  double getAvg(){
    double avg = (engScore + mathScore) / 2.0;
    return avg;
  }
}