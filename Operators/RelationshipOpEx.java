class RelationshipOpEx
{
    public static void main(String args[])
    {
        int a=10;
        int b=20;

        System.out.println("Relational operatgrs true or false");
        System.out.println("Relational operators ex with a=10, b=20");


        System.out.print("10>20 :");
        System.out.println(a>b);
        System.out.print("10<20 :");
        System.out.println(a<b);

        System.out.print("10==20 :");
        System.out.println(a==b);
        System.out.print("10!=20 :");
        System.out.println(a!=b);

        System.out.print("10>=20 :");
        System.out.println(a>=b);
        System.out.print("10<=20 :");
        System.out.println(a<=b);

        // if you want to hold true or false values we go with boolean data type

        boolean c;
        c=a>b;
        System.out.println(c);
        

    }
}