class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String ops : operations) {
            if (ops.equals("C")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            else if (ops.equals("D")) {
                st.push(2 * st.peek());
            }

            else if (ops.equals("+")) {
                int a = st.pop();
                int b = st.peek();
                int c = a + b;
                st.push(a);
                st.push(c);
            }

            else {
                st.push(Integer.parseInt(ops));
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        return sum;
    }
}