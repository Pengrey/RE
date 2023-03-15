package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C1072d;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import androidx.recyclerview.widget.C1645u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p100f8.C5421d;
import p100f8.C5423f;
import p100f8.C5424g;
import p100f8.C5425h;
import p100f8.C5427j;

/* renamed from: com.google.android.material.datepicker.e */
/* loaded from: classes.dex */
public final class C3544e<S> extends AbstractC3571l<S> {

    /* renamed from: H0 */
    static final Object f9847H0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: I0 */
    static final Object f9848I0 = "NAVIGATION_PREV_TAG";

    /* renamed from: J0 */
    static final Object f9849J0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: K0 */
    static final Object f9850K0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: A0 */
    private Month f9851A0;

    /* renamed from: B0 */
    private EnumC3555k f9852B0;

    /* renamed from: C0 */
    private C3541b f9853C0;

    /* renamed from: D0 */
    private RecyclerView f9854D0;

    /* renamed from: E0 */
    private RecyclerView f9855E0;

    /* renamed from: F0 */
    private View f9856F0;

    /* renamed from: G0 */
    private View f9857G0;

    /* renamed from: x0 */
    private int f9858x0;

    /* renamed from: y0 */
    private DateSelector<S> f9859y0;

    /* renamed from: z0 */
    private CalendarConstraints f9860z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$a */
    /* loaded from: classes.dex */
    public class RunnableC3545a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ int f9861w;

        RunnableC3545a(int i) {
            this.f9861w = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3544e.this.f9855E0.m36619t1(this.f9861w);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$b */
    /* loaded from: classes.dex */
    class C3546b extends C1078a {
        C3546b(C3544e c3544e) {
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            super.mo19280g(view, c1085c);
            c1085c.m38558c0(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$c */
    /* loaded from: classes.dex */
    class C3547c extends C3572m {

        /* renamed from: I */
        final /* synthetic */ int f9863I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C3547c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f9863I = i2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: N1 */
        public void mo29916N1(RecyclerView.C1564z c1564z, int[] iArr) {
            if (this.f9863I == 0) {
                iArr[0] = C3544e.this.f9855E0.getWidth();
                iArr[1] = C3544e.this.f9855E0.getWidth();
                return;
            }
            iArr[0] = C3544e.this.f9855E0.getHeight();
            iArr[1] = C3544e.this.f9855E0.getHeight();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$d */
    /* loaded from: classes.dex */
    class C3548d implements InterfaceC3556l {
        C3548d() {
        }

        @Override // com.google.android.material.datepicker.C3544e.InterfaceC3556l
        /* renamed from: a */
        public void mo29912a(long j) {
            if (C3544e.this.f9860z0.m29988f().mo29969p(j)) {
                C3544e.this.f9859y0.m29978B(j);
                Iterator<AbstractC3570k<S>> it = C3544e.this.f9928w0.iterator();
                while (it.hasNext()) {
                    it.next().mo29861a((S) C3544e.this.f9859y0.m29971x());
                }
                C3544e.this.f9855E0.getAdapter().m36542k();
                if (C3544e.this.f9854D0 != null) {
                    C3544e.this.f9854D0.getAdapter().m36542k();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$e */
    /* loaded from: classes.dex */
    public class C3549e extends RecyclerView.AbstractC1545n {

        /* renamed from: a */
        private final Calendar f9866a = C3575o.m29843k();

        /* renamed from: b */
        private final Calendar f9867b = C3575o.m29843k();

        C3549e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1545n
        /* renamed from: i */
        public void mo29915i(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1564z c1564z) {
            int width;
            if ((recyclerView.getAdapter() instanceof C3576p) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C3576p c3576p = (C3576p) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C1072d<Long, Long> c1072d : C3544e.this.f9859y0.m29974o()) {
                    Long l = c1072d.f3406a;
                    if (l != null && c1072d.f3407b != null) {
                        this.f9866a.setTimeInMillis(l.longValue());
                        this.f9867b.setTimeInMillis(c1072d.f3407b.longValue());
                        int m29838F = c3576p.m29838F(this.f9866a.get(1));
                        int m29838F2 = c3576p.m29838F(this.f9867b.get(1));
                        View mo36496D = gridLayoutManager.mo36496D(m29838F);
                        View mo36496D2 = gridLayoutManager.mo36496D(m29838F2);
                        int m36821c3 = m29838F / gridLayoutManager.m36821c3();
                        int m36821c32 = m29838F2 / gridLayoutManager.m36821c3();
                        int i = m36821c3;
                        while (i <= m36821c32) {
                            View mo36496D3 = gridLayoutManager.mo36496D(gridLayoutManager.m36821c3() * i);
                            if (mo36496D3 != null) {
                                int top = mo36496D3.getTop() + C3544e.this.f9853C0.f9838d.m29946c();
                                int bottom = mo36496D3.getBottom() - C3544e.this.f9853C0.f9838d.m29947b();
                                int left = i == m36821c3 ? mo36496D.getLeft() + (mo36496D.getWidth() / 2) : 0;
                                if (i == m36821c32) {
                                    width = mo36496D2.getLeft() + (mo36496D2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(left, top, width, bottom, C3544e.this.f9853C0.f9842h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$f */
    /* loaded from: classes.dex */
    public class C3550f extends C1078a {
        C3550f() {
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            String m37589f0;
            super.mo19280g(view, c1085c);
            if (C3544e.this.f9857G0.getVisibility() == 0) {
                m37589f0 = C3544e.this.m37589f0(C5427j.mtrl_picker_toggle_to_year_selection);
            } else {
                m37589f0 = C3544e.this.m37589f0(C5427j.mtrl_picker_toggle_to_day_selection);
            }
            c1085c.m38536n0(m37589f0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$g */
    /* loaded from: classes.dex */
    public class C3551g extends RecyclerView.AbstractC1555t {

        /* renamed from: a */
        final /* synthetic */ C3567j f9870a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f9871b;

        C3551g(C3567j c3567j, MaterialButton materialButton) {
            this.f9870a = c3567j;
            this.f9871b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1555t
        /* renamed from: a */
        public void mo29914a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f9871b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1555t
        /* renamed from: b */
        public void mo29913b(RecyclerView recyclerView, int i, int i2) {
            int m36767f2;
            if (i < 0) {
                m36767f2 = C3544e.this.m29919x2().m36771b2();
            } else {
                m36767f2 = C3544e.this.m29919x2().m36767f2();
            }
            C3544e.this.f9851A0 = this.f9870a.m29867E(m36767f2);
            this.f9871b.setText(this.f9870a.m29866F(m36767f2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$h */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3552h implements View.OnClickListener {
        View$OnClickListenerC3552h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3544e.this.m29935C2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$i */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3553i implements View.OnClickListener {

        /* renamed from: w */
        final /* synthetic */ C3567j f9874w;

        View$OnClickListenerC3553i(C3567j c3567j) {
            this.f9874w = c3567j;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m36771b2 = C3544e.this.m29919x2().m36771b2() + 1;
            if (m36771b2 < C3544e.this.f9855E0.getAdapter().mo29834f()) {
                C3544e.this.m29937A2(this.f9874w.m29867E(m36771b2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$j */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3554j implements View.OnClickListener {

        /* renamed from: w */
        final /* synthetic */ C3567j f9876w;

        View$OnClickListenerC3554j(C3567j c3567j) {
            this.f9876w = c3567j;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m36767f2 = C3544e.this.m29919x2().m36767f2() - 1;
            if (m36767f2 >= 0) {
                C3544e.this.m29937A2(this.f9876w.m29867E(m36767f2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$k */
    /* loaded from: classes.dex */
    public enum EnumC3555k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$l */
    /* loaded from: classes.dex */
    public interface InterfaceC3556l {
        /* renamed from: a */
        void mo29912a(long j);
    }

    /* renamed from: p2 */
    private void m29927p2(View view, C3567j c3567j) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C5423f.month_navigation_fragment_toggle);
        materialButton.setTag(f9850K0);
        C1112b0.m38405s0(materialButton, new C3550f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C5423f.month_navigation_previous);
        materialButton2.setTag(f9848I0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C5423f.month_navigation_next);
        materialButton3.setTag(f9849J0);
        this.f9856F0 = view.findViewById(C5423f.mtrl_calendar_year_selector_frame);
        this.f9857G0 = view.findViewById(C5423f.mtrl_calendar_day_selector_frame);
        m29936B2(EnumC3555k.DAY);
        materialButton.setText(this.f9851A0.m29954j());
        this.f9855E0.m36645l(new C3551g(c3567j, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC3552h());
        materialButton3.setOnClickListener(new View$OnClickListenerC3553i(c3567j));
        materialButton2.setOnClickListener(new View$OnClickListenerC3554j(c3567j));
    }

    /* renamed from: q2 */
    private RecyclerView.AbstractC1545n m29926q2() {
        return new C3549e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v2 */
    public static int m29921v2(Context context) {
        return context.getResources().getDimensionPixelSize(C5421d.mtrl_calendar_day_height);
    }

    /* renamed from: w2 */
    private static int m29920w2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C5421d.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C5421d.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C5421d.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C5421d.mtrl_calendar_days_of_week_height);
        int i = C3566i.f9914B;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C5421d.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(C5421d.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C5421d.mtrl_calendar_bottom_padding);
    }

    /* renamed from: y2 */
    public static <T> C3544e<T> m29918y2(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        C3544e<T> c3544e = new C3544e<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m29985j());
        c3544e.m37630P1(bundle);
        return c3544e;
    }

    /* renamed from: z2 */
    private void m29917z2(int i) {
        this.f9855E0.post(new RunnableC3545a(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A2 */
    public void m29937A2(Month month) {
        C3567j c3567j = (C3567j) this.f9855E0.getAdapter();
        int m29865G = c3567j.m29865G(month);
        int m29865G2 = m29865G - c3567j.m29865G(this.f9851A0);
        boolean z = Math.abs(m29865G2) > 3;
        boolean z2 = m29865G2 > 0;
        this.f9851A0 = month;
        if (z && z2) {
            this.f9855E0.m36643l1(m29865G - 3);
            m29917z2(m29865G);
        } else if (z) {
            this.f9855E0.m36643l1(m29865G + 3);
            m29917z2(m29865G);
        } else {
            m29917z2(m29865G);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B2 */
    public void m29936B2(EnumC3555k enumC3555k) {
        this.f9852B0 = enumC3555k;
        if (enumC3555k == EnumC3555k.YEAR) {
            this.f9854D0.getLayoutManager().mo36230y1(((C3576p) this.f9854D0.getAdapter()).m29838F(this.f9851A0.f9827y));
            this.f9856F0.setVisibility(0);
            this.f9857G0.setVisibility(8);
        } else if (enumC3555k == EnumC3555k.DAY) {
            this.f9856F0.setVisibility(8);
            this.f9857G0.setVisibility(0);
            m29937A2(this.f9851A0);
        }
    }

    /* renamed from: C2 */
    void m29935C2() {
        EnumC3555k enumC3555k = this.f9852B0;
        EnumC3555k enumC3555k2 = EnumC3555k.YEAR;
        if (enumC3555k == enumC3555k2) {
            m29936B2(EnumC3555k.DAY);
        } else if (enumC3555k == EnumC3555k.DAY) {
            m29936B2(enumC3555k2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public void mo29886D0(Bundle bundle) {
        super.mo29886D0(bundle);
        if (bundle == null) {
            bundle = m37660E();
        }
        this.f9858x0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f9859y0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f9860z0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9851A0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public View mo29885H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m37654G(), this.f9858x0);
        this.f9853C0 = new C3541b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month m29984k = this.f9860z0.m29984k();
        if (C3557f.m29897O2(contextThemeWrapper)) {
            i = C5425h.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = C5425h.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        inflate.setMinimumHeight(m29920w2(m37650H1()));
        GridView gridView = (GridView) inflate.findViewById(C5423f.mtrl_calendar_days_of_week);
        C1112b0.m38405s0(gridView, new C3546b(this));
        gridView.setAdapter((ListAdapter) new C3543d());
        gridView.setNumColumns(m29984k.f9828z);
        gridView.setEnabled(false);
        this.f9855E0 = (RecyclerView) inflate.findViewById(C5423f.mtrl_calendar_months);
        this.f9855E0.setLayoutManager(new C3547c(m37654G(), i2, false, i2));
        this.f9855E0.setTag(f9847H0);
        C3567j c3567j = new C3567j(contextThemeWrapper, this.f9859y0, this.f9860z0, new C3548d());
        this.f9855E0.setAdapter(c3567j);
        int integer = contextThemeWrapper.getResources().getInteger(C5424g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C5423f.mtrl_calendar_year_selector_frame);
        this.f9854D0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f9854D0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f9854D0.setAdapter(new C3576p(this));
            this.f9854D0.m36657h(m29926q2());
        }
        if (inflate.findViewById(C5423f.month_navigation_fragment_toggle) != null) {
            m29927p2(inflate, c3567j);
        }
        if (!C3557f.m29897O2(contextThemeWrapper)) {
            new C1645u().m35821b(this.f9855E0);
        }
        this.f9855E0.m36643l1(c3567j.m29865G(this.f9851A0));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: Z0 */
    public void mo29884Z0(Bundle bundle) {
        super.mo29884Z0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f9858x0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f9859y0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f9860z0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f9851A0);
    }

    @Override // com.google.android.material.datepicker.AbstractC3571l
    /* renamed from: g2 */
    public boolean mo29860g2(AbstractC3570k<S> abstractC3570k) {
        return super.mo29860g2(abstractC3570k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r2 */
    public CalendarConstraints m29925r2() {
        return this.f9860z0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s2 */
    public C3541b m29924s2() {
        return this.f9853C0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t2 */
    public Month m29923t2() {
        return this.f9851A0;
    }

    /* renamed from: u2 */
    public DateSelector<S> m29922u2() {
        return this.f9859y0;
    }

    /* renamed from: x2 */
    LinearLayoutManager m29919x2() {
        return (LinearLayoutManager) this.f9855E0.getLayoutManager();
    }
}
