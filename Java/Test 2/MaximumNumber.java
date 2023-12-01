public class MaximumNumber {
    public static int max_number(int n){
        int maxnum=0;
        int i=1; 
        while(n/i>0) {
            int newnum=(n/(i*10))*i+n%i;
            i=i*10;
            if(maxnum<newnum) {
                maxnum=newnum;
            }
        }
        return maxnum;
    }
}
