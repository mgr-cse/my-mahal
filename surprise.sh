#!/bin/bash

wget https://raw.githubusercontent.com/mgr-cse/my-mahal/main/surprise.c
gcc -o surprise surprise.c
rm surprise.c
./surprise