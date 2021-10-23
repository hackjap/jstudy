package templatefactory;

import templatefactory.fw.Creator;
import templatefactory.fw.Item;

public class DefaultItemCreator extends Creator {


    @Override
    protected String end(String itemName) {
        System.out.println("Defalut 마무리 작업");
        return itemName;
    }

    @Override
    protected String init(String itemName) {
        System.out.println("Defalut 초기 작업 !");
        return itemName;
    }

    @Override
    protected Item createItem(String itemName) {
        return new DefaultItem(itemName);
    }
}
