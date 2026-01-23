# Ask for a text, search email or name then output matches

import csv

def search_multiple(name, file_path):
    result = []

    try:
        with open(file_path, newline='', encoding='utf-8') as csvfile:
            reader = csv.reader(csvfile)
            for row in reader:
                # Check each column for exact match
                for cell in row:
                    if name in cell:
                        result.append(','.join(row))  # Join row as string

    except Exception as e:
        print(f"Error: {e}")

    return result