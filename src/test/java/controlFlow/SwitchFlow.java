package controlFlow;

import org.junit.jupiter.api.Test;

public class SwitchFlow {
    int num = 1;

    @Test
    public void switchformats(){
        switch (num){
            case 1:
                System.out.println("one");

            case 2:
                System.out.println("two");
                break;
            default:
                System.out.println("default");
                break;
            case 3:
                System.out.println("Three after default ");
        }
    }



    @Test
    public void Switchdefn() {
        switch("test") {
            case "test":
                System.out.println(" this is line 1 for test");

            case "bet", "flow":
                System.out.println("this is line 2 for bet and flow");
                break;
            default:
                System.out.println("this is default");
        }
    }
}
