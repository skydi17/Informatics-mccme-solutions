package sorting_and_searching.binary_search_by_answer;

import java.util.Scanner;

public class A_diploms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int n = scanner.nextInt();
        int l = 1, r = n*Math.max(w, h), mid, res;
        while (l != r) {
            mid = (l + r) / 2;
            res = (mid / h)*(mid / w);
            if (res < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        System.out.println(r);
    }
}
