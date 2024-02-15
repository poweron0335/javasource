package lang;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB", "AB"));
        System.out.println(count("12345", "AB"));
    }

    public static int count(String src, String target) {
        // src 에 target 문자가 몇 번 나오는지 세어서 반환

        int cnt = 0, pos = 0;

        while ((pos = src.indexOf(target, pos)) != -1) {
            cnt++;
            pos += target.length();
        }
        return cnt;
    }
    // public static int count(String src, String target) {
    // int cnt = 0;

    // for (int pos = src.indexOf(target); pos != -1; pos = src.indexOf(target, pos
    // + target.length())) {
    // cnt++;
    // }

    // return cnt;
    // }

}
