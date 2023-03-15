package p443xa;

/* renamed from: xa.a */
/* loaded from: classes2.dex */
class C12331a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static double m3059a(double d) {
        return Math.asin(Math.sqrt(d)) * 2.0d;
    }

    /* renamed from: b */
    static double m3058b(double d) {
        double sin = Math.sin(d * 0.5d);
        return sin * sin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static double m3057c(double d, double d2, double d3) {
        return m3058b(d - d2) + (m3058b(d3) * Math.cos(d) * Math.cos(d2));
    }
}
