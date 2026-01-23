# Ask for a rowid, delete csv row after confirmation prompt

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