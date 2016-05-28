/**
 * Created by igor on 28.05.16.
 */
public class IFTest {
    public static void main(String[] args) {
        FixedStack fixedStack1 = new FixedStack(5);
        FixedStack fixedStack2 = new FixedStack(6);

        for (int i = 0; i < 5; i++) {
            fixedStack1.push(i);
        }
        for (int i = 0; i < 6; i++) {
            fixedStack2.push(i);
        }
        ///////////
        for (int i = 0; i < 5; i++) {
            System.out.println(fixedStack1.pop());
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(fixedStack2.pop());
        }
    }
}
