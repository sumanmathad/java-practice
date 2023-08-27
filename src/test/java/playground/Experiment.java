package playground;
/*
This is a playground for java code. May be deleted
 */
public class Experiment {
    public static void main(String[] args) {
/*        String name = "suman";
        Integer numberone = new Integer(32);
        Integer numbertwo = new Integer(32);
        System.out.println(name+numberone);

        Integer a = 32;
        Integer b =32;
        System.out.println(a==b);
        System.out.println(numberone==numbertwo);*/
        int maxnum = Integer.MAX_VALUE;
        int maxnumminusFive=Integer.MAX_VALUE-5;

        System.out.printf("%,d%n",maxnum);
        System.out.printf("%d",maxnumminusFive);
        for (int i=0;i<10;i++){
            System.out.printf("%,d%n",maxnumminusFive);
            maxnumminusFive++;
        }

    }


}
