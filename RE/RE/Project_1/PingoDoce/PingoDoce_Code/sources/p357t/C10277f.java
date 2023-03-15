package p357t;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p018ui.platform.C0824y;
import id.InterfaceC6097a;
import p052d1.C4701c;
import p052d1.C4703d;
import p052d1.C4706g;
import p092f0.InterfaceC5179i;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;

/* compiled from: Clickable.android.kt */
/* renamed from: t.f */
/* loaded from: classes.dex */
public final class C10277f {

    /* renamed from: a */
    private static final long f26791a = ViewConfiguration.getTapTimeout();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Clickable.android.kt */
    /* renamed from: t.f$a */
    /* loaded from: classes.dex */
    public static final class C10278a extends AbstractC6438m implements InterfaceC6097a {

        /* renamed from: w */
        final /* synthetic */ View f26792w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10278a(View view) {
            super(0);
            this.f26792w = view;
        }

        /* renamed from: a */
        public final Boolean mo42214q() {
            return Boolean.valueOf(C10277f.m8351a(this.f26792w));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ boolean m8351a(View view) {
        return m8347e(view);
    }

    /* renamed from: b */
    public static final long m8350b() {
        return f26791a;
    }

    /* renamed from: c */
    public static final boolean m8349c(KeyEvent keyEvent) {
        Intrinsics.isThisObjectNull(keyEvent, "$this$isClick");
        if (C4701c.m26907e(C4703d.m26902b(keyEvent), C4701c.f12826a.m26905b())) {
            int m26892b = C4706g.m26892b(C4703d.m26903a(keyEvent));
            if (m26892b == 23 || m26892b == 66 || m26892b == 160) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final InterfaceC6097a m8348d(InterfaceC5179i interfaceC5179i, int i) {
        interfaceC5179i.mo25263g(-184546112);
        C10278a c10278a = new C10278a((View) interfaceC5179i.mo25256n(C0824y.m39469i()));
        interfaceC5179i.mo25282C();
        return c10278a;
    }

    /* renamed from: e */
    private static final boolean m8347e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
