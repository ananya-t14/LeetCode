class Solution {
    public int countDigitOne(int n) {
        int count = 0;
        int factor = 1; // to handle overflow for large values of n
        
        while (factor <= n) {
            int curr = (n / factor) % 10;
            int low = n - (n / factor) * factor;
            int high = (n / (factor * 10));
            
            if (curr == 0) {
                count += high * factor;
            } else if (curr == 1) {
                count += high * factor + low + 1;
            } else {
                count += (high + 1) * factor;
            }
            
            factor *= 10;
        }
        
        return count;
    }
}