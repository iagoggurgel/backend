package br.com.mangakore.mangakorebackend.api.manga;

public enum MangaFormatEnum {
    FORMAT_1("10.5 x 17.5 cm"),
    FORMAT_2("10,6 X 14,8 CM"),
    FORMAT_3("11,4 X 17,7 CM"),
    FORMAT_4("11,5 X 17 CM"),
    FORMAT_5("11,5 X 17,2 CM"),
    FORMAT_6("11,5 X 17,5 CM"),
    FORMAT_7("12 X 18 CM"),
    FORMAT_8("12,1 X 18,7 CM"),
    FORMAT_9("12,3 X 17,17 CM"),
    FORMAT_10("12,5 X 18 CM"),
    FORMAT_11("12,5 X 18,2 CM"),
    FORMAT_12("12,5 X 19 CM"),
    FORMAT_13("12,6 X 18 CM"),
    FORMAT_14("12,7 X 18,9 CM"),
    FORMAT_15("12,8 X 17,8 CM"),
    FORMAT_16("12,8 X 18 CM"),
    FORMAT_17("12,8 X 18,2 CM"),
    FORMAT_18("12,8 X 18,7 CM"),
    FORMAT_19("13 X 18 CM"),
    FORMAT_20("13 X 18,5"),
    FORMAT_21("13,2 X 20 CM"),
    FORMAT_22("13,4 × 20,0 CM"),
    FORMAT_23("13,5 X 17,5 CM"),
    FORMAT_24("13,5 X 18,5 CM"),
    FORMAT_25("13,5 X 19 CM"),
    FORMAT_26("13,5 X 20 CM"),
    FORMAT_27("13,5 X 20,5 CM"),
    FORMAT_28("13,7 X 20 CM"),
    FORMAT_29("14 X 21 CM"),
    FORMAT_30("14,5 X 20 CM"),
    FORMAT_31("14,7 X 21 CM"),
    FORMAT_32("14,8 X 21 CM"),
    FORMAT_33("15 X 21 CM"),
    FORMAT_34("15 X 22 CM"),
    FORMAT_35("15,4 X 22,5 CM"),
    FORMAT_36("15,5 X 21 CM"),
    FORMAT_37("15,5 X 22 CM"),
    FORMAT_38("15,8 × 23 CM"),
    FORMAT_39("16 X 22 CM"),
    FORMAT_40("16 X 23 CM"),
    FORMAT_41("17 X 24 CM"),
    FORMAT_42("17 X 26 CM"),
    FORMAT_43("17,8 X 12,5 CM"),
    FORMAT_44("17,8 X 25,6 CM"),
    FORMAT_45("18 X 20,6 CM"),
    FORMAT_46("18 X 26 CM"),
    FORMAT_47("18,2 X 25,6 CM"),
    FORMAT_48("18,5 X 27,5"),
    FORMAT_49("20 X 13,5 CM"),
    FORMAT_50("20,5 X 27,5"),
    FORMAT_51("21 X 29,6 CM"),
    FORMAT_52("21 X 29,7 CM"),
    FORMAT_53("21 X 30 CM"),
    FORMAT_54("23,4 X 31,6 CM"),
    FORMAT_55("26 X 18");

    private final String description;

    MangaFormatEnum(String description) {
        this.description = description;
    }
}
