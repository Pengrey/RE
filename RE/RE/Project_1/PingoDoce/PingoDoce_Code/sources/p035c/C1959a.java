package p035c;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: c.a */
/* loaded from: classes.dex */
public final class C1959a {

    /* renamed from: a */
    private final Set<InterfaceC1960b> f5770a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f5771b;

    /* renamed from: a */
    public void m35029a(InterfaceC1960b interfaceC1960b) {
        if (this.f5771b != null) {
            interfaceC1960b.mo35026a(this.f5771b);
        }
        this.f5770a.add(interfaceC1960b);
    }

    /* renamed from: b */
    public void m35028b() {
        this.f5771b = null;
    }

    /* renamed from: c */
    public void m35027c(Context context) {
        this.f5771b = context;
        for (InterfaceC1960b interfaceC1960b : this.f5770a) {
            interfaceC1960b.mo35026a(context);
        }
    }
}
