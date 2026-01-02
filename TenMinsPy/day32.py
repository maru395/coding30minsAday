# print out current date; then print out current time; using 2 separate function call, but outputting on the same line

from datetime import datetime, date

class day32:
    def __init__(self):
        d = date.today()
        t = datetime.now().time()
        print(f"Date: {d} \nTime: {t}")

day32()