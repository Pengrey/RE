package p467yb;

/* renamed from: yb.m */
/* loaded from: classes2.dex */
final class C13165m {

    /* renamed from: a */
    private int f34117a = 0;

    /* renamed from: b */
    private EnumC13166a f34118b = EnumC13166a.NUMERIC;

    /* compiled from: CurrentParsingState.java */
    /* renamed from: yb.m$a */
    /* loaded from: classes2.dex */
    private enum EnumC13166a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m1509a() {
        return this.f34117a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1508b(int i) {
        this.f34117a += i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m1507c() {
        return this.f34118b == EnumC13166a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m1506d() {
        return this.f34118b == EnumC13166a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m1505e() {
        this.f34118b = EnumC13166a.ALPHA;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m1504f() {
        this.f34118b = EnumC13166a.ISO_IEC_646;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m1503g() {
        this.f34118b = EnumC13166a.NUMERIC;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m1502h(int i) {
        this.f34117a = i;
    }
}
