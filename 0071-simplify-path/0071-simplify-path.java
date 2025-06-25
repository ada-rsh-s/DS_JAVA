class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();
        String canPath = "";
        int pathLength = path.length();
        int i = 0;

        while (i < pathLength) {
            String currDir = "";

            while (i < pathLength && path.charAt(i) != '/') {
                currDir += path.charAt(i);
                i++;
            }

            if (currDir.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else if (currDir.equals(".")) {
                continue;
            } else {
                if (!currDir.equals(""))
                    stack.push(currDir);
            }
            i++;
        }

        while (!stack.isEmpty()) {
            canPath = '/' + stack.pop() + canPath;
        }

        return canPath=="" ? "/":canPath;
    }
}