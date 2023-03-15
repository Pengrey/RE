package p039c3;

import android.view.View;
import android.view.WindowId;

/* renamed from: c3.l0 */
/* loaded from: classes.dex */
class C2036l0 implements InterfaceC2044m0 {

    /* renamed from: a */
    private final WindowId f5898a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2036l0(View view) {
        this.f5898a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2036l0) && ((C2036l0) obj).f5898a.equals(this.f5898a);
    }

    public int hashCode() {
        return this.f5898a.hashCode();
    }
}
