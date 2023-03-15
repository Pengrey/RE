package p005a4;

/* renamed from: a4.h */
/* loaded from: classes.dex */
public class C0021h {

    /* renamed from: d */
    private static String f80d = "\r";

    /* renamed from: a */
    private final String f81a;

    /* renamed from: b */
    public final float f82b;

    /* renamed from: c */
    public final float f83c;

    public C0021h(String str, float f, float f2) {
        this.f81a = str;
        this.f83c = f2;
        this.f82b = f;
    }

    /* renamed from: a */
    public boolean m42107a(String str) {
        if (this.f81a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f81a.endsWith(f80d)) {
            String str2 = this.f81a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
