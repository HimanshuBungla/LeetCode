class Solution {
    public String destCity(List<List<String>> paths) {
        int m = paths.size() - 1;
        String dest = paths.get(m).get(1);

        for (int i = 0; i < paths.size(); i++) {
            dest = paths.get(i).get(1);
            boolean found = false;

            for (int j = 0; j < paths.size(); j++) {
                if (dest.equals(paths.get(j).get(0))) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return dest;
            }
        }
        
        return dest;
    }
}
