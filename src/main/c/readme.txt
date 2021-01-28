Linux:
    gcc -shared -fPIC -c hello.c && gcc -shared -fPIC -o libmyhello.so hello.o
    ldd hello
MAC OSX:
    gcc -dynamiclib hello.c -o libmyhello.dylib