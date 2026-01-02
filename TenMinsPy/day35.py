# output remaining seconds on the current day

from datetime import datetime

class day35:
    def __init__(self):
        n = (datetime.now().hour * 3600) + (datetime.now().minute * 60) + datetime.now().second
        print(86400 - n)

day35()