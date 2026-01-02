# Check if string is 8 digits or 11 (09123456789)

class day59:
    def __init__(self):
        s = '09123456789';
        if s.isdigit() and len(s) in (8, 11):
            print('nice')
        else:
            print('nah')

day59()