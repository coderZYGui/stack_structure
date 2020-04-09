package com.zy;

/**
 * Description:
 *
 * @author zygui
 * @date 2020/4/9 20:40
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
