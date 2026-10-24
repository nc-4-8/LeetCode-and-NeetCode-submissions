class Solution(object):
    def countDaysTogether(self, arriveAlice, leaveAlice, arriveBob, leaveBob):
        start = max(self.check(arriveAlice),self.check(arriveBob))
        end = min(self.check(leaveAlice),self.check(leaveBob))

        return max(0, end - start +1)

    def check(self, date):
        a = int(date[:2])
        b = int(date[3:])
        return (275 * a)//9 - 2 * ((a+9)//12) + b - 30

