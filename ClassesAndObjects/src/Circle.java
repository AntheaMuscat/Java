public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        // setting radius only if it is a positive value //
        if (radius < 0)
            return;

        this.radius = radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calculateCircumference(){
        double circumference = 2 * Math.PI * getRadius();
        return circumference;
    }

    public double calculateArea(){
        double area = Math.PI * Math.pow(getRadius(), 2);
        return area;
    }



}
