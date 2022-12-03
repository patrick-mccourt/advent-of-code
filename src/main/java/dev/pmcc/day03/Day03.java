package dev.pmcc.day03;

import dev.pmcc.Template;
import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

public class Day03 implements Template {
    @Override
    public int part1(String input) {
        int sum = 0;
        String[] rucksacks = input.split("\n");
        for (String rucksack : rucksacks) {
            int half = rucksack.length() / 2;
            String[] compartments = { rucksack.substring(0, half), rucksack.substring(half) };
            Set<Character> leftChars = new HashSet<>();
            Set<Character> rightChars = new HashSet<>();
            for(char c : compartments[0].toCharArray()) {
                leftChars.add(c);
            }
            for(char c : compartments[1].toCharArray()) {
                rightChars.add(c);
            }

            for(char c : leftChars) {
                if(rightChars.contains(c)) {
                    sum += convertCharToInt(c);
                }
            }

        }

        return sum;
    }

    public static int convertCharToInt(char ch) {

        int charValue = 0;
        char initialCharacter = Character.isUpperCase(ch) ? 'A' : 'a';
        charValue = ch - initialCharacter + 1;
        if(Character.isUpperCase(ch)) {
            charValue += 26;
        }
        return charValue;

    }

    @Override
    public int part2(String input) {
        int sum = 0;
        String[] rucksacks = input.split("\n");
        int first = 0, second = 1, third = 2;
        for(int i = 0; i < rucksacks.length; i+=3) {
            String firstElf = rucksacks[first];
            String secondElf = rucksacks[second];
            String thirdElf = rucksacks[third];

            sum += convertCharToInt(calculateBadge(firstElf, secondElf, thirdElf));

            first += 3;
            second+=3;
            third +=3;
        }

        return sum;
    }

    private char calculateBadge(String firstElf, String secondElf, String thirdElf) {
        Set<Character> first = new HashSet<>(), second = new HashSet<>(), third = new HashSet<>();
        for(char c : firstElf.toCharArray()) {
            first.add(c);
        }
        for(char c : secondElf.toCharArray()) {
            second.add(c);
        }
        for(char c : thirdElf.toCharArray()) {
            third.add(c);
        }

        for(char c : first) {
            if(second.contains(c) && third.contains(c)) {
                return c;
            }
        }
        throw new RuntimeException("Oh fuck");

    }
}
