public class RelationalLogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 20, c =20;

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(b==c);     // true if both are equal
        System.out.println(a!=b);     // true if not equal
        System.out.println(a<=b);     
        System.out.println(a>=b);     
        System.out.println(b<=c);     

        System.out.println(true && true);     // true if both are true
        System.out.println(true && false);    // false if any of one false
        System.out.println(b==c || true);     // true if any of one true
        System.out.println(b==c || false);    // true if any of one true
        System.out.println(false || false);   // false if both are false
        System.out.println(!true);            // false 
    }   
}