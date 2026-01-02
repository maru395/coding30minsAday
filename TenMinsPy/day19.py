# output a number, and wait for a keypress, then increment the number and print it out, then repeat
import keyboard
class day19:
    def __init__(self):
        num = 0
        while True:
            print(num)
            keyboard.read_event()
            num += 1
            if num == 10:
                break

day19()