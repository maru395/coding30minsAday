# ask for an email input require gmail, yahoo or outlook only

def check_email(email):
    domain = email.split("@")[1]
    
    providers = {
        "gmail.com", "googlemail.com",
        "yahoo.com", "ymail.com", "rocketmail.com", "yahoo.co.uk", "yahoo.ca",
        "outlook.com", "hotmail.com", "live.com", "msn.com"
    }
    
    return domain in providers

print(check_email("clausmarvinhipolito@gmail.com"))