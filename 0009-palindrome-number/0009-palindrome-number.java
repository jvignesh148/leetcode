class Solution {
    public boolean isPalindrome(int x) {
        int temp,n,sum=0;
        temp=x;
        if(x<0){
            return false;
        }
        else{
            while(temp!=0){
                n=temp%10;
                sum=(sum*10)+n;
                temp=temp/10;
            }
            if (sum==x)
            {
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Solution y= new Solution();
        System.out.println(y.isPalindrome(x));
    }
}