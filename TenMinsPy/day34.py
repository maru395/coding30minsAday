# print out the current date time but with the specific format: Mon Jan 13 2025 14:54:30

from datetime import datetime

class day34:
    def __init__(self):
        now = datetime.now().strftime("%a %b %d %Y %H:%M:%S")
        print(now)

day34()