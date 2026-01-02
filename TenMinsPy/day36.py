# get remaining milliseconds of current the day

from datetime import datetime

class day36:
    def __init__(self):
        n = (datetime.now().hour * 3600000) + (datetime.now().minute * 60000) + (datetime.now().second * 1000) + (datetime.now().microsecond // 1000)
        print(86400000 - n)

day36()