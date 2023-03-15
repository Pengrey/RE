package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C1112b0;
import androidx.core.view.C1183m0;
import androidx.core.view.InterfaceC1211u;
import androidx.fragment.app.AbstractC1382r;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1348c;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.C3629d;
import com.google.android.material.internal.C3649p;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p100f8.C5419b;
import p100f8.C5421d;
import p100f8.C5422e;
import p100f8.C5423f;
import p100f8.C5425h;
import p100f8.C5427j;
import p100f8.C5428k;
import p111g.C5586a;
import p218l8.View$OnTouchListenerC7001a;
import p354s8.C10085b;
import p401v8.C11141g;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: classes.dex */
public final class C3557f<S> extends DialogInterface$OnCancelListenerC1348c {

    /* renamed from: i1 */
    static final Object f9878i1 = "CONFIRM_BUTTON_TAG";

    /* renamed from: j1 */
    static final Object f9879j1 = "CANCEL_BUTTON_TAG";

    /* renamed from: k1 */
    static final Object f9880k1 = "TOGGLE_BUTTON_TAG";

    /* renamed from: M0 */
    private final LinkedHashSet<InterfaceC3563g<? super S>> f9881M0 = new LinkedHashSet<>();

    /* renamed from: N0 */
    private final LinkedHashSet<View.OnClickListener> f9882N0 = new LinkedHashSet<>();

    /* renamed from: O0 */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f9883O0 = new LinkedHashSet<>();

    /* renamed from: P0 */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f9884P0 = new LinkedHashSet<>();

    /* renamed from: Q0 */
    private int f9885Q0;

    /* renamed from: R0 */
    private DateSelector<S> f9886R0;

    /* renamed from: S0 */
    private AbstractC3571l<S> f9887S0;

    /* renamed from: T0 */
    private CalendarConstraints f9888T0;

    /* renamed from: U0 */
    private C3544e<S> f9889U0;

    /* renamed from: V0 */
    private int f9890V0;

    /* renamed from: W0 */
    private CharSequence f9891W0;

    /* renamed from: X0 */
    private boolean f9892X0;

    /* renamed from: Y0 */
    private int f9893Y0;

    /* renamed from: Z0 */
    private int f9894Z0;

    /* renamed from: a1 */
    private CharSequence f9895a1;

    /* renamed from: b1 */
    private int f9896b1;

    /* renamed from: c1 */
    private CharSequence f9897c1;

    /* renamed from: d1 */
    private TextView f9898d1;

    /* renamed from: e1 */
    private CheckableImageButton f9899e1;

    /* renamed from: f1 */
    private C11141g f9900f1;

    /* renamed from: g1 */
    private Button f9901g1;

    /* renamed from: h1 */
    private boolean f9902h1;

    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.f$a */
    /* loaded from: classes.dex */
    class View$OnClickListenerC3558a implements View.OnClickListener {
        View$OnClickListenerC3558a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C3557f.this.f9881M0.iterator();
            while (it.hasNext()) {
                ((InterfaceC3563g) it.next()).m29887a(C3557f.this.m29900L2());
            }
            C3557f.this.mo30315j2();
        }
    }

    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.f$b */
    /* loaded from: classes.dex */
    class View$OnClickListenerC3559b implements View.OnClickListener {
        View$OnClickListenerC3559b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C3557f.this.f9882N0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C3557f.this.mo30315j2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.f$c */
    /* loaded from: classes.dex */
    public class C3560c implements InterfaceC1211u {

        /* renamed from: a */
        final /* synthetic */ int f9905a;

        /* renamed from: b */
        final /* synthetic */ View f9906b;

        /* renamed from: c */
        final /* synthetic */ int f9907c;

        C3560c(C3557f c3557f, int i, View view, int i2) {
            this.f9905a = i;
            this.f9906b = view;
            this.f9907c = i2;
        }

        @Override // androidx.core.view.InterfaceC1211u
        /* renamed from: a */
        public C1183m0 mo29259a(View view, C1183m0 c1183m0) {
            int i = c1183m0.m38108f(C1183m0.C1196m.m38053c()).f3252b;
            if (this.f9905a >= 0) {
                this.f9906b.getLayoutParams().height = this.f9905a + i;
                View view2 = this.f9906b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f9906b;
            view3.setPadding(view3.getPaddingLeft(), this.f9907c + i, this.f9906b.getPaddingRight(), this.f9906b.getPaddingBottom());
            return c1183m0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.f$d */
    /* loaded from: classes.dex */
    public class C3561d extends AbstractC3570k<S> {
        C3561d() {
        }

        @Override // com.google.android.material.datepicker.AbstractC3570k
        /* renamed from: a */
        public void mo29861a(S s) {
            C3557f.this.m29893S2();
            C3557f.this.f9901g1.setEnabled(C3557f.this.m29903I2().m29973q());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialDatePicker.java */
    /* renamed from: com.google.android.material.datepicker.f$e */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC3562e implements View.OnClickListener {
        View$OnClickListenerC3562e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C3557f.this.f9901g1.setEnabled(C3557f.this.m29903I2().m29973q());
            C3557f.this.f9899e1.toggle();
            C3557f c3557f = C3557f.this;
            c3557f.m29892T2(c3557f.f9899e1);
            C3557f.this.m29894R2();
        }
    }

    /* renamed from: G2 */
    private static Drawable m29905G2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C5586a.m23699b(context, C5422e.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], C5586a.m23699b(context, C5422e.material_ic_edit_black_24dp));
        return stateListDrawable;
    }

    /* renamed from: H2 */
    private void m29904H2(Window window) {
        if (this.f9902h1) {
            return;
        }
        View findViewById = m37648I1().findViewById(C5423f.fullscreen_header);
        C3629d.m29547a(window, true, C3649p.m29490c(findViewById), null);
        C1112b0.m38475E0(findViewById, new C3560c(this, findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.f9902h1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I2 */
    public DateSelector<S> m29903I2() {
        if (this.f9886R0 == null) {
            this.f9886R0 = (DateSelector) m37660E().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f9886R0;
    }

    /* renamed from: K2 */
    private static int m29901K2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C5421d.mtrl_calendar_content_padding);
        int i = Month.m29958e().f9828z;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C5421d.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(C5421d.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: M2 */
    private int m29899M2(Context context) {
        int i = this.f9885Q0;
        return i != 0 ? i : m29903I2().m29975l(context);
    }

    /* renamed from: N2 */
    private void m29898N2(Context context) {
        this.f9899e1.setTag(f9880k1);
        this.f9899e1.setImageDrawable(m29905G2(context));
        this.f9899e1.setChecked(this.f9893Y0 != 0);
        C1112b0.m38405s0(this.f9899e1, null);
        m29892T2(this.f9899e1);
        this.f9899e1.setOnClickListener(new View$OnClickListenerC3562e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O2 */
    public static boolean m29897O2(Context context) {
        return m29895Q2(context, 16843277);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P2 */
    public static boolean m29896P2(Context context) {
        return m29895Q2(context, C5419b.nestedScrollable);
    }

    /* renamed from: Q2 */
    static boolean m29895Q2(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C10085b.m9231d(context, C5419b.materialCalendarStyle, C3544e.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R2 */
    public void m29894R2() {
        AbstractC3571l<S> abstractC3571l;
        int m29899M2 = m29899M2(m37650H1());
        this.f9889U0 = C3544e.m29918y2(m29903I2(), m29899M2, this.f9888T0);
        if (this.f9899e1.isChecked()) {
            abstractC3571l = C3564h.m29883i2(m29903I2(), m29899M2, this.f9888T0);
        } else {
            abstractC3571l = this.f9889U0;
        }
        this.f9887S0 = abstractC3571l;
        m29893S2();
        AbstractC1382r m37447m = m37657F().m37447m();
        m37447m.m37176n(C5423f.mtrl_calendar_frame, this.f9887S0);
        m37447m.mo37182h();
        this.f9887S0.mo29860g2(new C3561d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S2 */
    public void m29893S2() {
        String m29902J2 = m29902J2();
        this.f9898d1.setContentDescription(String.format(m37589f0(C5427j.mtrl_picker_announce_current_selection), m29902J2));
        this.f9898d1.setText(m29902J2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T2 */
    public void m29892T2(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f9899e1.isChecked()) {
            string = checkableImageButton.getContext().getString(C5427j.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton.getContext().getString(C5427j.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f9899e1.setContentDescription(string);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c, androidx.fragment.app.Fragment
    /* renamed from: D0 */
    public final void mo29886D0(Bundle bundle) {
        super.mo29886D0(bundle);
        if (bundle == null) {
            bundle = m37660E();
        }
        this.f9885Q0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f9886R0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f9888T0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f9890V0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f9891W0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f9893Y0 = bundle.getInt("INPUT_MODE_KEY");
        this.f9894Z0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f9895a1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f9896b1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f9897c1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: H0 */
    public final View mo29885H0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f9892X0 ? C5425h.mtrl_picker_fullscreen : C5425h.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f9892X0) {
            inflate.findViewById(C5423f.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m29901K2(context), -2));
        } else {
            inflate.findViewById(C5423f.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m29901K2(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C5423f.mtrl_picker_header_selection_text);
        this.f9898d1 = textView;
        C1112b0.m38401u0(textView, 1);
        this.f9899e1 = (CheckableImageButton) inflate.findViewById(C5423f.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(C5423f.mtrl_picker_title_text);
        CharSequence charSequence = this.f9891W0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f9890V0);
        }
        m29898N2(context);
        this.f9901g1 = (Button) inflate.findViewById(C5423f.confirm_button);
        if (m29903I2().m29973q()) {
            this.f9901g1.setEnabled(true);
        } else {
            this.f9901g1.setEnabled(false);
        }
        this.f9901g1.setTag(f9878i1);
        CharSequence charSequence2 = this.f9895a1;
        if (charSequence2 != null) {
            this.f9901g1.setText(charSequence2);
        } else {
            int i = this.f9894Z0;
            if (i != 0) {
                this.f9901g1.setText(i);
            }
        }
        this.f9901g1.setOnClickListener(new View$OnClickListenerC3558a());
        Button button = (Button) inflate.findViewById(C5423f.cancel_button);
        button.setTag(f9879j1);
        CharSequence charSequence3 = this.f9897c1;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.f9896b1;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        button.setOnClickListener(new View$OnClickListenerC3559b());
        return inflate;
    }

    /* renamed from: J2 */
    public String m29902J2() {
        return m29903I2().m29976g(m37654G());
    }

    /* renamed from: L2 */
    public final S m29900L2() {
        return m29903I2().m29971x();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c, androidx.fragment.app.Fragment
    /* renamed from: Z0 */
    public final void mo29884Z0(Bundle bundle) {
        super.mo29884Z0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f9885Q0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f9886R0);
        CalendarConstraints.C3536b c3536b = new CalendarConstraints.C3536b(this.f9888T0);
        if (this.f9889U0.m29923t2() != null) {
            c3536b.m29979b(this.f9889U0.m29923t2().f9823B);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c3536b.m29980a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f9890V0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f9891W0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f9894Z0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f9895a1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f9896b1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f9897c1);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c, androidx.fragment.app.Fragment
    /* renamed from: a1 */
    public void mo29891a1() {
        super.mo29891a1();
        Window window = m37330s2().getWindow();
        if (this.f9892X0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f9900f1);
            m29904H2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m37603Z().getDimensionPixelOffset(C5421d.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f9900f1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new View$OnTouchListenerC7001a(m37330s2(), rect));
        }
        m29894R2();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c, androidx.fragment.app.Fragment
    /* renamed from: b1 */
    public void mo29890b1() {
        this.f9887S0.m29859h2();
        super.mo29890b1();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c
    /* renamed from: o2 */
    public final Dialog mo3127o2(Bundle bundle) {
        Dialog dialog = new Dialog(m37650H1(), m29899M2(m37650H1()));
        Context context = dialog.getContext();
        this.f9892X0 = m29897O2(context);
        int m9231d = C10085b.m9231d(context, C5419b.colorSurface, C3557f.class.getCanonicalName());
        C11141g c11141g = new C11141g(context, null, C5419b.materialCalendarStyle, C5428k.Widget_MaterialComponents_MaterialCalendar);
        this.f9900f1 = c11141g;
        c11141g.m6015O(context);
        this.f9900f1.m6004Z(ColorStateList.valueOf(m9231d));
        this.f9900f1.m6005Y(C1112b0.m38394y(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f9883O0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1348c, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f9884P0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) m37584h0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
