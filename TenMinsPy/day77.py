# create function readCsvRow(rowId) that returns a numeric array of the row values

import csv

class day77:
    def readCsvRow(rowId):
        with open("D:/coding30minsAday/textFiles/JTrialCsv.csv", "r", encoding="utf-8") as file:
            r = csv.reader(file)
            for i, row in enumerate(r, start=1): # only states the value one row at a time
                if i == rowId:
                    return [int(val.strip()) for val in row]
        return []

print(day77.readCsvRow(2))