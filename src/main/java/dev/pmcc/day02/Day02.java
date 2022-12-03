package dev.pmcc.day02;

import dev.pmcc.Template;

public class Day02 implements Template {

    int draw = 3, win = 6;

    @Override
    public int part1(String input) {
        int score = 0;
        String[] moves = input.split("\n");
        for(int i = 0; i < moves.length; i++){
            String[] move = moves[i].split(" ");
            Move elfMove = convertToMove(move[0]);
            Move myMove = convertToMove(move[1]);

            score += calculateScore(elfMove, myMove);
        }
        return score;
    }

    private Move convertToMove(String moveLetter) {
        Move move = Move.ROCK;
        if(moveLetter.equals("A") || moveLetter.equals("X")) {
            move = Move.ROCK;
        } else if(moveLetter.equals("B") || moveLetter.equals("Y")) {
            move = Move.PAPER;
        } else if(moveLetter.equals("C") || moveLetter.equals("Z")) {
            move = Move.SCISSORS;
        }
        return move;
    }

    @Override
    public int part2(String input) {
        int score = 0;
        String[] moves = input.split("\n");
        for(int i = 0; i < moves.length; i++){
            String[] move = moves[i].split(" ");
            Move elfMove = convertToMove(move[0]);
            Move myMove = convertToMyMove(elfMove, move[1]);

            score += calculateScore(elfMove, myMove);
        }
        return score;
    }

    private Move convertToMyMove(Move elfMove, String myMove) {
        switch (myMove) {
            case "X" -> {
                if (elfMove.equals(Move.ROCK)) {
                    return Move.SCISSORS;
                } else if (elfMove.equals(Move.PAPER)) {
                    return Move.ROCK;
                } else {
                    return Move.PAPER;
                }
            }
            case "Y" -> {
                return elfMove;
            }
            case "Z" -> {
                if (elfMove.equals(Move.ROCK)) {
                    return Move.PAPER;
                } else if (elfMove.equals(Move.PAPER)) {
                    return Move.SCISSORS;
                } else {
                    return Move.ROCK;
                }
            }
            default -> {
            }
        }
        return null;
    }

    public int calculateScore(Move elfMove, Move myMove) {
        int score = 0;
        if(myMove == elfMove) {
            score += draw;
        }
        if((myMove.equals(Move.ROCK) && elfMove.equals(Move.SCISSORS))
            || (myMove.equals(Move.PAPER) && elfMove.equals(Move.ROCK))
            || (myMove.equals(Move.SCISSORS) && elfMove.equals(Move.PAPER))) {
            score += win;
        }

        score += myMove.getPoints();
        return score;
    }
}
