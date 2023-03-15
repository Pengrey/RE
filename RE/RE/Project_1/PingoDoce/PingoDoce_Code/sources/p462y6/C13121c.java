package p462y6;

import com.google.android.gms.common.api.AbstractC2475c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C2538r;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: y6.c */
/* loaded from: classes.dex */
public final class C13121c {
    /* renamed from: a */
    public static <R extends InterfaceC13123e> AbstractC13119b<R> m1570a(R r, AbstractC2475c abstractC2475c) {
        C2597i.m33075k(r, "Result must not be null");
        C2597i.m33084b(!r.getStatus().m33511D(), "Status code must not be SUCCESS");
        C13127i c13127i = new C13127i(abstractC2475c, r);
        c13127i.m33473f(r);
        return c13127i;
    }

    /* renamed from: b */
    public static AbstractC13119b<Status> m1569b(Status status, AbstractC2475c abstractC2475c) {
        C2597i.m33075k(status, "Result must not be null");
        C2538r c2538r = new C2538r(abstractC2475c);
        c2538r.m33473f(status);
        return c2538r;
    }
}
