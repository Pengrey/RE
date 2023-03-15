package com.github.razir.progressbutton;

import android.animation.Animator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC1491v;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.TypeCastException;
import p181jd.Intrinsics;

/* compiled from: ProgressButtonHolder.kt */
/* renamed from: com.github.razir.progressbutton.g */
/* loaded from: classes.dex */
public final class C2378g {

    /* renamed from: a */
    private static final WeakHashMap<TextView, C2382i> f6940a = new WeakHashMap<>();

    /* renamed from: b */
    private static final WeakHashMap<TextView, List<Animator>> f6941b = new WeakHashMap<>();

    /* renamed from: c */
    private static final WeakHashMap<TextView, C2377f> f6942c = new WeakHashMap<>();

    /* renamed from: d */
    private static final View$OnAttachStateChangeListenerC2380b f6943d = new View$OnAttachStateChangeListenerC2380b();

    /* renamed from: e */
    private static final View$OnAttachStateChangeListenerC2379a f6944e = new View$OnAttachStateChangeListenerC2379a();

    /* compiled from: ProgressButtonHolder.kt */
    /* renamed from: com.github.razir.progressbutton.g$a */
    /* loaded from: classes.dex */
    public static final class View$OnAttachStateChangeListenerC2379a implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC2379a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C2377f c2377f;
            Drawable m33747a;
            WeakHashMap<TextView, C2377f> m33741f = C2378g.m33741f();
            if (m33741f != null) {
                if (!m33741f.containsKey(view) || (c2377f = C2378g.m33741f().get(view)) == null || (m33747a = c2377f.m33747a()) == null || !(m33747a instanceof Animatable)) {
                    return;
                }
                ((Animatable) m33747a).start();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C2377f c2377f;
            Drawable m33747a;
            WeakHashMap<TextView, C2377f> m33741f = C2378g.m33741f();
            if (m33741f != null) {
                if (!m33741f.containsKey(view) || (c2377f = C2378g.m33741f().get(view)) == null || (m33747a = c2377f.m33747a()) == null || !(m33747a instanceof Animatable)) {
                    return;
                }
                ((Animatable) m33747a).stop();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
        }
    }

    /* compiled from: ProgressButtonHolder.kt */
    /* renamed from: com.github.razir.progressbutton.g$b */
    /* loaded from: classes.dex */
    public static final class View$OnAttachStateChangeListenerC2380b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC2380b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            Intrinsics.m20926i(view, "v");
            WeakHashMap<TextView, C2382i> m33740g = C2378g.m33740g();
            if (m33740g == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            }
            if (m33740g.containsKey(view)) {
                C2370b.m33776g((TextView) view);
            }
        }
    }

    /* renamed from: b */
    public static final void m33745b(TextView textView) {
        Intrinsics.m20926i(textView, "$this$addDrawableAttachViewListener");
        textView.addOnAttachStateChangeListener(f6944e);
    }

    /* renamed from: c */
    public static final void m33744c(InterfaceC1491v interfaceC1491v, TextView textView) {
        Intrinsics.m20926i(interfaceC1491v, "$this$bindProgressButton");
        Intrinsics.m20926i(textView, "button");
        interfaceC1491v.mo137b().mo10402a(new ProgressButtonHolder(new WeakReference(textView)));
    }

    /* renamed from: d */
    public static final void m33743d(TextView textView) {
        Drawable m33747a;
        Intrinsics.m20926i(textView, "$this$cleanUpDrawable");
        WeakHashMap<TextView, C2377f> weakHashMap = f6942c;
        if (weakHashMap.containsKey(textView)) {
            C2377f c2377f = weakHashMap.get(textView);
            if (c2377f != null && (m33747a = c2377f.m33747a()) != null) {
                if (m33747a instanceof Animatable) {
                    ((Animatable) m33747a).stop();
                }
                m33747a.setCallback(null);
            }
            weakHashMap.remove(textView);
        }
    }

    /* renamed from: e */
    public static final WeakHashMap<TextView, List<Animator>> m33742e() {
        return f6941b;
    }

    /* renamed from: f */
    public static final WeakHashMap<TextView, C2377f> m33741f() {
        return f6942c;
    }

    /* renamed from: g */
    public static final WeakHashMap<TextView, C2382i> m33740g() {
        return f6940a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m33739h(TextView textView) {
        textView.removeOnAttachStateChangeListener(f6944e);
    }

    /* renamed from: i */
    public static final void m33738i(TextView textView) {
        Intrinsics.m20926i(textView, "$this$removeTextAnimationAttachViewListener");
        textView.removeOnAttachStateChangeListener(f6943d);
    }
}
