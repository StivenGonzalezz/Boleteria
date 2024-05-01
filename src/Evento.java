public class Evento {

    private String nombreEvento;
    private String fechaEvento;
    private String artista;
    private String precioCobre;
    private String precioPlata;
    private String precioOro;
    private int canEscenario;
    private int canCobre;
    private int canPlata;
    private int canOro;


    public Evento(String nombreEvento, String fechaEvento, String artista, String precioCobre, String precioPlata, String precioOro, int canEscenario) {
        this.nombreEvento = nombreEvento;
        this.fechaEvento = fechaEvento;
        this.artista = artista;
        this.precioCobre = precioCobre;
        this.precioPlata = precioPlata;
        this.precioOro = precioOro;
        this.canEscenario = canEscenario;
        canCobre= (int) (canEscenario*0.6);
        canPlata= (int) (canEscenario*0.3);
        canOro= (int) (canEscenario*0.1);
    }


    public void cantidad(){

        /*canCobre= (int) (canEscenario*0.6);
        canPlata= (int) (canEscenario*0.3);
        canOro= (int) (canEscenario*0.1);*/
        System.out.println(canCobre);
        System.out.println(canPlata);
        System.out.println(canOro);
    }

    public String getNombreEvento() {
        return nombreEvento;

    }public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;

    }public String getFechaEvento() {
        return fechaEvento;

    }public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;

    }public String getArtista() {
        return artista;

    }public void setArtista(String artista) {
        this.artista = artista;

    }public String getPrecioCobre() {
        return precioCobre;

    }public void setPrecioCobre(String precioCobre) {
        this.precioCobre = precioCobre;

    }public String getPrecioPlata() {
        return precioPlata;

    }public void setPrecioPlata(String precioPlata) {
        this.precioPlata = precioPlata;

    }public String getPrecioOro() {
        return precioOro;

    }public void setPrecioOro(String precioOro) {
        this.precioOro = precioOro;

    }public int getCanEscenario() {
        return canEscenario;

    }public void setCanEscenario(int canEscenario) {
        this.canEscenario = canEscenario;
    }
}