package p029b7;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC2472b;
import com.google.android.gms.common.api.C2461a;
import com.google.android.gms.common.api.internal.AbstractC2541s;
import com.google.android.gms.common.api.internal.InterfaceC2529o;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.AbstractC3419d;
import com.google.android.gms.tasks.C3421e;
import p251n7.C7685d;
import p484z6.C13711i;
import p484z6.InterfaceC13710h;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: b7.d */
/* loaded from: classes.dex */
public final class C1835d extends AbstractC2472b<C13711i> implements InterfaceC13710h {

    /* renamed from: k */
    private static final C2461a.C2471g<C1836e> f5538k;

    /* renamed from: l */
    private static final C2461a.AbstractC2462a<C1836e, C13711i> f5539l;

    /* renamed from: m */
    private static final C2461a<C13711i> f5540m;

    /* renamed from: n */
    public static final /* synthetic */ int f5541n = 0;

    static {
        C2461a.C2471g<C1836e> c2471g = new C2461a.C2471g<>();
        f5538k = c2471g;
        C1834c c1834c = new C1834c();
        f5539l = c1834c;
        f5540m = new C2461a<>("ClientTelemetry.API", c1834c, c2471g);
    }

    public C1835d(Context context, C13711i c13711i) {
        super(context, f5540m, c13711i, AbstractC2472b.C2473a.f7180c);
    }

    @Override // p484z6.InterfaceC13710h
    /* renamed from: a */
    public final AbstractC3419d<Void> mo560a(final TelemetryData telemetryData) {
        AbstractC2541s.C2542a m33293a = AbstractC2541s.m33293a();
        m33293a.m33285d(C7685d.f20272a);
        m33293a.m33286c(false);
        m33293a.m33287b(new InterfaceC2529o() { // from class: b7.b
            @Override // com.google.android.gms.common.api.internal.InterfaceC2529o
            /* renamed from: a */
            public final void mo19090a(Object obj, Object obj2) {
                TelemetryData telemetryData2 = TelemetryData.this;
                int i = C1835d.f5541n;
                ((C1832a) ((C1836e) obj).m33182D()).m35283S1(telemetryData2);
                ((C3421e) obj2).m30800c(null);
            }
        });
        return m33498d(m33293a.m33288a());
    }
}
