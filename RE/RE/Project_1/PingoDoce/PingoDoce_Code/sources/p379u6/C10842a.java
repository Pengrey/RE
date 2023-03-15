package p379u6;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: u6.a */
/* loaded from: classes.dex */
public class C10842a {

    /* renamed from: b */
    static int f28031b = 31;

    /* renamed from: a */
    private int f28032a = 1;

    /* renamed from: a */
    public C10842a m6895a(Object obj) {
        this.f28032a = (f28031b * this.f28032a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: b */
    public int m6894b() {
        return this.f28032a;
    }

    /* renamed from: c */
    public final C10842a m6893c(boolean z) {
        this.f28032a = (f28031b * this.f28032a) + (z ? 1 : 0);
        return this;
    }
}
