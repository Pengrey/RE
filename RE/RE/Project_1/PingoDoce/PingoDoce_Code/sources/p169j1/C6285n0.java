package p169j1;

import androidx.compose.p018ui.platform.AndroidComposeView;
import p092f0.AbstractC5150a;
import p181jd.Intrinsics;

/* compiled from: UiApplier.android.kt */
/* renamed from: j1.n0 */
/* loaded from: classes.dex */
public final class C6285n0 extends AbstractC5150a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6285n0(LayoutNode layoutNode) {
        super(layoutNode);
        Intrinsics.isThisObjectNull(layoutNode, "root");
    }

    /* renamed from: f */
    public void mo25546f() {
        super.mo25546f();
        InterfaceC6253f0 m21549Z = ((LayoutNode) m25544j()).m21549Z();
        AndroidComposeView androidComposeView = m21549Z instanceof AndroidComposeView ? (AndroidComposeView) m21549Z : null;
        if (androidComposeView == null) {
            return;
        }
        androidComposeView.m39915K();
    }

    /* renamed from: g */
    public void m21429g(int i, int i2, int i3) {
        ((LayoutNode) mo25549a()).m21505v0(i, i2, i3);
    }

    /* renamed from: h */
    public void m21428h(int i, int i2) {
        ((LayoutNode) mo25549a()).m21580G0(i, i2);
    }

    /* renamed from: k */
    protected void mo25543k() {
        ((LayoutNode) m25544j()).m21582F0();
    }

    /* renamed from: m */
    public void m21432b(int i, LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "instance");
        ((LayoutNode) mo25549a()).m21523m0(i, layoutNode);
    }

    /* renamed from: n */
    public void m21431e(int i, LayoutNode layoutNode) {
        Intrinsics.isThisObjectNull(layoutNode, "instance");
    }
}
