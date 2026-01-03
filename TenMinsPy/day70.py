# Ask for password input and check if it contains lowercase letter w/o using regex

class day70:
    def checkLower(s):
        return any(c.islower() for c in s)

s = input("Enter password\n")
print(day70.checkLower(s))