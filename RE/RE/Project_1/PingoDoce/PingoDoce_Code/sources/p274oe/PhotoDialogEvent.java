package p274oe;

import com.github.aachartmodel.aainfographics.BuildConfig;
import java.lang.ref.WeakReference;
import ne.DialogEvent;
import p181jd.Intrinsics;
import p221le.UiWidgets;

/* renamed from: oe.c */
/* loaded from: classes2.dex */
public final class PhotoDialogEvent extends DialogEvent {

    /* renamed from: d */
    private WeakReference f20849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoDialogEvent(UiWidgets.InterfaceC7048e interfaceC7048e) {
        super(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME);
        Intrinsics.isThisObjectNull(interfaceC7048e, "callback");
        this.f20849d = new WeakReference(interfaceC7048e);
    }

    /* renamed from: e */
    public final WeakReference m17005e() {
        return this.f20849d;
    }

    /* renamed from: f */
    public PhotoDialogEvent mo17670b() {
        return this;
    }
}
