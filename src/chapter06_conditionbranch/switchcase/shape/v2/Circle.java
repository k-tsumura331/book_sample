package chapter06_conditionbranch.switchcase.shape.v2;

class Circle implements Shape {
  private final double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    return radius * radius * Math.PI;
  }
}
