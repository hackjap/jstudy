package singleton;

import java.io.Serializable;

public class InnerStaticSingleton implements Serializable {

    // 기본 생성자 - private
    private InnerStaticSingleton() {

    }

    public static InnerStaticSingleton getInstance() {
        return InnerClass.instance;
    }

    private static class InnerClass {
        private static final InnerStaticSingleton instance = new InnerStaticSingleton();
    }


}

