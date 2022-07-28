
class Solution:
    def countNegatives(self, grid):
        count = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                num = grid[i][j]
                if num < 0:
                    # we have a negative number
                    count += 1
        return count

s = Solution()

input = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]

v = s.countNegatives(input)

print(v)