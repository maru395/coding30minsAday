# read all csv row and output

def show():
    file_path="D:/coding30minsAday/textFiles/JTrialCsv.csv"
    with open(file_path, "r") as f:
        lines = f.readlines()
        print(lines)

show()