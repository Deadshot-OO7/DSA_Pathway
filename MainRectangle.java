package Oops;

public class MainRectangle {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        r1.setHeight(-5);
        r1.setHeight(4);
        System.out.println(r1.getHeight());

        r1.setWidth(3);


        System.out.println(r1.getArea());


        ConstructorRectangle cr1 = new ConstructorRectangle(3,4);
        ConstructorRectangle cr2 = new ConstructorRectangle(-3,0);

        System.out.println(cr1.getHeight() + " " + cr1.getWidth());
        System.out.println(cr2.getHeight() + " " + cr2.getWidth());
    }
}
