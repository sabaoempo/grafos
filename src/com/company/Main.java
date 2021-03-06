package com.company;
import com.company.Grafo.Vertice;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println("Grafo simples (não dirigido):");
        GrafoSimples g = new GrafoSimples();

        Vertice s = g.adicionarVertice("s");
        Vertice t = g.adicionarVertice("t");
        Vertice u = g.adicionarVertice("u");
        Vertice v = g.adicionarVertice("v");
        Vertice x = g.adicionarVertice("x");

        g.adicionarAresta(v, s);
        g.adicionarAresta(v, t);
        g.adicionarAresta(v, u);
        g.adicionarAresta(v, x);
        // Adiciona loop - g.adicionarAresta(v, v);

        g.adicionarAresta(x, u);
        g.adicionarAresta(u, t);
        g.adicionarAresta(u, u);

        g.imprimir();

        // Método 1
        System.out.println("\nOs vértices S e V são adjacentes? " + g.eAdjacente(s, v));
        System.out.println("Os vértices X e T são adjacentes? " + g.eAdjacente(x, t));

        // Método 2
        System.out.println("O vértice s possui grau igual a: " +g.getGrau(s));
        System.out.println("O vértice x possui grau igual a: " +g.getGrau(x));
        System.out.println("O vértice v possui grau igual a: " +g.getGrau(v));

        // Método 3
        System.out.println("O grafo é regular? " + g.eRegular());

        // Método 4
        System.out.println("O vértice S é isolado? " + g.eIsolado(s));

        // Método 5
        System.out.println("O vértice V é pendente? " + g.ePendente(v));

        // Método 6
        System.out.println("O grafo é nulo? " + g.eNulo());

        // Método 7
        System.out.println("O grafo é completo? " + g.eCompleto());

        // Método 8
        System.out.println("O grafo é conexo? " + g.eConexo());

        // Método 9

        GrafoSimples b = new GrafoSimples();
        Vertice sB = b.adicionarVertice("s");
        Vertice tB = b.adicionarVertice("t");
        Vertice uB = b.adicionarVertice("u");
        Vertice vB = b.adicionarVertice("v");
        Vertice xB = b.adicionarVertice("x");

        g.adicionarAresta(sB, xB);
        g.adicionarAresta(tB, xB);
        g.adicionarAresta(tB, vB);
        g.adicionarAresta(uB, vB);

        System.out.println("O grafo 'G'é bipartido? " + g.eBipartido());
        System.out.println("O grafo 'B'é bipartido? " + b.eBipartido());

        //Método 10
        System.out.println("Grafo complementar: ");
        g.getComplementar(g);

        // Método 11
        System.out.println("O grafo é euleriano? " + g.eEuleriano());

        // Método 12
        System.out.println("O grafo é unicursal? " + g.eUnicursal());

        System.out.println("\n------------------------------------------------\n");
        System.out.println("Grafo Dirigido:");
        GrafoDirigido gD = new GrafoDirigido();

        Vertice sD = gD.adicionarVertice("s");
        Vertice tD = gD.adicionarVertice("t");
        Vertice uD = gD.adicionarVertice("u");
        Vertice vD = gD.adicionarVertice("v");
        Vertice xD = gD.adicionarVertice("x");

        gD.adicionarAresta(vD, sD);
        gD.adicionarAresta(vD, tD);
        gD.adicionarAresta(vD, uD);
        gD.adicionarAresta(vD, xD);
        gD.adicionarAresta(xD, uD);
        gD.adicionarAresta(uD, tD);
        gD.adicionarAresta(uD, uD);

        gD.imprimir();

        System.out.println("\nO vértice S aponta para V? " + gD.eAdjacente(sD, vD));

        System.out.println("O vértice X aponta para T? " + gD.eAdjacente(xD, tD));

        // Método  14
        System.out.println("O vértice S possui grau de entrada igual a: " + gD.getGrauEntrada(sD));

        // Método 16
        Grafo transposto = gD.getTransposto();
        transposto.imprimir();
    }

}
