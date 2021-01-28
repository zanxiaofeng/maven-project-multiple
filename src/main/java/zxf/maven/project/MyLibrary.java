package zxf.maven.project;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public interface MyLibrary extends Library {
    MyLibrary INSTANCE = (MyLibrary) Native.load("my.so", MyLibrary.class);
}
