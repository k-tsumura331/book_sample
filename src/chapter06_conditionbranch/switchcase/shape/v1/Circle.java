package chapter06_conditionbranch.switchcase.shape.v1;

class Circle {
  private final double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  double area() {
    return radius * radius * Math.PI;
  }
}
