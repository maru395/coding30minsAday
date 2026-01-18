# ask for an email & name input, add to csv (2 columns) (Create)

import re

def checkEmail(email, name):
    p = r".+\@.+\..+"
    if re.match(p, email):
            file_path = "D:/coding30minsAday/textFiles/JTrialCsv.csv"
            with open(file_path, "r") as f:
                if email in f.read():
                    print("duplicate input")
                else:
                    with open(file_path, "a") as f:
                        f.write(f"{email}, {name}\n")
    else:
        print('nah man')

checkEmail("waa@gmail.com", "sister")