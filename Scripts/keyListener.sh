#!/bin/bash

#Change layout anyway
LAYOUT=$(gsettings get org.gnome.desktop.input-sources current | awk '{print $2}')

((LAYOUT++))

if [ $LAYOUT -eq 3 ];
	then
		LAYOUT=0
fi

#Change it back if in Idea
ACTIVE=$(xprop -id `xdotool getwindowfocus` | grep '_NET_WM_PID' | grep -oE '[[:digit:]]*$')

IDEA=$(ps -ef | awk '$8=="/home/shemyakovsergey/Installed/idea-IC-145.597.3/bin/../jre/jre/bin/java" {print $2}')

if [ $ACTIVE!=$IDEA ];
	then
		gsettings set org.gnome.desktop.input-sources current $LAYOUT 
fi
