public class Aresta {

    private double distancia;
    private Vertice partida;
    private Vertice destino;

    public Aresta(double distancia, String ruaTermino, String ruaComeco) {
    }

    @Override
    public String toString() {
        return "Aresta{" +
                "distancia=" + distancia +
                ", partida=" + partida +
                ", destino=" + destino +
                '}';
    }

    public Aresta(double distancia, Vertice partida, Vertice destino) {
        this.distancia = distancia;
        this.partida = partida;
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Vertice getPartida() {
        return partida;
    }

    public void setPartida(Vertice partida) {
        this.partida = partida;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }
}
