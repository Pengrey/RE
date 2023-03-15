package kotlinx.coroutines.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.internal.j0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6871j0 {

    /* renamed from: a */
    private static final int f18321a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m19947a() {
        return f18321a;
    }

    /* renamed from: b */
    public static final String m19946b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
