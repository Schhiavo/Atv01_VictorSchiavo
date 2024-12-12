package Teste;

import AbstractFactory.*;
import Bridge.*;
import Singleton.GerenciadorDispositivo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeviceManagerTest {
    private GerenciadorDispositivo gerenciadorDispositivo;
    private DispositivoFactory smartphoneFactory;
    private DispositivoFactory tabletFactory;

    @BeforeEach
    public void setUp() {
        gerenciadorDispositivo = GerenciadorDispositivo.getInstance();
        smartphoneFactory = new SmartphoneFactory();
        tabletFactory = new TabletFactory();
    }

    @Test
    public void testSingleton() {
        GerenciadorDispositivo anotherDeviceManager = GerenciadorDispositivo.getInstance();
        assertSame(gerenciadorDispositivo, anotherDeviceManager, "Os dois gerenciadores devem ser a mesma instância!");
    }

    @Test
    public void testConfigureSmartphone() {
        gerenciadorDispositivo.configureDevice(smartphoneFactory);
        String expectedMessage = "Smartphone funcionando: Conectando via Android Network";
        assertEquals(expectedMessage, gerenciadorDispositivo.operateDevice(), "A operação do smartphone não foi realizada corretamente.");
    }

    @Test
    public void testConfigureTablet() {
        gerenciadorDispositivo.configureDevice(tabletFactory);
        String expectedMessage = "Tablet funcionando: Conectando via iOS Network";
        assertEquals(expectedMessage, gerenciadorDispositivo.operateDevice(), "A operação do tablet não foi realizada corretamente.");
    }

    @Test
    public void testDeviceNotConfigured() {
        GerenciadorDispositivo emptyDeviceManager = GerenciadorDispositivo.getInstance();
        assertEquals("Nenhum dispositivo configurado.", emptyDeviceManager.operateDevice(), "Deveria retornar a mensagem de dispositivo não configurado.");
    }
}