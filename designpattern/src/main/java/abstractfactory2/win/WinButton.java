package abstractfactory2.win;

import abstractfactory2.abst.Button;

public class WinButton implements Button {
    @Override
    public void click() {
        System.out.println("Win 버튼");
    }
}
