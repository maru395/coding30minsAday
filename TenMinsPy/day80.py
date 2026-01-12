# create function getCsvCellValue(rowId, columnNumber)

import csv

class day80:
    def getCsvCellValue(rowId, columnNumber):
        with open("D:/coding30minsAday/textFiles/JTrialCsv.csv", "r", encoding="utf-8") as file:
            r = csv.reader(file)
            for i, row in enumerate(r, start=1): # only states the value one row at a time (enumerate adds counter per row in this code) 
                if i == rowId:
                    nums = [int(val.strip()) for val in row]
            for i in range(len(nums)):
                if i + 1 == columnNumber:
                    return nums[i]

print(day80.getCsvCellValue(2,2))