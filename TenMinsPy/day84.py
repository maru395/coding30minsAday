# ask for an email input, add to csv (Create)
import re

def checkEmail(email):
    p = r".+\@.+\..+"
    if re.match(p, email):
            file_path = "D:/coding30minsAday/textFiles/JTrialCsv.csv"
            with open(file_path, "a") as f:
                f.write(f"{email},")
    else:
        print('nah man')

checkEmail("wifa@gmail.com")