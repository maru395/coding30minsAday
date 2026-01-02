# Ask for a number input, print an error when it's not a number using if else
class day21:
    def __init__(self):
        while True:
            inp = input("Enter a number and q to exit\n")
            ascii = ord(inp)
            if (inp.lower() == 'q'):
                break
            elif (ascii < 58 and ascii > 47):
                ()
            else:
                print("Error")

day21()