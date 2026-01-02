# print out unique characters from a string using built-in array-unique function or it's equivalent
class day17:
    def __init__(self):
        s = "Banana"
        print("".join(dict.fromkeys(s)))

day17()