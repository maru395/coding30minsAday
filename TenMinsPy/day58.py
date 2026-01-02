# Check if string contains 8 or 10 digits (even if there's dash, space or + parenthesis) (02) 8-555-6677

import re

class day58:
    def __init__(self):
        maxL1 = 8
        maxL2 = 10
        digit = 0
        s = '(02) 8-555-6677'
        for c in s:
            if c in ('-',' ','+', '+', '(', ')'):
                maxL1 += 1
                maxL2 += 1
            if c.isdigit():
                digit += 1
        if (len(s) == maxL1 or len(s) == maxL2) and (digit == 8 or digit == 10):
            print('nice')
        else:
            print('nah')

day58()