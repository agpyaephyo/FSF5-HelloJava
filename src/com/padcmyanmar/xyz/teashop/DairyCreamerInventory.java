package com.padcmyanmar.xyz.teashop;

public class DairyCreamerInventory extends Inventory {

    private static final int DAIRY_CREAMER_PSC = 30;
    private static final String DAIRY_CREAMER_PCU = "tin";
    private static final String DAIRY_CREAMER_ISU = "tea-spoon";
    private static final String DAIRY_CREAMER_INVENTORY_TYPE = "Dairy Creamer";

    public DairyCreamerInventory(int purchasingQuantity) {
        super(purchasingQuantity,
                purchasingQuantity * DAIRY_CREAMER_PSC,
                DAIRY_CREAMER_PCU,
                DAIRY_CREAMER_ISU,
                DAIRY_CREAMER_PSC,
                DAIRY_CREAMER_INVENTORY_TYPE);
    }

    public void updateInventoryForNewSale(Tea tea, int sellingQuantity) {
        inStockQuantity -= tea.getDairyCreamerAmount() * sellingQuantity;
    }

    public void updateInventoryForNewSale(CoffeeHnutPhyaw coffeeHnutPhyaw, int sellingQuantity) {
        inStockQuantity -= coffeeHnutPhyaw.getDairyCreamerAmount() * sellingQuantity;
    }

    public void updateInventoryForNewSale(CoffeeMix coffeeMix, int sellingQuantity) {
        inStockQuantity -= coffeeMix.getDairyCreamerAmount() * sellingQuantity;
    }
}
