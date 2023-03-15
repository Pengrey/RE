package p199k9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p136ha.InterfaceC5880a;
import p136ha.InterfaceC5882b;
import p157i9.InterfaceC6056a;
import p219l9.C7011f;
import p238m9.C7148c;
import p238m9.C7149d;
import p238m9.C7150e;
import p238m9.C7151f;
import p238m9.InterfaceC7146a;
import p253n9.C7691c;
import p253n9.InterfaceC7689a;
import p253n9.InterfaceC7690b;

/* renamed from: k9.d */
/* loaded from: classes.dex */
public class C6612d {

    /* renamed from: a */
    private final InterfaceC5880a<InterfaceC6056a> f17850a;

    /* renamed from: b */
    private volatile InterfaceC7146a f17851b;

    /* renamed from: c */
    private volatile InterfaceC7690b f17852c;

    /* renamed from: d */
    private final List<InterfaceC7689a> f17853d;

    public C6612d(InterfaceC5880a<InterfaceC6056a> interfaceC5880a) {
        this(interfaceC5880a, new C7691c(), new C7151f());
    }

    /* renamed from: f */
    private void m20493f() {
        this.f17850a.mo21029a(new InterfaceC5880a.InterfaceC5881a() { // from class: k9.a
            @Override // p136ha.InterfaceC5880a.InterfaceC5881a
            /* renamed from: a */
            public final void mo19633a(InterfaceC5882b interfaceC5882b) {
                C6612d.this.m20490i(interfaceC5882b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m20492g(String str, Bundle bundle) {
        this.f17851b.mo19085a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m20491h(InterfaceC7689a interfaceC7689a) {
        synchronized (this) {
            if (this.f17852c instanceof C7691c) {
                this.f17853d.add(interfaceC7689a);
            }
            this.f17852c.mo17710a(interfaceC7689a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m20490i(InterfaceC5882b interfaceC5882b) {
        C7011f.m19611f().m19615b("AnalyticsConnector now available.");
        InterfaceC6056a interfaceC6056a = (InterfaceC6056a) interfaceC5882b.get();
        C7150e c7150e = new C7150e(interfaceC6056a);
        C6613e c6613e = new C6613e();
        if (m20489j(interfaceC6056a, c6613e) != null) {
            C7011f.m19611f().m19615b("Registered Firebase Analytics listener.");
            C7149d c7149d = new C7149d();
            C7148c c7148c = new C7148c(c7150e, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (InterfaceC7689a interfaceC7689a : this.f17853d) {
                    c7149d.mo17710a(interfaceC7689a);
                }
                c6613e.m20485d(c7149d);
                c6613e.m20484e(c7148c);
                this.f17852c = c7149d;
                this.f17851b = c7148c;
            }
            return;
        }
        C7011f.m19611f().m19606k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    /* renamed from: j */
    private static InterfaceC6056a.InterfaceC6057a m20489j(InterfaceC6056a interfaceC6056a, C6613e c6613e) {
        InterfaceC6056a.InterfaceC6057a mo22297a = interfaceC6056a.mo22297a("clx", c6613e);
        if (mo22297a == null) {
            C7011f.m19611f().m19615b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            mo22297a = interfaceC6056a.mo22297a("crash", c6613e);
            if (mo22297a != null) {
                C7011f.m19611f().m19606k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return mo22297a;
    }

    /* renamed from: d */
    public InterfaceC7146a m20495d() {
        return new InterfaceC7146a() { // from class: k9.b
            @Override // p238m9.InterfaceC7146a
            /* renamed from: a */
            public final void mo19085a(String str, Bundle bundle) {
                C6612d.this.m20492g(str, bundle);
            }
        };
    }

    /* renamed from: e */
    public InterfaceC7690b m20494e() {
        return new InterfaceC7690b() { // from class: k9.c
            @Override // p253n9.InterfaceC7690b
            /* renamed from: a */
            public final void mo17710a(InterfaceC7689a interfaceC7689a) {
                C6612d.this.m20491h(interfaceC7689a);
            }
        };
    }

    public C6612d(InterfaceC5880a<InterfaceC6056a> interfaceC5880a, InterfaceC7690b interfaceC7690b, InterfaceC7146a interfaceC7146a) {
        this.f17850a = interfaceC5880a;
        this.f17852c = interfaceC7690b;
        this.f17853d = new ArrayList();
        this.f17851b = interfaceC7146a;
        m20493f();
    }
}
