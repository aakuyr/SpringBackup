import application.config.DemoConfig;
import application.dao.IDao;
import application.dao.StudentDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void sai(Stack<Integer> inStack, List<String> integerArrayList){
        Stack<Integer> outStack = new Stack<>();
        Stack<Integer> tempStack= new Stack<>();

        for (int i = 0; i < integerArrayList.size(); i++) {
            if (!inStack.isEmpty()){
                String word = integerArrayList.get(i);
                if (word.length() % inStack.pop() == 0){
                    outStack.push(word.length() + inStack.pop());
                }
                else {
                    tempStack.push(word.length());
                }
            }
            else {
                outStack.push(integerArrayList.get(i).length());
            }
        }
        while (!tempStack.isEmpty()){
            outStack.push(tempStack.pop());
        }
        while (!outStack.isEmpty()){
            System.out.println("HERE : "  + outStack.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(3);
        integers.push(7);
        integers.push(2);
        integers.push(4);

        System.out.println(integers.peek());
        List<String> stringList = List.of(
                "Road",
                "Demon",
                "Sneakers",
                "Pluton",
                "Barbarous"
        );

        sai(integers, stringList);
    }
}
