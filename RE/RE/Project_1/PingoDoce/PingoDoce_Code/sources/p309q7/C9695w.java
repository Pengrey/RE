package p309q7;

import ba.InterfaceC1871b;
import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4249d;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.w */
/* loaded from: classes.dex */
public final class C9695w implements InterfaceC1871b<C9695w> {

    /* renamed from: d */
    private static final InterfaceC4247b<Object> f25544d = C9694v.f25543a;

    /* renamed from: e */
    public static final /* synthetic */ int f25545e = 0;

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC4247b<?>> f25546a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC4249d<?>> f25547b = new HashMap();

    /* renamed from: c */
    private final InterfaceC4247b<Object> f25548c = f25544d;

    @Override // ba.InterfaceC1871b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C9695w mo10198a(Class cls, InterfaceC4247b interfaceC4247b) {
        this.f25546a.put(cls, interfaceC4247b);
        this.f25547b.remove(cls);
        return this;
    }

    /* renamed from: b */
    public final C9696x m10197b() {
        return new C9696x(new HashMap(this.f25546a), new HashMap(this.f25547b), this.f25548c);
    }
}
