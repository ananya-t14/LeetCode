class Solution:
    
    def merge(self, v, ans, l, mid, h):
        t = [] # temporary array for merging both halves
        i = l
        j = mid+1
        while (i < mid+1 and j <= h):
            # v[i][0] is greater than all
            # the elements from j till h.
            if v[i][0] > v[j][0]:
                ans[v[i][1]] += (h-j+1)
                t.append(v[i])
                i += 1
            else:
                t.append(v[j])
                j += 1
        # if any elements left in left array
        while (i <= mid):
            t.append(v[i])
            i += 1
        # if any elements left in right array
        while j <= h:
            t.append(v[j])
            j += 1
        # putting elements back in main array in
        # descending order
        k = 0
        i = l
        while (i <= h):
            v[i] = t[k]
            i += 1
            k += 1

    def mergesort(self, v, ans, i, j):
        if i < j:
            mid = (i+j)//2
            # calling mergesort for left half
            self.mergesort(v, ans, i, mid)
            # calling mergesort for right half
            self.mergesort(v, ans, mid + 1, j)
            # merging both halves and generating answer
            self.merge(v, ans, i, mid, j)

    def countSmaller(self, nums: List[int]) -> List[int]:
       	v = []
        n = len(nums)
    	# inserting elements and corresponding index as pair
        for i in range(n):
            v.append([nums[i], i])
    	# answer array for keeping count initialized by 0
        ans = [0]*n
	   	# calling mergesort
        self.mergesort(v, ans, 0, n-1)
        return ans