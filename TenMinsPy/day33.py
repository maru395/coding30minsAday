# print out current unix timestamp in seconds and milliseconds using built in functions if available

import time

class day33:
    def __init__(self):
        s = int(time.time())
        ms = int(time.time() * 1000)
        print(f"Seconds: {s} \nMiliseconds: {ms}")

day33()