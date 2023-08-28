package main.java;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Stack Using 2 queues
 */
public class MyStack {

    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public MyStack()
    {
        queue1 = new ArrayDeque<>();
        queue2 = new ArrayDeque<>();
    }

    public void push(int x)
    {
        queue1.add(x);
    }

    public int pop()
    {
        while(queue1.size()>1)
        {
            queue2.add(queue1.remove());
        }
        int res = queue1.remove();
        queue1.addAll(queue2);
        queue2.clear();
        return res;
    }

    public int top()
    {
        int res = pop();
        queue1.addAll(queue2);
        queue1.add(res);
        return res;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
