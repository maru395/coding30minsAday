# Ask for passsword input and require all (digit, symbol, uppercase, lowercase)

class day72:
    def checkPass(s):
        return any(c.isdigit() or (not c.isalnum() and not c.isspace()) or c.isupper() or c.islower() for c in s)

s = input("Enter password\n")
print (day72.checkPass(s))