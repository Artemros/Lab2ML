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
    private Set<Character> between = Set.of('.', '-');

    public Graph() {
        vertices.add(new Vertex(1, List.of(new Edge(1, 2, plus), new Edge(1, 5, intSymbols), new Edge(1, 4, left), new Edge(1, 3, between))));
        vertices.add(new Vertex(1, List.of(new Edge(2, 5, intSymbols), new Edge(2, 4, left), new Edge(2, 3, between))));
        vertices.add(new Vertex(1, List.of(new Edge(3, 6, intSymbols), new Edge(3, 4, left))));
        vertices.add(new Vertex(1, List.of(new Edge(4, 6, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(5, 7, intSymbols), new Edge(5, 4, left), new Edge(5, 3, between))));
        vertices.add(new Vertex(1, List.of(new Edge(6, 8, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(7, 9, intSymbols), new Edge(7, 4, left), new Edge(7, 10, between), new Edge(7, 11, right))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 12, intSymbols), new Edge(8, 13, between), new Edge(8, 11, right))));
        vertices.add(new Vertex(1, List.of(new Edge(9, 14, intSymbols), new Edge(9, 4, left), new Edge(9, 10, between), new Edge(9, 11, right))));
        vertices.add(new Vertex(1, List.of(new Edge(10, 15, intSymbols), new Edge(10, 4, left))));
        vertices.add(new Vertex(1, List.of(new Edge(11, 16, intSymbols), new Edge(11, 13, between))));
        vertices.add(new Vertex(1, List.of(new Edge(12, 17, intSymbols), new Edge(12, 13, between), new Edge(12, 11, right))));
        vertices.add(new Vertex(1, List.of(new Edge(13, 16, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(14, 18, intSymbols), new Edge(14, 13, between), new Edge(14, 11, right))));
        vertices.add(new Vertex(1, List.of(new Edge(15, 19, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(16, 20, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(17, 21, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(18, 22, intSymbols), new Edge(18, 23, between), new Edge(18, 11, right))));
        vertices.add(new Vertex(1, List.of(new Edge(19, 24, intSymbols), new Edge(19, 13, between), new Edge(19, 11, right))));
        vertices.add(new Vertex(1, List.of(new Edge(20, 25, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(21, 26, intSymbols), new Edge(21, 27, between))));
        vertices.add(new Vertex(1, List.of(new Edge(22, 28, intSymbols), new Edge(22, 23, between), new Edge(22, 11, right))));
        vertices.add(new Vertex(1, List.of(new Edge(23, 29, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(24, 30, intSymbols), new Edge(24, 23, between), new Edge(24, 11, right))));
        vertices.add(new Vertex(1, List.of(new Edge(25, 31, intSymbols), new Edge(25, 27, between))));
        vertices.add(new Vertex(1, List.of(new Edge(26, 32, intSymbols), new Edge(26, 27, between))));
        vertices.add(new Vertex(1, List.of(new Edge(27, 31, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(28, 33, intSymbols), new Edge(28, 27, between))));
        vertices.add(new Vertex(1, List.of(new Edge(29, 34, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(30, 35, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(31, 36, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(32, 37, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(33, 38, intSymbols), new Edge(33, 27, between))));
        vertices.add(new Vertex(1, List.of(new Edge(34, 39, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(35, 40, intSymbols), new Edge(35, 27, between))));
        vertices.add(new Vertex(1, List.of(new Edge(36, 41, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(37, 42, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(38, 43, intSymbols), new Edge(38, 27, between))));
        vertices.add(new Vertex(1, List.of(new Edge(39, 44, intSymbols), new Edge(39, 27, between))));
        vertices.add(new Vertex(1, List.of(new Edge(40, 45, intSymbols), new Edge(40, 27, between))));
        vertices.add(new Vertex(1, List.of(new Edge(41, 46, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(42, 46, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(43, 47, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(44, 36, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(45, 37, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(47, 42, intSymbols))));


    }

    public Integer getSize() {
        return vertices.size();
    }
}
