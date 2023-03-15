package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.C2461a.InterfaceC2465d;
import com.google.android.gms.common.api.internal.InterfaceC2496e;
import com.google.android.gms.common.api.internal.InterfaceC2519l;
import com.google.android.gms.common.internal.AbstractC2576b;
import com.google.android.gms.common.internal.C2583c;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.common.internal.InterfaceC2590f;
import java.util.Set;
import p462y6.C13125g;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes.dex */
public final class C2461a<O extends InterfaceC2465d> {

    /* renamed from: a */
    private final AbstractC2462a<?, O> f7166a;

    /* renamed from: b */
    private final C2471g<?> f7167b;

    /* renamed from: c */
    private final String f7168c;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2462a<T extends InterfaceC2470f, O> extends AbstractC2469e<T, O> {
        @Deprecated
        /* renamed from: a */
        public T mo6033a(Context context, Looper looper, C2583c c2583c, O o, AbstractC2475c.InterfaceC2476a interfaceC2476a, AbstractC2475c.InterfaceC2477b interfaceC2477b) {
            return mo9918b(context, looper, c2583c, o, interfaceC2476a, interfaceC2477b);
        }

        /* renamed from: b */
        public T mo9918b(Context context, Looper looper, C2583c c2583c, O o, InterfaceC2496e interfaceC2496e, InterfaceC2519l interfaceC2519l) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2463b {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$c */
    /* loaded from: classes.dex */
    public static class C2464c<C extends InterfaceC2463b> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$d */
    /* loaded from: classes.dex */
    public interface InterfaceC2465d {

        /* renamed from: e */
        public static final C2468c f7169e = new C2468c(null);

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* loaded from: classes.dex */
        public interface InterfaceC2466a extends InterfaceC2465d {
            /* renamed from: b */
            Account m33502b();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* renamed from: com.google.android.gms.common.api.a$d$b */
        /* loaded from: classes.dex */
        public interface InterfaceC2467b extends InterfaceC2465d {
            /* renamed from: f */
            GoogleSignInAccount m33501f();
        }

        /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
        /* renamed from: com.google.android.gms.common.api.a$d$c */
        /* loaded from: classes.dex */
        public static final class C2468c implements InterfaceC2465d {
            private C2468c() {
            }

            /* synthetic */ C2468c(C13125g c13125g) {
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2469e<T extends InterfaceC2463b, O> {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$f */
    /* loaded from: classes.dex */
    public interface InterfaceC2470f extends InterfaceC2463b {
        /* renamed from: a */
        void mo33348a(AbstractC2576b.InterfaceC2581e interfaceC2581e);

        /* renamed from: b */
        boolean mo33347b();

        /* renamed from: c */
        Set<Scope> mo33117c();

        /* renamed from: d */
        void mo33346d(InterfaceC2590f interfaceC2590f, Set<Scope> set);

        /* renamed from: e */
        void mo33345e(String str);

        /* renamed from: f */
        boolean mo33344f();

        /* renamed from: h */
        int mo19093h();

        /* renamed from: i */
        boolean mo33343i();

        /* renamed from: j */
        Feature[] mo33342j();

        /* renamed from: k */
        String mo33341k();

        /* renamed from: l */
        String mo33340l();

        /* renamed from: m */
        void mo33339m(AbstractC2576b.InterfaceC2579c interfaceC2579c);

        /* renamed from: n */
        void mo32942n();

        /* renamed from: o */
        boolean mo20508o();
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.a$g */
    /* loaded from: classes.dex */
    public static final class C2471g<C extends InterfaceC2470f> extends C2464c<C> {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <C extends InterfaceC2470f> C2461a(String str, AbstractC2462a<C, O> abstractC2462a, C2471g<C> c2471g) {
        C2597i.m33075k(abstractC2462a, "Cannot construct an Api with a null ClientBuilder");
        C2597i.m33075k(c2471g, "Cannot construct an Api with a null ClientKey");
        this.f7168c = str;
        this.f7166a = abstractC2462a;
        this.f7167b = c2471g;
    }

    /* renamed from: a */
    public final AbstractC2462a<?, O> m33505a() {
        return this.f7166a;
    }

    /* renamed from: b */
    public final C2464c<?> m33504b() {
        return this.f7167b;
    }

    /* renamed from: c */
    public final String m33503c() {
        return this.f7168c;
    }
}
