/**
 * Created by amrutha on 7/19/16.
 */
public class isosceles {
    public static void main(String [] args){
        int n=3;
        int i;
        int space;
        int star;
        for(i=0;i<n;i++)

        {
            for(space=0;space<(n-1-i);space++){
                System.out.print(" ");

            }
            for(star=0;star<(i+(i+1)) ;star++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}