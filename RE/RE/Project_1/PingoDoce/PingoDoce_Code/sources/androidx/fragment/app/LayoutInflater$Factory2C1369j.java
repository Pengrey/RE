package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p326r2.C9794c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.j */
/* loaded from: classes.dex */
public class LayoutInflater$Factory2C1369j implements LayoutInflater.Factory2 {

    /* renamed from: w */
    final FragmentManager f4073w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentLayoutInflaterFactory.java */
    /* renamed from: androidx.fragment.app.j$a */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC1370a implements View.OnAttachStateChangeListener {

        /* renamed from: w */
        final /* synthetic */ C1378p f4074w;

        View$OnAttachStateChangeListenerC1370a(C1378p c1378p) {
            this.f4074w = c1378p;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment m37225k = this.f4074w.m37225k();
            this.f4074w.m37223m();
            AbstractC1406y.m37107n((ViewGroup) m37225k.f3826d0.getParent(), LayoutInflater$Factory2C1369j.this.f4073w).m37111j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C1369j(FragmentManager fragmentManager) {
        this.f4073w = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C1378p m37417w;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f4073w);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9794c.f25731a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(C9794c.f25732b);
            }
            int resourceId = obtainStyledAttributes.getResourceId(C9794c.f25733c, -1);
            String string = obtainStyledAttributes.getString(C9794c.f25734d);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !C1367h.m37280b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id2 = view != null ? view.getId() : 0;
            if (id2 == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment m37458i0 = resourceId != -1 ? this.f4073w.m37458i0(resourceId) : null;
            if (m37458i0 == null && string != null) {
                m37458i0 = this.f4073w.m37455j0(string);
            }
            if (m37458i0 == null && id2 != -1) {
                m37458i0 = this.f4073w.m37458i0(id2);
            }
            if (m37458i0 == null) {
                m37458i0 = this.f4073w.m37428s0().mo37281a(context.getClassLoader(), attributeValue);
                m37458i0.f3808J = true;
                m37458i0.f3816S = resourceId != 0 ? resourceId : id2;
                m37458i0.f3817T = id2;
                m37458i0.f3818U = string;
                m37458i0.f3809K = true;
                FragmentManager fragmentManager = this.f4073w;
                m37458i0.f3813O = fragmentManager;
                m37458i0.f3814P = fragmentManager.m37419v0();
                m37458i0.m37631P0(this.f4073w.m37419v0().m37274g(), attributeSet, m37458i0.f3843x);
                m37417w = this.f4073w.m37465g(m37458i0);
                if (FragmentManager.m37520H0(2)) {
                    Log.v("FragmentManager", "Fragment " + m37458i0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else if (!m37458i0.f3809K) {
                m37458i0.f3809K = true;
                FragmentManager fragmentManager2 = this.f4073w;
                m37458i0.f3813O = fragmentManager2;
                m37458i0.f3814P = fragmentManager2.m37419v0();
                m37458i0.m37631P0(this.f4073w.m37419v0().m37274g(), attributeSet, m37458i0.f3843x);
                m37417w = this.f4073w.m37417w(m37458i0);
                if (FragmentManager.m37520H0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + m37458i0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            m37458i0.f3825c0 = (ViewGroup) view;
            m37417w.m37223m();
            m37417w.m37226j();
            View view2 = m37458i0.f3826d0;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (m37458i0.f3826d0.getTag() == null) {
                    m37458i0.f3826d0.setTag(string);
                }
                m37458i0.f3826d0.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1370a(m37417w));
                return m37458i0.f3826d0;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }
}
