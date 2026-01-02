# add 1 hour interval to current time and output (date/time manipulation [oop??])

from datetime import datetime, timedelta

class day41:
    def __init__(self):
        t = datetime.now() + timedelta(hours=1)
        print(t)

day41()