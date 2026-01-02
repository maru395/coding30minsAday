# get remaining microseconds of current the day

from datetime import datetime

class day36:
    def __init__(self):
        n = (datetime.now().hour * 3600000000) + (datetime.now().minute * 60000000) + (datetime.now().second * 1000000) + datetime.now().microsecond
        print(86400000000 - n)

day36()