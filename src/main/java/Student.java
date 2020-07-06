import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Student {
    private static final String[] Roster = {"Abby Truong", "Ahmed Mujtaba", "Azeez Teitope Olanrewaju",
    "Diming Chu", "Dongshuo Li", "Honorinicy", "Jason", "Junyu Liu", "Kelly Liu", "Kinjan", "Kun Li",
    "Muhammed Umar", "Oaz", "PQ", "Prithviatani", "Richard", "Sahil Singh Sandhu", "Samuel Yang",
    "Scott Jhou", "Shahbaz Mansahia", "Shahriar Kabir", "Shakur", "Shrina Patel", "Siyu Qiu",
    "Siyu Lei", "Sumid", "Tao", "Trivediakshay", "Yan Huang", "Zhaosai Tong"};

    public String randomStudent() {
        Random rand = new Random();
        ArrayList<String> rosterAL = new ArrayList<String>();
        Collections.addAll(rosterAL, Roster);
        int randIndex = rand.nextInt(rosterAL.size());
        String name = rosterAL.get(randIndex);
        rosterAL.remove(randIndex);
        return name;
    }
}
