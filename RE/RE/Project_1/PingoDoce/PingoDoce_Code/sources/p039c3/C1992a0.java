package p039c3;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: c3.a0 */
/* loaded from: classes.dex */
class C1992a0 implements InterfaceC1994b0 {

    /* renamed from: a */
    private final ViewOverlay f5813a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1992a0(View view) {
        this.f5813a = view.getOverlay();
    }

    @Override // p039c3.InterfaceC1994b0
    /* renamed from: b */
    public void mo34804b(Drawable drawable) {
        this.f5813a.add(drawable);
    }

    @Override // p039c3.InterfaceC1994b0
    /* renamed from: d */
    public void mo34803d(Drawable drawable) {
        this.f5813a.remove(drawable);
    }
}
