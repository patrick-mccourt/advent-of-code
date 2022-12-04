package dev.pmcc.day04;

public class ElfAssignment {
    private int start;
    private int end;

    public ElfAssignment(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public ElfAssignment(String assignment) {
        String[] numbers = assignment.split("-");
        this.start = Integer.parseInt(numbers[0]);
        this.end = Integer.parseInt(numbers[1]);
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public boolean doesContain(ElfAssignment assignment){
        return this.start <= assignment.getStart() && this.end >= assignment.getEnd()
                || assignment.getStart() <= this.getStart() && assignment.getEnd() >= this.end;
    }

    public boolean doesOverlap(ElfAssignment assignment) {
        return this.start <= assignment.getEnd() && assignment.getStart() <= this.end;
    }

    @Override
    public String toString(){
        return "Hello I am assigned rooms " + start + " to " + end;
    }
}
