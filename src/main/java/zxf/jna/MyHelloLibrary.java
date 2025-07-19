package zxf.jna;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface MyHelloLibrary extends Library {
    void hello(String name);

    static MyHelloLibrary getInstance() {
        return (MyHelloLibrary) Native.load("myhello", MyHelloLibrary.class);
    }
}
