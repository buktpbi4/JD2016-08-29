package by.it.vashukevich.jd1_04;

/**
 * Created by Admin on 05.09.16.
 */
public class Main {
    public static void main(String[] args) {
        double a[][]={
                {2,5,4,1},
                {1,3,2,1},
                {2,10,9,7},
                {3,8,9,2}
        };
        double y[]={20,11,40,37};
        double x[]= Helper.findroot(a,y);

        /*System.out.println("Root");
        InOut.printArr(x);
        System.out.println("Determinant="+Helper.det)*/

    }
}
