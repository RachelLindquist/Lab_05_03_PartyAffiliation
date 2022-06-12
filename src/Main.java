public class Main {
    public static void main(String[] args) {

        //(This task uses Strings:) A program that prompts the user for their party affiliation
        // (Democrat, Republican, or Independent) and responds accordingly with a Donkey,
        // Elephant, Person, or Other.  (i.e. “You get a Democratic Donkey.”)
        // Notes: create a menu so the user chooses D, R, or I and assume that
        // any other choice will be Other.  Tests: just the four options D, R, I, Other.
        // Use as cascaded if structure not separate if statements!

        //Test runs:   (insert the output widow copies here for the 4 test runs)

        System.out.println ("Please enter your party affiliation. (D, R, I or Other)");
        String party = "D";
        if (party.equals("D")){
            System.out.println("You get a Democratic Donkey.");
        } else if (party.equals("R")){
            System.out.println("You get a Republican Elephant.");
        } else if (party.equals("I")){
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You picked Other, no animal for you.");
        }





    }
}