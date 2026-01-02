# get date yesterday and output (date/time manipulation [substraction and rounding off])

from datetime import datetime, timedelta

class day42:
    def __init__(self):
        t = datetime.now() - timedelta(hours=24)
        print(t)

day42()