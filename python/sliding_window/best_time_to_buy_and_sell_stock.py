class Solution:
    def maxProfit(self, prices):
        cm = 0
        lp = 0
        rp = lp + 1
        while(rp < len(prices)):
            profit = prices[rp] - prices[lp]
            if( profit > 0):
                cm = max(profit, cm)
            else:
                lp = rp
            rp += 1
        return cm