# (formerly day18) print out unique characters and their count on a string

from collections import Counter

class day24:
    def __init__(self):
        s = 'Banana'
        frq = Counter(s)
        orderedF = {c : frq[c] for c in dict.fromkeys(s)} # formats
        print(orderedF)

day24()