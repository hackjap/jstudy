package prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle();

        circle.setId("1");

        circle.setX(1);
        circle.setY(1);
        circle.setR(3);

        circle.a.x = 1;

        Circle copyCircle = (Circle) circle.copy();

        System.out.println(circle.a.x);
        System.out.println(copyCircle.a.x);

        circle.a.x = 2;
        System.out.println(circle.a.x);
        System.out.println(copyCircle.a.x);

        circle.a.x = 3;
        System.out.println(circle.a.x);
        System.out.println(copyCircle.a.x);


    }
}
