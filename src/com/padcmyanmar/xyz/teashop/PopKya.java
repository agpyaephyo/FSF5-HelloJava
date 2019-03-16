package com.padcmyanmar.xyz.teashop;

public class PopKya extends Tea {

    private static final int POP_KYA_DIARY_CREAMER_AMOUNT = 1;
    private static final int POP_KYA_AKYAYAY_AMOUNT = 60;
    private static final int POP_KYA_SUGAR_AMOUNT = 1;

    public static final char POP_KYA_CHAR = 'O';
    private static final String POP_KYA_NAME = "Pop Kya Tea";

    private static int totalPopKyaCups;
    private static int subTotalForPopKyaSales;

    public PopKya(SellingType sellingType) {
        super(sellingType,
                POP_KYA_DIARY_CREAMER_AMOUNT,
                POP_KYA_AKYAYAY_AMOUNT,
                POP_KYA_SUGAR_AMOUNT,
                POP_KYA_NAME);
    }

    public static void showBeverageWithChar() {
        System.out.println("\'" + POP_KYA_CHAR + "\' for " + POP_KYA_NAME);
    }

    public static void addTotalPopKyaCups() {
        totalPopKyaCups++;
    }

    public static void addSubTotal(double price) {
        subTotalForPopKyaSales += price;
    }

    public static void showSubTotal() {
        System.out.println(POP_KYA_NAME + " - " + totalPopKyaCups
                + " cups : " + subTotalForPopKyaSales + " mmk");
    }

    public static int getSubTotalForPopKyaSales() {
        return subTotalForPopKyaSales;
    }
}
