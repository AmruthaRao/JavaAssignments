/**
 * Created by amrutha on 7/20/16.
 */
public class diamond {
    public static void main(String[] args) {
        int n = 3;
        int i, k, j;
        int space;
        int star;
        for (i = 0; i < n; i++)

        {

k=((n-1)*2)-1;
            for (space = 0; space < (n - 1 - i); space++) {
                System.out.print(" ");

            }
            for (star = 0; star < (i + (i + 1)); star++) {
                System.out.print("*");
            }
            System.out.println("");
            if (i == 2) {
                for (j = 0; j < n - 1; j++) {

                    for (space = 0; space < (j + 1); space++) {
                        System.out.print(" ");
                                                               }

                    for (star = 0; star < k; star++) {
                        System.out.print("*");
                                                      }
                    k -= 2;

                    System.out.println("");

                }

            }

        }
    }
}