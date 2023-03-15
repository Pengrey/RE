package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC1468o0;
import androidx.lifecycle.C1479r0;
import androidx.lifecycle.C1486s0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public final class C1374m extends AbstractC1468o0 {

    /* renamed from: j */
    private static final C1479r0.InterfaceC1481b f4080j = new C1375a();

    /* renamed from: f */
    private final boolean f4084f;

    /* renamed from: c */
    private final HashMap<String, Fragment> f4081c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C1374m> f4082d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C1486s0> f4083e = new HashMap<>();

    /* renamed from: g */
    private boolean f4085g = false;

    /* renamed from: h */
    private boolean f4086h = false;

    /* renamed from: i */
    private boolean f4087i = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* renamed from: androidx.fragment.app.m$a */
    /* loaded from: classes.dex */
    class C1375a implements C1479r0.InterfaceC1481b {
        C1375a() {
        }

        @Override // androidx.lifecycle.C1479r0.InterfaceC1481b
        /* renamed from: a */
        public <T extends AbstractC1468o0> T mo36919a(Class<T> cls) {
            return new C1374m(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1374m(boolean z) {
        this.f4084f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public static C1374m m37244k(C1486s0 c1486s0) {
        return (C1374m) new C1479r0(c1486s0, f4080j).m36981a(C1374m.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractC1468o0
    /* renamed from: e */
    public void mo36928e() {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4085g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1374m.class != obj.getClass()) {
            return false;
        }
        C1374m c1374m = (C1374m) obj;
        return this.f4081c.equals(c1374m.f4081c) && this.f4082d.equals(c1374m.f4082d) && this.f4083e.equals(c1374m.f4083e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m37248g(Fragment fragment) {
        if (this.f4087i) {
            if (FragmentManager.m37520H0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f4081c.containsKey(fragment.f3847B)) {
        } else {
            this.f4081c.put(fragment.f3847B, fragment);
            if (FragmentManager.m37520H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m37247h(Fragment fragment) {
        if (FragmentManager.m37520H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C1374m c1374m = this.f4082d.get(fragment.f3847B);
        if (c1374m != null) {
            c1374m.mo36928e();
            this.f4082d.remove(fragment.f3847B);
        }
        C1486s0 c1486s0 = this.f4083e.get(fragment.f3847B);
        if (c1486s0 != null) {
            c1486s0.m36975a();
            this.f4083e.remove(fragment.f3847B);
        }
    }

    public int hashCode() {
        return (((this.f4081c.hashCode() * 31) + this.f4082d.hashCode()) * 31) + this.f4083e.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment m37246i(String str) {
        return this.f4081c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C1374m m37245j(Fragment fragment) {
        C1374m c1374m = this.f4082d.get(fragment.f3847B);
        if (c1374m == null) {
            C1374m c1374m2 = new C1374m(this.f4084f);
            this.f4082d.put(fragment.f3847B, c1374m2);
            return c1374m2;
        }
        return c1374m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Collection<Fragment> m37243l() {
        return new ArrayList(this.f4081c.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C1486s0 m37242m(Fragment fragment) {
        C1486s0 c1486s0 = this.f4083e.get(fragment.f3847B);
        if (c1486s0 == null) {
            C1486s0 c1486s02 = new C1486s0();
            this.f4083e.put(fragment.f3847B, c1486s02);
            return c1486s02;
        }
        return c1486s0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m37241n() {
        return this.f4085g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m37240o(Fragment fragment) {
        if (this.f4087i) {
            if (FragmentManager.m37520H0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f4081c.remove(fragment.f3847B) != null) && FragmentManager.m37520H0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m37239p(boolean z) {
        this.f4087i = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m37238q(Fragment fragment) {
        if (this.f4081c.containsKey(fragment.f3847B)) {
            if (this.f4084f) {
                return this.f4085g;
            }
            return !this.f4086h;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f4081c.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f4082d.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4083e.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
