# press "c" to add new column to the csv

def addColumn(columnName, file_path="D:/coding30minsAday/textFiles/JTrialCsv.csv"):
    try:
        # Step 1: Read all lines
        with open(file_path, "r") as f:
            lines = f.readlines()
            
        lines[0] = lines[0].strip() + "," + columnName + "\n"
        for i in range(1, len(lines)):
            lines[i] = lines[i].strip() + ",\n"

        # Step 3: Rewrite the CSV
        with open(file_path, "w") as f:
            f.writelines(lines)

    except Exception as e:
        print("Error:", e)

def ask():
    choice = input("enter c to add new column name\n").strip()
    if choice.lower() == "c":
        row_id = input("enter columnName")
        addColumn(row_id)

ask()