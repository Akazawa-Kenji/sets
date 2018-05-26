import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSandbox {

    public static void main(String[] args) {
    //Set is a collection that can only contain unique elements

        Set<String> animalSet = new HashSet<>();
        //I add elements to the Set by using the add method.
        animalSet.add("Cat");
        animalSet.add("Dog");
        animalSet.add("Dragon");
        animalSet.add("Mouse");


        animalSet.add("Cat");
        // because sets can only contain unique elements Cat doesn't print out twice.


        System.out.println(animalSet);

        Set<String> disneySet = new LinkedHashSet<>();
        //Linked again puts them in the order they were added

        disneySet.add("Buzz Lightyear");
        disneySet.add("Mickey");
        disneySet.add("Goofy");
        disneySet.add("Woody");
        disneySet.add("Stitch");
        disneySet.add("Lilo");
        disneySet.add("Elsa");
        disneySet.add("Snow White");

        System.out.println(disneySet);

        Set<String> AppSet = new TreeSet<String>();
        //Linked again puts them in the order they were added

        AppSet.add("Apple Store");
        AppSet.add("Sing!");
        AppSet.add("Netflix");
        AppSet.add("Crunchyroll");
        AppSet.add("Clash of Clans");
        AppSet.add("SimCity");

        System.out.println(AppSet);

        //Using a forreach loop to iterate through the set.// using contain to check if it the element is in the set.
        for (String element : AppSet) {
            System.out.println(element);
        }
        if (AppSet.contains("Hulu")) {
            System.out.println("Contains Hulu");
        }
        if (AppSet.contains("Netflix")) {
            System.out.println("Contains Netflix");

        }

        Set<String> animalSet2 = new TreeSet<String>();
        //I add elements to the Set by using the add method.
        animalSet2.add("Cat");
        animalSet2.add("Dog");
        animalSet2.add("Mongoose");
        animalSet2.add("Rhino");
        animalSet2.add("Spider");
        animalSet2.add("Liger");

        Set<String> intersection = new HashSet<String>(animalSet);
        //intersection is a copy of animal set

        intersection.retainAll(animalSet2);
        //intersection is a copy of animalSet because I passed it to the construction
        // I then use retainAll and pass it animalSet2. retainAll takes both Sets and takes the elements that
        // the sets both contain.
        System.out.println(intersection);
        //Print to verify


        //Trying to find the differences

        Set<String> diff = new HashSet<String>(animalSet);

        diff.removeAll(animalSet2);
        System.out.println(diff);



    }
}