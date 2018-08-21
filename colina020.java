package SwordToOffer;

import java.util.Stack;
/**
 * 定义栈的数据结构，
 * 请在该类型中实现一个能够得到栈中所含最小元素的min函数
 * （时间复杂度应为O（1））
 */



public class colina020 {

    private Stack<Integer> data_stack=new Stack<Integer>();
    private Stack<Integer> min_stack=new Stack<Integer>();

    public void push(int node) {//进栈
        if(min_stack.isEmpty() || min_stack.peek()>=node){
            min_stack.push(node);
        }else{
            min_stack.push(min_stack.peek());
        }
        data_stack.push(node);
    }

    public void pop() {//出栈
        if(data_stack.empty() || min_stack.empty())
            return;

        data_stack.pop();
        min_stack.pop();
    }

    public int top() {//取得栈顶元素
        if(!data_stack.empty()){
            return data_stack.peek();
        }
        return 0;
    }

    public int min() {//取得最小值
        if(!min_stack.empty()){

            return min_stack.peek();
        }
        return 0;
    }



}