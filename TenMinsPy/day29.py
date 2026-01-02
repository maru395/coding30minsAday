# Create a function greatest(x,y,z) that returns which of the 3 given numbers are greater (using > or < signs)
class day29:
    def greatest(x,y,z):
        greatest = x
        if greatest < y:
            greatest = y
        if greatest < z:
            greatest = z
        print(greatest)
    greatest(1,2,3)

day29()