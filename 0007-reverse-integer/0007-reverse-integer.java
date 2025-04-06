class Solution {
    public static int reverse(int x) {
        int temp=x,sum=0,s=0;
        while(temp!=0){
            s=temp%10;
            if (sum > Integer.MAX_VALUE/10 || (sum== Integer.MAX_VALUE/10 && s>7)) {
                return 0; // Positive overflow
            }
            if (sum < Integer.MIN_VALUE/10 || (sum==Integer.MIN_VALUE/10 && s<-8)) {
                return 0; // Negative overflow
            }

            sum=(sum*10)+s;
            temp=temp/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0){
            System.out.println(reverse(a));
        }
        else{
            System.out.println("-"+reverse(a));
        }
    }
}