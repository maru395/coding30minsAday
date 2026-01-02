# Check if string is 8 digits

class day54:
    def __init__(self):
        digit = 0
        s = input('enter 8 digit number\n')
        for c in s:
            if c.isdigit():
                digit += 1
        if len(s) == 8 and digit == 8:
            print('nice')
        else:
            print("insufficient length or not a digit")

day54()