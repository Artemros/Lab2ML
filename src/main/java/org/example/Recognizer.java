package org.example;

import java.util.Set;

public class Recognizer {

    boolean nextState(int length, int numOfCurrState, String symbolsLane, int current) {
        Graph graph = new Graph();
        boolean answer = false;
        if (numOfCurrState == length) {
            if(current == 38 || current==42 || current == 43 || current == 44 || current == 45 || current == 46 || current==47){
                answer=true;
            }
        } else {
            Character i1 = symbolsLane.charAt(numOfCurrState);
            for (int i = 0; i < graph.getSize(); i++) {
                int begin = graph.vertices.get(i).edges.get(0).getBegin();
                if (begin == current) {
                    for (int j = 0; j < graph.vertices.get(i).getSize(); j++) {
                        int end = graph.vertices.get(i).edges.get(j).getEnd();
                        Character character = symbolsLane.charAt(numOfCurrState);
                        Set<Character> st = graph.vertices.get(i).edges.get(j).getState();
                        boolean contains = graph.vertices.get(i).edges.get(j).getState().contains(i1);
                        if (contains) {
                            answer = nextState(length, numOfCurrState + 1, symbolsLane, graph.vertices.get(i).edges.get(j).getEnd());
                        }
                    }
                }
            }
        }
        return answer;
    }

}
