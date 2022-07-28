class Solution:
    def isValidSudoku(self, board):
        
        rowIsGood = True
        columnIsGood = True
        threeByThreeIsGood = True

        
        for row in board:
            # Check if each row is good
            
            rowChecker = {}
            for element in row:
                if element.isdigit():
                    if element not in rowChecker:
                        rowChecker[element] = 1
                    else:
                        rowIsGood = False
        return rowIsGood
    
    
board = [
 ["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]

s = Solution()

print(s.isValidSudoku(board))
