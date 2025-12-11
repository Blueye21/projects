public class d132 {
    public static void main(String[] args) {
        Mountain moun = new Mountain("Mt. Crst", 743, 1);
        Fold fold = new Fold("Mt. Baro", 1500, 3);
        Volcanic volc = new Volcanic("Mt. Fuji", 1234, 300);

        System.out.println(moun.getName() + ", which is " + moun.getAge() + " million years old, is " + moun.getHeight() + " meters high.");
        System.out.println(fold.getName() + ", which is " + fold.getAge() + " million years old, is " + fold.getHeight() + " meters high.");
        System.out.println(volc.getName() + ", which is " + volc.getAge() + " million years old, is " + volc.getHeight() + " meters high.");
    }
}
