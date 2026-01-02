# loop through a numeric array printing both the index and the value

class day13:
    def __init__(self):
        nums = [1,2,3,4,5]
        for i, n in enumerate(nums):
            print(f"{i} {n}")

day13()