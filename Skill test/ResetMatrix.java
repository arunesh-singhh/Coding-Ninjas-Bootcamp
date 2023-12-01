public class ResetMatrix {
    public static void makeRowsCols0(int [][]input) {
		boolean fr = false,fc = false;
        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[0].length; j++) {
				if(input[i][j] == 0) {
					if(i == 0) fr = true;
					if(j == 0) fc = true;
					input[0][j] = 0;
					input[i][0] = 0;
				}
			}
		}
		for(int i = 1; i < input.length; i++) {
			for(int j = 1; j < input[0].length; j++) {
				if(input[i][0] == 0 || input[0][j] == 0) {
					input[i][j] = 0;
			    }
		    }
		}
		if(fr) {
			for(int j = 0; j < input[0].length; j++) {
				input[0][j] = 0;
			}
		}
		if(fc) {
			for(int i = 0; i < input.length; i++) {
				input[i][0] = 0;
			}
		}
	}
}