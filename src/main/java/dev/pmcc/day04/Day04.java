package dev.pmcc.day04;

import dev.pmcc.Template;

public class Day04 implements Template {
    @Override
    public int part1(String input) {
        int sum = 0;
        String[] elfPairs = input.split("\n");
        for (String elfPair: elfPairs) {
            String[] assignments = elfPair.split(",");
            ElfAssignment firstAss = new ElfAssignment(assignments[0]);
            ElfAssignment secondAss = new ElfAssignment(assignments[1]);
            if(firstAss.doesContain(secondAss)) {
                sum += 1;
            }
        }
        return sum;
    }

    @Override
    public int part2(String input) {
        int sum = 0;
        String[] elfPairs = input.split("\n");
        for (String elfPair: elfPairs) {
            String[] assignments = elfPair.split(",");
            ElfAssignment firstAss = new ElfAssignment(assignments[0]);
            ElfAssignment secondAss = new ElfAssignment(assignments[1]);
            if(firstAss.doesOverlap(secondAss)) {
                sum += 1;
            }
        }
        return sum;
    }
}
