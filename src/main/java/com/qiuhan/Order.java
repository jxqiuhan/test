package com.qiuhan;

import java.util.StringTokenizer;

public class Order {
    private int a;
    private long b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    public static void main(String[] args) {
        String content = "32131{";
        StringTokenizer st = new StringTokenizer(content, "{", true);
        while (st.hasMoreElements()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
