package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public final class C3564h<S> extends AbstractC3571l<S> {

    /* renamed from: x0 */
    private int f9910x0;

    /* renamed from: y0 */
    private DateSelector<S> f9911y0;

    /* renamed from: z0 */
    private CalendarConstraints f9912z0;

    /* compiled from: MaterialTextInputPicker.java */
    /* renamed from: com.google.android.material.datepicker.h$a */
    /* loaded from: classes.dex */
    class C3565a extends AbstractC3570k<S> {
        C3565a() {
        }

        @Override // com.google.android.material.datepicker.AbstractC3570k
        /* renamed from: a */
        public void mo29861a(S s) {
            Iterator<AbstractC3570k<S>> it = C3564h.this.f9928w0.iterator();
            while (it.hasNext()) {
                it.next().mo29861a(s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i2 */
    public static <T> C3564h<T> m29883i2(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        C3564h<T> c3564h = new C3564h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        c3564h.m37630P1(bundle);
        return c3564h;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public void mo29886D0(Bundle bundle) {
        super.mo29886D0(bundle);
        if (bundle == null) {
            bundle = m37660E();
        }
        this.f9910x0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f9911y0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f9912z0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public View mo29885H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f9911y0.m29977C(layoutInflater.cloneInContext(new ContextThemeWrapper(m37654G(), this.f9910x0)), viewGroup, bundle, this.f9912z0, new C3565a());
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Z0 */
    public void mo29884Z0(Bundle bundle) {
        super.mo29884Z0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f9910x0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f9911y0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9912z0);
    }
}
