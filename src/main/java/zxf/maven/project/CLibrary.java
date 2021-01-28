package zxf.maven.project;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public interface CLibrary extends Library {
    void printf(String format, Object... args);

    static CLibrary getInstance() {
        return (CLibrary) Native.load(Platform.C_LIBRARY_NAME, CLibrary.class);
    }
}