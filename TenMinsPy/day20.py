# output fibonacci sequence (base 1) on each keypress

import keyboard

class day20:
    def __init__(self):
        inp = input("Enter to fibonacci and q to quit")
        a = 1
        b = 1
        while True:
            event = keyboard.read_event()
            if event.event_type == keyboard.KEY_DOWN:
                if event.name == 'enter':
                    print(a)
                    c = a + b
                    a = b
                    b = c
                elif event.name == 'q':
                    break;

day20()