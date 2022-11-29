package lesson10;

public class fitnesAccount {
    public static void main(String[] args) {
// account//
        new fitnessTracker("Vlad", "Prokopenko", 31, 12, 1999,
                "vlad_prok@gmail.com", "0784726283",
                "120/80", 90, 11000).printAccountInfo();
        new fitnessTracker("Vitaly", "Syrets", 22, 5, 1967,
                "visyr@gmail.com", "0683449712",
                "110/90", 68, 2000).printAccountInfo();
        new fitnessTracker("Oleksandr", "Naumenko", 4, 7, 2002,
                "oleksandr@gmail.com", "0858234857",
                "120/70", 75, 7000).printAccountInfo();
        fitnessTracker kristina = new fitnessTracker("Kristina", "Linkevich", 13, 1, 2004,
                "kristin_link@gmail.com", "0472827912",
                "110/70", 54, 4000);
        fitnessTracker olga = new fitnessTracker("Olga", "Sokolova", 17, 10, 2010,
                "olga_sok@gmail.com", "0992134586",
                "130/75", 50, 2000);
//finish account //
        //finish//
        kristina.setSurname("Tytarenko");
        kristina.setPressure("130/90");
        kristina.setSteps(6000);
        kristina.setWeight(70);
        kristina.printAccountInfo();


        olga.setSurname("Kryvenko");
        olga.setPressure("110/80");
        olga.setSteps(4000);
        olga.setWeight(60);
        olga.printAccountInfo();
    }
}







