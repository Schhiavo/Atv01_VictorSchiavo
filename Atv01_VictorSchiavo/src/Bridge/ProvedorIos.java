package Bridge;

public class ProvedorIos implements ProvedorInternet {
    @Override
    public String connect() {
        return "Conectando via iOS Network";
    }
}
