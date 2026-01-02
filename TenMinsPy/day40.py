# print out the date/time on New York City
from datetime import datetime
import pytz

class day40:
    def __init__(self):
        ny = pytz.timezone("America/New_York")
        dt = datetime.now(ny)
        print(dt)

day40()