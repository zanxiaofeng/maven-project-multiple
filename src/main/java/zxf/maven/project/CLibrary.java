package zxf.maven.project;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public interface CLibrary extends Library {
    CLibrary INSTANCE = (CLibrary) Native.load(Platform.C_LIBRARY_NAME, CLibrary.class);

    void printf(String format, Object... args);
}