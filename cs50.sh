#!/bin/bash

# install prerequisites
apt-get install -y clang binutils git

if [ -d libcs50 ]; then
	rm -rf libcs50
fi
git clone https://www.github.com/cs50/libcs50

# compile shit
cd libcs50/src
gcc -c -std=c11 cs50.c
ar rcs libcs50.a cs50.o

# install shit
cp cs50.h $PREFIX/include/cs50.h
header=$?
cp libcs50.a $PREFIX/lib/libcs50.a
lib=$?
if [ $header -eq 0 -a $lib -eq 0 ]; then
	echo "you got libcs50, go brrrrr! mahal ko!"
else
	echo "there was some problem :-(, tell me!"
fi
