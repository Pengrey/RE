package p071e0;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import p070e.C4906j;
import p092f0.InterfaceC5242r1;
import p181jd.Intrinsics;
import p345s.Animatable;
import p345s.C9937b;
import p345s.InterfaceC9950h;
import p373u0.C10781l;
import p392v.C10974b;
import p392v.C10975c;
import p392v.C10976d;
import p392v.C10980g;
import p392v.DragInteraction;
import p392v.FocusInteraction;
import p392v.HoverInteraction;
import p392v.InterfaceC10984j;
import p393v0.C11076z;
import p393v0.Color;
import p433x0.DrawScope;
import p433x0.InterfaceC12239d;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13777q;
import td.InterfaceC10524i0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Ripple.kt */
/* renamed from: e0.q */
/* loaded from: classes.dex */
public final class C4934q {

    /* renamed from: a */
    private final boolean f13710a;

    /* renamed from: b */
    private final InterfaceC5242r1 f13711b;

    /* renamed from: c */
    private final Animatable f13712c;

    /* renamed from: d */
    private final List f13713d;

    /* renamed from: e */
    private InterfaceC10984j f13714e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ripple.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", m20196f = "Ripple.kt", m20195l = {290}, m20194m = "invokeSuspend")
    /* renamed from: e0.q$a */
    /* loaded from: classes.dex */
    public static final class C4935a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ InterfaceC9950h f13715A;

        /* renamed from: x */
        int f13716x;

        /* renamed from: z */
        final /* synthetic */ float f13718z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4935a(float f, InterfaceC9950h interfaceC9950h, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f13718z = f;
            this.f13715A = interfaceC9950h;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4935a(this.f13718z, this.f13715A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4935a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f13716x;
            if (i == 0) {
                C13186n.m1453b(obj);
                Animatable m26244a = C4934q.m26244a(C4934q.this);
                Float m20200b = C6755b.m20200b(this.f13718z);
                InterfaceC9950h interfaceC9950h = this.f13715A;
                this.f13716x = 1;
                if (Animatable.m9653f(m26244a, m20200b, interfaceC9950h, null, null, this, 12, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Ripple.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", m20196f = "Ripple.kt", m20195l = {296}, m20194m = "invokeSuspend")
    /* renamed from: e0.q$b */
    /* loaded from: classes.dex */
    public static final class C4936b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f13719x;

        /* renamed from: z */
        final /* synthetic */ InterfaceC9950h f13721z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4936b(InterfaceC9950h interfaceC9950h, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f13721z = interfaceC9950h;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C4936b(this.f13721z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C4936b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f13719x;
            if (i == 0) {
                C13186n.m1453b(obj);
                Animatable m26244a = C4934q.m26244a(C4934q.this);
                Float m20200b = C6755b.m20200b(0.0f);
                InterfaceC9950h interfaceC9950h = this.f13721z;
                this.f13719x = 1;
                if (Animatable.m9653f(m26244a, m20200b, interfaceC9950h, null, null, this, 12, null) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    public C4934q(boolean z, InterfaceC5242r1 interfaceC5242r1) {
        Intrinsics.isThisObjectNull(interfaceC5242r1, "rippleAlpha");
        this.f13710a = z;
        this.f13711b = interfaceC5242r1;
        this.f13712c = C9937b.m9627b(0.0f, 0.0f, 2, null);
        this.f13713d = new ArrayList();
    }

    /* renamed from: a */
    public static final /* synthetic */ Animatable m26244a(C4934q c4934q) {
        return c4934q.f13712c;
    }

    /* renamed from: b */
    public final void m26243b(DrawScope drawScope, float f, long j) {
        float m899A;
        Intrinsics.isThisObjectNull(drawScope, "$receiver");
        if (Float.isNaN(f)) {
            m899A = C4922h.m26276a(drawScope, this.f13710a, drawScope.m3263a());
        } else {
            m899A = drawScope.m899A(f);
        }
        float f2 = m899A;
        float floatValue = ((Number) this.f13712c.m9644o()).floatValue();
        if (floatValue > 0.0f) {
            long m6648l = Color.m6648l(j, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (this.f13710a) {
                float m7091i = C10781l.m7091i(drawScope.m3263a());
                float m7093g = C10781l.m7093g(drawScope.m3263a());
                int m6194b = C11076z.f28470a.m6194b();
                InterfaceC12239d m3272B = drawScope.m3272B();
                long mo3276a = m3272B.mo3276a();
                m3272B.mo3275b().m6269h();
                m3272B.mo3274c().mo3246a(0.0f, 0.0f, m7091i, m7093g, m6194b);
                DrawScope.C12241b.m3259a(drawScope, m6648l, f2, 0L, 0.0f, null, null, 0, C4906j.f13410G0, null);
                m3272B.mo3275b().m6270g();
                m3272B.mo3273d(mo3276a);
                return;
            }
            DrawScope.C12241b.m3259a(drawScope, m6648l, f2, 0L, 0.0f, null, null, 0, C4906j.f13410G0, null);
        }
    }

    /* renamed from: c */
    public final void m26242c(InterfaceC10984j interfaceC10984j, InterfaceC10524i0 interfaceC10524i0) {
        InterfaceC9950h m26255d;
        float m26298a;
        InterfaceC9950h m26256c;
        Intrinsics.isThisObjectNull(interfaceC10984j, "interaction");
        Intrinsics.isThisObjectNull(interfaceC10524i0, "scope");
        boolean z = interfaceC10984j instanceof C10980g;
        if (z) {
            this.f13713d.add(interfaceC10984j);
        } else if (interfaceC10984j instanceof HoverInteraction) {
            this.f13713d.remove(((HoverInteraction) interfaceC10984j).m6677a());
        } else if (interfaceC10984j instanceof C10976d) {
            this.f13713d.add(interfaceC10984j);
        } else if (interfaceC10984j instanceof FocusInteraction) {
            this.f13713d.remove(((FocusInteraction) interfaceC10984j).m6680a());
        } else if (interfaceC10984j instanceof C10974b) {
            this.f13713d.add(interfaceC10984j);
        } else if (interfaceC10984j instanceof C10975c) {
            this.f13713d.remove(((C10975c) interfaceC10984j).m6681a());
        } else if (!(interfaceC10984j instanceof DragInteraction)) {
            return;
        } else {
            this.f13713d.remove(((DragInteraction) interfaceC10984j).m6682a());
        }
        InterfaceC10984j interfaceC10984j2 = (InterfaceC10984j) C13777q.m248X(this.f13713d);
        if (Intrinsics.equals(this.f13714e, interfaceC10984j2)) {
            return;
        }
        if (interfaceC10984j2 != null) {
            if (z) {
                m26298a = ((C4914f) this.f13711b.getValue()).m26296c();
            } else if (interfaceC10984j instanceof C10976d) {
                m26298a = ((C4914f) this.f13711b.getValue()).m26297b();
            } else {
                m26298a = interfaceC10984j instanceof C10974b ? ((C4914f) this.f13711b.getValue()).m26298a() : 0.0f;
            }
            m26256c = C4929n.m26256c(interfaceC10984j2);
            C6772d.m20158d(interfaceC10524i0, null, null, new C4935a(m26298a, m26256c, null), 3, null);
        } else {
            m26255d = C4929n.m26255d(this.f13714e);
            C6772d.m20158d(interfaceC10524i0, null, null, new C4936b(m26255d, null), 3, null);
        }
        this.f13714e = interfaceC10984j2;
    }
}
