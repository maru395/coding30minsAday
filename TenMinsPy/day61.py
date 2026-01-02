# Check if string has 8 digits, or 11 digits starting with zero, or string begins with +, and contains 12 digits; valid: 8812-5566; (0922)3334455; +63922-3334455

import re

class day61:
    def checkNum(self, s):
        s = re.sub(r"[-()+]", "", s)
        if len(s) == 8 or (len(s) == 11 and s[0] == '0') or len(s) == 12:
            print('nice')
        else:
            print('nah')

day = day61()
s1 = "8812-5566"
s2 = "(0922)3334455"
s3 = "+63922-3334455"
day.checkNum(s1)
day.checkNum(s2)
day.checkNum(s3)