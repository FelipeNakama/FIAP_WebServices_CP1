package br.com.fiap.winery;

import br.com.fiap.winery.client.WineStockService;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;


public class ApplicationClient1 {
    public static void main(String[] args) throws MalformedURLException {
        final String wsdl = "http://localhost:8085/WineStockService?wsdl";
        URL url = new URL(wsdl);

        QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");

        Service service = Service.create(url, qName);

        WineStockService wineStockService = service.getPort(WineStockService.class);

        String menu = wineStockService.getMenu();
        System.out.println("Menu recebido do serviço: \n" + menu);
    }
}
