import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public int romanToInt(String s) {
        int sum=0;
        Map<Character,Integer> romap=new HashMap<>();
        romap.put('I',1);
        romap.put('V',5);
        romap.put('X',10);
        romap.put('L',50);
        romap.put('C',100);
        romap.put('D',500);
        romap.put('M',1000);
        for(int i=0;i<s.length();i++)
        {
            if (i < s.length() - 1 && romap.get(s.charAt(i)) < romap.get(s.charAt(i + 1))) {
                sum-=romap.get(s.charAt(i));
            }
            else{
                sum+=romap.get(s.charAt(i));
            }
        }
        return sum;
    }
}