# Check if string contains 1 digit, 1 symbol, 1 uppercase letter and 1 lowercase and is more than 10 characters long

import string

class day53:
    def __init__(self):
        s = input("Enter a string with 1 digit, 1 symbol, 1 uppercase and 1 lower and more than 10 characters long\n")
        digit = any(ch.isdigit() for ch in s)
        symbol = any(ch in string.punctuation for ch in s)
        upper = any(ch.isupper() for ch in s)
        lower = any(ch.islower() for ch in s)
        leng = len(s) > 10
        if digit and symbol and upper and lower and leng:
            print('yeah man')
        else:
            print(f"requirments: \ndigit: {digit} \nsymbol: {symbol} \nuppercase: {upper} \nlowercase: {lower} \ndigit: {leng}")

day53()