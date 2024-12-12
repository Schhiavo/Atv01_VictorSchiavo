package AbstractFactory;


import Bridge.Dispositivo;
import Bridge.Tablet;
import Bridge.ProvedorIos;
import Bridge.ProvedorInternet;

public class TabletFactory implements DispositivoFactory {
    @Override
    public Dispositivo criarDispositivo() {
        return new Tablet(criarProvedor());
    }

    @Override
    public ProvedorInternet criarProvedor() {
        return new ProvedorIos();
    }
}