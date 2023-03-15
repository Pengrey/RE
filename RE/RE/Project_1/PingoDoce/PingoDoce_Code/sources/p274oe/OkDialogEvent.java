package p274oe;

import android.text.Spanned;
import java.lang.ref.WeakReference;
import ne.DialogEvent;
import p181jd.Intrinsics;
import p221le.UiWidgets;

/* renamed from: oe.b */
/* loaded from: classes2.dex */
public final class OkDialogEvent extends DialogEvent {

    /* renamed from: d */
    private WeakReference f20848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkDialogEvent(String str, Spanned spanned, UiWidgets.InterfaceC7047d interfaceC7047d) {
        super(str, spanned);
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(spanned, "message");
        this.f20848d = new WeakReference(interfaceC7047d);
    }

    /* renamed from: e */
    public final WeakReference m17008e() {
        return this.f20848d;
    }

    /* renamed from: f */
    public OkDialogEvent mo17670b() {
        return this;
    }
}
