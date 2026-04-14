package com.gla.Generics.Genericsproblemset;

public class MeanPlanGenerator {
    interface MealPlan {}

    class VegetarianMeal implements MealPlan {}
    class VeganMeal implements MealPlan {}

    class Meal<T extends MealPlan> {
        T meal;

        Meal(T meal) {
            this.meal = meal;
        }
    }

    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println(meal.getClass().getSimpleName());
    }
}
