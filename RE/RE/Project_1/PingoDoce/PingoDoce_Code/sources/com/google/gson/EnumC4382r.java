package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.r */
/* loaded from: classes.dex */
public abstract class EnumC4382r {
    private static final /* synthetic */ EnumC4382r[] $VALUES;
    public static final EnumC4382r DEFAULT;
    public static final EnumC4382r STRING;

    /* compiled from: LongSerializationPolicy.java */
    /* renamed from: com.google.gson.r$a */
    /* loaded from: classes.dex */
    enum C4383a extends EnumC4382r {
        C4383a(String str, int i) {
            super(str, i, null);
        }

        @Override // com.google.gson.EnumC4382r
        public AbstractC4376l serialize(Long l) {
            return new C4379o(l);
        }
    }

    static {
        C4383a c4383a = new C4383a("DEFAULT", 0);
        DEFAULT = c4383a;
        EnumC4382r enumC4382r = new EnumC4382r("STRING", 1) { // from class: com.google.gson.r.b
            @Override // com.google.gson.EnumC4382r
            public AbstractC4376l serialize(Long l) {
                return new C4379o(String.valueOf(l));
            }
        };
        STRING = enumC4382r;
        $VALUES = new EnumC4382r[]{c4383a, enumC4382r};
    }

    private EnumC4382r(String str, int i) {
    }

    public static EnumC4382r valueOf(String str) {
        return (EnumC4382r) Enum.valueOf(EnumC4382r.class, str);
    }

    public static EnumC4382r[] values() {
        return (EnumC4382r[]) $VALUES.clone();
    }

    public abstract AbstractC4376l serialize(Long l);

    /* synthetic */ EnumC4382r(String str, int i, C4383a c4383a) {
        this(str, i);
    }
}
