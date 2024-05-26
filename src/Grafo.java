import java.util.ArrayList;

public class Grafo {

private ArrayList<String> ruas;
private  ArrayList<String> caminho;

    @Override
    public String toString() {
        return "Grafo{" +
                "ruas=" + ruas +
                ", caminho=" + caminho +
                '}';
    }

    public Grafo(ArrayList<String> ruas, ArrayList<String> caminho) {
        this.ruas = ruas;
        this.caminho = caminho;
    }

public void addRua(String rua) throws IllegalAccessException {
if (seachRua(rua)!= null){
    throw new IllegalAccessException("Rua ja inserida");

}else {
ruas.add(String.valueOf(new Vertice(rua)));

}

    }


public void addRua(double distancia,String ruaComeco,String ruaTermino){

        Vertice comeco =seachRua(ruaComeco);
        Vertice fim = seachRua(ruaTermino);
        if (comeco == null || fim ==null){
            throw new IllegalArgumentException("Caminho nao encontrado!");
        }
Aresta novoCaminho =new Aresta(distancia, comeco, fim);
    if (!caminho.contains(novoCaminho)) {
        caminho.add(String.valueOf(novoCaminho));
        caminho.add(String.valueOf(new Aresta(distancia, ruaTermino, ruaComeco)));

    }else {
        throw new IllegalArgumentException("Caminho ja colocado");

    }



}
private Vertice seachRua(String rua){
for (Vertice r: ruas){
    if (r.getRota().equals(rua)){
        return r;

    }
}
        return null;
    }



        }
