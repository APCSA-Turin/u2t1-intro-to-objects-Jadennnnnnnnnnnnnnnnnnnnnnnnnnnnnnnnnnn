public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Mr.Fish", 5, 30.2);
        Cat cat2 = new Cat("Bobby", 10, 25.34);

        cat1.introduce();
        cat1.printCatInfo();
        cat2.printCatInfo();
        cat2.introduce();
    }
}