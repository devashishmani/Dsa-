class Solution {
    public String simplifyPath(String path) {
        // Split by '/'
        String[] parts = path.split("/");

        // Use a list as stack
        List<String> stack = new ArrayList<>();

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
              
                continue;
            } else if (part.equals("..")) {
               
                if (!stack.isEmpty()) {
                    stack.remove(stack.size() - 1);
                }
            } else {
              
                stack.add(part);
            }
        }

    
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }
}
