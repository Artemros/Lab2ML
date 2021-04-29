package org.example;

public class Recognizer {
    private Integer[] states = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    boolean nextState(int length, int numOfCurrState, String symbolsLane, int current) {
        Graph graph = new Graph();
        boolean answer=false;
        if (numOfCurrState == length) {
            return current==56;
        } else {
            Character i1 = symbolsLane.charAt(numOfCurrState);
            for (int i = 0; i < graph.getSize(); i++) {
                for (int j = 0; j < graph.vertices.get(i).getSize(); j++) {
                    int begin = graph.vertices.get(i).edges.get(j).getBegin();
                    boolean contains = graph.vertices.get(i).edges.get(j).getState().contains(i1);
                    if (begin == current) {
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
