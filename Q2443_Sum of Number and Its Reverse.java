class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        boolean b = false;
        if(num==0)
        return true;
        for (int i=1; i<num; i++){
            int cpy = i, rev=0;
            while(cpy!=0){
                int d = cpy%10;
                rev = rev*10 + d;
                cpy = cpy/10;
            }
            if ((rev+i)==num){
                b = true;
                break;
            }
            else 
            continue;
        }
        return b;
    }
}