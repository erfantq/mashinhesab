public class MyMath {
    public final float PI=3.14F;
    public final float E= 2.71F;
    public static int min(int num1,int num2){
        if (num1<=num2) return num1;
        return num2;
    }
    public static int max(int num1,int num2){
        if (num1>=num2) return num1;
        return num2;
    }
    public static int pow(int num,int power){
        int num1=num;
        for (int i=1;i<power;i++)
            num*=num1;
        return num;
    }
   public static long round(double num){
        return ((int) (num+0.5f));
    }
    public static int gcd(int num1,int num2){
        int GCD=0;
        if (num1<0) num1=-num1;
        if (num2<0) num2=-num2;
        if (num1==0||num2==0) return 0;
        for (int i=1;i<=min(num1,num2);i++){
            if (num1%i==0 && num2%i==0) GCD=i;
        }
        return GCD;
    }
    public static int lcm(int num1,int num2){
        int sw=0;
        if (num1<0||num2<0) sw=1;   //lcm<0
        if (num1<0) num1=-num1;
        if (num2<0) num2=-num2;
        if (num1==0||num2==0) return 0;
        for (int i=max(num1,num2);;i++){
            if (i%num1==0 && i%num2==0 && sw==0) return i;
            else if (i%num1==0 && i%num2==0 && sw==1) return -i;
        }
    }
}
