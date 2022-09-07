public class Main {
    public static void main(String[] args) {
        System.out.println("task1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        System.out.println("task2:");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        System.out.println("task3:");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("dog="+dog);
        System.out.println("cat="+cat);
        System.out.println("paper="+paper);

        System.out.println("task4:");
        var friend = 19;
        System.out.println("friend="+friend);

        friend = friend + 2;
        System.out.println("friend="+friend);

        friend = friend / 7;
        System.out.println("friend="+friend);

        System.out.println("task5:");
        var frog = 3.5;
        System.out.println("frog="+frog);

        frog = frog * 10;
        System.out.println("frog="+frog);

        frog = frog / 3.5;
        System.out.println("frog="+frog);

        frog = frog + 4;
        System.out.println("frog="+frog);

        System.out.println("task6:");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightBoxerAll = weightBoxer1 + weightBoxer2;
        System.out.println("Weight summ: boxer1, boxer2 = " + weightBoxerAll + "кг.");

        var weightBoxerDiff = weightBoxer2 - weightBoxer1;
        System.out.println("Weight difference: boxer1,  boxer2 = " + weightBoxerDiff + "кг.");
    }
}