public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task67();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper =  763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper =  763789;
        dog = dog + 4;
        cat = cat +4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
        var dog = 8.0;
        var cat = 3.6;
        var paper =  763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task67 () {
        System.out.println("Задача 67");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        System.out.println("Вес первого боксера " + weightFirstBoxer + " кг " + " и " + " Вес второго боксера "+ weightSecondBoxer + " кг ");
        var allWeightBoxers = weightSecondBoxer + weightFirstBoxer;
        System.out.println("Вес всех боксеров равен "+ allWeightBoxers + " кг!");
        var raznicaWeight = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница в весе в делении состовляет "+ raznicaWeight + " кг ;) жирдяй!");
        var vichitanieVesa = weightSecondBoxer - weightFirstBoxer;
        System.out.println( "Разница в вычитании жирдяев равна "+ vichitanieVesa + " кг!");
    }
    public static void task8 () {
        System.out.println("Задача 8.1");
        var allTime = 640;
        var timeOneWorker = 8;
        System.out.println( "всего работников в компании "+ allTime / timeOneWorker + " человек.");
        System.out.println("Задача 8.2");
        var upWorkers = allTime / timeOneWorker;
        upWorkers = upWorkers + 94;


        System.out.println( "Если в компании работает " + upWorkers + " человек, то всего " + allTime / upWorkers + " часов работы может быть поделено между сотрудниками" );

    }
}


