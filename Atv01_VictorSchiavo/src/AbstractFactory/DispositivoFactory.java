package AbstractFactory;

import Bridge.Dispositivo;
import Bridge.ProvedorInternet;

public interface DispositivoFactory {
    Dispositivo criarDispositivo();
    ProvedorInternet criarProvedor();
}
