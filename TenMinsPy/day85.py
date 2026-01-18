# ask for an email input, do not allow duplicates (findFirst

import re

def checkEmail(email):
    p = r".+\@.+\..+"
    if re.match(p, email):
            file_path = "D:/coding30minsAday/textFiles/JTrialCsv.csv"
            with open(file_path, "r") as f:
                if email in f.read():
                    print("duplicate input")
                else:
                    with open(file_path, "a") as f:
                        f.write(f"{email},")
    else:
        print('nah man')

checkEmail("wggaa@gmail.com")