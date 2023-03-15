package p288p3;

import id.InterfaceC6097a;
import kotlin.EnumC6754a;
import p107ff.CacheControl;
import p107ff.Headers;
import p107ff.MediaType;
import p107ff.Response;
import p181jd.AbstractC6438m;
import p356sf.InterfaceC10186d;
import p356sf.InterfaceC10187e;
import p396v3.C11098i;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;

/* renamed from: p3.a */
/* loaded from: classes.dex */
public final class C8400a {

    /* renamed from: a */
    private final InterfaceC13178g f21747a;

    /* renamed from: b */
    private final InterfaceC13178g f21748b;

    /* renamed from: c */
    private final long f21749c;

    /* renamed from: d */
    private final long f21750d;

    /* renamed from: e */
    private final boolean f21751e;

    /* renamed from: f */
    private final Headers f21752f;

    /* compiled from: CacheResponse.kt */
    /* renamed from: p3.a$a */
    /* loaded from: classes.dex */
    static final class C8401a extends AbstractC6438m implements InterfaceC6097a<CacheControl> {
        C8401a() {
            super(0);
        }

        @Override // id.InterfaceC6097a
        /* renamed from: a */
        public final CacheControl mo42214q() {
            return CacheControl.f15394n.m24214b(C8400a.this.m15495d());
        }
    }

    /* compiled from: CacheResponse.kt */
    /* renamed from: p3.a$b */
    /* loaded from: classes.dex */
    static final class C8402b extends AbstractC6438m implements InterfaceC6097a<MediaType> {
        C8402b() {
            super(0);
        }

        @Override // id.InterfaceC6097a
        /* renamed from: a */
        public final MediaType mo42214q() {
            String m24014b = C8400a.this.m15495d().m24014b("Content-Type");
            if (m24014b != null) {
                return MediaType.f15564d.m23908b(m24014b);
            }
            return null;
        }
    }

    public C8400a(InterfaceC10187e interfaceC10187e) {
        InterfaceC13178g m1463b;
        InterfaceC13178g m1463b2;
        EnumC6754a enumC6754a = EnumC6754a.NONE;
        m1463b = LazyJVM.m1463b(enumC6754a, new C8401a());
        this.f21747a = m1463b;
        m1463b2 = LazyJVM.m1463b(enumC6754a, new C8402b());
        this.f21748b = m1463b2;
        this.f21749c = Long.parseLong(interfaceC10187e.mo8765J());
        this.f21750d = Long.parseLong(interfaceC10187e.mo8765J());
        this.f21751e = Integer.parseInt(interfaceC10187e.mo8765J()) > 0;
        int parseInt = Integer.parseInt(interfaceC10187e.mo8765J());
        Headers.C5498a c5498a = new Headers.C5498a();
        for (int i = 0; i < parseInt; i++) {
            C11098i.m6154b(c5498a, interfaceC10187e.mo8765J());
        }
        this.f21752f = c5498a.m24002f();
    }

    /* renamed from: a */
    public final CacheControl m15498a() {
        return (CacheControl) this.f21747a.getValue();
    }

    /* renamed from: b */
    public final MediaType m15497b() {
        return (MediaType) this.f21748b.getValue();
    }

    /* renamed from: c */
    public final long m15496c() {
        return this.f21750d;
    }

    /* renamed from: d */
    public final Headers m15495d() {
        return this.f21752f;
    }

    /* renamed from: e */
    public final long m15494e() {
        return this.f21749c;
    }

    /* renamed from: f */
    public final boolean m15493f() {
        return this.f21751e;
    }

    /* renamed from: g */
    public final void m15492g(InterfaceC10186d interfaceC10186d) {
        interfaceC10186d.mo8773w0(this.f21749c).mo8780S(10);
        interfaceC10186d.mo8773w0(this.f21750d).mo8780S(10);
        interfaceC10186d.mo8773w0(this.f21751e ? 1L : 0L).mo8780S(10);
        interfaceC10186d.mo8773w0(this.f21752f.size()).mo8780S(10);
        int size = this.f21752f.size();
        for (int i = 0; i < size; i++) {
            interfaceC10186d.mo8774u0(this.f21752f.m24012h(i)).mo8774u0(": ").mo8774u0(this.f21752f.m24009p(i)).mo8780S(10);
        }
    }

    public C8400a(Response response) {
        InterfaceC13178g m1463b;
        InterfaceC13178g m1463b2;
        EnumC6754a enumC6754a = EnumC6754a.NONE;
        m1463b = LazyJVM.m1463b(enumC6754a, new C8401a());
        this.f21747a = m1463b;
        m1463b2 = LazyJVM.m1463b(enumC6754a, new C8402b());
        this.f21748b = m1463b2;
        this.f21749c = response.m24201b0();
        this.f21750d = response.m24204X();
        this.f21751e = response.m24195y() != null;
        this.f21752f = response.m24211H();
    }
}
