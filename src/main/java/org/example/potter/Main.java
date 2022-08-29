package org.example.potter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final List<Potion> potions = List.of(
//                new Potion("Fake Potion1"),
//                new Potion("Fake Potion2"),
//                new Potion("Fake Potion3"),
//                new Potion("Fake Potion4"),
//                new Potion("Fake Potion5"),
//                new Potion("Fake Potion6"),
                new Potion("Polyjuice"),
                new Potion("Fame"),
                new Potion("Felicicus Melonus"),
                new Potion("Varitas Serum"),
                new Potion("Sleep"),
                new Potion("Girding potion"),
                new Potion("Love potion"),
                new Potion("Comed Tea"),
                new Potion("Invisibility potion"),
                new Potion("Pepperup Potion")
                );

//        PotionHomework potionHomework = new NaivePotionHomework(new HashingBrewery());
//        PotionHomework potionHomework = new SkipSelfMixPotionHomework(new HashingBrewery());

        PotionHomework potionHomework = new SkipDoublesPotionHomework(new HashingBrewery());
        potionHomework.printAllCombinations(potions);

//        FindPotionIngredientsMission potionMission = new FindPotionIngredientsMission(new HashingBrewery());
//
//        FindPotionIngredientsMission potionMission = new FindPotionIngredientsMission(new HashingBrewery());
//        potionMission.printPotionIngridients(potions, new Potion(""));
    }
}
