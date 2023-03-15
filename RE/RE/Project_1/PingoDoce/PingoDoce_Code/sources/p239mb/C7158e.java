package p239mb;

import java.util.List;

/* renamed from: mb.e */
/* loaded from: classes2.dex */
public final class C7158e {

    /* renamed from: a */
    private final byte[] f18973a;

    /* renamed from: b */
    private int f18974b;

    /* renamed from: c */
    private final String f18975c;

    /* renamed from: d */
    private final List<byte[]> f18976d;

    /* renamed from: e */
    private final String f18977e;

    /* renamed from: f */
    private Object f18978f;

    /* renamed from: g */
    private final int f18979g;

    /* renamed from: h */
    private final int f18980h;

    public C7158e(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    /* renamed from: a */
    public List<byte[]> m19043a() {
        return this.f18976d;
    }

    /* renamed from: b */
    public String m19042b() {
        return this.f18977e;
    }

    /* renamed from: c */
    public int m19041c() {
        return this.f18974b;
    }

    /* renamed from: d */
    public Object m19040d() {
        return this.f18978f;
    }

    /* renamed from: e */
    public byte[] m19039e() {
        return this.f18973a;
    }

    /* renamed from: f */
    public int m19038f() {
        return this.f18979g;
    }

    /* renamed from: g */
    public int m19037g() {
        return this.f18980h;
    }

    /* renamed from: h */
    public String m19036h() {
        return this.f18975c;
    }

    /* renamed from: i */
    public boolean m19035i() {
        return this.f18979g >= 0 && this.f18980h >= 0;
    }

    /* renamed from: j */
    public void m19034j(Integer num) {
    }

    /* renamed from: k */
    public void m19033k(Integer num) {
    }

    /* renamed from: l */
    public void m19032l(int i) {
        this.f18974b = i;
    }

    /* renamed from: m */
    public void m19031m(Object obj) {
        this.f18978f = obj;
    }

    public C7158e(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this.f18973a = bArr;
        this.f18974b = bArr == null ? 0 : bArr.length * 8;
        this.f18975c = str;
        this.f18976d = list;
        this.f18977e = str2;
        this.f18979g = i2;
        this.f18980h = i;
    }
}
