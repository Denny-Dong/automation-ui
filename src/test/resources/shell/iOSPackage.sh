#!/bin/bash
readonly dir="./src/test/apps"
if [ -e $dir ]
then 
	echo "apps folder exist , reset dir !"
	rm -rf  $dir
	mkdir $dir
else
	echo "apps folder not exist , create dir ！"
	mkdir $dir
fi
