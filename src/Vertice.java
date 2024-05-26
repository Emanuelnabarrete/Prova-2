public class Vertice {

private String rota;

    @Override
    public String toString() {
        return "Vertice{" +
                "rota='" + rota + '\'' +
                '}';
    }

    public Vertice(String rota) {
        this.rota = rota;
    }


    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }


}
