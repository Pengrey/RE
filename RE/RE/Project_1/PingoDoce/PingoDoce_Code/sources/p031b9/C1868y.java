package p031b9;

/* renamed from: b9.y */
/* loaded from: classes.dex */
public final class C1868y {
    /* renamed from: a */
    public static String m35244a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: b */
    public static String m35243b(String str, String str2, String str3) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length + 2 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        sb2.append(":");
        sb2.append(str3);
        return sb2.toString();
    }
}
