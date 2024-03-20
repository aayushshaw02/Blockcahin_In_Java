import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        for(int i=0;i<=size;i++){
            String command=sc.nextLine();
            String[] words=command.split(" ");
            String action=words[0];
            switch(action){
                case "push": int num=Integer.parseInt(words[1]);
                             stack1.push(num);
                             if(stack2.isEmpty()){
                                 stack2.push(num);
                             }
                             else{
                                 if(stack2.peek()>num){
                                     stack2.push(stack2.peek());
                                 } else{
                                     stack2.push(num);
                                 }
                             }
                             break;
                case "pop": stack1.pop();
                            stack2.pop();
                            break;
                case "max":
                        System.out.println(stack2.peek());
                     break;
            }
        }
    }
}