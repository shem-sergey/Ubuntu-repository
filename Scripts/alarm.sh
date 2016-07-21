# Need to add following line to crontab (via "crontab -e"):
#   minute (0-59),
#   |   hour (0-23),
#   |   |   day of the month (1-31),
#   |   |   |   month of the year (1-12),
#   |   |   |   |   day of the week (0-6 with 0=Sunday).
#   |   |   |   |   |   commands
#   0   9   *   *   1,2,3,4,5 /home/user/Scripts/alarm.sh

amixer -D pulse sset Master 100%
env DISPLAY=:0 xdg-open /home/shemyakovsergey/Music/alarm.mp3
