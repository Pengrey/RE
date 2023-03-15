package p169j1;

import androidx.compose.p018ui.platform.InterfaceC0724i;
import androidx.compose.p018ui.platform.InterfaceC0726j0;
import androidx.compose.p018ui.platform.InterfaceC0727j1;
import androidx.compose.p018ui.platform.InterfaceC0814v1;
import androidx.compose.p018ui.platform.ViewConfiguration;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import p023b1.InterfaceC1792a;
import p037c1.InterfaceC1987b;
import p093f1.InterfaceC5315r;
import p324r0.AutofillTree;
import p324r0.InterfaceC9784d;
import p358t0.InterfaceC10331g;
import p359t1.InterfaceC10362d;
import p374u1.TextInputService;
import p393v0.InterfaceC11064u;
import p468yc.C13195u;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: j1.f0 */
/* loaded from: classes.dex */
public interface InterfaceC6253f0 {

    /* renamed from: p */
    public static final C6254a f17138p = C6254a.f17139a;

    /* compiled from: Owner.kt */
    /* renamed from: j1.f0$a */
    /* loaded from: classes.dex */
    public static final class C6254a {

        /* renamed from: a */
        static final /* synthetic */ C6254a f17139a = new C6254a();

        /* renamed from: b */
        private static boolean f17140b;

        private C6254a() {
        }

        /* renamed from: a */
        public final boolean m21642a() {
            return f17140b;
        }
    }

    /* compiled from: Owner.kt */
    /* renamed from: j1.f0$b */
    /* loaded from: classes.dex */
    public static final class C6255b {
        /* renamed from: a */
        public static /* synthetic */ void m21641a(InterfaceC6253f0 interfaceC6253f0, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            interfaceC6253f0.mo21652h(z);
        }
    }

    InterfaceC0724i getAccessibilityManager();

    InterfaceC9784d getAutofill();

    AutofillTree getAutofillTree();

    InterfaceC0726j0 getClipboardManager();

    Density getDensity();

    InterfaceC10331g getFocusManager();

    InterfaceC10362d.InterfaceC10363a getFontLoader();

    InterfaceC1792a getHapticFeedBack();

    InterfaceC1987b getInputModeManager();

    EnumC13618o getLayoutDirection();

    InterfaceC5315r getPointerIconService();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    TextInputService getTextInputService();

    InterfaceC0727j1 getTextToolbar();

    ViewConfiguration getViewConfiguration();

    InterfaceC0814v1 getWindowInfo();

    /* renamed from: h */
    void mo21652h(boolean z);

    /* renamed from: i */
    InterfaceC6250e0 mo21651i(InterfaceC6108l<? super InterfaceC11064u, C13195u> interfaceC6108l, InterfaceC6097a<C13195u> interfaceC6097a);

    /* renamed from: j */
    long mo21650j(long j);

    /* renamed from: k */
    void mo21649k();

    /* renamed from: l */
    void mo21648l(LayoutNode layoutNode);

    /* renamed from: o */
    void mo21647o(LayoutNode layoutNode);

    /* renamed from: p */
    void mo21646p(LayoutNode layoutNode);

    /* renamed from: q */
    void mo21645q(LayoutNode layoutNode);

    /* renamed from: r */
    void mo21644r(LayoutNode layoutNode);

    boolean requestFocus();

    /* renamed from: s */
    void mo21643s(LayoutNode layoutNode);

    void setShowLayoutBounds(boolean z);
}
