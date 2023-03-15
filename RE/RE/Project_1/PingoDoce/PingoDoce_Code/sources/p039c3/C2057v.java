package p039c3;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: c3.v */
/* loaded from: classes.dex */
class C2057v implements InterfaceC2058w {

    /* renamed from: a */
    private final ViewGroupOverlay f5966a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2057v(ViewGroup viewGroup) {
        this.f5966a = viewGroup.getOverlay();
    }

    @Override // p039c3.InterfaceC2058w
    /* renamed from: a */
    public void mo34811a(View view) {
        this.f5966a.add(view);
    }

    @Override // p039c3.InterfaceC1994b0
    /* renamed from: b */
    public void mo34804b(Drawable drawable) {
        this.f5966a.add(drawable);
    }

    @Override // p039c3.InterfaceC2058w
    /* renamed from: c */
    public void mo34810c(View view) {
        this.f5966a.remove(view);
    }

    @Override // p039c3.InterfaceC1994b0
    /* renamed from: d */
    public void mo34803d(Drawable drawable) {
        this.f5966a.remove(drawable);
    }
}
