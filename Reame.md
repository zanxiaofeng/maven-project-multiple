#There are several ways to make your target library available to your Java program:
    1. The preferred method is to set the jna.library.path system property to the path to your target library. This property is similar to java.library.path, but only applies to libraries loaded by JNA.
    2. Change the appropriate library access environment variable before launching the VM. This is PATH on Windows, LD_LIBRARY_PATH on Linux, and DYLD_LIBRARY_PATH on OSX.
    3. Make your native library available on your classpath, under the path {OS}-{ARCH}/{LIBRARY}, where {OS}-{ARCH} is JNA's canonical prefix for native libraries (e.g. win32-x86, linux-amd64, or darwin). If the resource is within a jar file it will be automatically extracted when loaded.
#run on MAC OSX:
    java -Djna.library.path="`pwd`/src/main/c" -jar target/maven-project-0.0.1-SNAPSHOT-jar-with-dependencies.jar