class Solution(object):
    def countDaysTogether(self, arriveAlice, leaveAlice, arriveBob, leaveBob):
        start = max(self.check(arriveAlice),self.check(arriveBob))
        end = min(self.check(leaveAlice),self.check(leaveBob))

        return max(0, end - start +1)

    def check(self, date):
        a = int(date[:2])
        b = int(date[3:])
        days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        return sum(days[:a-1]) + b

