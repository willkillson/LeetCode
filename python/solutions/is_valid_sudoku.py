class Solution:
    def isValidSudoku(self, board):
        
        rowIsGood = True
        columnIsGood = True
        threeByThreeIsGood = True
        
        #Check rows
        for i in range(len(board)):            
            mySet = set()
            for j in range(len(board[0])):
                if board[i][j].isdigit():
                    if board[i][j] in mySet:
                        rowIsGood = False
                    else:
                        mySet.add(board[i][j])
        
        #Check columns
        for i in range(len(board)):            
            mySet = set()
            for j in range(len(board[0])):
                if board[j][i].isdigit():
                    if board[j][i] in mySet:
                        columnIsGood = False
                    else:
                        mySet.add(board[j][i])
                        
        # check 3x3 grid
        for i in range(3):
            for j in range(3):
                # Center points
                cj = (3 * j) + 1
                ci = (3 * i) + 1
                mySet = set()
                for k in range(-1,2,1):
                    for l in range(-1,2,1):
                        if board[k+cj][l+ci].isdigit():
                            if board[k+cj][l+ci] in mySet:
                                threeByThreeIsGood = False
                            else:
                                mySet.add(board[k+cj][l+ci])
                        
                        
        return rowIsGood and columnIsGood and threeByThreeIsGood
    

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

# s.isValidSudoku(board)
print(s.isValidSudoku(board))
