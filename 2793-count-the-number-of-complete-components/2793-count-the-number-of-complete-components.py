class Solution:
    def countCompleteComponents(self, n: int, edges: list[list[int]]) -> int:
        g = [1 << v for v in range(n)]
        for u, v in edges:
            g[u] |= 1 << v
            g[v] |= 1 << u

        return sum(v == k.bit_count() for k, v in Counter(g).items())