#!/bin/bash

#Change layout anyway
LAYOUT=$(setxkbmap -print | grep xkb_symbols | awk '{print $4}' | awk -F"+" '{print $2}')
echo $LAYOUT > /home/robaut/yay.txt
if [ "$LAYOUT" == "us" ];
	then
		setxkbmap by
		echo by > /home/robaut/yay.txt


else if [ "$LAYOUT" == "by" ];
	then
		setxkbmap ru
		echo ru > /home/robaut/yay.txt
		

		else if [ "$LAYOUT" == "ru" ];
			then
				setxkbmap us
				echo us > /home/robaut/yay.txt
			fi
	fi
fi
#Change it back if in Idea
ACTIVE=$(xprop -id `xdotool getwindowfocus` | grep '_NET_WM_PID' | grep -oE '[[:digit:]]*$')

IDEA=$(ps -ef | awk '$8=="/home/robaut/Installed/idea-IC-145.258.11/bin/../jre/jre/bin/java" {print $2}')

if [ $ACTIVE==$IDEA ];
	then
		setxkbmap us
fi

	
