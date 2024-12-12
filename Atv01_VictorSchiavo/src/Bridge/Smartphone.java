package Bridge;

public class Smartphone implements Dispositivo {
    private ProvedorInternet provedorInternet;

    public Smartphone(ProvedorInternet provedorInternet) {
        this.provedorInternet = provedorInternet;
    }

    @Override
    public String operate() {
        return "Smartphone funcionando: " + provedorInternet.connect();
    }
}
