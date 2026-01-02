# Check if string is 8 digits or 11 or starting with +, plus 12 digits (+63)

class day60:
    def checkNum(self, s):
        if s[0] == '+':
            s = s[1:]
            if len(s) == 12 and s.isdigit():
                print('nice')
            else:
                print('nah')
        else:
            if len(s) in (8,11) and s.isdigit():
                print('nice')
            else:
                print('nah')

day = day60()   
s = input('enter num\n')
day.checkNum(s)