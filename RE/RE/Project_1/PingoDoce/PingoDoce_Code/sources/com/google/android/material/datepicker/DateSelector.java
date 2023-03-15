package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.C1072d;
import java.util.Collection;

/* loaded from: classes.dex */
public interface DateSelector<S> extends Parcelable {
    /* renamed from: B */
    void m29978B(long j);

    /* renamed from: C */
    View m29977C(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, AbstractC3570k<S> abstractC3570k);

    /* renamed from: g */
    String m29976g(Context context);

    /* renamed from: l */
    int m29975l(Context context);

    /* renamed from: o */
    Collection<C1072d<Long, Long>> m29974o();

    /* renamed from: q */
    boolean m29973q();

    /* renamed from: u */
    Collection<Long> m29972u();

    /* renamed from: x */
    S m29971x();
}
