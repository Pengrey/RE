package p221le;

import androidx.appcompat.app.ActivityC0325c;
import java.text.SimpleDateFormat;
import p423wc.InterfaceC11614c;
import p445xc.InterfaceC12341a;

/* renamed from: le.i */
/* loaded from: classes2.dex */
public final class C7049i implements InterfaceC11614c<UiWidgets> {

    /* renamed from: a */
    private final InterfaceC12341a<ActivityC0325c> f18705a;

    /* renamed from: b */
    private final InterfaceC12341a<Integer> f18706b;

    /* renamed from: c */
    private final InterfaceC12341a<Integer> f18707c;

    /* renamed from: d */
    private final InterfaceC12341a<SimpleDateFormat> f18708d;

    public C7049i(InterfaceC12341a<ActivityC0325c> interfaceC12341a, InterfaceC12341a<Integer> interfaceC12341a2, InterfaceC12341a<Integer> interfaceC12341a3, InterfaceC12341a<SimpleDateFormat> interfaceC12341a4) {
        this.f18705a = interfaceC12341a;
        this.f18706b = interfaceC12341a2;
        this.f18707c = interfaceC12341a3;
        this.f18708d = interfaceC12341a4;
    }

    /* renamed from: a */
    public static C7049i m19480a(InterfaceC12341a<ActivityC0325c> interfaceC12341a, InterfaceC12341a<Integer> interfaceC12341a2, InterfaceC12341a<Integer> interfaceC12341a3, InterfaceC12341a<SimpleDateFormat> interfaceC12341a4) {
        return new C7049i(interfaceC12341a, interfaceC12341a2, interfaceC12341a3, interfaceC12341a4);
    }

    /* renamed from: c */
    public static UiWidgets m19478c(ActivityC0325c activityC0325c, int i, int i2, SimpleDateFormat simpleDateFormat) {
        return new UiWidgets(activityC0325c, i, i2, simpleDateFormat);
    }

    @Override // p445xc.InterfaceC12341a
    /* renamed from: b */
    public UiWidgets mo42226get() {
        return m19478c(this.f18705a.mo42226get(), this.f18706b.mo42226get().intValue(), this.f18707c.mo42226get().intValue(), this.f18708d.mo42226get());
    }
}
