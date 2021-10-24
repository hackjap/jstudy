package abstractfactory2;

import abstractfactory2.abst.Button;
import abstractfactory2.abst.GuiFactory;
import abstractfactory2.abst.TextArea;
import abstractfactory2.concrete.FactoryInstance;
import abstractfactory2.linux.LinuxGuiFactory;
import abstractfactory2.mac.MacGuiFactory;
import abstractfactory2.win.WinGuiFactory;

public class Main {

    public static void main(String[] args) {

        GuiFactory factory = FactoryInstance.getGuiFac(1);

        if (factory != null) {
            factory.createButton().click();
            TextArea textArea = factory.createTextArea();
            System.out.println(textArea.getText());
        }

//        GuiFactory linuxFactory = new LinuxGuiFactory();
//        Button button = linuxFactory.createButton();
//        TextArea textArea = linuxFactory.createTextArea();
//        button.click();
//        System.out.println(textArea.getText());
//
//        // 맥
//        GuiFactory macFactory = new MacGuiFactory();
//        Button macButton = macFactory.createButton();
//        TextArea macTextArea = macFactory.createTextArea();
//        macButton.click();
//        System.out.println(macTextArea.getText());
//
//        // 윈도우
//
//        GuiFactory winFactory = new WinGuiFactory();
//        Button winButton = winFactory.createButton();
//        TextArea winTextArea = winFactory.createTextArea();
//        winButton.click();
//        System.out.println(winTextArea.getText());

    }
}
