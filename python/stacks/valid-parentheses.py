class Solution:
    def isValid(self, s):
        stack = []
        closeToOpen = { ")": "(", "]":"[", "}":"{"}

        for c in s:
            if c in closeToOpen:
                # Python -1 is the last element that was added
                if stack and stack[-1] == closeToOpen[c]:
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)
        # Return true if the stack is empty, else return false
        return True if not stack else False
            