package templatefactory;

import templatefactory.fw.Creator;
import templatefactory.fw.Item;

public class Main {

    public static void main(String[] args) {

        Creator creator = new DefaultItemCreator();

        Item item1 = creator.create("나무칼");
        Item item2 = creator.create("나무방패");
        Item item3 = creator.create("나무갑주");

        item1.use();
        item2.use();
        item3.use();



    }
}