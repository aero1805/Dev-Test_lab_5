package task6;

public class MyReverse {
    String s;

    public MyReverse(String s) {
        this.s = new String(s);

    }

    public String get_reverse(){
        char[] s1 = new char[this.s.length()];
        char[] s2 = this.s.toCharArray();

        for(int i = this.s.length() - 1; i >= 0; i--){
            s1[this.s.length() - 1 - i] = s2[i];
        }
        String s_r = new String(s1);
        return s_r;
    }
}
