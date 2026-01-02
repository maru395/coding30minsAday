# ask for date input and convert to unix timestamp

from datetime import datetime, timezone

class day39:
    def __init__(self):
        nd = input("Enter a date in YYYY-MM-DD format\n")
        days = nd.split("-") #this is an array of sorts
        dt = datetime(int(days[0]), int(days[1]), int(days[2]))  # 2025-11-28 14:30
        unix_ts = int(dt.replace(tzinfo=timezone.utc).timestamp())
        print(unix_ts)

day39()