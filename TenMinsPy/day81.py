# using readAllCsvRows(), create function searchCsvRows(columnName, value) return array of rowId
import csv
from turtle import reset
from unittest import result

def searchCsvRows(columnName, value):
    result = []

    with open("D:/coding30minsAday/textFiles/JTrialCsv.csv", newline="") as file:
        reader = csv.reader(file)

        # read header only
        header = [h.strip() for h in next(reader)]
        col_index = header.index(columnName)

        # read rows one by one
        for row in reader:
            if row[col_index] == value:
                result.append(row[0])  # row ID (first column)

    return result

print(searchCsvRows("second", "2"))