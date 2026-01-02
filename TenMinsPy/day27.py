# Create a function that will subtract y from x, but only until zero
class day27:
    def sub(x, y):
        t = True
        while t:
            if x - y <= 0:
                print('0')
                t = False
            else:
                print(x - y)
                sum = x - y
                x = sum
    sub(100, 10)

day27()