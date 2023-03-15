package androidx.compose.p018ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import id.InterfaceC6112p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p092f0.C5232o1;
import p092f0.InterfaceC5151a1;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: ComposeView.android.kt */
/* renamed from: androidx.compose.ui.platform.l0 */
/* loaded from: classes.dex */
public final class C0734l0 extends AbstractC0682a {

    /* renamed from: D */
    private final InterfaceC5220m0 f2278D;

    /* renamed from: E */
    private boolean f2279E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComposeView.android.kt */
    /* renamed from: androidx.compose.ui.platform.l0$a */
    /* loaded from: classes.dex */
    public static final class C0735a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: x */
        final /* synthetic */ int f2281x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0735a(int i) {
            super(2);
            this.f2281x = i;
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ Object mo39856d(Object obj, Object obj2) {
            m39712a((InterfaceC5179i) obj, ((Number) obj2).intValue());
            return C13195u.f34156a;
        }

        /* renamed from: a */
        public final void m39712a(InterfaceC5179i interfaceC5179i, int i) {
            C0734l0.this.m39713a(interfaceC5179i, this.f2281x | 1);
        }
    }

    public /* synthetic */ C0734l0(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    /* renamed from: a */
    public void m39713a(InterfaceC5179i interfaceC5179i, int i) {
        InterfaceC5179i mo25249u = interfaceC5179i.mo25249u(2083049676);
        InterfaceC6112p interfaceC6112p = (InterfaceC6112p) this.f2278D.getValue();
        if (interfaceC6112p != null) {
            interfaceC6112p.mo39856d(mo25249u, 0);
        }
        InterfaceC5151a1 mo25274K = mo25249u.mo25274K();
        if (mo25274K == null) {
            return;
        }
        mo25274K.mo25532a(new C0735a(i));
    }

    public CharSequence getAccessibilityClassName() {
        String name = C0734l0.class.getName();
        Intrinsics.checkIfNull(name, "javaClass.name");
        return name;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2279E;
    }

    public final void setContent(InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "content");
        this.f2279E = true;
        this.f2278D.setValue(interfaceC6112p);
        if (isAttachedToWindow()) {
            m39841d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0734l0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC5220m0 m24962d;
        Intrinsics.isThisObjectNull(context, "context");
        m24962d = C5232o1.m24962d(null, null, 2, null);
        this.f2278D = m24962d;
    }
}
