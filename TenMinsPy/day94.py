# press A to add new row, feature in day76

import os
import csv

def addToCsv():
    row = 1
    if os.path.exists("D:/coding30minsAday/textFiles/cvsDay76P.csv"):
        with open("D:/coding30minsAday/textFiles/cvsDay76P.csv", "a", newline="", encoding="utf-8") as file:
            w = csv.writer(file)
            w.writerow("")
            
        with open("D:/coding30minsAday/textFiles/cvsDay76P.csv", "r", newline="", encoding="utf-8") as file:
            row = sum(1 for _ in file) + 1
    else:
        with open("D:/coding30minsAday/textFiles/cvsDay76P.csv", "w", newline="", encoding="utf-8") as file:
            writer = csv.writer(file)
            writer.writerows("")
    return row

def ask():
    choice = input("enter a to append new row\n").strip()
    if choice.lower() == "a":
        addToCsv()

ask()