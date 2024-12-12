

import AbstractFactory.*;
import Bridge.*;
import Singleton.GerenciadorDispositivo;

public class Main {
    public static void main(String[] args) {
        GerenciadorDispositivo deviceManager1 = GerenciadorDispositivo.getInstance();
        GerenciadorDispositivo deviceManager2 = GerenciadorDispositivo.getInstance();
        System.out.println(deviceManager1 == deviceManager2);
        DispositivoFactory smartphoneFactory = new SmartphoneFactory();
        deviceManager1.configureDevice(smartphoneFactory);
        System.out.println(deviceManager1.operateDevice());
        DispositivoFactory tabletFactory = new TabletFactory();
        deviceManager1.configureDevice(tabletFactory);
        System.out.println(deviceManager1.operateDevice());
    }
}