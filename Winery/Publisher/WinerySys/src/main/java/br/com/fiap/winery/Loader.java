package br.com.fiap.winery;

import jakarta.xml.ws.Endpoint;

public class Loader {
    public static void main(String[] args){

        WineStockServiceImplementation wineStock = new WineStockServiceImplementation();
        String address1 = "http://localhost:8085/WineStockService";
        Endpoint.publish(address1, wineStock);
        System.out.println("Serviço 1 publicado!");

        WineWarningServiceImplementation wineWarning = new WineWarningServiceImplementation();
        String address2 = "http://localhost:8086/WineWarningService";
        Endpoint.publish(address2, wineWarning);
        System.out.println("Serviço 2 publicado!");
    }
}
