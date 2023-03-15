package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.C1112b0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C3544e;
import p100f8.C5423f;
import p100f8.C5425h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.j */
/* loaded from: classes.dex */
public class C3567j extends RecyclerView.AbstractC1535g<C3569b> {

    /* renamed from: c */
    private final CalendarConstraints f9920c;

    /* renamed from: d */
    private final DateSelector<?> f9921d;

    /* renamed from: e */
    private final C3544e.InterfaceC3556l f9922e;

    /* renamed from: f */
    private final int f9923f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonthsPagerAdapter.java */
    /* renamed from: com.google.android.material.datepicker.j$a */
    /* loaded from: classes.dex */
    public class C3568a implements AdapterView.OnItemClickListener {

        /* renamed from: w */
        final /* synthetic */ MaterialCalendarGridView f9924w;

        C3568a(MaterialCalendarGridView materialCalendarGridView) {
            this.f9924w = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f9924w.getAdapter2().m29869n(i)) {
                C3567j.this.f9922e.mo29912a(this.f9924w.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    /* renamed from: com.google.android.material.datepicker.j$b */
    /* loaded from: classes.dex */
    public static class C3569b extends RecyclerView.AbstractC1531c0 {

        /* renamed from: t */
        final TextView f9926t;

        /* renamed from: u */
        final MaterialCalendarGridView f9927u;

        C3569b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C5423f.month_title);
            this.f9926t = textView;
            C1112b0.m38403t0(textView, true);
            this.f9927u = (MaterialCalendarGridView) linearLayout.findViewById(C5423f.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3567j(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, C3544e.InterfaceC3556l interfaceC3556l) {
        Month m29984k = calendarConstraints.m29984k();
        Month m29987h = calendarConstraints.m29987h();
        Month m29985j = calendarConstraints.m29985j();
        if (m29984k.compareTo(m29985j) <= 0) {
            if (m29985j.compareTo(m29987h) <= 0) {
                this.f9923f = (C3566i.f9914B * C3544e.m29921v2(context)) + (C3557f.m29897O2(context) ? C3544e.m29921v2(context) : 0);
                this.f9920c = calendarConstraints;
                this.f9921d = dateSelector;
                this.f9922e = interfaceC3556l;
                m36549B(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public Month m29867E(int i) {
        return this.f9920c.m29984k().m29952m(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public CharSequence m29866F(int i) {
        return m29867E(i).m29954j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public int m29865G(Month month) {
        return this.f9920c.m29984k().m29951n(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: H */
    public void mo35523M(C3569b c3569b, int i) {
        Month m29952m = this.f9920c.m29984k().m29952m(i);
        c3569b.f9926t.setText(m29952m.m29954j());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c3569b.f9927u.findViewById(C5423f.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && m29952m.equals(materialCalendarGridView.getAdapter2().f9916w)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m29870m(materialCalendarGridView);
        } else {
            C3566i c3566i = new C3566i(m29952m, this.f9921d, this.f9920c);
            materialCalendarGridView.setNumColumns(m29952m.f9828z);
            materialCalendarGridView.setAdapter((ListAdapter) c3566i);
        }
        materialCalendarGridView.setOnItemClickListener(new C3568a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: I */
    public C3569b mo42215u(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C5425h.mtrl_calendar_month_labeled, viewGroup, false);
        if (C3557f.m29897O2(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.C1551p(-1, this.f9923f));
            return new C3569b(linearLayout, true);
        }
        return new C3569b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: f */
    public int mo29834f() {
        return this.f9920c.m29986i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1535g
    /* renamed from: g */
    public long mo29862g(int i) {
        return this.f9920c.m29984k().m29952m(i).m29953k();
    }
}
