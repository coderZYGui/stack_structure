package com.zy;

import com.zy.list.ArrayList;

/**
 * Description: 自定义栈结构
 *
 * @author zygui
 * @date 2020/4/9 20:46
 */
public class Stack<E> extends ArrayList<E> {
    /*
        因为栈是线性结构,许多特点和动态数组和链表是相同的, 这里可以继承ArrayList来实现栈;
     */
    // 接口设计(size,isEmpty调用父类的就可以了)

    /**
     * 压入元素
     * @param element
     */
    public void push(E element) {
        // 相当于往栈的栈顶添加元素
        add(element);
    }

    /**
     * 弹出元素
     * @return
     */
    public E pop() {
        return remove(size - 1);
    }

    /**
     * 获取栈顶元素
     * @return
     */
    public E top() {
        return get(size - 1);
    }

}
