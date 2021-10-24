package abstractfactory2.concrete;

import abstractfactory2.abst.GuiFactory;
import abstractfactory2.linux.LinuxGuiFactory;
import abstractfactory2.mac.MacGuiFactory;
import abstractfactory2.win.WinGuiFactory;

public class FactoryInstance {

    public static GuiFactory getGuiFac(int num) {

        switch (num) {
            case 0: return new MacGuiFactory();
            case 1: return new LinuxGuiFactory();
            case 2: return new WinGuiFactory();
        }


        return null;
    }
}
