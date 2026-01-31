# refactor the search to also include partial text matches

import csv

def search_multiple(name, file_path):
    result = []

    try:
        with open(file_path, newline='', encoding='utf-8') as csvfile:
            reader = csv.reader(csvfile)
            for row in reader:
                for cell in row:
                    if name.lower() in cell.lower():
                        result.append(','.join(row))  # Join row as string

    except Exception as e:
        print(f"Error: {e}")

    return result