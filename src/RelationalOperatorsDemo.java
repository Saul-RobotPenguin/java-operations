public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        int x = 10 , y = 5;
        System.out.println("x > y : "+(x > y));

        System.out.println("x < y : "+(x < y));
        System.out.println("x >= y : "+(x >= y));
        System.out.println("x <= y : "+(x <= y));
        System.out.println("x == y : "+(x == y));
        System.out.println("x != y : "+(x != y));

        int variable1 = 50, variable2 = 100, variable3 = 50;
        System.out.println("variable1 = " + variable1);
        System.out.println("variable2 = " + variable2);
        System.out.println("variable3 = " + variable3);
        System.out.println("variable1 == variable2: "
                + (variable1 == variable2));

        System.out.println("variable1 == variable3: "
                + (variable1 == variable3));


         x = 58; //111010
         y =13; //1101
        System.out.println("x & y : " + (x & y)); //returns 8 = 1000
        System.out.println("x | y : " + (x | y)); //63=111111
        System.out.println("x ^ y : " + (x ^ y)); //55=11011
        System.out.println("~x : " + (~x));  //-59
        System.out.println("x << y : " + (x << y));
        System.out.println("x >> y : " + (x >> y));

        int age = 18;
        String result = age < 100 ?
                "Less than 100" : "Greater than 100";
        System.out.println(result);

    }
}
