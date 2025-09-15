class Solution {
    public int mySqrt(int x) {
        long xx=x;
        long ans=1;
        if(x<2)return x;
        int i=2;
            for(i=2;ans<xx;i++){
                ans=(long)i*(long)i;
                if(ans==xx)return i;
            }
            return (i-2);  
        }
    }

  