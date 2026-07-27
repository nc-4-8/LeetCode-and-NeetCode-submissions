class Solution {
   public int converter(char i){
        if(i== ('I')){
            return 1;
        }
        if(i==('V')){
            return 5;
        }
        if(i==('X')){
            return 10;
        }
        if(i==('L')){
            return 50;
        }
        if(i==('C')){
            return 100;
        }
        if(i==('D')){
            return 500;
        }
        if(i==('M')){
            return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
        int num = 0;
        int x = 0;
        int y = 0;
        for(int i = 0; i < s.length(); i++){
             x = converter(s.charAt(i));
            if(i + 1 < s.length()){
                 y = converter(s.charAt(i+1));
            }
            else{
                y = 0;
            }
            if(y>x){
                num += y-x;
                i++;
            }
            else{
                num+=x;
            }
        }
        return num;
    }


}