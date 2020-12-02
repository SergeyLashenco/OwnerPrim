package io.owner.sergey;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class ServerTest {

    @Test
    public void  testServer (){
        ServerConfig config = ConfigFactory.newInstance()
                .create(ServerConfig.class);

        System.out.println(config.getServer().host);
        System.out.println(config.getServer().port);
    }
}
