# Check if string contains 8 or 10 digits

class day57:
    def __init__(self):
        s = input("enter 8 or 10 digit num\n")
        if s.isdigit() and len(s) in (8, 10):
            print('nice')
        else:
            print('nah')

day57()