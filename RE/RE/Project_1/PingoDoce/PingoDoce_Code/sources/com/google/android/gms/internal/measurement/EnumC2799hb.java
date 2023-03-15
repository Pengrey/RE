package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.hb */
/* loaded from: classes.dex */
public final class EnumC2799hb {
    public static final EnumC2799hb zza;
    public static final EnumC2799hb zzb;
    public static final EnumC2799hb zzc;
    public static final EnumC2799hb zzd;
    public static final EnumC2799hb zze;
    public static final EnumC2799hb zzf;
    public static final EnumC2799hb zzg;
    public static final EnumC2799hb zzh;
    public static final EnumC2799hb zzi;
    public static final EnumC2799hb zzj;
    public static final EnumC2799hb zzk;
    public static final EnumC2799hb zzl;
    public static final EnumC2799hb zzm;
    public static final EnumC2799hb zzn;
    public static final EnumC2799hb zzo;
    public static final EnumC2799hb zzp;
    public static final EnumC2799hb zzq;
    public static final EnumC2799hb zzr;
    private static final /* synthetic */ EnumC2799hb[] zzs;
    private final EnumC2815ib zzt;

    static {
        EnumC2799hb enumC2799hb = new EnumC2799hb("DOUBLE", 0, EnumC2815ib.DOUBLE, 1);
        zza = enumC2799hb;
        EnumC2799hb enumC2799hb2 = new EnumC2799hb("FLOAT", 1, EnumC2815ib.FLOAT, 5);
        zzb = enumC2799hb2;
        EnumC2815ib enumC2815ib = EnumC2815ib.LONG;
        EnumC2799hb enumC2799hb3 = new EnumC2799hb("INT64", 2, enumC2815ib, 0);
        zzc = enumC2799hb3;
        EnumC2799hb enumC2799hb4 = new EnumC2799hb("UINT64", 3, enumC2815ib, 0);
        zzd = enumC2799hb4;
        EnumC2815ib enumC2815ib2 = EnumC2815ib.INT;
        EnumC2799hb enumC2799hb5 = new EnumC2799hb("INT32", 4, enumC2815ib2, 0);
        zze = enumC2799hb5;
        EnumC2799hb enumC2799hb6 = new EnumC2799hb("FIXED64", 5, enumC2815ib, 1);
        zzf = enumC2799hb6;
        EnumC2799hb enumC2799hb7 = new EnumC2799hb("FIXED32", 6, enumC2815ib2, 5);
        zzg = enumC2799hb7;
        EnumC2799hb enumC2799hb8 = new EnumC2799hb("BOOL", 7, EnumC2815ib.BOOLEAN, 0);
        zzh = enumC2799hb8;
        EnumC2799hb enumC2799hb9 = new EnumC2799hb("STRING", 8, EnumC2815ib.STRING, 2);
        zzi = enumC2799hb9;
        EnumC2815ib enumC2815ib3 = EnumC2815ib.MESSAGE;
        EnumC2799hb enumC2799hb10 = new EnumC2799hb("GROUP", 9, enumC2815ib3, 3);
        zzj = enumC2799hb10;
        EnumC2799hb enumC2799hb11 = new EnumC2799hb("MESSAGE", 10, enumC2815ib3, 2);
        zzk = enumC2799hb11;
        EnumC2799hb enumC2799hb12 = new EnumC2799hb("BYTES", 11, EnumC2815ib.BYTE_STRING, 2);
        zzl = enumC2799hb12;
        EnumC2799hb enumC2799hb13 = new EnumC2799hb("UINT32", 12, enumC2815ib2, 0);
        zzm = enumC2799hb13;
        EnumC2799hb enumC2799hb14 = new EnumC2799hb("ENUM", 13, EnumC2815ib.ENUM, 0);
        zzn = enumC2799hb14;
        EnumC2799hb enumC2799hb15 = new EnumC2799hb("SFIXED32", 14, enumC2815ib2, 5);
        zzo = enumC2799hb15;
        EnumC2799hb enumC2799hb16 = new EnumC2799hb("SFIXED64", 15, enumC2815ib, 1);
        zzp = enumC2799hb16;
        EnumC2799hb enumC2799hb17 = new EnumC2799hb("SINT32", 16, enumC2815ib2, 0);
        zzq = enumC2799hb17;
        EnumC2799hb enumC2799hb18 = new EnumC2799hb("SINT64", 17, enumC2815ib, 0);
        zzr = enumC2799hb18;
        zzs = new EnumC2799hb[]{enumC2799hb, enumC2799hb2, enumC2799hb3, enumC2799hb4, enumC2799hb5, enumC2799hb6, enumC2799hb7, enumC2799hb8, enumC2799hb9, enumC2799hb10, enumC2799hb11, enumC2799hb12, enumC2799hb13, enumC2799hb14, enumC2799hb15, enumC2799hb16, enumC2799hb17, enumC2799hb18};
    }

    private EnumC2799hb(String str, int i, EnumC2815ib enumC2815ib, int i2) {
        this.zzt = enumC2815ib;
    }

    public static EnumC2799hb[] values() {
        return (EnumC2799hb[]) zzs.clone();
    }

    public final EnumC2815ib zza() {
        return this.zzt;
    }
}
