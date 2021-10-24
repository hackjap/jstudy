package abstractfactory2.win;

import abstractfactory2.abst.TextArea;

public class WinTextArea implements TextArea {
    @Override
    public String getText() {
        return "Win TextArea";
    }
}
