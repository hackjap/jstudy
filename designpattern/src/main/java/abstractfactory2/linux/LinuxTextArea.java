package abstractfactory2.linux;

import abstractfactory2.abst.TextArea;

public class LinuxTextArea implements TextArea {
    @Override
    public String getText() {
        return "Linux TextArea";
    }
}
