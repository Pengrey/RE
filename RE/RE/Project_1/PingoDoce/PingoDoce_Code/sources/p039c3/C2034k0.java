package p039c3;

import android.os.IBinder;

/* renamed from: c3.k0 */
/* loaded from: classes.dex */
class C2034k0 implements InterfaceC2044m0 {

    /* renamed from: a */
    private final IBinder f5895a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2034k0(IBinder iBinder) {
        this.f5895a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2034k0) && ((C2034k0) obj).f5895a.equals(this.f5895a);
    }

    public int hashCode() {
        return this.f5895a.hashCode();
    }
}
