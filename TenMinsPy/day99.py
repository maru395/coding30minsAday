# deleteColumn(columnName) a function that will delete the specified columnName from the csv

import csv

def deleteColumn(columnName, file_path="D:/coding30minsAday/textFiles/JTrialCsv.csv"):
    try:
        # Step 1: Read all lines
        with open(file_path, "r") as f:
            lines = f.readlines()
            
        line = lines[0].strip().split(",")
        line.pop(columnName)
        lines[0] = ",".join(line) + "\n"
        for i in range(1, len(lines)):
            lines[i] = lines[i].strip() + ",\n"

        # Step 3: Rewrite the CSV
        with open(file_path, "w") as f:
            f.writelines(lines)

    except Exception as e:
        print("Error:", e)

# topic for midterm: ip address subnetting