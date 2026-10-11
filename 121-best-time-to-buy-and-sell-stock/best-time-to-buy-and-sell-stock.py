class Solution(object):
    def maxProfit(self, prices):
        buyPrice = prices[0]
        maxProfit = 0

        for p in prices[1: ]:
            if(p<buyPrice):
                buyPrice = p
            maxProfit = max(maxProfit, p - buyPrice)
        
        return maxProfit
            
        