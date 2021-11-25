import static java.lang.Math.PI;

class Circle implements Measurable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }
}

// do not change the interface
interface Measurable {
    double area();
}