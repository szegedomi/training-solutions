package stringbasic;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    public void add(Pet newpet){
        boolean found = false;
        for(Pet pet : pets) {
            if (areEquals(pet, newpet)) {
                found = true;
            }
        }
        if (!found){pets.add(newpet);}
    }

    private boolean areEquals(Pet pet1, Pet pet2){
        return pet1.getRegNumber().equals(pet2.getRegNumber());
    }



}
