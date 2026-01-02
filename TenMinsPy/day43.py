# attempt to list 24 timezones list (numeric array of objects/assoc array)

import datetime
import pytz

class day43:
    def displayTZ(self):
        for t in self.timezones:
            tz = pytz.timezone(t)
            dt = datetime.datetime.now(tz)
            print(f"{t} : {dt}")


    def __init__(self):
        self.timezones = [
            "America/New_York",
            "Europe/London",
            "Asia/Tokyo",
            "Australia/Sydney",
            "Europe/Paris",
            "America/Los_Angeles",
            "Asia/Kolkata",
            "America/Chicago",
            "Europe/Berlin",
            "Asia/Shanghai",
            "America/Toronto",
            "Europe/Moscow",
            "Asia/Dubai",
            "America/Sao_Paulo",
            "Europe/Rome",
            "Asia/Singapore",
            "America/Mexico_City",
            "Europe/Madrid",
            "Asia/Seoul",
            "America/Vancouver",
            "Europe/Amsterdam",
            "Asia/Jakarta",
            "America/Argentina/Buenos_Aires",
            "Europe/Istanbul"
        ]

day = day43()
day.displayTZ()