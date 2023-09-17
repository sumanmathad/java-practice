package datatypes;

public class varType {
    //var a =6;   var not applicable for instance variables.
    int a =6;
    public static void main(String[] args) {

        StringBuilder b= new StringBuilder("12");
        var c=new StringBuilder("3");
        b.append(3);
        // b=b+c;  + cannot be applied to StringBuilder

        System.out.println(b);  //123

    }
}
