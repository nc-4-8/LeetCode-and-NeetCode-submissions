class Solution:
    def findKthSmallest(self, coins: list[int], k: int) -> int:
        coins.sort()
        list = []
        for i in coins:
            if all(i % x for x in list):
                list.append(i)

        n = len(list)

        def check(mid):
            y = 0
            for i in range(1, n + 1):
                q = (1 << i) - 1
                z = 1 << n
                a = ((i & 1) << 1) - 1

                while q < z:
                    x = 1
                    for j in range(n):
                        if (q >> j) & 1:
                            x = lcm(x, list[j])

                    y += (mid // x) * a

                    i = q & -q
                    r = q + i
                    q = (((r ^ q) >> 2) // i) | r
            return y >= k

        return bisect_left(range(list[0] * k + 1), True, lo=k, key=check)