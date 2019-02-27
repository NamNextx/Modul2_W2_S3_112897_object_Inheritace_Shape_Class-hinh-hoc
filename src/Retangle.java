public class Retangle extends Shape {
    private double width = 4;
    private double length = 4;

    public Retangle() {

    }

    public Retangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Retangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString(){
        return  "A Rectangle with width="+getWidth()+" and length="+getLength()+", which is a subclass of"+super.toString();
    }

}
