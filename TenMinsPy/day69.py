# Ask for password input and check if it contains a digit w/o using regex

class day69:
    def checkNum(s):
        return any(c.isdigit() for c in s)

p = input("enter password\n")
print(day69.checkNum(p))