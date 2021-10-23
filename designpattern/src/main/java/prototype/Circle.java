package prototype;

import java.rmi.MarshalledObject;

public class Circle extends Shape {

    int x,y;
    int r;
    public Double d;
    public A a;

    public Circle() {
        a = new A();
    }




    public Shape copy() throws CloneNotSupportedException {
        Circle shape = (Circle) clone();

        shape.x += 1;
        shape.y += 1;
        shape.setA((A) shape.getA().clone());

        return shape;
    }



    // @Data

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}
