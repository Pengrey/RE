package p092f0;

import id.InterfaceC6097a;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: f0.p */
/* loaded from: classes.dex */
public abstract class AbstractC5233p<T> {

    /* renamed from: a */
    private final ValueHolders<T> f14487a;

    private AbstractC5233p(InterfaceC6097a<? extends T> interfaceC6097a) {
        this.f14487a = new ValueHolders<>(interfaceC6097a);
    }

    public /* synthetic */ AbstractC5233p(InterfaceC6097a interfaceC6097a, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6097a);
    }

    /* renamed from: a */
    public final ValueHolders<T> m24960a() {
        return this.f14487a;
    }

    /* renamed from: b */
    public abstract InterfaceC5242r1<T> mo24959b(T t, InterfaceC5179i interfaceC5179i, int i);
}
