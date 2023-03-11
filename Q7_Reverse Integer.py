class Solution:
    def reverse(self, x: int) -> int:
        isnegative = False
        if x<0:
            isnegative = True
            x=-x
        reversenumber = 0
        while x:
            reversenumber = reversenumber*10+x%10
            x//=10
        if reversenumber >= 2**31-1 or reversenumber <= -2**31:
            return 0
        return -reversenumber if isnegative else reversenumber