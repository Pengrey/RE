package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p100f8.C5425h;
import p100f8.C5427j;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
class C3543d extends BaseAdapter {

    /* renamed from: z */
    private static final int f9843z;

    /* renamed from: w */
    private final Calendar f9844w;

    /* renamed from: x */
    private final int f9845x;

    /* renamed from: y */
    private final int f9846y;

    static {
        f9843z = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C3543d() {
        Calendar m29843k = C3575o.m29843k();
        this.f9844w = m29843k;
        this.f9845x = m29843k.getMaximum(7);
        this.f9846y = m29843k.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m29938b(int i) {
        int i2 = i + this.f9846y;
        int i3 = this.f9845x;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f9845x) {
            return null;
        }
        return Integer.valueOf(m29938b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f9845x;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C5425h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f9844w.set(7, m29938b(i));
        textView.setText(this.f9844w.getDisplayName(7, f9843z, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C5427j.mtrl_picker_day_of_week_column_header), this.f9844w.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
