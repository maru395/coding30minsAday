# ask for an email & name input, if email is duplicate, update name(Update)

import re

def checkEmail(email, name):
    pattern = r".+@.+\..+"
    file_path = "D:/coding30minsAday/textFiles/JTrialCsv.csv"

    if not re.match(pattern, email):
        print("nah man")
        return

    lines = []
    found = False

    with open(file_path, "r") as f:
        for line in f:
            if line.startswith(email + ","):
                lines.append(f"{email}, {name}\n")  # update
                found = True
            else:
                lines.append(line)

    with open(file_path, "w") as f:
        f.writelines(lines)

    if not found:
        with open(file_path, "a") as f:
            f.write(f"{email}, {name}\n")
        print("Email saved successfully")
    else:
        print("Duplicate email found — name updated")