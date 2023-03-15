package com.github.guilhe.keyboardevents;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import kotlin.Metadata;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m20207d2 = {"Lcom/github/guilhe/keyboardevents/ViewGroupHolder;", "Landroidx/lifecycle/s;", "Landroid/view/ViewGroup;", "root", "<init>", "(Landroid/view/ViewGroup;)V", "keyboard-state-events_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* renamed from: com.github.guilhe.keyboardevents.ViewGroupHolder */
/* loaded from: classes.dex */
public final class KeyboardStateEvents implements InterfaceC1485s {

    /* renamed from: w */
    private final ViewTreeObserver$OnGlobalLayoutListenerC2352a f6849w;

    /* renamed from: x */
    private final ViewGroup f6850x;

    /* compiled from: KeyboardStateEvents.kt */
    /* renamed from: com.github.guilhe.keyboardevents.ViewGroupHolder$a */
    /* loaded from: classes.dex */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC2352a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: w */
        private boolean f6851w;

        ViewTreeObserver$OnGlobalLayoutListenerC2352a() {
            this.f6851w = C2354b.m33841e(KeyboardStateEvents.this.f6850x, 0.0f, 1, null);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            boolean m33841e = C2354b.m33841e(KeyboardStateEvents.this.f6850x, 0.0f, 1, null);
            if (m33841e != this.f6851w) {
                C2355c.f6855c.m33837b(m33841e ? EnumC2353a.OPEN : EnumC2353a.CLOSED);
                this.f6851w = !this.f6851w;
            }
        }
    }

    public KeyboardStateEvents(ViewGroup viewGroup) {
        Intrinsics.m20926i(viewGroup, "root");
        this.f6850x = viewGroup;
        this.f6849w = new ViewTreeObserver$OnGlobalLayoutListenerC2352a();
    }

    /* renamed from: h */
    private final void m33848h() {
        this.f6850x.getViewTreeObserver().addOnGlobalLayoutListener(this.f6849w);
    }

    /* renamed from: i */
    private final void m33847i() {
        this.f6850x.getViewTreeObserver().removeOnGlobalLayoutListener(this.f6849w);
    }

    @Override // androidx.lifecycle.InterfaceC1485s
    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        Intrinsics.m20926i(interfaceC1491v, "source");
        Intrinsics.m20926i(enumC1471b, "event");
        if (enumC1471b == AbstractC1469p.EnumC1471b.ON_PAUSE) {
            m33847i();
        } else if (enumC1471b == AbstractC1469p.EnumC1471b.ON_RESUME) {
            m33848h();
        }
    }
}
