# Ask for a password and validate using a stored hash on txt file

import hashlib

class day67:
    def __init__(self):
        password = input("enter password\n")
        path = "D:/coding30minsAday/textFiles/textDay70P.txt"
        newPass = hashlib.sha256(password.encode()).hexdigest()
        
        with open(path, "r") as f:
            if newPass in f.read():
                print("match")
            else:
                print("mismatch")

day67()