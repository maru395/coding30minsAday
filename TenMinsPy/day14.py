# split a name string into a char-array, then capitalize the first letter by overwriting char-array item zero, then reconstruct into a string
class day14:
    def __init__(self):
        name = 'marvin'
        char = list(name)
        char[0] = char[0].upper()
        newS = ''.join(char)
        print(f"{newS}")

day14()