/**
 * Created by igor on 28.05.16.
 */
public class FixedStack implements IntStack{

    private int stck[];
    private int tos;

    public FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length - 1){
            System.out.println("Full stack");
        }else {
            stck[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("FixedStack.pop");
            return 0;
        }else {
            return stck[tos--];
        }
    }
}
