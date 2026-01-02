# Ask for a password input and save to a txt file as sha1 hash
import hashlib

class day65:
    def __init__(self):
        s = input("Enter a password\n")
        path = "D:/coding30minsAday/textFiles/textDay69P.txt"
        sSha = hashlib.sha1(s.encode()).hexdigest()
        # hexdigest converts hash to readable string
        
        with open(path, "w") as f:
            f.write(sSha)

day65()