package p368ta;

import com.google.gson.AbstractC4385s;
import com.google.gson.C4364f;
import com.google.gson.InterfaceC4375k;
import com.google.gson.InterfaceC4381q;
import com.google.gson.InterfaceC4391t;
import p334ra.InterfaceC9831b;
import p421wa.C11605a;
import sa.C10104c;

/* renamed from: ta.d */
/* loaded from: classes2.dex */
public final class C10409d implements InterfaceC4391t {

    /* renamed from: w */
    private final C10104c f27052w;

    public C10409d(C10104c c10104c) {
        this.f27052w = c10104c;
    }

    @Override // com.google.gson.InterfaceC4391t
    /* renamed from: a */
    public <T> AbstractC4385s<T> mo7935a(C4364f c4364f, C11605a<T> c11605a) {
        InterfaceC9831b interfaceC9831b = (InterfaceC9831b) c11605a.m4629c().getAnnotation(InterfaceC9831b.class);
        if (interfaceC9831b == null) {
            return null;
        }
        return (AbstractC4385s<T>) m8057b(this.f27052w, c4364f, c11605a, interfaceC9831b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public AbstractC4385s<?> m8057b(C10104c c10104c, C4364f c4364f, C11605a<?> c11605a, InterfaceC9831b interfaceC9831b) {
        AbstractC4385s<?> c10427l;
        Object mo9083a = c10104c.m9121a(C11605a.m4631a(interfaceC9831b.value())).mo9083a();
        if (mo9083a instanceof AbstractC4385s) {
            c10427l = (AbstractC4385s) mo9083a;
        } else if (mo9083a instanceof InterfaceC4391t) {
            c10427l = ((InterfaceC4391t) mo9083a).mo7935a(c4364f, c11605a);
        } else {
            boolean z = mo9083a instanceof InterfaceC4381q;
            if (!z && !(mo9083a instanceof InterfaceC4375k)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo9083a.getClass().getName() + " as a @JsonAdapter for " + c11605a.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            c10427l = new C10427l<>(z ? (InterfaceC4381q) mo9083a : null, mo9083a instanceof InterfaceC4375k ? (InterfaceC4375k) mo9083a : null, c4364f, c11605a, null);
        }
        return (c10427l == null || !interfaceC9831b.nullSafe()) ? c10427l : c10427l.m27742a();
    }
}
