public class Madlib {
    public static void main(String[] args) {
        System.out.println("Hello world,");
        Madlib mystory = new Madlib();

    }

    public Madlib() {
        String classmate = "Niam";
        String city = "George Town";
        String noun = "teleportaion device";
        String adjective = "velmputous";
        String pluralNoun = "My xylphones";
        String pluralAnimal = "spinasoureses";
        boolean trueOrFalse = true;
        double decimalBiggerThan1 = 8.32596;
        int number1 = 84;
        int number2 = 30;
        int wholeNumberBetween1And4 = 2;
        String miltonTeacher = "Mr.A";
        String miltonDean = "Mrs.Latham";
        String letterGrade = "A+++";
        String season = "Summer";
        //define a string called story for mad lib
        String story = "This weekend I am going camping with "
                +classmate+ ". We are going to a campsite in "
                +city+ ". I packed my "+noun+ " and "
                +pluralNoun + ". The forecast is calling for a high of "
                +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "
                +adjective+" day! This year, the park rangers have seen "
                +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
                +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
                +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
                +miltonDean+ " said it actually has only happened "
                + number2+" times. Wish us luck! If we survive, we will earn a "
                +letterGrade+ "- in P.E. class.";
//now print story to the dos window
        System.out.println(story);
    }
}
