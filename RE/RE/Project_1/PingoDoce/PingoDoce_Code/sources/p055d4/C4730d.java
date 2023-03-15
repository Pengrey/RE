package p055d4;

import com.airbnb.lottie.C2201d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;
import java.util.Locale;
import p026b4.C1798b;
import p026b4.C1806j;
import p026b4.C1807k;
import p026b4.C1808l;
import p040c4.C2070g;
import p040c4.InterfaceC2065b;
import p152i4.C6013a;

/* renamed from: d4.d */
/* loaded from: classes.dex */
public class C4730d {

    /* renamed from: a */
    private final List<InterfaceC2065b> f12960a;

    /* renamed from: b */
    private final C2201d f12961b;

    /* renamed from: c */
    private final String f12962c;

    /* renamed from: d */
    private final long f12963d;

    /* renamed from: e */
    private final EnumC4731a f12964e;

    /* renamed from: f */
    private final long f12965f;

    /* renamed from: g */
    private final String f12966g;

    /* renamed from: h */
    private final List<C2070g> f12967h;

    /* renamed from: i */
    private final C1808l f12968i;

    /* renamed from: j */
    private final int f12969j;

    /* renamed from: k */
    private final int f12970k;

    /* renamed from: l */
    private final int f12971l;

    /* renamed from: m */
    private final float f12972m;

    /* renamed from: n */
    private final float f12973n;

    /* renamed from: o */
    private final int f12974o;

    /* renamed from: p */
    private final int f12975p;

    /* renamed from: q */
    private final C1806j f12976q;

    /* renamed from: r */
    private final C1807k f12977r;

    /* renamed from: s */
    private final C1798b f12978s;

    /* renamed from: t */
    private final List<C6013a<Float>> f12979t;

    /* renamed from: u */
    private final EnumC4732b f12980u;

    /* renamed from: v */
    private final boolean f12981v;

    /* compiled from: Layer.java */
    /* renamed from: d4.d$a */
    /* loaded from: classes.dex */
    public enum EnumC4731a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    /* renamed from: d4.d$b */
    /* loaded from: classes.dex */
    public enum EnumC4732b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public C4730d(List<InterfaceC2065b> list, C2201d c2201d, String str, long j, EnumC4731a enumC4731a, long j2, String str2, List<C2070g> list2, C1808l c1808l, int i, int i2, int i3, float f, float f2, int i4, int i5, C1806j c1806j, C1807k c1807k, List<C6013a<Float>> list3, EnumC4732b enumC4732b, C1798b c1798b, boolean z) {
        this.f12960a = list;
        this.f12961b = c2201d;
        this.f12962c = str;
        this.f12963d = j;
        this.f12964e = enumC4731a;
        this.f12965f = j2;
        this.f12966g = str2;
        this.f12967h = list2;
        this.f12968i = c1808l;
        this.f12969j = i;
        this.f12970k = i2;
        this.f12971l = i3;
        this.f12972m = f;
        this.f12973n = f2;
        this.f12974o = i4;
        this.f12975p = i5;
        this.f12976q = c1806j;
        this.f12977r = c1807k;
        this.f12979t = list3;
        this.f12980u = enumC4732b;
        this.f12978s = c1798b;
        this.f12981v = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C2201d m26765a() {
        return this.f12961b;
    }

    /* renamed from: b */
    public long m26764b() {
        return this.f12963d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List<C6013a<Float>> m26763c() {
        return this.f12979t;
    }

    /* renamed from: d */
    public EnumC4731a m26762d() {
        return this.f12964e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public List<C2070g> m26761e() {
        return this.f12967h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public EnumC4732b m26760f() {
        return this.f12980u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public String m26759g() {
        return this.f12962c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public long m26758h() {
        return this.f12965f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m26757i() {
        return this.f12975p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m26756j() {
        return this.f12974o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public String m26755k() {
        return this.f12966g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public List<InterfaceC2065b> m26754l() {
        return this.f12960a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m26753m() {
        return this.f12971l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public int m26752n() {
        return this.f12970k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public int m26751o() {
        return this.f12969j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public float m26750p() {
        return this.f12973n / this.f12961b.m34427e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public C1806j m26749q() {
        return this.f12976q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public C1807k m26748r() {
        return this.f12977r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public C1798b m26747s() {
        return this.f12978s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public float m26746t() {
        return this.f12972m;
    }

    public String toString() {
        return m26743w(BuildConfig.VERSION_NAME);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public C1808l m26745u() {
        return this.f12968i;
    }

    /* renamed from: v */
    public boolean m26744v() {
        return this.f12981v;
    }

    /* renamed from: w */
    public String m26743w(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(m26759g());
        sb2.append("\n");
        C4730d m34412t = this.f12961b.m34412t(m26758h());
        if (m34412t != null) {
            sb2.append("\t\tParents: ");
            sb2.append(m34412t.m26759g());
            C4730d m34412t2 = this.f12961b.m34412t(m34412t.m26758h());
            while (m34412t2 != null) {
                sb2.append("->");
                sb2.append(m34412t2.m26759g());
                m34412t2 = this.f12961b.m34412t(m34412t2.m26758h());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!m26761e().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(m26761e().size());
            sb2.append("\n");
        }
        if (m26751o() != 0 && m26752n() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(m26751o()), Integer.valueOf(m26752n()), Integer.valueOf(m26753m())));
        }
        if (!this.f12960a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (InterfaceC2065b interfaceC2065b : this.f12960a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(interfaceC2065b);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
