import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> teams1 = new ArrayList<>();
        Collections.addAll(teams1, "Galatasaray", "Bursaspor", "Fenerbahçe", "Beşiktaş", "Başakşehir", "Trabzonspor");
        FixtureGenerator fixtureGenerator1 = new FixtureGenerator(teams1);
        List<String> fixture1 = fixtureGenerator1.getFixture();

        System.out.println("Takım sayısı çift senaryosu\n");
        for (String round : fixture1) {
            System.out.println(round);
        }

        System.out.println("\n----------------------\n");

        List<String> teams2 = new ArrayList<>();
        Collections.addAll(teams2, "Galatasaray", "Bursaspor", "Fenerbahçe", "Beşiktaş", "Başakşehir", "Boluspor");
        FixtureGenerator fixtureGenerator2 = new FixtureGenerator(teams2);
        List<String> fixture2 = fixtureGenerator2.getFixture();

        System.out.println("Takım sayısı tek senaryosu\n");
        for (String round : fixture2) {
            System.out.println(round);
        }
    }
}
