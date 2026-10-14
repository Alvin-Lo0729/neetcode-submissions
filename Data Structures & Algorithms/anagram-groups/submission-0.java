class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return List.of(List.of(""));
        }
        Map<String, List<String>> kk = new HashMap<>();
        for (String a : strs) {
            char[] bb = a.toCharArray();
            Arrays.sort(bb);
            String b1 = new String(bb);
            if (kk.containsKey(b1)) {
                kk.get(b1).add(a);
            } else {
                List<String> cc = new ArrayList<>();
                cc.add(a);
                kk.put(b1, cc);
            }
        }
        return kk.values().stream().toList();
    }
}
