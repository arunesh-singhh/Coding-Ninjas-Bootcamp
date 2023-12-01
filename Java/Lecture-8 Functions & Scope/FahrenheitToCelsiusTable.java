public class FahrenheitToCelsiusTable {
    
    public static void printFahrenheitTable(int S, int E, int W) {
		while(S <= E){
            System.out.print(S);
            int C = (S - 32) * 5/9;
            System.out.println(" " + C);
            S = S + W;
        }
	}
}
