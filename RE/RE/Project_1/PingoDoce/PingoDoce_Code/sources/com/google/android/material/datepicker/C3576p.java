package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C3544e;
import java.util.Calendar;
import java.util.Locale;
import p100f8.C5425h;
import p100f8.C5427j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: classes.dex */
public class C3576p extends RecyclerView.AbstractC1535g<C3578b> {

    /* renamed from: c */
    private final C3544e<?> f9933c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: YearGridAdapter.java */
    /* renamed from: com.google.android.material.datepicker.p$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3577a implements View.OnClickListener {

        /* renamed from: w */
        final /* synthetic */ int f9934w;

        View$OnClickListenerC3577a(int i) {
            this.f9934w = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3576p.this.f9933c.m29937A2(C3576p.this.f9933c.m29925r2().m29989e(Month.m29960c(this.f9934w, C3576p.this.f9933c.m29923t2().f9826x)));
            C3576p.this.f9933c.m29936B2(C3544e.EnumC3555k.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    /* renamed from: com.google.android.material.datepicker.p$b */
    /* loaded from: classes.dex */
    public static class C3578b extends RecyclerView.AbstractC1531c0 {

        /* renamed from: t */
        final TextView f9936t;

        C3578b(TextView textView) {
            super(textView);
            this.f9936t = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3576p(C3544e<?> c3544e) {
        this.f9933c = c3544e;
    }

    /* renamed from: E */
    private View.OnClickListener m29839E(int i) {
        return new View$OnClickListenerC3577a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public int m29838F(int i) {
        return i - this.f9933c.m29925r2().m29984k().f9827y;
    }

    /* renamed from: G */
    int m29837G(int i) {
        return this.f9933c.m29925r2().m29984k().f9827y + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: H */
    public void mo35523M(C3578b c3578b, int i) {
        int m29837G = m29837G(i);
        String string = c3578b.f9936t.getContext().getString(C5427j.mtrl_picker_navigate_to_year_description);
        c3578b.f9936t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(m29837G)));
        c3578b.f9936t.setContentDescription(String.format(string, Integer.valueOf(m29837G)));
        C3541b m29924s2 = this.f9933c.m29924s2();
        Calendar m29845i = C3575o.m29845i();
        C3540a c3540a = m29845i.get(1) == m29837G ? m29924s2.f9840f : m29924s2.f9838d;
        for (Long l : this.f9933c.m29922u2().m29972u()) {
            m29845i.setTimeInMillis(l.longValue());
            if (m29845i.get(1) == m29837G) {
                c3540a = m29924s2.f9839e;
            }
        }
        c3540a.m29945d(c3578b.f9936t);
        c3578b.f9936t.setOnClickListener(m29839E(m29837G));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: I */
    public C3578b mo42215u(ViewGroup viewGroup, int i) {
        return new C3578b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5425h.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: f */
    public int mo29834f() {
        return this.f9933c.m29925r2().m29983m();
    }
}
