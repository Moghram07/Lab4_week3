public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        System.out.println("Circle area: "+ radius*radius*Math.PI);
        return radius*radius*Math.PI;
    }

    @Override
    public double calculateCircumference() {
        return 2*Math.PI*radius;
    }
}
