package CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Factories;

import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Cheese;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Dough;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Sauce;
import CreationalDesignPatterns.Factory.ExampleUsingFacAndAbsFac.Ingridients.Veggie;

import java.util.ArrayList;
import java.util.List;

public class NYPizzaIngredientsFactory implements PizzaIngredientsFactory {
    @Override
    public Dough createDough() {
        return new Dough("ThickCrustDough"); // There will be a separate class for ThickCrustDough.
    }

    @Override
    public Sauce createSauce() {
        return new Sauce("MarianaSauce");
    }

    @Override
    public Cheese createCheese() {
        return new Cheese("ReggianoCheese");
    }

    @Override
    public List<Veggie> createVeggies() {
        List<Veggie> veggies = new ArrayList<>();
        veggies.add(new Veggie("Garlic"));
        veggies.add(new Veggie("Onion"));
        veggies.add(new Veggie("Mushroom"));
        return veggies;
    }
}
