package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public class C1381q {

    /* renamed from: a */
    private final ArrayList<Fragment> f4095a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C1378p> f4096b = new HashMap<>();

    /* renamed from: c */
    private C1374m f4097c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m37212a(Fragment fragment) {
        if (!this.f4095a.contains(fragment)) {
            synchronized (this.f4095a) {
                this.f4095a.add(fragment);
            }
            fragment.f3806H = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m37211b() {
        this.f4096b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m37210c(String str) {
        return this.f4096b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m37209d(int i) {
        for (C1378p c1378p : this.f4096b.values()) {
            if (c1378p != null) {
                c1378p.m37215u(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m37208e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4096b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1378p c1378p : this.f4096b.values()) {
                printWriter.print(str);
                if (c1378p != null) {
                    Fragment m37225k = c1378p.m37225k();
                    printWriter.println(m37225k);
                    m37225k.mo33454u(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4095a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f4095a.get(i).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment m37207f(String str) {
        C1378p c1378p = this.f4096b.get(str);
        if (c1378p != null) {
            return c1378p.m37225k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment m37206g(int i) {
        for (int size = this.f4095a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f4095a.get(size);
            if (fragment != null && fragment.f3816S == i) {
                return fragment;
            }
        }
        for (C1378p c1378p : this.f4096b.values()) {
            if (c1378p != null) {
                Fragment m37225k = c1378p.m37225k();
                if (m37225k.f3816S == i) {
                    return m37225k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment m37205h(String str) {
        if (str != null) {
            for (int size = this.f4095a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f4095a.get(size);
                if (fragment != null && str.equals(fragment.f3818U)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C1378p c1378p : this.f4096b.values()) {
                if (c1378p != null) {
                    Fragment m37225k = c1378p.m37225k();
                    if (str.equals(m37225k.f3818U)) {
                        return m37225k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment m37204i(String str) {
        Fragment m37553w;
        for (C1378p c1378p : this.f4096b.values()) {
            if (c1378p != null && (m37553w = c1378p.m37225k().m37553w(str)) != null) {
                return m37553w;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m37203j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f3825c0;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4095a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f4095a.get(i);
            if (fragment2.f3825c0 == viewGroup && (view2 = fragment2.f3826d0) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4095a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f4095a.get(indexOf);
            if (fragment3.f3825c0 == viewGroup && (view = fragment3.f3826d0) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public List<C1378p> m37202k() {
        ArrayList arrayList = new ArrayList();
        for (C1378p c1378p : this.f4096b.values()) {
            if (c1378p != null) {
                arrayList.add(c1378p);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Fragment> m37201l() {
        ArrayList arrayList = new ArrayList();
        for (C1378p c1378p : this.f4096b.values()) {
            if (c1378p != null) {
                arrayList.add(c1378p.m37225k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C1378p m37200m(String str) {
        return this.f4096b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public List<Fragment> m37199n() {
        ArrayList arrayList;
        if (this.f4095a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4095a) {
            arrayList = new ArrayList(this.f4095a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C1374m m37198o() {
        return this.f4097c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m37197p(C1378p c1378p) {
        Fragment m37225k = c1378p.m37225k();
        if (m37210c(m37225k.f3847B)) {
            return;
        }
        this.f4096b.put(m37225k.f3847B, c1378p);
        if (m37225k.f3822Y) {
            if (m37225k.f3821X) {
                this.f4097c.m37248g(m37225k);
            } else {
                this.f4097c.m37240o(m37225k);
            }
            m37225k.f3822Y = false;
        }
        if (FragmentManager.m37520H0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + m37225k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m37196q(C1378p c1378p) {
        Fragment m37225k = c1378p.m37225k();
        if (m37225k.f3821X) {
            this.f4097c.m37240o(m37225k);
        }
        if (this.f4096b.put(m37225k.f3847B, null) != null && FragmentManager.m37520H0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + m37225k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m37195r() {
        Iterator<Fragment> it = this.f4095a.iterator();
        while (it.hasNext()) {
            C1378p c1378p = this.f4096b.get(it.next().f3847B);
            if (c1378p != null) {
                c1378p.m37223m();
            }
        }
        for (C1378p c1378p2 : this.f4096b.values()) {
            if (c1378p2 != null) {
                c1378p2.m37223m();
                Fragment m37225k = c1378p2.m37225k();
                if (m37225k.f3807I && !m37225k.m37567q0()) {
                    m37196q(c1378p2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m37194s(Fragment fragment) {
        synchronized (this.f4095a) {
            this.f4095a.remove(fragment);
        }
        fragment.f3806H = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m37193t() {
        this.f4096b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m37192u(List<String> list) {
        this.f4095a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment m37207f = m37207f(str);
                if (m37207f != null) {
                    if (FragmentManager.m37520H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m37207f);
                    }
                    m37212a(m37207f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public ArrayList<FragmentState> m37191v() {
        ArrayList<FragmentState> arrayList = new ArrayList<>(this.f4096b.size());
        for (C1378p c1378p : this.f4096b.values()) {
            if (c1378p != null) {
                Fragment m37225k = c1378p.m37225k();
                FragmentState m37217s = c1378p.m37217s();
                arrayList.add(m37217s);
                if (FragmentManager.m37520H0(2)) {
                    Log.v("FragmentManager", "Saved state of " + m37225k + ": " + m37217s.f3977I);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public ArrayList<String> m37190w() {
        synchronized (this.f4095a) {
            if (this.f4095a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f4095a.size());
            Iterator<Fragment> it = this.f4095a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f3847B);
                if (FragmentManager.m37520H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f3847B + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m37189x(C1374m c1374m) {
        this.f4097c = c1374m;
    }
}
