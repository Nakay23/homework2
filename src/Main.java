public class Main {
    public static void main(String[] args) {

        var dog = 8;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = (int) (dog - 3.5);
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 18;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend /7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog /3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalMass = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса двух боксёров " + totalMass + " Кг");
        var difference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между массами бойцов " + difference + " кг");

        var remain = secondBoxerWeight %firstBoxerWeight;
        System.out.println(remain);

        var workingHours = 640;
        var employeeWorkingTime = 8;
        var totalEmployees = workingHours /employeeWorkingTime;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");
        totalEmployees = totalEmployees + 94;
        workingHours = totalEmployees * employeeWorkingTime;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " +workingHours + " часов работы может быть поделено между сотрудниками" );
    }
}