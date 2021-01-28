package zxf.maven.project;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public interface MyHelloLibrary extends Library {
    void hello(String name);

    static MyHelloLibrary getInstance() {
        return (MyHelloLibrary) Native.load("myhello", MyHelloLibrary.class);
    }
}
