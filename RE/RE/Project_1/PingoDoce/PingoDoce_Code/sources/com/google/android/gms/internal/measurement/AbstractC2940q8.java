package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2940q8;
import com.google.android.gms.internal.measurement.C2892n8;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.q8 */
/* loaded from: classes.dex */
public abstract class AbstractC2940q8<MessageType extends AbstractC2940q8<MessageType, BuilderType>, BuilderType extends C2892n8<MessageType, BuilderType>> extends AbstractC2699b7<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected C2974sa zzc = C2974sa.m32106c();
    protected int zzd = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public static Object m32189l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static Object m32188m(InterfaceC2973s9 interfaceC2973s9, String str, Object[] objArr) {
        return new C2718ca(interfaceC2973s9, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static void m32187n(Class cls, AbstractC2940q8 abstractC2940q8) {
        zza.put(cls, abstractC2940q8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static AbstractC2940q8 m32184q(Class cls) {
        Map map = zza;
        AbstractC2940q8 abstractC2940q8 = (AbstractC2940q8) map.get(cls);
        if (abstractC2940q8 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2940q8 = (AbstractC2940q8) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC2940q8 == null) {
            abstractC2940q8 = (AbstractC2940q8) ((AbstractC2940q8) C2703bb.m32847j(cls)).mo31692z(6, null, null);
            if (abstractC2940q8 != null) {
                map.put(cls, abstractC2940q8);
            } else {
                throw new IllegalStateException();
            }
        }
        return abstractC2940q8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public static InterfaceC3003u8 m32183r() {
        return C2956r8.m32141g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public static InterfaceC3018v8 m32182s() {
        return C2781g9.m32619f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public static InterfaceC3018v8 m32181u(InterfaceC3018v8 interfaceC3018v8) {
        int size = interfaceC3018v8.size();
        return interfaceC3018v8.mo31956n(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public static InterfaceC3033w8 m32180w() {
        return C2702ba.m32864f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public static InterfaceC3033w8 m32179x(InterfaceC3033w8 interfaceC3033w8) {
        int size = interfaceC3033w8.size();
        return interfaceC3033w8.mo31906k(size == 0 ? 10 : size + size);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2973s9
    /* renamed from: a */
    public final /* synthetic */ InterfaceC2957r9 mo32113a() {
        return (C2892n8) mo31692z(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2973s9
    /* renamed from: b */
    public final /* synthetic */ InterfaceC2957r9 mo32112b() {
        C2892n8 c2892n8 = (C2892n8) mo31692z(5, null, null);
        c2892n8.m32428n(this);
        return c2892n8;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2989t9
    /* renamed from: c */
    public final /* synthetic */ InterfaceC2973s9 mo32062c() {
        return (AbstractC2940q8) mo31692z(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2973s9
    /* renamed from: e */
    public final void mo32110e(AbstractC3062y7 abstractC3062y7) throws IOException {
        C2686aa.m32915a().m32914b(getClass()).mo31898h(this, C3077z7.m31667l(abstractC3062y7));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C2686aa.m32915a().m32914b(getClass()).mo31899g(this, (AbstractC2940q8) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2973s9
    /* renamed from: f */
    public final int mo32109f() {
        int i = this.zzd;
        if (i == -1) {
            int mo31901e = C2686aa.m32915a().m32914b(getClass()).mo31901e(this);
            this.zzd = mo31901e;
            return mo31901e;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2699b7
    /* renamed from: g */
    public final int mo32191g() {
        return this.zzd;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int mo31897i = C2686aa.m32915a().m32914b(getClass()).mo31897i(this);
        this.zzb = mo31897i;
        return mo31897i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2699b7
    /* renamed from: j */
    public final void mo32190j(int i) {
        this.zzd = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public final C2892n8 m32186o() {
        return (C2892n8) mo31692z(5, null, null);
    }

    /* renamed from: p */
    public final C2892n8 m32185p() {
        C2892n8 c2892n8 = (C2892n8) mo31692z(5, null, null);
        c2892n8.m32428n(this);
        return c2892n8;
    }

    public final String toString() {
        return C3004u9.m32002a(this, super.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: z */
    public abstract Object mo31692z(int i, Object obj, Object obj2);
}
