package p274oe;

import android.text.Spanned;
import java.lang.ref.WeakReference;
import ne.DialogEvent;
import p181jd.Intrinsics;
import p221le.UiWidgets;

/* renamed from: oe.a */
/* loaded from: classes2.dex */
public final class BooleanDialogEvent extends DialogEvent {

    /* renamed from: d */
    private final String f20845d;

    /* renamed from: e */
    private final String f20846e;

    /* renamed from: f */
    private WeakReference f20847f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BooleanDialogEvent(String str, Spanned spanned, String str2, String str3, UiWidgets.InterfaceC7044a interfaceC7044a) {
        super(str, spanned);
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(spanned, "message");
        Intrinsics.isThisObjectNull(interfaceC7044a, "callback");
        this.f20845d = str2;
        this.f20846e = str3;
        this.f20847f = new WeakReference(interfaceC7044a);
    }

    /* renamed from: e */
    public final WeakReference m17013e() {
        return this.f20847f;
    }

    /* renamed from: f */
    public final String m17012f() {
        return this.f20846e;
    }

    /* renamed from: g */
    public final String m17011g() {
        return this.f20845d;
    }

    /* renamed from: h */
    public BooleanDialogEvent mo17670b() {
        return this;
    }
}
