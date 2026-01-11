# create function getCsvColumnNumber(columnName) returns the position of the column (base 1)

import csv

class day79:
    def getCsvColumnNumber(columnName):
        with open("D:/coding30minsAday/textFiles/JTrialCsv.csv", "r") as file:
            r = csv.reader(file)
            col = next(r)
            for i, val in enumerate(col):
                if columnName == val.strip():
                    return i + 1

print(day79.getCsvColumnNumber("second"))