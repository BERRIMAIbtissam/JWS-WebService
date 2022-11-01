package server;

import ws.BanqueService;

import javax.xml.ws.Endpoint;


public class ServerWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8085/";
        Endpoint.publish(url, new BanqueService());
    }
}
