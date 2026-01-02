# Formerly day 67 Ask for a password input and save to a variable (and print out)

class day63:
    def __init__(self):
        s = input("Enter text\n")
        path = "D:/coding30minsAday/textFiles/textDay67P.txt"
        
        with open(path, "w") as f:
            f.write(s)
            # with opens a file, w is write, f is just a variable name

day63()