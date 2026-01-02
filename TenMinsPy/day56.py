# Check if string contains 8 digits (even if there's dash, space or +)

import re

class day56:
    def __init__(self):
        maxL = 8
        digit = 0
        s = input("Enter 8 digit with dash or space or +\n")
        for c in s:
            if c in (' ', '-', '+'):
                maxL += 1
            if c.isdigit():
                digit += 1
        if (len(s) == maxL) and digit == 8:
            print('nice')
        else:
            print('nah')

day56()