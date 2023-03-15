package p309q7;

import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4248c;
import java.io.IOException;
import p011aa.C0095a;
import p270oa.C8051a;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.a */
/* loaded from: classes.dex */
final class C9673a implements InterfaceC4247b<C8051a> {

    /* renamed from: a */
    static final C9673a f25501a = new C9673a();

    /* renamed from: b */
    private static final C0095a f25502b;

    /* renamed from: c */
    private static final C0095a f25503c;

    /* renamed from: d */
    private static final C0095a f25504d;

    /* renamed from: e */
    private static final C0095a f25505e;

    /* renamed from: f */
    private static final C0095a f25506f;

    /* renamed from: g */
    private static final C0095a f25507g;

    /* renamed from: h */
    private static final C0095a f25508h;

    /* renamed from: i */
    private static final C0095a f25509i;

    /* renamed from: j */
    private static final C0095a f25510j;

    /* renamed from: k */
    private static final C0095a f25511k;

    /* renamed from: l */
    private static final C0095a f25512l;

    /* renamed from: m */
    private static final C0095a f25513m;

    /* renamed from: n */
    private static final C0095a f25514n;

    /* renamed from: o */
    private static final C0095a f25515o;

    /* renamed from: p */
    private static final C0095a f25516p;

    static {
        C0095a.C0097b m41963a = C0095a.m41963a("projectNumber");
        C9687o c9687o = new C9687o();
        c9687o.m10220a(1);
        f25502b = m41963a.m41958b(c9687o.m10219b()).m41959a();
        C0095a.C0097b m41963a2 = C0095a.m41963a("messageId");
        C9687o c9687o2 = new C9687o();
        c9687o2.m10220a(2);
        f25503c = m41963a2.m41958b(c9687o2.m10219b()).m41959a();
        C0095a.C0097b m41963a3 = C0095a.m41963a("instanceId");
        C9687o c9687o3 = new C9687o();
        c9687o3.m10220a(3);
        f25504d = m41963a3.m41958b(c9687o3.m10219b()).m41959a();
        C0095a.C0097b m41963a4 = C0095a.m41963a("messageType");
        C9687o c9687o4 = new C9687o();
        c9687o4.m10220a(4);
        f25505e = m41963a4.m41958b(c9687o4.m10219b()).m41959a();
        C0095a.C0097b m41963a5 = C0095a.m41963a("sdkPlatform");
        C9687o c9687o5 = new C9687o();
        c9687o5.m10220a(5);
        f25506f = m41963a5.m41958b(c9687o5.m10219b()).m41959a();
        C0095a.C0097b m41963a6 = C0095a.m41963a("packageName");
        C9687o c9687o6 = new C9687o();
        c9687o6.m10220a(6);
        f25507g = m41963a6.m41958b(c9687o6.m10219b()).m41959a();
        C0095a.C0097b m41963a7 = C0095a.m41963a("collapseKey");
        C9687o c9687o7 = new C9687o();
        c9687o7.m10220a(7);
        f25508h = m41963a7.m41958b(c9687o7.m10219b()).m41959a();
        C0095a.C0097b m41963a8 = C0095a.m41963a("priority");
        C9687o c9687o8 = new C9687o();
        c9687o8.m10220a(8);
        f25509i = m41963a8.m41958b(c9687o8.m10219b()).m41959a();
        C0095a.C0097b m41963a9 = C0095a.m41963a("ttl");
        C9687o c9687o9 = new C9687o();
        c9687o9.m10220a(9);
        f25510j = m41963a9.m41958b(c9687o9.m10219b()).m41959a();
        C0095a.C0097b m41963a10 = C0095a.m41963a("topic");
        C9687o c9687o10 = new C9687o();
        c9687o10.m10220a(10);
        f25511k = m41963a10.m41958b(c9687o10.m10219b()).m41959a();
        C0095a.C0097b m41963a11 = C0095a.m41963a("bulkId");
        C9687o c9687o11 = new C9687o();
        c9687o11.m10220a(11);
        f25512l = m41963a11.m41958b(c9687o11.m10219b()).m41959a();
        C0095a.C0097b m41963a12 = C0095a.m41963a("event");
        C9687o c9687o12 = new C9687o();
        c9687o12.m10220a(12);
        f25513m = m41963a12.m41958b(c9687o12.m10219b()).m41959a();
        C0095a.C0097b m41963a13 = C0095a.m41963a("analyticsLabel");
        C9687o c9687o13 = new C9687o();
        c9687o13.m10220a(13);
        f25514n = m41963a13.m41958b(c9687o13.m10219b()).m41959a();
        C0095a.C0097b m41963a14 = C0095a.m41963a("campaignId");
        C9687o c9687o14 = new C9687o();
        c9687o14.m10220a(14);
        f25515o = m41963a14.m41958b(c9687o14.m10219b()).m41959a();
        C0095a.C0097b m41963a15 = C0095a.m41963a("composerLabel");
        C9687o c9687o15 = new C9687o();
        c9687o15.m10220a(15);
        f25516p = m41963a15.m41958b(c9687o15.m10219b()).m41959a();
    }

    private C9673a() {
    }

    @Override // com.google.firebase.encoders.InterfaceC4247b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo661a(Object obj, Object obj2) throws IOException {
        C8051a c8051a = (C8051a) obj;
        InterfaceC4248c interfaceC4248c = (InterfaceC4248c) obj2;
        interfaceC4248c.mo10215c(f25502b, c8051a.m17048l());
        interfaceC4248c.mo10212f(f25503c, c8051a.m17052h());
        interfaceC4248c.mo10212f(f25504d, c8051a.m17053g());
        interfaceC4248c.mo10212f(f25505e, c8051a.m17051i());
        interfaceC4248c.mo10212f(f25506f, c8051a.m17047m());
        interfaceC4248c.mo10212f(f25507g, c8051a.m17050j());
        interfaceC4248c.mo10212f(f25508h, c8051a.m17056d());
        interfaceC4248c.mo10216b(f25509i, c8051a.m17049k());
        interfaceC4248c.mo10216b(f25510j, c8051a.m17045o());
        interfaceC4248c.mo10212f(f25511k, c8051a.m17046n());
        interfaceC4248c.mo10215c(f25512l, c8051a.m17058b());
        interfaceC4248c.mo10212f(f25513m, c8051a.m17054f());
        interfaceC4248c.mo10212f(f25514n, c8051a.m17059a());
        interfaceC4248c.mo10215c(f25515o, c8051a.m17057c());
        interfaceC4248c.mo10212f(f25516p, c8051a.m17055e());
    }
}
