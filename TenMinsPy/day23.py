# Ask for a string input for numbers 1 to 10 in words (e.g. one, two...) then output it's translation in tagalog
class day23:
    def __init__(self):
        inp = input("Eenter a number from one to ten\n")
        dictionary = {
            "one": "isa",
            "two": "dalwa",
            "three": "tatlo",
            "four": "apat",
            "five": "lima",
            "six": "anim",
            "seven": "pito",
            "eight": "walo",
            "nine": "siyam",
            "ten": "sampu",
        }
        print(dictionary.get(inp))

day23()