# // Check if string contains at least 1 lowercase letter

class day52:
    def __init__(self):
        s = input('enter a string with a lower case\n')
        if any((ch.islower() for ch in s)):
            print('yeah man')
        else:
            print('nah man')

day52()