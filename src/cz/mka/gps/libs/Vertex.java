package cz.mka.gps.libs;

import java.util.ArrayList;
import java.util.List;

public class Vertex{
    private String name;
    private boolean visited;
    private List<Vertex> adjacencyList;

    public Vertex(String name) {
        this.name = name;
        this.adjacencyList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNeighbour (Vertex vertex){
        adjacencyList.add(vertex);
    }
    public void showNeighbours(){
        for (Vertex v : adjacencyList)
            System.out.println(v);
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getAdjacencyList() {
        return adjacencyList;
    }

    @Override
    public String toString() {
        return this.name;
    }
}