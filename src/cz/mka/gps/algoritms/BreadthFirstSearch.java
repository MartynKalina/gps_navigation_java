package cz.mka.gps.algoritms;

import cz.mka.gps.libs.Vertex;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    public void travers(Vertex root){

        Queue<Vertex> queue = new LinkedList<>();

        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()){

            Vertex actualVertex = queue.remove();
            System.out.println("Actual visted Vertex: "+ actualVertex );
            for (Vertex v : actualVertex.getAdjacencyList()){
                if (!v.isVisited()){
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
