public class Probability {

    // calculate factorial function
    public static int fact(int number){
        int ans=1; 
        for(int i=1;i<=number; i++) {
            ans*=i; 
        } 
        return ans;
    }

    // calculate NCR function
    public static int ncr(int num, int r) {
        int ans = fact (num) / (fact (num-r)*fact(r));
        return ans;
    }

    public static int probability (int n,int x) {
        int redProb = ncr(4,x);
        int otherProb = ncr(4,n-x); 
        float totalProb = ncr(8,n);
        
        float probability = redProb * otherProb / 0.1f*totalProb;
        return (int)(probability*100);
    }
}