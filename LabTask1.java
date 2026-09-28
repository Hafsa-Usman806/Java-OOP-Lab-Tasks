class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}

public class LabTask1 {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("Circumference of c1 = " + c1.circumference());

        Circle c2 = new Circle(5);
        System.out.println("Circumference of c2 = " + c2.circumference());
    }
}