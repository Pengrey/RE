package p374u1;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import id.InterfaceC6097a;
import java.util.Objects;
import kotlin.EnumC6754a;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.InterfaceC13178g;
import p468yc.LazyJVM;

/* renamed from: u1.j */
/* loaded from: classes.dex */
public final class InputMethodManager implements InterfaceC10793i {

    /* renamed from: a */
    private final InterfaceC13178g f27912a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InputMethodManager.kt */
    /* renamed from: u1.j$a */
    /* loaded from: classes.dex */
    public static final class C10794a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ Context f27913w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10794a(Context context) {
            super(0);
            this.f27913w = context;
        }

        /* renamed from: a */
        public final android.view.inputmethod.InputMethodManager mo42214q() {
            Object systemService = this.f27913w.getSystemService("input_method");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            return (android.view.inputmethod.InputMethodManager) systemService;
        }
    }

    public InputMethodManager(Context context) {
        InterfaceC13178g m1463b;
        Intrinsics.isThisObjectNull(context, "context");
        m1463b = LazyJVM.m1463b(EnumC6754a.NONE, new C10794a(context));
        this.f27912a = m1463b;
    }

    /* renamed from: c */
    private final android.view.inputmethod.InputMethodManager m7044c() {
        return (android.view.inputmethod.InputMethodManager) this.f27912a.getValue();
    }

    /* renamed from: a */
    public void mo7048a(IBinder iBinder) {
        m7044c().hideSoftInputFromWindow(iBinder, 0);
    }

    /* renamed from: b */
    public void mo7047b(View view) {
        Intrinsics.isThisObjectNull(view, "view");
        m7044c().showSoftInput(view, 0);
    }
}
