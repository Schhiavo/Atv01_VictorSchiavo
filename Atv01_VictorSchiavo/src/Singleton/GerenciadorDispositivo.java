package Singleton;

import AbstractFactory.DispositivoFactory;
import Bridge.Dispositivo;

public class GerenciadorDispositivo {
    private static GerenciadorDispositivo instance;
    private Dispositivo dispositivo;
    private GerenciadorDispositivo() {}

    public static GerenciadorDispositivo getInstance() {
        if (instance == null) {
            instance = new GerenciadorDispositivo();
        }
        return instance;
    }

    public void configureDevice(DispositivoFactory factory) {
        this.dispositivo = factory.criarDispositivo();
    }

    public String operateDevice() {
        if (dispositivo != null) {
            return dispositivo.operate();
        }
        return "Nenhum dispositivo configurado.";
    }
}
