class MyStack {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public MyStack() {

    }

    public void push(int x) {
        list.add(x);
    }

    public int pop() {
        int x = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return x;
    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public boolean empty() {
        if (list.size() > 0) {
            return false;
        }
        return true;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */