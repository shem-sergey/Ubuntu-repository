#!/bin/bash

cacaview "$1" &
sleep 1

xdotool key "ctrl+1"
xdotool key "f"
