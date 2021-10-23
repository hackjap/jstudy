package prototype;

public class A implements Cloneable {

    public int x,y;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
