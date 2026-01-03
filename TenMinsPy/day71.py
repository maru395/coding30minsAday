# Ask for password input and check if it contains a symbol w/o using regex

class day71:
    def checkSymbol(s):
        return any(not c.isalnum() and not c.isspace() for c in s)

s = input("password")
print(day71.checkSymbol(s))