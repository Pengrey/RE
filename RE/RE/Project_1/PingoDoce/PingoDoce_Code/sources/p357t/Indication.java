package p357t;

import p070e.C4906j;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5242r1;
import p181jd.Intrinsics;
import p392v.C10977f;
import p392v.C10981i;
import p392v.C10990r;
import p392v.InterfaceC10985k;
import p393v0.Color;
import p433x0.DrawScope;
import p433x0.InterfaceC12238c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: t.g */
/* loaded from: classes.dex */
public final class Indication implements InterfaceC10307k {

    /* renamed from: a */
    public static final Indication f26793a = new Indication();

    /* compiled from: Indication.kt */
    /* renamed from: t.g$a */
    /* loaded from: classes.dex */
    private static final class C10279a implements InterfaceC10308l {

        /* renamed from: w */
        private final InterfaceC5242r1 f26794w;

        /* renamed from: x */
        private final InterfaceC5242r1 f26795x;

        /* renamed from: y */
        private final InterfaceC5242r1 f26796y;

        public C10279a(InterfaceC5242r1 interfaceC5242r1, InterfaceC5242r1 interfaceC5242r12, InterfaceC5242r1 interfaceC5242r13) {
            Intrinsics.isThisObjectNull(interfaceC5242r1, "isPressed");
            Intrinsics.isThisObjectNull(interfaceC5242r12, "isHovered");
            Intrinsics.isThisObjectNull(interfaceC5242r13, "isFocused");
            this.f26794w = interfaceC5242r1;
            this.f26795x = interfaceC5242r12;
            this.f26796y = interfaceC5242r13;
        }

        /* renamed from: c */
        public void mo8303c(InterfaceC12238c interfaceC12238c) {
            Intrinsics.isThisObjectNull(interfaceC12238c, "<this>");
            interfaceC12238c.mo3277g0();
            if (((Boolean) this.f26794w.getValue()).booleanValue()) {
                DrawScope.C12241b.m3255e(interfaceC12238c, Color.m6648l(Color.f28297b.m6637a(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC12238c.m3263a(), 0.0f, null, null, 0, C4906j.f13400E0, null);
            } else if (((Boolean) this.f26795x.getValue()).booleanValue() || ((Boolean) this.f26796y.getValue()).booleanValue()) {
                DrawScope.C12241b.m3255e(interfaceC12238c, Color.m6648l(Color.f28297b.m6637a(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, interfaceC12238c.m3263a(), 0.0f, null, null, 0, C4906j.f13400E0, null);
            }
        }
    }

    private Indication() {
    }

    /* renamed from: a */
    public InterfaceC10308l mo8304a(InterfaceC10985k interfaceC10985k, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC10985k, "interactionSource");
        interfaceC5179i.mo25263g(1543446324);
        int i2 = i & 14;
        InterfaceC5242r1 m6663a = C10990r.m6663a(interfaceC10985k, interfaceC5179i, i2);
        InterfaceC5242r1 m6676a = C10981i.m6676a(interfaceC10985k, interfaceC5179i, i2);
        InterfaceC5242r1 m6679a = C10977f.m6679a(interfaceC10985k, interfaceC5179i, i2);
        interfaceC5179i.mo25263g(-3686930);
        boolean mo25276I = interfaceC5179i.mo25276I(interfaceC10985k);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25276I || mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = new C10279a(m6663a, m6676a, m6679a);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        C10279a c10279a = (C10279a) mo25262h;
        interfaceC5179i.mo25282C();
        return c10279a;
    }
}
