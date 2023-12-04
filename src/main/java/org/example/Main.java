package org.example;

public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("v1");
        grafo.adicionarVertice("v2");
        grafo.adicionarVertice("v3");
        grafo.adicionarVertice("v4");
        grafo.adicionarVertice("v5");
        grafo.adicionarVertice("v6");

        grafo.adicionarAresta(1.0, "v1", "v5");
        grafo.adicionarAresta(1.0, "v2", "v3");
        grafo.adicionarAresta(1.0, "v3", "v2");
        grafo.adicionarAresta(1.0, "v4", "v6");
        grafo.adicionarAresta(1.0, "v5", "v4");
        grafo.adicionarAresta(1.0, "v6", "v4");

        grafo.buscaEmLargura();
    }
}
