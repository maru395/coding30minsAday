# Check if string contains at least 1 digit

import re

class day49:
    def __init__(self):
        s = input("enter a string with a number\n")
        p = r".*[0-9].*"
        if re.search(p, s):
            print('yeah man')
        else:
            print('nah man')

day49()