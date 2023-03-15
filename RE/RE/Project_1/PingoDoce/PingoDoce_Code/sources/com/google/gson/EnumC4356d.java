package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.d */
/* loaded from: classes.dex */
public abstract class EnumC4356d implements InterfaceC4363e {
    private static final /* synthetic */ EnumC4356d[] $VALUES;
    public static final EnumC4356d IDENTITY;
    public static final EnumC4356d LOWER_CASE_WITH_DASHES;
    public static final EnumC4356d LOWER_CASE_WITH_DOTS;
    public static final EnumC4356d LOWER_CASE_WITH_UNDERSCORES;
    public static final EnumC4356d UPPER_CAMEL_CASE;
    public static final EnumC4356d UPPER_CAMEL_CASE_WITH_SPACES;

    /* compiled from: FieldNamingPolicy.java */
    /* renamed from: com.google.gson.d$a */
    /* loaded from: classes.dex */
    enum C4357a extends EnumC4356d {
        C4357a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.EnumC4356d, com.google.gson.InterfaceC4363e
        public String translateName(Field field) {
            return field.getName();
        }
    }

    static {
        C4357a c4357a = new C4357a("IDENTITY", 0);
        IDENTITY = c4357a;
        EnumC4356d enumC4356d = new EnumC4356d("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.d.b
            @Override // com.google.gson.EnumC4356d, com.google.gson.InterfaceC4363e
            public String translateName(Field field) {
                return EnumC4356d.upperCaseFirstLetter(field.getName());
            }
        };
        UPPER_CAMEL_CASE = enumC4356d;
        EnumC4356d enumC4356d2 = new EnumC4356d("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.d.c
            @Override // com.google.gson.EnumC4356d, com.google.gson.InterfaceC4363e
            public String translateName(Field field) {
                return EnumC4356d.upperCaseFirstLetter(EnumC4356d.separateCamelCase(field.getName(), " "));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = enumC4356d2;
        EnumC4356d enumC4356d3 = new EnumC4356d("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.d.d
            @Override // com.google.gson.EnumC4356d, com.google.gson.InterfaceC4363e
            public String translateName(Field field) {
                return EnumC4356d.separateCamelCase(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = enumC4356d3;
        EnumC4356d enumC4356d4 = new EnumC4356d("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.d.e
            @Override // com.google.gson.EnumC4356d, com.google.gson.InterfaceC4363e
            public String translateName(Field field) {
                return EnumC4356d.separateCamelCase(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = enumC4356d4;
        EnumC4356d enumC4356d5 = new EnumC4356d("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.d.f
            @Override // com.google.gson.EnumC4356d, com.google.gson.InterfaceC4363e
            public String translateName(Field field) {
                return EnumC4356d.separateCamelCase(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = enumC4356d5;
        $VALUES = new EnumC4356d[]{c4357a, enumC4356d, enumC4356d2, enumC4356d3, enumC4356d4, enumC4356d5};
    }

    private EnumC4356d(String str, int i) {
    }

    static String separateCamelCase(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    static String upperCaseFirstLetter(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }

    public static EnumC4356d valueOf(String str) {
        return (EnumC4356d) Enum.valueOf(EnumC4356d.class, str);
    }

    public static EnumC4356d[] values() {
        return (EnumC4356d[]) $VALUES.clone();
    }

    @Override // com.google.gson.InterfaceC4363e
    public abstract /* synthetic */ String translateName(Field field);

    /* synthetic */ EnumC4356d(String str, int i, C4357a c4357a) {
        this(str, i);
    }
}
