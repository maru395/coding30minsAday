# ask for a year input and output if it's a leap year or not using built in functions if possible

import calendar

class day38:
    def __init__(self):
        y = int(input("Enter a year\n"))
        print(calendar.isleap(y))

day38()