package dev.pmcc.day01;

import dev.pmcc.Template;

import java.util.Arrays;
import java.util.Collections;

public class Day01 implements Template {

    @Override
    public int part1(String input) {
        String[] calories = input.split("\n\n");
        int highest = 0;
        int current = 0;
        for (String elfCalories: calories) {
            current = 0;
            String[] elf = elfCalories.split("\n");
            for (String cals: elf) {
                current += Integer.parseInt(cals);
            }
            if(current > highest) {
                highest = current;
            }
        };

        return highest;
    }

    @Override
    public int part2(String input) {
        String[] calories = input.split("\n\n");
        Integer[] caloriesSummed = new Integer[calories.length];
        for (int i = 0; i < calories.length; i++) {
            String elfCalories = calories[i];
            int current = 0;
            String[] elf = elfCalories.split("\n");
            for (String cals: elf) {
                current += Integer.parseInt(cals);
            }
            caloriesSummed[i] = current;

        };
        Arrays.sort(caloriesSummed, Collections.reverseOrder());
        return caloriesSummed[0] + caloriesSummed[1] + caloriesSummed[2];
    }

}
