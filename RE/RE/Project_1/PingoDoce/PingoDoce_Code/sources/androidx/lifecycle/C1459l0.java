package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.SavedStateRegistry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.lifecycle.l0 */
/* loaded from: classes.dex */
public final class C1459l0 {

    /* renamed from: e */
    private static final Class[] f4328e;

    /* renamed from: a */
    final Map<String, Object> f4329a;

    /* renamed from: b */
    final Map<String, SavedStateRegistry.InterfaceC1660b> f4330b;

    /* renamed from: c */
    private final Map<String, C1461b<?>> f4331c;

    /* renamed from: d */
    private final SavedStateRegistry.InterfaceC1660b f4332d;

    /* compiled from: SavedStateHandle.java */
    /* renamed from: androidx.lifecycle.l0$a */
    /* loaded from: classes.dex */
    class C1460a implements SavedStateRegistry.InterfaceC1660b {
        C1460a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1660b
        /* renamed from: a */
        public Bundle mo35789a() {
            for (Map.Entry entry : new HashMap(C1459l0.this.f4330b).entrySet()) {
                C1459l0.this.m37000g((String) entry.getKey(), ((SavedStateRegistry.InterfaceC1660b) entry.getValue()).mo35789a());
            }
            Set<String> keySet = C1459l0.this.f4329a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str : keySet) {
                arrayList.add(str);
                arrayList2.add(C1459l0.this.f4329a.get(str));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i = Build.VERSION.SDK_INT;
        clsArr[27] = i >= 21 ? Size.class : cls;
        if (i >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        f4328e = clsArr;
    }

    public C1459l0(Map<String, Object> map) {
        this.f4330b = new HashMap();
        this.f4331c = new HashMap();
        this.f4332d = new C1460a();
        this.f4329a = new HashMap(map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C1459l0 m37006a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C1459l0();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C1459l0(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                hashMap.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
            }
            return new C1459l0(hashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }

    /* renamed from: e */
    private <T> C1436e0<T> m37002e(String str, boolean z, T t) {
        C1461b<?> c1461b;
        C1461b<?> c1461b2 = this.f4331c.get(str);
        if (c1461b2 != null) {
            return c1461b2;
        }
        if (this.f4329a.containsKey(str)) {
            c1461b = new C1461b<>(this, str, this.f4329a.get(str));
        } else if (z) {
            c1461b = new C1461b<>(this, str, t);
        } else {
            c1461b = new C1461b<>(this, str);
        }
        this.f4331c.put(str, c1461b);
        return c1461b;
    }

    /* renamed from: h */
    private static void m36999h(Object obj) {
        if (obj == null) {
            return;
        }
        for (Class cls : f4328e) {
            if (cls.isInstance(obj)) {
                return;
            }
        }
        throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
    }

    /* renamed from: b */
    public <T> T m37005b(String str) {
        return (T) this.f4329a.get(str);
    }

    /* renamed from: c */
    public <T> C1436e0<T> m37004c(String str) {
        return m37002e(str, false, null);
    }

    /* renamed from: d */
    public <T> C1436e0<T> m37003d(String str, @SuppressLint({"UnknownNullness"}) T t) {
        return m37002e(str, true, t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public SavedStateRegistry.InterfaceC1660b m37001f() {
        return this.f4332d;
    }

    /* renamed from: g */
    public <T> void m37000g(String str, T t) {
        m36999h(t);
        C1461b<?> c1461b = this.f4331c.get(str);
        if (c1461b != null) {
            c1461b.mo166p(t);
        } else {
            this.f4329a.put(str, t);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SavedStateHandle.java */
    /* renamed from: androidx.lifecycle.l0$b */
    /* loaded from: classes.dex */
    public static class C1461b<T> extends C1436e0<T> {

        /* renamed from: l */
        private String f4334l;

        /* renamed from: m */
        private C1459l0 f4335m;

        C1461b(C1459l0 c1459l0, String str, T t) {
            super(t);
            this.f4334l = str;
            this.f4335m = c1459l0;
        }

        @Override // androidx.lifecycle.C1436e0, androidx.lifecycle.LiveData
        /* renamed from: p */
        public void mo166p(T t) {
            C1459l0 c1459l0 = this.f4335m;
            if (c1459l0 != null) {
                c1459l0.f4329a.put(this.f4334l, t);
            }
            super.mo166p(t);
        }

        C1461b(C1459l0 c1459l0, String str) {
            this.f4334l = str;
            this.f4335m = c1459l0;
        }
    }

    public C1459l0() {
        this.f4330b = new HashMap();
        this.f4331c = new HashMap();
        this.f4332d = new C1460a();
        this.f4329a = new HashMap();
    }
}
