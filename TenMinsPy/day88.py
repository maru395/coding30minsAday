# Ask for a name, output all matching csv row (exact match) searchMultiple

import csv

def search_multiple(name, file_path):
    result = []

    try:
        with open(file_path, newline='', encoding='utf-8') as csvfile:
            reader = csv.reader(csvfile)
            for row in reader:
                # Check each column for exact match
                for cell in row:
                    if cell == name:
                        result.append(','.join(row))  # Join row as string
                        break  # Stop checking this row after match

    except Exception as e:
        print(f"Error: {e}")

    return result
