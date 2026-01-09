# Ask for a credit/debit card input then validate using regex

import re
import string

class day75:
    def checkCard(s):
        p = r"^(\d{4}[- ]?){3}\d{4}|\d{15}$"
        if re.search(p, s):
            return True
        else:
            return False

s = input("Enter password\n")
print(day75.checkCard(s))