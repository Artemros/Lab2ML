package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Graph {
    LinkedList<Vertex> vertices = new LinkedList<>();
    private Set<Character> intSymbols = Set.of('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
    private Set<Character> plus = Set.of('+');
    private Set<Character> left = Set.of('(');
    private Set<Character> right = Set.of(')');
    private Set<Character> between = Set.of('.','-');

    public Graph() {
        vertices.add(new Vertex(1, List.of(new Edge(1, 2, plus),new Edge(1, 3, intSymbols),new Edge(1, 4, between),new Edge(1, 5, left))));
        vertices.add(new Vertex(1, List.of(new Edge(2, 6, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(3, 7, intSymbols),new Edge(3, 5, left),new Edge(3, 4, between))));
        vertices.add(new Vertex(1, List.of(new Edge(4, 8, intSymbols),new Edge(4, 5, left))));
        vertices.add(new Vertex(1, List.of(new Edge(5, 8, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(6, 9, intSymbols), new Edge(6, 4, between), new Edge(6, 5, left))));
        vertices.add(new Vertex(1, List.of(new Edge(7, 10, intSymbols),new Edge(7, 11, between),new Edge(7, 5, left),new Edge(7, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(9, 14, intSymbols),new Edge(9, 4, between),new Edge(9, 5, left))));
        vertices.add(new Vertex(1, List.of(new Edge(10, 15, intSymbols),new Edge(10, 5, left),new Edge(10, 11, between),new Edge(10, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));






























    }

    public Integer getSize() {
        return vertices.size();
    }
}
