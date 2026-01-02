# Check if string contains '.'

class day46:
    def check(self, s):
        if '.' in s:
            print('contains .')
        else:
            print('no .')

day = day46()
s = input("Etner a .\n")
day.check(s)