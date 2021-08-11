class Solution {
    public int reverse(int x) {
        int units = ((Integer)Math.abs(x)).toString().length();
        String reverseIntTxt = "";
        if(x<0)
            reverseIntTxt="-";
        for(int a=0;a<units;a++,x/=10){
            reverseIntTxt+=Math.abs(x%10);
        }
        try{
            return Integer.parseInt(reverseIntTxt);
        } catch (Exception NumberFormatException){
            return 0;
        }
        
        
    }
}