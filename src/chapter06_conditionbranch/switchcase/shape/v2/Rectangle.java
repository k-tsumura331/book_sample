package chapter06_conditionbranch.switchcase.shape.v2;

class Rectangle implements Shape {
  private final double width;
  private final double height;

  Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public double area() {
    return width * height;
  }
}
