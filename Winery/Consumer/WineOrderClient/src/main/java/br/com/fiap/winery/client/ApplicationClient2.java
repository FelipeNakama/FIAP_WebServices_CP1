package br.com.fiap.winery.client;

import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {

        final String wsdl = "http://localhost:8085/WineStockService?wsdl";
        URL url = new URL(wsdl);
        QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        Service service = Service.create(url, qName);
        WineStockService wineStockService = service.getPort(WineStockService.class);
        String order = wineStockService.placeOrder("Cabernet",2);
        System.out.println(order);

        final String wsdl2 = "http://localhost:8086/WineWarningService?wsdl";
        URL url2 = new URL(wsdl2);
        QName qName2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");
        Service service2 = Service.create(url2, qName2);
        WineWarningService wineWarningService = service2.getPort(WineWarningService.class);
        String estoque = wineWarningService.sendWarn();
        System.out.println(estoque);

    }
}
