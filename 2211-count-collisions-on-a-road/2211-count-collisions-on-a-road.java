class Solution {
    // public int countCollisions(String directions) {
    //     Stack<Character> st = new Stack<>();
    //     int result = 0;
    //     for (char c : directions.toCharArray()) {
    //         while (!st.isEmpty() && isValid(st.peek(), c)) {
    //             if (c == 'L' && st.peek() == 'R') {
    //                 st.pop();
    //                 c = 'S';
    //                 result += 2;
    //             } else if (c == 'L' && st.peek() == 'S') {
    //                 result += 1;
    //                 c = 'S';
    //             } else if (c == 'S' && st.peek() == 'R') {
    //                 result += 1;
    //                 st.pop();
    //             } else
    //                 break;
    //         }
    //         st.push(c);
    //     }
    //     return result;
    // }

    // public static boolean isValid(char c1, char c2) {
    //     return (c1 == 'S' && c2 == 'L') || (c1 == 'R' && (c2 == 'S' || c2 == 'L'));
    // }
    public int countCollisions(String directions) {
        int n = directions.length();
        int left = 0, right = n - 1, result = 0;
        while (left < n && directions.charAt(left) == 'L')
            left++;
        while (right >= 0 && directions.charAt(right) == 'R')
            right--;
        for (int i = left; i <= right; i++)
            if (directions.charAt(i) != 'S')
                result++;
        return result;
    }
}