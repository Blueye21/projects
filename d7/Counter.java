package cohding.java.d7;

class Counter {
    int newnumber = 10;
    int number;

    void increment() {
        newnumber++;
        number = newnumber;
    }

    public static void main(String[] args) {
        Counter count1 = new Counter();
        Counter count2 = new Counter();
        Counter count3 = new Counter();

        count1.increment();
        count2.increment();
        count3.increment();
        
        System.out.println(count1.number);
        System.out.println(count2.number);
        System.out.println(count3.number);
    }
}
