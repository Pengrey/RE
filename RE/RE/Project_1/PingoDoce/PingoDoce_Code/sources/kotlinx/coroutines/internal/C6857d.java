package kotlinx.coroutines.internal;

import id.InterfaceC6108l;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* renamed from: kotlinx.coroutines.internal.d */
/* loaded from: classes2.dex */
final class C6857d extends AbstractC6868i {

    /* renamed from: a */
    public static final C6857d f18303a = new C6857d();

    /* renamed from: b */
    private static final C6858a f18304b = new C6858a();

    /* compiled from: ExceptionsConstructor.kt */
    /* renamed from: kotlinx.coroutines.internal.d$a */
    /* loaded from: classes2.dex */
    public static final class C6858a extends ClassValue<InterfaceC6108l<? super Throwable, ? extends Throwable>> {
        C6858a() {
        }
    }

    private C6857d() {
    }

    @Override // kotlinx.coroutines.internal.AbstractC6868i
    /* renamed from: a */
    public InterfaceC6108l<Throwable, Throwable> mo19889a(Class<? extends Throwable> cls) {
        return (InterfaceC6108l) f18304b.get(cls);
    }
}
