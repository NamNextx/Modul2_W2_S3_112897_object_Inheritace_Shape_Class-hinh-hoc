public class Main {
    public static void main(String[] args) {
        Shape hinhhoc= new Shape();
        System.out.println(hinhhoc);

        hinhhoc=new Shape("red",false);
        System.out.println(hinhhoc);


        Circle hinhTron =new Circle();
        System.out.println(hinhTron);

        hinhTron =new Circle(3);
        System.out.println(hinhTron);

        hinhTron=new Circle(2.3, "Blue",false);
        System.out.println(hinhTron);

        Square square=new Square();
        System.out.println(square);


    }
}
