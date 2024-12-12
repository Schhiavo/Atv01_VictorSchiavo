package AbstractFactory;

import Bridge.Dispositivo;
import Bridge.Smartphone;
import Bridge.ProvedorAndroid;
import Bridge.ProvedorInternet;

public class SmartphoneFactory implements DispositivoFactory {
    @Override
    public Dispositivo criarDispositivo() {
        return new Smartphone(criarProvedor());
    }

    @Override
    public ProvedorInternet criarProvedor() {
        return new ProvedorAndroid();
    }
}