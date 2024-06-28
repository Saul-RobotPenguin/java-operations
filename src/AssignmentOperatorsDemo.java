public class AssignmentOperatorsDemo {
    public static void main(String[] args) {

        //Part 1
        int j, k;
        j = 10;
        j = 5;
        k=j;
        System.out.println("J is :" + j);
        System.out.println("K is :" + k);



        k= j = 10;
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);


       //Part 2
        int x, y = 10, z = 5;
        x = y + z;
        System.out.println("+ operator resulted in " + x);
        x = y - z;
        System.out.println("- operator resulted in " + x);
        x = y * z;
        System.out.println("* operator resulted in " + x);
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        x = y % z;
        System.out.println("% operator resulted in " + x);
        x = y++;
        System.out.println("Postfix ++ operator resulted in " + x);
        x = ++z;
        System.out.println("Prefix ++ operator resulted in " + x);
        x = -y;
        System.out.println("Unary operator resulted in " + x);


        //MAX_VALUE starts as a positive value that can be stored and if it passes, starts to go to negative
        int tooBig = Integer.MAX_VALUE + 1;
        //MIN_VALUE starts as a negative value that can be stored and if it passes the lowest, starts to go to positive
        int tooSmall = Integer.MIN_VALUE - 1;

        System.out.println(tooBig);
        System.out.println(tooSmall);


        //Legit prints out infinty;
        System.out.println( 4.0/0.0);
        //Legit prints out -infinty
        System.out.println(-4.0/0.0);
        //Prints out NaN
        System.out.println(0.0 / 0.0);

        double d1 = 12 / 8; // result: 1 by integer division. The value of d1 becomes 1.0.
        double d2 = 12.0F / 8; // result: 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);














    }
}
