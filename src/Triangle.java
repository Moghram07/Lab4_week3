public class Triangle extends Shape{
    private double height;
    private double base;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        double area = 0.5 * this.base * this.height;
        System.out.println("triangle area is : "+ area);
        return area;
    }

    @Override
    public double calculateCircumference() {
    //assuming it's a right angle triangle
        // calculate the hypotenuse
        double hypotnues = Math.sqrt((base*base)+(height*height));
        double circumference = height + base + hypotnues;
        System.out.printf("Triangle circumference: %.2f ",circumference );
        return circumference;
    }
}
