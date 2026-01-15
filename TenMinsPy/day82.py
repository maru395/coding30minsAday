# updateCSVRow (rowID, column, value) -updates the specified rowId row's column value

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


# Example usage
update_csv_cell(2, 3, 99)