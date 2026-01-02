# Ask for a password input and save to a txt file as md5 hash
import hashlib

class day64:
    def __init__(self):
        s = input("Enter a password\n")
        path = "D:/coding30minsAday/textFiles/textDay68P.txt"
        sHash = hashlib.md5(s.encode()).hexdigest()
        # hexdigest converts hash to readable string
        
        with open(path, "w") as f:
            f.write(sHash)

day64()