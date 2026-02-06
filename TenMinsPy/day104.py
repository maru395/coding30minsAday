# sortColumn(rows, columnName) sorts rows array according to column specified, ascending alphabethical
import csv

def sort_column(column_name):
    file_path = "D:/coding30minsAday/textFiles/JTrialCsv.csv"
    
    try:
        # Read all content from the file
        with open(file_path, 'r', newline='', encoding='utf-8') as f:
            reader = csv.reader(f)
            lines = list(reader)
        
        # Check if file is empty
        if not lines:
            return

        # Extract header and rows
        header = lines[0]
        rows = lines[1:]
        
        # Find the column index
        try:
            index = header.index(column_name)
        except ValueError:
            print(f"Column '{column_name}' not found.")
            return

        # Sort the rows based on the column index (case-insensitive)
        # Lambda mimics: rowA[index].compareToIgnoreCase(rowB[index])
        rows.sort(key=lambda x: x[index].lower())

        # Combine header and sorted rows
        lines = [header] + rows

        # Write the sorted content back to the file
        with open(file_path, 'w', newline='', encoding='utf-8') as f:
            writer = csv.writer(f)
            writer.writerows(lines)
            
    except Exception as e:
        print(f"Error: {e}")