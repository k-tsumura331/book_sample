package chapter06_conditionbranch.switchcase.shape.v1;

class Rectangle {
  private final double width;
  private final double height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  double area() {
    return width * height;
  }
}
