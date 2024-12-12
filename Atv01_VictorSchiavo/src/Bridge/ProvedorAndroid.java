package Bridge;

public class ProvedorAndroid implements ProvedorInternet {
    @Override
    public String connect() {
        return "Conectando via Android Network";
    }
}
