class Solution(object):
    def longestValidParentheses(self, s):
        """
        :type s: str
        :rtype: int
        """
        
        new = []
        new.append(-1)
        x = 0

        for i in range(len(s)):
            if(s[i] == '('):
                new.append(i)
            else:
                new.pop()

                if not new:
                    new.append(i)
                else:
                    x = max(x, i - new[-1])
        
        return x