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
        vertices.add(new Vertex(1, List.of(new Edge(1, 2, plus), new Edge(1, 3, intSymbols), new Edge(1, 4, between), new Edge(1, 5, left))));
        vertices.add(new Vertex(1, List.of(new Edge(2, 6, intSymbols),new Edge(2, 5, left),new Edge(2, 4, between))));
        vertices.add(new Vertex(1, List.of(new Edge(3, 7, intSymbols), new Edge(3, 5, left), new Edge(3, 4, between))));
        vertices.add(new Vertex(1, List.of(new Edge(4, 8, intSymbols), new Edge(4, 5, left))));
        vertices.add(new Vertex(1, List.of(new Edge(5, 8, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(6, 9, intSymbols), new Edge(6, 5, left), new Edge(6, 4, between))));
        vertices.add(new Vertex(1, List.of(new Edge(7, 10, intSymbols), new Edge(7, 5, left), new Edge(7, 11, between), new Edge(7, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(8, 13, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(9, 14, intSymbols), new Edge(9, 5, left), new Edge(9, 4, between))));
        vertices.add(new Vertex(1, List.of(new Edge(10, 15, intSymbols), new Edge(10, 5, left), new Edge(10, 11, between), new Edge(10, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(11, 16, intSymbols), new Edge(11, 5, left))));
        vertices.add(new Vertex(1, List.of(new Edge(12, 17, intSymbols), new Edge(12, 18, between))));
        vertices.add(new Vertex(1, List.of(new Edge(13, 19, intSymbols), new Edge(13, 18, between), new Edge(13, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(14, 20, intSymbols), new Edge(14, 5, left), new Edge(14, 11, between), new Edge(14, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(15, 21, intSymbols),new Edge(15, 18, between))));
        vertices.add(new Vertex(1, List.of(new Edge(16, 22, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(17, 23, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(18, 17, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(19, 24, intSymbols),new Edge(19, 18, between),new Edge(19, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(20, 25, intSymbols),new Edge(20, 18, between),new Edge(20, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(21, 26, intSymbols),new Edge(21, 27, between))));
        vertices.add(new Vertex(1, List.of(new Edge(22, 28, intSymbols),new Edge(22, 18, between),new Edge(22, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(23, 29, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(24, 30, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(25, 31, intSymbols),new Edge(25, 18, between),new Edge(25, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(26, 32, intSymbols),new Edge(26, 27, between),new Edge(26, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(27, 52, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(28, 34, intSymbols),new Edge(28, 33, between),new Edge(28, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(29, 35, intSymbols),new Edge(29, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(30, 50, intSymbols),new Edge(30, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(31, 36, intSymbols),new Edge(31, 33, between),new Edge(31, 12, right))));
        vertices.add(new Vertex(1, List.of(new Edge(32, 39, intSymbols),new Edge(32, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(33, 35, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(34, 37, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(35, 38, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(36, 40, intSymbols),new Edge(36, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(37, 41, intSymbols),new Edge(37, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(38, 42, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(39, 43, intSymbols),new Edge(39, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(40, 44, intSymbols),new Edge(40, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(41, 45, intSymbols),new Edge(41, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(42, 56, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(43, 46, intSymbols),new Edge(43, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(44, 46, intSymbols),new Edge(44, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(45, 47, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(46, 48, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(47, 49, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(48, 49, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(49, 56, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(50, 51, intSymbols),new Edge(50, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(51, 47, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(52, 53, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(53, 54, intSymbols))));
        vertices.add(new Vertex(1, List.of(new Edge(54, 55, intSymbols),new Edge(54, 33, between))));
        vertices.add(new Vertex(1, List.of(new Edge(55, 38, intSymbols))));


    }

    public Integer getSize() {
        return vertices.size();
    }
}
