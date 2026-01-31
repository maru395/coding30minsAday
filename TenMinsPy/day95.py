# press D to delete a row, do feature from day90

import csv

def deleteCSVRow(row_id):
    try:
        ans = input("are you sure? (y/n)")
        if ans.strip().lower() == "y":
            # Step 1: Read all lines
            file_path="D:/coding30minsAday/textFiles/JTrialCsv.csv"
            with open(file_path, "r") as f:
                lines = f.readlines()

            # Step 2: Modify the value
            if len(lines) >= row_id:
                lines.pop(row_id - 1)

            # Step 3: Rewrite the CSV
            with open(file_path, "w") as f:
                f.writelines(lines)
        else:
            return

    except Exception as e:
        print("Error:", e)

def ask():
    choice = input("enter d to delete row\n").strip()
    if choice.lower() == "d":
        row_id = int(input("enter row id number"))
        deleteCSVRow(row_id)

ask()