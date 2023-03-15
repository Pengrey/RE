package p309q7;

import com.google.firebase.encoders.InterfaceC4247b;
import com.google.firebase.encoders.InterfaceC4249d;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.x */
/* loaded from: classes.dex */
public final class C9696x {

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC4247b<?>> f25549a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC4249d<?>> f25550b;

    /* renamed from: c */
    private final InterfaceC4247b<Object> f25551c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9696x(Map<Class<?>, InterfaceC4247b<?>> map, Map<Class<?>, InterfaceC4249d<?>> map2, InterfaceC4247b<Object> interfaceC4247b) {
        this.f25549a = map;
        this.f25550b = map2;
        this.f25551c = interfaceC4247b;
    }

    /* renamed from: a */
    public final void m10196a(Object obj, OutputStream outputStream) throws IOException {
        new C9693u(outputStream, this.f25549a, this.f25550b, this.f25551c).m10208j(obj);
    }
}
