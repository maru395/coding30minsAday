# using readCSVRow(), create function readAllCsvRows()

import csv

class day78:
    def readAllCsvRow():
        with open("D:/coding30minsAday/textFiles/JTrialCsv.csv", "r", encoding="utf-8") as file:
            r = csv.reader(file)
            nums = []
            for row in r:
                nums += [int(val.strip()) for val in row]
        return nums

print(day78.readAllCsvRow())