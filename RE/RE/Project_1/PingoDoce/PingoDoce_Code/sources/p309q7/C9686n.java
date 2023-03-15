package p309q7;

import java.lang.annotation.Annotation;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: q7.n */
/* loaded from: classes.dex */
final class C9686n implements InterfaceC9691s {

    /* renamed from: a */
    private final int f25528a;

    /* renamed from: b */
    private final EnumC9690r f25529b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9686n(int i, EnumC9690r enumC9690r) {
        this.f25528a = i;
        this.f25529b = enumC9690r;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return InterfaceC9691s.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InterfaceC9691s) {
            InterfaceC9691s interfaceC9691s = (InterfaceC9691s) obj;
            return this.f25528a == interfaceC9691s.zza() && this.f25529b.equals(interfaceC9691s.zzb());
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f25528a ^ 14552422) + (this.f25529b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f25528a + "intEncoding=" + this.f25529b + ')';
    }

    @Override // p309q7.InterfaceC9691s
    public final int zza() {
        return this.f25528a;
    }

    @Override // p309q7.InterfaceC9691s
    public final EnumC9690r zzb() {
        return this.f25529b;
    }
}
