package com.zy;

import com.zy.list.ArrayList;
import com.zy.list.List;

import java.lang.reflect.Array;

/**
 * Description: 自定义栈结构
 *
 * @author zygui
 * @date 2020/4/9 20:46
 */
public class Stack<E> extends ArrayList<E> {
    /*
        因为使用了继承ArrayList, 所以栈就拥有了动态数组的所有方法,这样明显是不合理的~(官方的栈是继承Vector(安全的ArrayList))
        可以使用和ArrayList变为组合关系
     */

    private List<E> list = new ArrayList<>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.inEmpty();
    }

    public void clear() {
        list.clear();
    }

    /**
     * 压入元素
     *
     * @param element
     */
    public void push(E element) {
        // 相当于往栈的栈顶添加元素
        list.add(element);
    }

    /**
     * 弹出元素
     *
     * @return
     */
    public E pop() {
        return list.remove(list.size() - 1);
    }

    /**
     * 获取栈顶元素, 和java.util.Stack中的peek()方法相同
     *
     * @return
     */
    public E top() {
        return list.get(list.size() - 1);
    }

}
