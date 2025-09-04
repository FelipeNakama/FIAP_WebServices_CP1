package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {
    @Override
    public String getMenu() {
        return "Menu de Vinhos: \n"
                + "- Cabernet Sauvignon: Reserva 2018, Reserva 2019 \n"
                + "- Merlot: Suave 2020, Clássico 2017 \n"
                + "- Chardonnay: Branco Seco 2021, Barrica 2019 \n"
                + "- Sauvignon Blanc: Reserva 2022\n";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado: " + quantity + " garrafas de " + name;
    }
}
