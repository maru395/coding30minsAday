# Check if string contains 8 digits (even if there's dash)

import re

class day55:
    def __init__(self):
        s = input("Enter 8 digit number (- is ignored)\n")
        maxL = 8
        digit = 0
        for c in s:
            if c.isdigit(): 
                digit += 1
        for c in s:
            if (c == '-' ):
                maxL += 1
        if len(s) == maxL:
            print('nice')
        else:
            print('is not 8 digit or not a digit')

day55()