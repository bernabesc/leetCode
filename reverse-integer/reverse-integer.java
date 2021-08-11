class Solution {
    public int reverse(int x) {
        String reverseIntTxt = "";
        if(x<0) {
            reverseIntTxt = "-";
        }
        while(x!=0){
            reverseIntTxt+=Math.abs(x%10);
            x/=10;
        }
        try{
            return Integer.parseInt(reverseIntTxt);
        } catch (Exception NumberFormatException){
            return 0;
        }
    }
}