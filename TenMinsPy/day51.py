# Check if string contains at least 1 upper case letter

class day50:
    def __init__(self):
        s = input('enter a string with at least 1 upper case letter\n')
        if any(ch.isupper() for ch in s):
            print('yeah man')
        else:
            print('nah man')

day50()