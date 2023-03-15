package ae;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import be.UtilsExtensions;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Objects;
import p095f3.C5348a;
import p095f3.InterfaceC5359e;
import p106fe.CommonUtils;
import p181jd.Intrinsics;
import p305q3.C9629g;
import p361t3.InterfaceC10379c;

/* renamed from: ae.e */
/* loaded from: classes2.dex */
public final class BindingAdapters {
    static {
        new BindingAdapters();
    }

    private BindingAdapters() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m41790a(InterfaceC0131a interfaceC0131a, Object obj, List list, View view) {
        m41783h(interfaceC0131a, obj, list, view);
    }

    /* renamed from: b */
    public static /* synthetic */ void m41789b(ConstraintLayout.C0847b c0847b, Guideline guideline, ValueAnimator valueAnimator) {
        m41786e(c0847b, guideline, valueAnimator);
    }

    /* renamed from: c */
    public static /* synthetic */ void m41788c(InterfaceC0131a interfaceC0131a, Object obj, List list, View view) {
        m41782i(interfaceC0131a, obj, list, view);
    }

    /* renamed from: d */
    public static final void m41787d(final Guideline guideline, Float f, TimeInterpolator timeInterpolator, Long l) {
        Intrinsics.isThisObjectNull(guideline, "view");
        if (f != null) {
            f.floatValue();
            ViewGroup.LayoutParams layoutParams = guideline.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            final ConstraintLayout.C0847b c0847b = (ConstraintLayout.C0847b) layoutParams;
            float f2 = c0847b.f2547c;
            if (f2 >= 0.0f && timeInterpolator != null) {
                ValueAnimator m24300b = CommonUtils.f15361a.m24300b(f2, f.floatValue(), l != null ? l.longValue() : 150L, timeInterpolator);
                m24300b.setStartDelay(m24300b.getDuration());
                m24300b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ae.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BindingAdapters.m41786e(ConstraintLayout.C0847b.this, guideline, valueAnimator);
                    }
                });
                m24300b.start();
                return;
            }
            c0847b.f2547c = f.floatValue();
            guideline.setLayoutParams(c0847b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m41786e(ConstraintLayout.C0847b c0847b, Guideline guideline, ValueAnimator valueAnimator) {
        Intrinsics.isThisObjectNull(c0847b, "$params");
        Intrinsics.isThisObjectNull(guideline, "$view");
        Intrinsics.isThisObjectNull(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c0847b.f2547c = ((Float) animatedValue).floatValue();
        guideline.setLayoutParams(c0847b);
    }

    /* renamed from: f */
    public static final void m41785f(View view, float f, float f2, float f3, float f4) {
        Intrinsics.isThisObjectNull(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins((f > (-1.0f) ? 1 : (f == (-1.0f) ? 0 : -1)) == 0 ? marginLayoutParams.leftMargin : (int) f, (f2 > (-1.0f) ? 1 : (f2 == (-1.0f) ? 0 : -1)) == 0 ? marginLayoutParams.topMargin : (int) f2, (f3 > (-1.0f) ? 1 : (f3 == (-1.0f) ? 0 : -1)) == 0 ? marginLayoutParams.rightMargin : (int) f3, f4 == -1.0f ? marginLayoutParams.bottomMargin : (int) f4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0028 A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m41784g(android.view.ViewGroup r7, final java.util.List r8, int r9, int r10, java.lang.String r11, final ae.InterfaceC0131a r12, java.lang.Integer r13) {
        /*
            java.lang.String r0 = "viewGroup"
            p181jd.Intrinsics.isThisObjectNull(r7, r0)
            r7.removeAllViews()
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L6d
            boolean r2 = r8.isEmpty()
            r2 = r2 ^ r1
            if (r2 == 0) goto L6d
            android.content.Context r11 = r7.getContext()
            java.lang.String r2 = "layout_inflater"
            java.lang.Object r11 = r11.getSystemService(r2)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.LayoutInflater"
            java.util.Objects.requireNonNull(r11, r2)
            android.view.LayoutInflater r11 = (android.view.LayoutInflater) r11
            java.util.Iterator r2 = r8.iterator()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8c
            java.lang.Object r3 = r2.next()
            androidx.databinding.ViewDataBinding r4 = androidx.databinding.C1275f.m37764e(r11, r10, r7, r1)
            r4.mo3593M(r9, r3)
            r4.m37807n()
            if (r12 == 0) goto L28
            if (r13 == 0) goto L5d
            int r5 = r13.intValue()
            android.view.View r6 = r4.m37802s()
            android.view.View r5 = r6.findViewById(r5)
            if (r5 == 0) goto L5d
            java.lang.String r6 = "findViewById<View>(it)"
            p181jd.Intrinsics.checkIfNull(r5, r6)
            ae.c r6 = new ae.c
            r6.<init>()
            r5.setOnClickListener(r6)
            r5 = r1
            goto L5e
        L5d:
            r5 = r0
        L5e:
            if (r5 != 0) goto L28
            android.view.View r4 = r4.m37802s()
            ae.d r5 = new ae.d
            r5.<init>()
            r4.setOnClickListener(r5)
            goto L28
        L6d:
            if (r11 == 0) goto L8c
            int r8 = r11.length()
            if (r8 <= 0) goto L76
            r0 = r1
        L76:
            if (r0 == 0) goto L8c
            android.widget.TextView r8 = new android.widget.TextView
            android.content.Context r9 = r7.getContext()
            r8.<init>(r9)
            r9 = 17
            r8.setGravity(r9)
            r8.setText(r11)
            r7.addView(r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ae.BindingAdapters.m41784g(android.view.ViewGroup, java.util.List, int, int, java.lang.String, ae.a, java.lang.Integer):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m41783h(InterfaceC0131a interfaceC0131a, Object obj, List list, View view) {
        interfaceC0131a.mo41791a(obj, list.indexOf(obj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m41782i(InterfaceC0131a interfaceC0131a, Object obj, List list, View view) {
        interfaceC0131a.mo41791a(obj, list.indexOf(obj));
    }

    /* renamed from: j */
    public static final void m41781j(ImageView imageView, String str, Drawable drawable, Drawable drawable2, Drawable drawable3, InterfaceC10379c interfaceC10379c) {
        Intrinsics.isThisObjectNull(imageView, "view");
        if ((str == null || str.length() == 0) && drawable == null) {
            if (drawable3 != null) {
                InterfaceC5359e m24549a = C5348a.m24549a(imageView.getContext());
                C9629g.C9630a m10341m = new C9629g.C9630a(imageView.getContext()).m10350d(drawable3).m10341m(imageView);
                if (interfaceC10379c != null) {
                    m10341m.m10338p(interfaceC10379c);
                }
                m10341m.m10351c(true);
                m24549a.mo24489b(m10341m.m10353a());
                return;
            }
            return;
        }
        if (str != null) {
            Uri parse = Uri.parse(str);
            InterfaceC5359e m24549a2 = C5348a.m24549a(imageView.getContext());
            C9629g.C9630a m10341m2 = new C9629g.C9630a(imageView.getContext()).m10350d(parse).m10341m(imageView);
            if (drawable2 != null) {
                m10341m2.m10347g(drawable2);
            }
            if (drawable3 != null) {
                m10341m2.m10348f(drawable3);
            }
            if (interfaceC10379c != null) {
                m10341m2.m10338p(interfaceC10379c);
            }
            m10341m2.m10351c(true);
            m24549a2.mo24489b(m10341m2.m10353a());
        }
        if (drawable != null) {
            InterfaceC5359e m24549a3 = C5348a.m24549a(imageView.getContext());
            C9629g.C9630a m10341m3 = new C9629g.C9630a(imageView.getContext()).m10350d(drawable).m10341m(imageView);
            if (drawable2 != null) {
                m10341m3.m10347g(drawable2);
            }
            if (drawable3 != null) {
                m10341m3.m10348f(drawable3);
            }
            if (interfaceC10379c != null) {
                m10341m3.m10338p(interfaceC10379c);
            }
            m10341m3.m10351c(true);
            m24549a3.mo24489b(m10341m3.m10353a());
        }
    }

    /* renamed from: k */
    public static final void m41780k(TextInputLayout textInputLayout, String str) {
        Intrinsics.isThisObjectNull(textInputLayout, "view");
        Intrinsics.isThisObjectNull(str, "error");
        textInputLayout.setError(str);
    }

    /* renamed from: l */
    public static final void m41779l(View view, Boolean bool, Boolean bool2) {
        int i;
        Intrinsics.isThisObjectNull(view, "view");
        if (bool != null || (bool2 != null && Intrinsics.equals(bool2, Boolean.TRUE))) {
            Boolean bool3 = Boolean.TRUE;
            if (Intrinsics.equals(bool, bool3)) {
                i = 0;
            } else {
                i = Intrinsics.equals(bool2, bool3) ? 8 : 4;
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: m */
    public static final void m41778m(TextView textView, boolean z) {
        Intrinsics.isThisObjectNull(textView, "view");
        if (z) {
            UtilsExtensions.m35164h(textView);
        } else {
            UtilsExtensions.m35169c(textView);
        }
    }
}
