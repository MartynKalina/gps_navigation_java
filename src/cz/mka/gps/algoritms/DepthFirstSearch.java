package cz.mka.gps.algoritms;

import cz.mka.gps.libs.Vertex;

import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {

    private Stack<Vertex> stack;

    public DepthFirstSearch(){
        this.stack = new Stack<>();
    }

    public void dfs (List<Vertex> vertexList){

        //for traversal more components
        for (Vertex v : vertexList){
            if (!v.isVisited()){
                v.setVisited(true);
                dfsWithStack(v);
            }
        }

    }

    private void dfsWithStack(Vertex rootVertex) {
        this.stack.add(rootVertex);
        rootVertex.setVisited(true);

        while (!stack.isEmpty()){

            Vertex actualVertex = this.stack.pop();
            System.out.println("Actual Vrtex: "+actualVertex);

            for (Vertex v : actualVertex.getAdjacencyList()){
                if (!v.isVisited()){
                    v.setVisited(true);
                    this.stack.push(v);
                }
            }
        }
    }

}
