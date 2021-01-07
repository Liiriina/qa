import org.junit.jupiter.api.Test;

public class MyFirstTest {
    private String name = "Carl";
    @Test
    public void firstTest (){

        System.out.println("Hello, Corona!");
       int sum =  sumTwoDigits(11,45);
        System.out.println("And the sum is: " + sum);
        System.out.println(sumTwoDigits(9,13));
        System.out.println(name);
    }
private int sumTwoDigits (int a, int b){
       int c = a + b;
       return c;
}

}
