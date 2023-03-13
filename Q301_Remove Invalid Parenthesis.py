import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        boolean found = false;
        
        queue.offer(s);
        visited.add(s);
        
        while (!queue.isEmpty()) {
            String curr = queue.poll();
            
            if (isValid(curr)) {
                result.add(curr);
                found = true;
            }
            
            if (found) {
                continue;
            }
            
            for (int i = 0; i < curr.length(); i++) {
                if (curr.charAt(i) != '(' && curr.charAt(i) != ')') {
                    continue;
                }
                
                String next = curr.substring(0, i) + curr.substring(i + 1);
                
                if (!visited.contains(next)) {
                    queue.offer(next);
                    visited.add(next);
                }
            }
        }
        
        return result;
    }

    private static boolean isValid(String s) {
        int count = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                
                if (count < 0) {
                    return false;
                }
            }
        }
        
        return count == 0;
    }

}