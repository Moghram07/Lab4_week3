public class Rectangle extends Shape {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        System.out.println("Rectangle area: "+ width*height);
        return width*height;
    }

    @Override
    public double calculateCircumference() {
        System.out.println("Rectangle circumference: "+ (width+height)*2);
        return (width+height)*2;
    }
}
