# Check if the string matches email pattern .+\@.+\..+

import re

class day48:
    def __init__(self):
        s = input("enter string\n")
        p = r".+\@.+\..+"
        if re.match(p, s):
            print('yeah man')
        else:
            print('nah man')

day48()