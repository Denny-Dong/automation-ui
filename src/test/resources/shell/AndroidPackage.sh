#!/bin/bash
readonly api_token=$1
readonly id=$2
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
get_download_token_url="http://api.fir.im/apps/$id/download_token?api_token=$api_token"
download_token_str=$(curl $get_download_token_url | /usr/local/bin/jq '.download_token')
download_token=${download_token_str:1:`expr ${#download_token_str} - 2`}
get_appPackage_url="http://download.fir.im/apps/$id/install?download_token=$download_token"
/usr/local/bin/wget -c -O ./src/test/apps/creams.apk $get_appPackage_url