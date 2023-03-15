package sd;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sd.c */
/* loaded from: classes2.dex */
public class C10149c extends CharJVM {
    /* renamed from: f */
    public static final boolean m9039f(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(c);
            char upperCase2 = Character.toUpperCase(c2);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }
}
