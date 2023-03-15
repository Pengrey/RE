package p478z0;

import id.InterfaceC6097a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p433x0.DrawScope;
import p468yc.C13195u;

/* renamed from: z0.i */
/* loaded from: classes.dex */
public abstract class AbstractC13528i {

    /* renamed from: a */
    private InterfaceC6097a<C13195u> f34449a;

    private AbstractC13528i() {
    }

    public /* synthetic */ AbstractC13528i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract void mo1077a(DrawScope drawScope);

    /* renamed from: b */
    public InterfaceC6097a<C13195u> mo1076b() {
        return this.f34449a;
    }

    /* renamed from: c */
    public final void m1075c() {
        InterfaceC6097a<C13195u> mo1076b = mo1076b();
        if (mo1076b == null) {
            return;
        }
        mo1076b.mo42214q();
    }

    /* renamed from: d */
    public void mo1074d(InterfaceC6097a<C13195u> interfaceC6097a) {
        this.f34449a = interfaceC6097a;
    }
}
