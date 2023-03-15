package p133h7;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.C2566b;
import com.google.android.gms.common.internal.C2599j;
import java.util.LinkedList;
import p133h7.InterfaceC5869c;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h7.a */
/* loaded from: classes.dex */
public abstract class AbstractC5866a<T extends InterfaceC5869c> {

    /* renamed from: a */
    private T f16299a;

    /* renamed from: b */
    private Bundle f16300b;

    /* renamed from: c */
    private LinkedList<InterfaceC5876j> f16301c;

    /* renamed from: d */
    private final InterfaceC5871e<T> f16302d = new C5872f(this);

    /* renamed from: h */
    public static void m22848h(FrameLayout frameLayout) {
        C2566b m33240m = C2566b.m33240m();
        Context context = frameLayout.getContext();
        int mo33223g = m33240m.mo33223g(context);
        String m33068d = C2599j.m33068d(context, mo33223g);
        String m33069c = C2599j.m33069c(context, mo33223g);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(m33068d);
        linearLayout.addView(textView);
        Intent mo33228b = m33240m.mo33228b(context, mo33223g, null);
        if (mo33228b != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(m33069c);
            linearLayout.addView(button);
            button.setOnClickListener(new View$OnClickListenerC5874h(context, mo33228b));
        }
    }

    /* renamed from: m */
    private final void m22843m(int i) {
        while (!this.f16301c.isEmpty() && this.f16301c.getLast().mo22832b() >= i) {
            this.f16301c.removeLast();
        }
    }

    /* renamed from: n */
    private final void m22842n(Bundle bundle, InterfaceC5876j interfaceC5876j) {
        T t = this.f16299a;
        if (t != null) {
            interfaceC5876j.mo22833a(t);
            return;
        }
        if (this.f16301c == null) {
            this.f16301c = new LinkedList<>();
        }
        this.f16301c.add(interfaceC5876j);
        if (bundle != null) {
            Bundle bundle2 = this.f16300b;
            if (bundle2 == null) {
                this.f16300b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        mo22855a(this.f16302d);
    }

    /* renamed from: a */
    protected abstract void mo22855a(InterfaceC5871e<T> interfaceC5871e);

    /* renamed from: b */
    public T m22854b() {
        return this.f16299a;
    }

    /* renamed from: c */
    public void m22853c(Bundle bundle) {
        m22842n(bundle, new C5873g(this, bundle));
    }

    /* renamed from: d */
    public void m22852d() {
        T t = this.f16299a;
        if (t != null) {
            t.mo22839F();
        } else {
            m22843m(1);
        }
    }

    /* renamed from: e */
    public void m22851e() {
        T t = this.f16299a;
        if (t != null) {
            t.onLowMemory();
        }
    }

    /* renamed from: f */
    public void m22850f() {
        T t = this.f16299a;
        if (t != null) {
            t.mo22840B();
        } else {
            m22843m(5);
        }
    }

    /* renamed from: g */
    public void m22849g() {
        m22842n(null, new C5875i(this));
    }
}
