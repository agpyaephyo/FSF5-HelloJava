package com.padcmyanmar.xyz.teashop;

public class KyaSaint extends Tea {

    private static final int KYA_SAINT_DIARY_CREAMER_AMOUNT = 2;
    private static final int KYA_SAINT_AKYAYAY_AMOUNT = 60;
    private static final int KYA_SAINT_SUGAR_AMOUNT = 3;

    public static final char KYA_SAINT_CHAR = 'K';
    private static final String KYA_SAINT_NAME = "Kya Saint Tea";

    private static int totalKyaSaintCups = 0;
    private static double subTotalForKyaSaintSales = 0.0;

    public KyaSaint(SellingType sellingType) {
        super(sellingType,
                KYA_SAINT_DIARY_CREAMER_AMOUNT,
                KYA_SAINT_AKYAYAY_AMOUNT,
                KYA_SAINT_SUGAR_AMOUNT,
                KYA_SAINT_NAME);
    }

    public static void showBeverageWithChar() {
        System.out.println("\'" + KYA_SAINT_CHAR
                + "\' for " + KYA_SAINT_NAME);
    }

    public static void addTotalKyaSaintCups() {
        totalKyaSaintCups++;
    }

    public static void addSubTotal(double price) {
        subTotalForKyaSaintSales += price;
    }

    public static void showSubTotal() {
        System.out.println(KYA_SAINT_NAME + " - " + totalKyaSaintCups
                + " cups : " + subTotalForKyaSaintSales + " mmk");
    }

    public static double getSubTotalForKyaSaintSales() {
        return subTotalForKyaSaintSales;
    }
}
