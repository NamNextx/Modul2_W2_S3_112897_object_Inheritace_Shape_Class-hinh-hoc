public class Square extends Retangle {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    public double getSide() {
        return getWidth();
    }
    @Override
    public void setWidth(double side){
        setWidth(side);
    }
    @Override
    public void setLength(double side){
        setLength(side);
    }
    @Override
    public String toString(){
        return "A Square with side= "+getSide()+", which is a subclass of "+super.toString();
    }

}
