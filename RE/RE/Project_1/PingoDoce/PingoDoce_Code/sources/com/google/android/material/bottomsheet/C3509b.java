package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p091f.C5149c;

/* renamed from: com.google.android.material.bottomsheet.b */
/* loaded from: classes.dex */
public class C3509b extends C5149c {

    /* renamed from: M0 */
    private boolean f9610M0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BottomSheetDialogFragment.java */
    /* renamed from: com.google.android.material.bottomsheet.b$b */
    /* loaded from: classes.dex */
    public class C3511b extends BottomSheetBehavior.AbstractC3499f {
        private C3511b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3499f
        /* renamed from: b */
        public void mo30311b(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3499f
        /* renamed from: c */
        public void mo30310c(View view, int i) {
            if (i == 5) {
                C3509b.this.m30312z2();
            }
        }
    }

    /* renamed from: A2 */
    private void m30317A2(BottomSheetBehavior<?> bottomSheetBehavior, boolean z) {
        this.f9610M0 = z;
        if (bottomSheetBehavior.m30361k0() == 5) {
            m30312z2();
            return;
        }
        if (m37335m2() instanceof DialogC3502a) {
            ((DialogC3502a) m37335m2()).m30323m();
        }
        bottomSheetBehavior.m30376W(new C3511b());
        bottomSheetBehavior.m30402I0(5);
    }

    /* renamed from: B2 */
    private boolean m30316B2(boolean z) {
        Dialog m37335m2 = m37335m2();
        if (m37335m2 instanceof DialogC3502a) {
            DialogC3502a dialogC3502a = (DialogC3502a) m37335m2;
            BottomSheetBehavior<FrameLayout> m30325k = dialogC3502a.m30325k();
            if (m30325k.m30355o0() && dialogC3502a.m30324l()) {
                m30317A2(m30325k, z);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z2 */
    public void m30312z2() {
        if (this.f9610M0) {
            super.mo30314k2();
        } else {
            super.mo30315j2();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c
    /* renamed from: j2 */
    public void mo30315j2() {
        if (m30316B2(false)) {
            return;
        }
        super.mo30315j2();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c
    /* renamed from: k2 */
    public void mo30314k2() {
        if (m30316B2(true)) {
            return;
        }
        super.mo30314k2();
    }

    @Override // p091f.C5149c, androidx.fragment.app.DialogInterface$OnCancelListenerC1348c
    /* renamed from: o2 */
    public Dialog mo3127o2(Bundle bundle) {
        return new DialogC3502a(m37654G(), m37334n2());
    }
}
