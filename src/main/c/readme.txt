gcc -shared -fPIC -c hello.c && gcc -shared -fPIC -o libmyhello.so hello.o
ldd hello