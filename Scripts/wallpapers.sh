#!/bin/bash

#Get random pic from directory ~/Pictures/Wallpapers
PIC=$(ls ~/Pictures/Wallpapers/*.jpg | shuf -n1)

#Set this pic as wallpapers
gsettings set org.gnome.desktop.background picture-uri file://$PIC
