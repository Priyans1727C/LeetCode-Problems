class Solution {
    public int reverse(int x) {
        int neg = (x<0)?-1:1;
        x=x*neg;
        long ans=0;
        while(x>0){
            ans=ans*10+(x%10);
            x=x/10;
        }
        if(neg*ans>Integer.MAX_VALUE || neg*ans<Integer.MIN_VALUE) return 0;
        else
        return (int)ans*neg;
    }
}