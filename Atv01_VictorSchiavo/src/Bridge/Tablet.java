package Bridge;

public class Tablet implements Dispositivo {
    private ProvedorInternet provedorInternet;

    public Tablet(ProvedorInternet provedorInternet) {
        this.provedorInternet = provedorInternet;
    }

    @Override
    public String operate() {
        return "Tablet funcionando: " + provedorInternet.connect();
    }
}
