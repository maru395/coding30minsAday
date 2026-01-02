# Ask for a password input and save to a txt file as sha256 hash
import hashlib;

class day66:
    def __init__(self):
        s = input("Enter password\n")
        path = "D:/coding30minsAday/textFiles/textDay70P.txt"
        p = hashlib.sha256(s.encode()).hexdigest()
        with open(path, "w") as f:
            f.write(p)

day66()