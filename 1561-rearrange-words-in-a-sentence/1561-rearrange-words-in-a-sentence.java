class Solution {
    public String arrangeWords(String text) {
        text=text.toLowerCase();
        String[] str=text.split(" ");
        List<String[]> l=new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            l.add(new String[]{str[i], String.valueOf(i)});
        }
        l.sort((a, b) -> {
            int lenCompare = Integer.compare(a[0].length(), b[0].length());
            if (lenCompare != 0) return lenCompare;
            return Integer.compare(Integer.parseInt(a[1]), Integer.parseInt(b[1]));
        });
        StringBuilder sb=new StringBuilder();
        for (String[] pair : l) {
            sb.append(pair[0]).append(" ");
        }
        String s = sb.toString().trim();
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}