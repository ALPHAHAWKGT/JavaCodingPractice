import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack stack = new Stack<Integer>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack<Integer>();
        int sum = 0;
        int item1 = 3;
        int item2 = 2;
        int item3 = 1;
        stack.push(item3);
        stack.push(item2);
        stack.push(item1);
        sum = item1 + item2 + item3;
        System.out.println(sum);

    }
}

/*
Sequence 1 ans: 1
Sequence 2 ans: "abc", 2, 3 or undef
Sequence 3 ans: 1,2,3
Sequence 4 ans: 34, 40
 */
