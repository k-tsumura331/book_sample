package chapter06_conditionbranch.switchcase.shape.v1;

public class ShowAreaLogic {
  void showArea(Object shape) {
    if (shape instanceof Rectangle) {
      System.out.println(((Rectangle) shape).area());
    }
    if (shape instanceof Circle) {
      System.out.println(((Circle) shape).area());
    }
  }
}
