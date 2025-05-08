import heapq

class Solution:
    def minTimeToReach(self, moveTime):
        m, n = len(moveTime), len(moveTime[0])
        directions = [(1, 0), (-1, 0), (0, 1), (0, -1)]
        result = [[float('inf')] * n for _ in range(m)]
        result[0][0] = 0
        pq = [(0, 0, 0)]

        while pq:
            curr_time, i, j = heapq.heappop(pq)

            if i == m - 1 and j == n - 1:
                return curr_time

            for dx, dy in directions:
                ni, nj = i + dx, j + dy
                if 0 <= ni < m and 0 <= nj < n:
                    move_cost = 2 if (ni+nj)%2==0 else 1
                    wait = max(moveTime[ni][nj] - curr_time, 0)
                    arr_time = curr_time + wait + move_cost

                    if result[ni][nj] > arr_time:
                        result[ni][nj] = arr_time
                        heapq.heappush(pq, (arr_time, ni, nj))

        return -1
