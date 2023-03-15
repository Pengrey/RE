package com.google.android.gms.location;

import android.app.Activity;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.AbstractC2472b;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.internal.AbstractC2541s;
import com.google.android.gms.common.api.internal.C2481a;
import com.google.android.gms.common.api.internal.C2508i;
import com.google.android.gms.common.api.internal.C2513j;
import com.google.android.gms.common.api.internal.C2525n;
import com.google.android.gms.common.api.internal.C2545t;
import com.google.android.gms.common.api.internal.InterfaceC2529o;
import com.google.android.gms.common.api.internal.InterfaceC2535q;
import com.google.android.gms.internal.location.C2667n;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import com.google.android.gms.tasks.InterfaceC3415b;
import p079e8.AbstractC5014a;
import p079e8.InterfaceC5019f;
import p331r7.C9823e;
import p400v7.AbstractC11129a;
import p400v7.C11131c;
import p400v7.C11134f;

/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: com.google.android.gms.location.a */
/* loaded from: classes.dex */
public class C3084a extends AbstractC2472b<C2461a.InterfaceC2465d.C2468c> {
    public C3084a(@RecentlyNonNull Activity activity) {
        super(activity, C11131c.f28558a, C2461a.InterfaceC2465d.f7169e, (InterfaceC2535q) new C2481a());
    }

    /* renamed from: A */
    private final AbstractC3419d<Void> m31622A(final zzba zzbaVar, final AbstractC11129a abstractC11129a, Looper looper, final InterfaceC3096j interfaceC3096j, int i) {
        final C2508i m33352a = C2513j.m33352a(abstractC11129a, C9823e.m9917a(looper), AbstractC11129a.class.getSimpleName());
        final C3093g c3093g = new C3093g(this, m33352a);
        return m33496f(C2525n.m33318a().m33316b(new InterfaceC2529o(this, c3093g, abstractC11129a, interfaceC3096j, zzbaVar, m33352a) { // from class: com.google.android.gms.location.e

            /* renamed from: a */
            private final C3084a f8189a;

            /* renamed from: b */
            private final AbstractC3098l f8190b;

            /* renamed from: c */
            private final AbstractC11129a f8191c;

            /* renamed from: d */
            private final InterfaceC3096j f8192d;

            /* renamed from: e */
            private final zzba f8193e;

            /* renamed from: f */
            private final C2508i f8194f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8189a = this;
                this.f8190b = c3093g;
                this.f8191c = abstractC11129a;
                this.f8192d = interfaceC3096j;
                this.f8193e = zzbaVar;
                this.f8194f = m33352a;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC2529o
            /* renamed from: a */
            public final void mo19090a(Object obj, Object obj2) {
                this.f8189a.m31618x(this.f8190b, this.f8191c, this.f8192d, this.f8193e, this.f8194f, (C2667n) obj, (C3421e) obj2);
            }
        }).m33314d(c3093g).m33313e(m33352a).m33315c(i).m33317a());
    }

    @RecentlyNonNull
    /* renamed from: u */
    public AbstractC3419d<Location> m31621u(int i, @RecentlyNonNull final AbstractC5014a abstractC5014a) {
        LocationRequest m31628h = LocationRequest.m31628h();
        m31628h.m31631F(i);
        m31628h.m31632E(0L);
        m31628h.m31633D(0L);
        m31628h.m31625y(30000L);
        final zzba m32936h = zzba.m32936h(null, m31628h);
        m32936h.m32933y(true);
        m32936h.m32935t(10000L);
        AbstractC3419d m33497e = m33497e(AbstractC2541s.m33293a().m33287b(new InterfaceC2529o(this, abstractC5014a, m32936h) { // from class: com.google.android.gms.location.c

            /* renamed from: a */
            private final C3084a f8184a;

            /* renamed from: b */
            private final AbstractC5014a f8185b;

            /* renamed from: c */
            private final zzba f8186c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8184a = this;
                this.f8185b = abstractC5014a;
                this.f8186c = m32936h;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC2529o
            /* renamed from: a */
            public final void mo19090a(Object obj, Object obj2) {
                this.f8184a.m31617y(this.f8185b, this.f8186c, (C2667n) obj, (C3421e) obj2);
            }
        }).m33285d(C11134f.f28564d).m33284e(2415).m33288a());
        if (abstractC5014a != null) {
            final C3421e c3421e = new C3421e(abstractC5014a);
            m33497e.mo30787i(new InterfaceC3415b(c3421e) { // from class: com.google.android.gms.location.d

                /* renamed from: a */
                private final C3421e f8188a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f8188a = c3421e;
                }

                @Override // com.google.android.gms.tasks.InterfaceC3415b
                /* renamed from: a */
                public final Object mo4684a(AbstractC3419d abstractC3419d) {
                    C3421e c3421e2 = this.f8188a;
                    if (abstractC3419d.mo30780p()) {
                        c3421e2.m30798e((Location) abstractC3419d.mo30784l());
                    } else {
                        Exception mo30785k = abstractC3419d.mo30785k();
                        if (mo30785k != null) {
                            c3421e2.m30801b(mo30785k);
                        }
                    }
                    return c3421e2.m30802a();
                }
            });
            return c3421e.m30802a();
        }
        return m33497e;
    }

    @RecentlyNonNull
    /* renamed from: v */
    public AbstractC3419d<Location> m31620v() {
        return m33497e(AbstractC2541s.m33293a().m33287b(new InterfaceC2529o(this) { // from class: com.google.android.gms.location.z

            /* renamed from: a */
            private final C3084a f8203a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8203a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC2529o
            /* renamed from: a */
            public final void mo19090a(Object obj, Object obj2) {
                this.f8203a.m31616z((C2667n) obj, (C3421e) obj2);
            }
        }).m33284e(2414).m33288a());
    }

    @RecentlyNonNull
    /* renamed from: w */
    public AbstractC3419d<Void> m31619w(@RecentlyNonNull AbstractC11129a abstractC11129a) {
        return C2545t.m33279c(m33495g(C2513j.m33351b(abstractC11129a, AbstractC11129a.class.getSimpleName())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public final /* synthetic */ void m31618x(final AbstractC3098l abstractC3098l, final AbstractC11129a abstractC11129a, final InterfaceC3096j interfaceC3096j, zzba zzbaVar, C2508i c2508i, C2667n c2667n, C3421e c3421e) throws RemoteException {
        BinderC3095i binderC3095i = new BinderC3095i(c3421e, new InterfaceC3096j(this, abstractC3098l, abstractC11129a, interfaceC3096j) { // from class: com.google.android.gms.location.a0

            /* renamed from: a */
            private final C3084a f8177a;

            /* renamed from: b */
            private final AbstractC3098l f8178b;

            /* renamed from: c */
            private final AbstractC11129a f8179c;

            /* renamed from: d */
            private final InterfaceC3096j f8180d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8177a = this;
                this.f8178b = abstractC3098l;
                this.f8179c = abstractC11129a;
                this.f8180d = interfaceC3096j;
            }

            @Override // com.google.android.gms.location.InterfaceC3096j
            public final void zza() {
                C3084a c3084a = this.f8177a;
                AbstractC3098l abstractC3098l2 = this.f8178b;
                AbstractC11129a abstractC11129a2 = this.f8179c;
                InterfaceC3096j interfaceC3096j2 = this.f8180d;
                abstractC3098l2.m31612c(false);
                c3084a.m31619w(abstractC11129a2);
                if (interfaceC3096j2 != null) {
                    interfaceC3096j2.zza();
                }
            }
        });
        zzbaVar.m32934v(m33488n());
        c2667n.m32941n0(zzbaVar, c2508i, binderC3095i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public final /* synthetic */ void m31617y(AbstractC5014a abstractC5014a, zzba zzbaVar, C2667n c2667n, final C3421e c3421e) throws RemoteException {
        final C3092f c3092f = new C3092f(this, c3421e);
        if (abstractC5014a != null) {
            abstractC5014a.mo25884a(new InterfaceC5019f(this, c3092f) { // from class: com.google.android.gms.location.b0

                /* renamed from: a */
                private final C3084a f8182a;

                /* renamed from: b */
                private final AbstractC11129a f8183b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f8182a = this;
                    this.f8183b = c3092f;
                }

                @Override // p079e8.InterfaceC5019f
                /* renamed from: a */
                public final void mo25881a() {
                    this.f8182a.m31619w(this.f8183b);
                }
            });
        }
        m31622A(zzbaVar, c3092f, Looper.getMainLooper(), new InterfaceC3096j(c3421e) { // from class: com.google.android.gms.location.c0

            /* renamed from: a */
            private final C3421e f8187a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8187a = c3421e;
            }

            @Override // com.google.android.gms.location.InterfaceC3096j
            public final void zza() {
                this.f8187a.m30798e(null);
            }
        }, 2437).mo30787i(new InterfaceC3415b(c3421e) { // from class: com.google.android.gms.location.b

            /* renamed from: a */
            private final C3421e f8181a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f8181a = c3421e;
            }

            @Override // com.google.android.gms.tasks.InterfaceC3415b
            /* renamed from: a */
            public final Object mo4684a(AbstractC3419d abstractC3419d) {
                C3421e c3421e2 = this.f8181a;
                if (!abstractC3419d.mo30780p()) {
                    if (abstractC3419d.mo30785k() != null) {
                        Exception mo30785k = abstractC3419d.mo30785k();
                        if (mo30785k != null) {
                            c3421e2.m30801b(mo30785k);
                        }
                    } else {
                        c3421e2.m30798e(null);
                    }
                }
                return c3421e2.m30802a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public final /* synthetic */ void m31616z(C2667n c2667n, C3421e c3421e) throws RemoteException {
        c3421e.m30800c(c2667n.m32939p0(m33488n()));
    }
}
