# validate email domain using fetch(or it's equivalent)

import sqlite3

def check_email(email):
    domain = email.split("@")[1]
    try:
        connect = sqlite3.connect("D:/coding30minsAday/textFiles/backlog.db")
        cursor = connect.cursor()
        
        # sql query
        cursor.execute("SELECT 1 FROM domains WHERE domain_name = ?", (domain,))
        
        result = cursor.fetchone()
        connect.close()
        return result is not None
    except Exception:
        return False

print(check_email("albert@gmail.com"))