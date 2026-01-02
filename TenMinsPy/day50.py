# Check if string contains at least 1 symbol

import string

class day50:
    def __init__(self):
        s = input('enter a unique character\n')
        if any(ch in string.punctuation for ch in s):
            print('yeah man')
        else:
            print('nah man')

day50()