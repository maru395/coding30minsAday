# Ask for a input, print out the unique characters on that input

class day18:
    def __init__(self):
        inp = input("Enter string\n") #\n is newLine
        print("".join(dict.fromkeys(inp)))

day18()