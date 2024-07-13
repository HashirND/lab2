package yycpetresort;

import java.util.ArrayList;
import java.util.List;

public class Client extends User {
    private List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}