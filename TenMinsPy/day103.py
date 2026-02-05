# press "R" to rename a column

import csv

def renameColumn(oldName, newName, file_path="D:/coding30minsAday/textFiles/JTrialCsv.csv"):
    try:
        # Step 1: Read all lines
        with open(file_path, "r") as f:
            lines = list(csv.reader(f))

        for i in range(len(lines[0])):
            if lines[0][i] == oldName:
                lines[0][i] = newName

        # Step 3: Rewrite the CSV
        with open(file_path, "w") as f:
            f.writelines(lines)

    except Exception as e:
        print("Error:", e)

def ask():
    choice = input("enter R to rename a column \n").strip()
    if choice.lower() == "R":
        oldName = input("enter old name")
        newName = input("enter new name")
        renameColumn(oldName, newName)

ask()