package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import p039c3.AbstractC2037m;
import p039c3.C2054s;

/* renamed from: com.google.android.material.internal.l */
/* loaded from: classes.dex */
public class C3643l extends AbstractC2037m {

    /* compiled from: TextScale.java */
    /* renamed from: com.google.android.material.internal.l$a */
    /* loaded from: classes.dex */
    class C3644a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ TextView f10227a;

        C3644a(C3643l c3643l, TextView textView) {
            this.f10227a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f10227a.setScaleX(floatValue);
            this.f10227a.setScaleY(floatValue);
        }
    }

    /* renamed from: g0 */
    private void m29510g0(C2054s c2054s) {
        View view = c2054s.f5960b;
        if (view instanceof TextView) {
            c2054s.f5959a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: f */
    public void mo29511f(C2054s c2054s) {
        m29510g0(c2054s);
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: j */
    public void mo29509j(C2054s c2054s) {
        m29510g0(c2054s);
    }

    @Override // p039c3.AbstractC2037m
    /* renamed from: n */
    public Animator mo29508n(ViewGroup viewGroup, C2054s c2054s, C2054s c2054s2) {
        if (c2054s == null || c2054s2 == null || !(c2054s.f5960b instanceof TextView)) {
            return null;
        }
        View view = c2054s2.f5960b;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Map<String, Object> map = c2054s.f5959a;
            Map<String, Object> map2 = c2054s2.f5959a;
            float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
            float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
            if (floatValue == floatValue2) {
                return null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
            ofFloat.addUpdateListener(new C3644a(this, textView));
            return ofFloat;
        }
        return null;
    }
}
