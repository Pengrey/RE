package p484z6;

import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import p462y6.AbstractC13119b;
import p462y6.InterfaceC13123e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: z6.d */
/* loaded from: classes.dex */
public class C13704d {

    /* renamed from: a */
    private static final InterfaceC13726w f34819a = new C13723t();

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: z6.d$a */
    /* loaded from: classes.dex */
    public interface InterfaceC13705a<R extends InterfaceC13123e, T> {
        /* renamed from: a */
        T mo549a(R r);
    }

    /* renamed from: a */
    public static <R extends InterfaceC13123e, T> AbstractC3419d<T> m571a(AbstractC13119b<R> abstractC13119b, InterfaceC13705a<R, T> interfaceC13705a) {
        InterfaceC13726w interfaceC13726w = f34819a;
        C3421e c3421e = new C3421e();
        abstractC13119b.mo1572a(new C13724u(abstractC13119b, c3421e, interfaceC13705a, interfaceC13726w));
        return c3421e.m30802a();
    }

    /* renamed from: b */
    public static <R extends InterfaceC13123e> AbstractC3419d<Void> m570b(AbstractC13119b<R> abstractC13119b) {
        return m571a(abstractC13119b, new C13725v());
    }
}
