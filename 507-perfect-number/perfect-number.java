class Solution {
    public boolean checkPerfectNumber(int num) {
        int temp=num;
        int sum =0;
        for(int i =1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==temp) return true;
        return false;
        
    }
}