import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='['||input.charAt(i)=='('||input.charAt(i)=='{'){
                stack.push(input.charAt(i));
            }else{
                if(stack.empty()){
                    System.out.println(false);
                    return;
                }
               if(input.charAt(i)==')' && stack.peek()=='('){
                   stack.pop();
               }
                if(input.charAt(i)=='}' && stack.peek()=='{'){
                    stack.pop();
                }
                if(input.charAt(i)==']' && stack.peek()=='['){
                    stack.pop();
                }
            }
        }
        System.out.println(stack.empty());
    }
}