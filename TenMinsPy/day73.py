# Ask for passwoord input and require at least 3 (digit, symbol, uppercase, lowercase)

class day73:
    def checkPass(s):
        hasNum = any(c.isdigit() for c in s) 
        hasSym = any(not c.isalnum() and not c.isspace() for c in s)
        hasUp = any(c.isupper() for c in s)
        hasLow = any(c.islower() for c in s)
        min = sum(hasNum, hasSym, hasUp, hasLow)
        return min >= 3

s = input("Enter password\n")
print (day73.checkPass(s))