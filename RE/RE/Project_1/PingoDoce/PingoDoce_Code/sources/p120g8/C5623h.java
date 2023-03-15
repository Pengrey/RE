package p120g8;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Property;
import java.util.ArrayList;
import java.util.List;
import p301q.C9558g;

/* renamed from: g8.h */
/* loaded from: classes.dex */
public class C5623h {

    /* renamed from: a */
    private final C9558g<String, C5624i> f15866a = new C9558g<>();

    /* renamed from: b */
    private final C9558g<String, PropertyValuesHolder[]> f15867b = new C9558g<>();

    /* renamed from: a */
    private static void m23552a(C5623h c5623h, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c5623h.m23541l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c5623h.m23540m(objectAnimator.getPropertyName(), C5624i.m23538b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    /* renamed from: b */
    private PropertyValuesHolder[] m23551b(PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    /* renamed from: c */
    public static C5623h m23550c(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return m23549d(context, resourceId);
    }

    /* renamed from: d */
    public static C5623h m23549d(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return m23548e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(loadAnimator);
                return m23548e(arrayList);
            }
            return null;
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* renamed from: e */
    private static C5623h m23548e(List<Animator> list) {
        C5623h c5623h = new C5623h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m23552a(c5623h, list.get(i));
        }
        return c5623h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5623h) {
            return this.f15866a.equals(((C5623h) obj).f15866a);
        }
        return false;
    }

    /* renamed from: f */
    public <T> ObjectAnimator m23547f(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, m23546g(str));
        ofPropertyValuesHolder.setProperty(property);
        m23545h(str).m23539a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    /* renamed from: g */
    public PropertyValuesHolder[] m23546g(String str) {
        if (m23543j(str)) {
            return m23551b(this.f15867b.get(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public C5624i m23545h(String str) {
        if (m23542k(str)) {
            return this.f15866a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f15866a.hashCode();
    }

    /* renamed from: i */
    public long m23544i() {
        int size = this.f15866a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            C5624i m10610q = this.f15866a.m10610q(i);
            j = Math.max(j, m10610q.m23537c() + m10610q.m23536d());
        }
        return j;
    }

    /* renamed from: j */
    public boolean m23543j(String str) {
        return this.f15867b.get(str) != null;
    }

    /* renamed from: k */
    public boolean m23542k(String str) {
        return this.f15866a.get(str) != null;
    }

    /* renamed from: l */
    public void m23541l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f15867b.put(str, propertyValuesHolderArr);
    }

    /* renamed from: m */
    public void m23540m(String str, C5624i c5624i) {
        this.f15866a.put(str, c5624i);
    }

    public String toString() {
        return '\n' + C5623h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f15866a + "}\n";
    }
}
