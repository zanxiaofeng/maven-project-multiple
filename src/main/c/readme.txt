Linux:
    gcc -shared -fPIC -c hello.c && gcc -shared -fPIC -o libmyhello.so hello.o
    ldd libmyhello.so
    ldd hello.o
MAC OSX:
    gcc -dynamiclib hello.c -o libmyhello.dylib