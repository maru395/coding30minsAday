# Check if password hash file exists, ask for a new password if not, if it exists, ask for the password, then validate using the stored hash txt file

import hashlib
import os

class day68():
    def __init__(self):
        print("hello")
        path = "D:/coding30minsAday/textFiles/textDay71P.txt"
        if os.path.exists(path):
            s = input("Enter password\n")
            newS = hashlib.sha1(s.encode()).hexdigest()
            with open(path, "r") as f:
                if newS in f.read():
                    print("nice")
                else:
                    print("missing")
        else:
            s = input("enter new password\n")
            newP = hashlib.sha1(s.encode()).hexdigest()
            with open(path, "w") as f:
                f.write(newP)

day68()