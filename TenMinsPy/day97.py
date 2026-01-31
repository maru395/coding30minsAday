# press 'u' to update a row, ask for a rowId, then ask for the field values (day 82)

import csv

def update_csv_cell(row_id, column_number, value, file_path="D:/coding30minsAday/textFiles/JTrialCsv.csv"):
    try:
        # Step 1: Read all lines
        with open(file_path, "r") as f:
            lines = f.readlines()

        # Step 2: Modify the value
        if len(lines) >= row_id:
            cells = lines[row_id - 1].strip().split(",")
            if column_number <= len(cells):
                cells[column_number - 1] = str(value)  # Python is 0-indexed
                lines[row_id - 1] = ",".join(c.strip() for c in cells) + "\n"

        # Step 3: Rewrite the CSV
        with open(file_path, "w") as f:
            f.writelines(lines)

    except Exception as e:
        print("Error:", e)

def ask():
    choice = input("enter u to update row\n").strip()
    if choice.lower() == "u":
        row_id = int(input("enter row id number"))
        column_number = int(input("enter column id number"))
        value = (input("enter new value"))

ask()