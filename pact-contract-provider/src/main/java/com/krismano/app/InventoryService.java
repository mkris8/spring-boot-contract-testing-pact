package com.krismano.app;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {


    public Inventory saveInventory(Inventory inventory){

        /* for testing the provider end. This service will be mocked */
        return new Inventory("LG Television", "OXFORD", 100);
    }

}
