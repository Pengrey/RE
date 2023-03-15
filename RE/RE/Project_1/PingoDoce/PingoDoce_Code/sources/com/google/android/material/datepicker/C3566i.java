package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: classes.dex */
public class C3566i extends BaseAdapter {

    /* renamed from: B */
    static final int f9914B = C3575o.m29843k().getMaximum(4);

    /* renamed from: A */
    final CalendarConstraints f9915A;

    /* renamed from: w */
    final Month f9916w;

    /* renamed from: x */
    final DateSelector<?> f9917x;

    /* renamed from: y */
    private Collection<Long> f9918y;

    /* renamed from: z */
    C3541b f9919z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3566i(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f9916w = month;
        this.f9917x = dateSelector;
        this.f9915A = calendarConstraints;
        this.f9918y = dateSelector.m29972u();
    }

    /* renamed from: e */
    private void m29878e(Context context) {
        if (this.f9919z == null) {
            this.f9919z = new C3541b(context);
        }
    }

    /* renamed from: h */
    private boolean m29875h(long j) {
        Iterator<Long> it = this.f9917x.m29972u().iterator();
        while (it.hasNext()) {
            if (C3575o.m29853a(j) == C3575o.m29853a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m29872k(TextView textView, long j) {
        C3540a c3540a;
        if (textView == null) {
            return;
        }
        if (this.f9915A.m29988f().mo29969p(j)) {
            textView.setEnabled(true);
            if (m29875h(j)) {
                c3540a = this.f9919z.f9836b;
            } else if (C3575o.m29845i().getTimeInMillis() == j) {
                c3540a = this.f9919z.f9837c;
            } else {
                c3540a = this.f9919z.f9835a;
            }
        } else {
            textView.setEnabled(false);
            c3540a = this.f9919z.f9841g;
        }
        c3540a.m29945d(textView);
    }

    /* renamed from: l */
    private void m29871l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m29959d(j).equals(this.f9916w)) {
            m29872k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().m29882a(this.f9916w.m29955i(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m29882a(int i) {
        return m29881b() + (i - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m29881b() {
        return this.f9916w.m29957f();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f9916w.m29957f() || i > m29874i()) {
            return null;
        }
        return Long.valueOf(this.f9916w.m29956h(m29873j(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m29878e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p100f8.C5425h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.m29881b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.Month r8 = r5.f9916w
            int r2 = r8.f9822A
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f9916w
            long r7 = r8.m29956h(r7)
            com.google.android.material.datepicker.Month r3 = r5.f9916w
            int r3 = r3.f9827y
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m29958e()
            int r4 = r4.f9827y
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.C3542c.m29944a(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.C3542c.m29941d(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.m29872k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C3566i.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m29877f(int i) {
        return i % this.f9916w.f9828z == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m29876g(int i) {
        return (i + 1) % this.f9916w.f9828z == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9916w.f9822A + m29881b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f9916w.f9828z;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m29874i() {
        return (this.f9916w.m29957f() + this.f9916w.f9822A) - 1;
    }

    /* renamed from: j */
    int m29873j(int i) {
        return (i - this.f9916w.m29957f()) + 1;
    }

    /* renamed from: m */
    public void m29870m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.f9918y) {
            m29871l(materialCalendarGridView, l.longValue());
        }
        DateSelector<?> dateSelector = this.f9917x;
        if (dateSelector != null) {
            for (Long l2 : dateSelector.m29972u()) {
                m29871l(materialCalendarGridView, l2.longValue());
            }
            this.f9918y = this.f9917x.m29972u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m29869n(int i) {
        return i >= m29881b() && i <= m29874i();
    }
}
