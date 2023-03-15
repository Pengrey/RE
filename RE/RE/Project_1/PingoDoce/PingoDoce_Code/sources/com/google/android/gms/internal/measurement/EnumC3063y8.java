package com.google.android.gms.internal.measurement;

import com.github.aachartmodel.aainfographics.BuildConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.y8 */
/* loaded from: classes.dex */
public final class EnumC3063y8 {
    public static final EnumC3063y8 zza;
    public static final EnumC3063y8 zzb;
    public static final EnumC3063y8 zzc;
    public static final EnumC3063y8 zzd;
    public static final EnumC3063y8 zze;
    public static final EnumC3063y8 zzf;
    public static final EnumC3063y8 zzg;
    public static final EnumC3063y8 zzh;
    public static final EnumC3063y8 zzi;
    public static final EnumC3063y8 zzj;
    private static final /* synthetic */ EnumC3063y8[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        EnumC3063y8 enumC3063y8 = new EnumC3063y8("VOID", 0, Void.class, Void.class, null);
        zza = enumC3063y8;
        Class cls = Integer.TYPE;
        EnumC3063y8 enumC3063y82 = new EnumC3063y8("INT", 1, cls, Integer.class, 0);
        zzb = enumC3063y82;
        EnumC3063y8 enumC3063y83 = new EnumC3063y8("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = enumC3063y83;
        EnumC3063y8 enumC3063y84 = new EnumC3063y8("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = enumC3063y84;
        EnumC3063y8 enumC3063y85 = new EnumC3063y8("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = enumC3063y85;
        EnumC3063y8 enumC3063y86 = new EnumC3063y8("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = enumC3063y86;
        EnumC3063y8 enumC3063y87 = new EnumC3063y8("STRING", 6, String.class, String.class, BuildConfig.VERSION_NAME);
        zzg = enumC3063y87;
        EnumC3063y8 enumC3063y88 = new EnumC3063y8("BYTE_STRING", 7, AbstractC2955r7.class, AbstractC2955r7.class, AbstractC2955r7.f7969x);
        zzh = enumC3063y88;
        EnumC3063y8 enumC3063y89 = new EnumC3063y8("ENUM", 8, cls, Integer.class, null);
        zzi = enumC3063y89;
        EnumC3063y8 enumC3063y810 = new EnumC3063y8("MESSAGE", 9, Object.class, Object.class, null);
        zzj = enumC3063y810;
        zzk = new EnumC3063y8[]{enumC3063y8, enumC3063y82, enumC3063y83, enumC3063y84, enumC3063y85, enumC3063y86, enumC3063y87, enumC3063y88, enumC3063y89, enumC3063y810};
    }

    private EnumC3063y8(String str, int i, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static EnumC3063y8[] values() {
        return (EnumC3063y8[]) zzk.clone();
    }

    public final Class zza() {
        return this.zzm;
    }
}
