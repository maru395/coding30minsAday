# Check if string contains '@' and '.' using regex

import re

class day47:
    def check(self, s):
        pattern = r".*@.*\..*"
        if re.search(pattern, s):
            print('valid\n')
        else:
            print('nah man\n')

day = day47()
s = input('enter @ and .\n')
day.check(s)