# Censor the word fuck and dead with constant length asterisk

class day44:
    def checkBadword(self, w):
        badwords = ['dead', 'fuck']
        for i in badwords:
            if i in w.lower():
                w = w.replace(i, "*"*len(i))
        print(w)

day = day44();
w = input("Enter a word\n")
day.checkBadword(w)