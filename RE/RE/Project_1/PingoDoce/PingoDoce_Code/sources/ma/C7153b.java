package ma;

/* renamed from: ma.b */
/* loaded from: classes.dex */
public class C7153b implements InterfaceC7152a {

    /* renamed from: a */
    private static C7153b f18963a;

    private C7153b() {
    }

    /* renamed from: b */
    public static C7153b m19083b() {
        if (f18963a == null) {
            f18963a = new C7153b();
        }
        return f18963a;
    }

    @Override // ma.InterfaceC7152a
    /* renamed from: a */
    public long mo19084a() {
        return System.currentTimeMillis();
    }
}
