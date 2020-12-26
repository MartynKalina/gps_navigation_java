package cz.mka.gps;

import cz.mka.gps.algoritms.BreadthFirstSearch;
import cz.mka.gps.algoritms.DepthFirstSearch;
import cz.mka.gps.libs.Vertex;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        Vertex h = new Vertex("H");

        a.addNeighbour(b);
        a.addNeighbour(f);
        a.addNeighbour(g);
        b.addNeighbour(a);
        b.addNeighbour(c);
        b.addNeighbour(d);
        c.addNeighbour(b);
        d.addNeighbour(b);
        d.addNeighbour(e);
        f.addNeighbour(a);
        g.addNeighbour(a);
        g.addNeighbour(h);
        h.addNeighbour(g);



        /*BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.travers(a);*/

        System.out.println("Depth First Search: ");
        List<Vertex> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
        list.add(g);
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.dfs(list);

    }
}
