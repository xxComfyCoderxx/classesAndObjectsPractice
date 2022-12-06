package com.deonlewis.handson1;

public class Holiday {
    private String name;
    private int day;
    private String month;

    // Question a
    public Holiday(String n, int d, String m) {
        this.name = n;
        this.day = d;
        this.month = m;
    }
    // Question b
    public boolean isSameMonth(Holiday h) {
        if (this.month.equals(h.month)) {
            return true;
        } else
        return false;
    }
    //Question c
    public static double avgDate(Holiday h[]) {
        int sum = 0;

        for (int i = 0; i < h.length; i++) {
            sum = sum + h[i].day;
        }
        return ((double) sum) / h.length;
    }
    // Question d
    Holiday h = new Holiday("Christmas",25, "December");

}
