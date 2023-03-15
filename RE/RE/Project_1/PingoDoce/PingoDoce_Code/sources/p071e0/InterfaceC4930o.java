package p071e0;

import p092f0.InterfaceC5179i;
import p393v0.C11003c0;
import p393v0.Color;

/* renamed from: e0.o */
/* loaded from: classes.dex */
public interface InterfaceC4930o {

    /* renamed from: a */
    public static final C4931a f13703a = C4931a.f13704a;

    /* compiled from: RippleTheme.kt */
    /* renamed from: e0.o$a */
    /* loaded from: classes.dex */
    public static final class C4931a {

        /* renamed from: a */
        static final /* synthetic */ C4931a f13704a = new C4931a();

        private C4931a() {
        }

        /* renamed from: a */
        public final C4914f m26251a(long j, boolean z) {
            C4914f c4914f;
            C4914f c4914f2;
            C4914f c4914f3;
            if (z) {
                if (C11003c0.m6589g(j) > 0.5d) {
                    c4914f3 = C4932p.f13706b;
                    return c4914f3;
                }
                c4914f2 = C4932p.f13707c;
                return c4914f2;
            }
            c4914f = C4932p.f13708d;
            return c4914f;
        }

        /* renamed from: b */
        public final long m26250b(long j, boolean z) {
            return (z || ((double) C11003c0.m6589g(j)) >= 0.5d) ? j : Color.f28297b.m6631g();
        }
    }

    /* renamed from: a */
    long mo26253a(InterfaceC5179i interfaceC5179i, int i);

    /* renamed from: b */
    C4914f mo26252b(InterfaceC5179i interfaceC5179i, int i);
}
