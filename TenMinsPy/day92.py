# output csv as pretty table (text format)

def show():
    file_path="D:/coding30minsAday/textFiles/JTrialCsv.csv"
    with open(file_path, "r") as f:
        lines = f.readlines()
        parts = []
        for l in lines:
            parts.append(l.strip().split(",")) 
        print(f"{'Email':<30} | {'Name':<20}")
        print("-" * 54)

        # Print rows
        for row in parts:
            print(f"{row[0]:<30} | {row[1]:<20}")

show()