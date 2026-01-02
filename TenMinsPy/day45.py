# supposedly day 46 Check if string contains '@'

class day45:
    def check(self, s):
        if '@' in s:
            print('contains @')
        else:
            print('invalid email')

day = day45()
s = input("Etner a email\n")
day.check(s)