# Ask for a password input, if new, require strong password and register, if password exists(hashed password txt file), require existing password

import re


class day74:
    def checkPass(s):
        # checks the lenght of password
        if len(s) >= 8:
            passScore = 0
            usedLetters = []
            usedSigns = []
            # does not take space
            for c in s:
                if c.isspace():
                    return "error there is space"
                # check if letter is repeated and for symbols and numbers
                elif c.isalpha():
                    c = c.upper()
                    if c not in usedLetters:
                        usedLetters.append(c)
                    else:
                        passScore -= 5
                else:
                    if c not in usedSigns:
                        usedSigns.append(c)
                    else:
                        passScore -= 5
            # checks ratio of upper to lower characters
            upper = 0
            lower = 0
            for c in s:
                if c.isupper():
                    upper += 1
                if c.islower():
                    lower += 1
            # checks password score from given parameters
            for i in range((len(usedLetters) + len(usedSigns))):
                passScore += 3
            # returns values based on password score and other ideas
            if passScore <= 10 or len(usedSigns) <= 2 or abs(upper - lower) > 2:
                return "weak"
            elif passScore >= 11 and passScore <= 19 or len(usedSigns) <= 3 or abs(upper - lower) < 2:
                return "moderate"
            elif passScore >= 20 or len(usedSigns) <= 4:
                return "strong"
            else:
                return "error"
        else:
            return "Enter longer password"

s = input("Enter password\n")
print(day74.checkPass(s))