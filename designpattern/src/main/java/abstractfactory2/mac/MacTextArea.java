package abstractfactory2.mac;

import abstractfactory2.abst.TextArea;

public class MacTextArea implements TextArea {
    @Override
    public String getText() {
        return "Mac TextArea";
    }
}
