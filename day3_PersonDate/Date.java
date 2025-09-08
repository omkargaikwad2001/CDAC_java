public class Date {

    private int dd;
    private int mm;
    private int yy;

    // default constructor
    public Date() {
        dd = 0;
        mm = 0;
        yy = 0;
    }

    // parameterized constructor
    public Date(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    // copy constructor
    public Date(Date d) {
        this.dd = d.dd;
        this.mm = d.mm;
        this.yy = d.yy;
    }

    void setDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }

    void display() {
        System.out.println(dd + "/" + mm + "/" + yy);
    }

}
