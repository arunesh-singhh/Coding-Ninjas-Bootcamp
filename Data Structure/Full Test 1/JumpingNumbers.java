import java.util.LinkedList;
import java.util.Queue;

public class JumpingNumbers {

    public static void showJumpingNos(int x) {
		System.out.print("0" + " ");
        for (int i = 1; i <= 9; i++) {
            bsf(x, i);
        }
	}

    private static void bsf(int x, int num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(num);

        while (!queue.isEmpty()) {
            num = queue.remove();
            if (num <= x) {
                System.out.print(num + " ");

                int lDigit = num % 10;
                if (lDigit == 0) {
                    queue.add((num * 10) + (lDigit + 1));
                }
                else if (lDigit == 9) {
                    queue.add((num * 10) + (lDigit - 1));
                }
                else{
                    queue.add((num * 10) + (lDigit + 1));
                    queue.add((num * 10) + (lDigit - 1));
                }
            }
        }
    }
}