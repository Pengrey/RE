package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC1382r;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
public final class C1331a extends AbstractC1382r implements FragmentManager.InterfaceC1326n {

    /* renamed from: q */
    final FragmentManager f3982q;

    /* renamed from: r */
    boolean f3983r;

    /* renamed from: s */
    int f3984s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1331a(FragmentManager fragmentManager) {
        super(fragmentManager.m37428s0(), fragmentManager.m37419v0() != null ? fragmentManager.m37419v0().m37274g().getClassLoader() : null);
        this.f3984s = -1;
        this.f3982q = fragmentManager;
    }

    /* renamed from: B */
    private static boolean m37376B(AbstractC1382r.C1383a c1383a) {
        Fragment fragment = c1383a.f4115b;
        return (fragment == null || !fragment.f3806H || fragment.f3826d0 == null || fragment.f3820W || fragment.f3819V || !fragment.m37562s0()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m37377A(ArrayList<C1331a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f4112a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f4112a.get(i4).f4115b;
            int i5 = fragment != null ? fragment.f3817T : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    C1331a c1331a = arrayList.get(i6);
                    int size2 = c1331a.f4112a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = c1331a.f4112a.get(i7).f4115b;
                        if ((fragment2 != null ? fragment2.f3817T : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m37375C() {
        for (int i = 0; i < this.f4112a.size(); i++) {
            if (m37376B(this.f4112a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public void m37374D() {
        if (this.f4111p != null) {
            for (int i = 0; i < this.f4111p.size(); i++) {
                this.f4111p.get(i).run();
            }
            this.f4111p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public void m37373E(Fragment.InterfaceC1310j interfaceC1310j) {
        for (int i = 0; i < this.f4112a.size(); i++) {
            AbstractC1382r.C1383a c1383a = this.f4112a.get(i);
            if (m37376B(c1383a)) {
                c1383a.f4115b.m37609W1(interfaceC1310j);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public Fragment m37372F(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f4112a.size() - 1; size >= 0; size--) {
            AbstractC1382r.C1383a c1383a = this.f4112a.get(size);
            int i = c1383a.f4114a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c1383a.f4115b;
                            break;
                        case 10:
                            c1383a.f4121h = c1383a.f4120g;
                            break;
                    }
                }
                arrayList.add(c1383a.f4115b);
            }
            arrayList.remove(c1383a.f4115b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC1326n
    /* renamed from: a */
    public boolean mo37371a(ArrayList<C1331a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m37520H0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f4103g) {
            this.f3982q.m37471e(this);
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC1382r
    /* renamed from: f */
    public int mo37184f() {
        return m37369s(false);
    }

    @Override // androidx.fragment.app.AbstractC1382r
    /* renamed from: g */
    public int mo37183g() {
        return m37369s(true);
    }

    @Override // androidx.fragment.app.AbstractC1382r
    /* renamed from: h */
    public void mo37182h() {
        m37180j();
        this.f3982q.m37476c0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC1382r
    /* renamed from: i */
    public void mo37181i() {
        m37180j();
        this.f3982q.m37476c0(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.AbstractC1382r
    /* renamed from: k */
    public void mo37179k(int i, Fragment fragment, String str, int i2) {
        super.mo37179k(i, fragment, str, i2);
        fragment.f3813O = this.f3982q;
    }

    @Override // androidx.fragment.app.AbstractC1382r
    /* renamed from: l */
    public boolean mo37178l() {
        return this.f4112a.isEmpty();
    }

    @Override // androidx.fragment.app.AbstractC1382r
    /* renamed from: m */
    public AbstractC1382r mo37177m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f3813O;
        if (fragmentManager != null && fragmentManager != this.f3982q) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
        }
        return super.mo37177m(fragment);
    }

    @Override // androidx.fragment.app.AbstractC1382r
    /* renamed from: p */
    public AbstractC1382r mo37174p(Fragment fragment, AbstractC1469p.EnumC1472c enumC1472c) {
        if (fragment.f3813O == this.f3982q) {
            if (enumC1472c == AbstractC1469p.EnumC1472c.INITIALIZED && fragment.f3846w > -1) {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC1472c + " after the Fragment has been created");
            } else if (enumC1472c != AbstractC1469p.EnumC1472c.DESTROYED) {
                return super.mo37174p(fragment, enumC1472c);
            } else {
                throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC1472c + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            }
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f3982q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m37370r(int i) {
        AbstractC1382r.C1383a c1383a;
        if (this.f4103g) {
            if (FragmentManager.m37520H0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f4112a.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = this.f4112a.get(i2).f4115b;
                if (fragment != null) {
                    fragment.f3812N += i;
                    if (FragmentManager.m37520H0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c1383a.f4115b + " to " + c1383a.f4115b.f3812N);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    int m37369s(boolean z) {
        if (!this.f3983r) {
            if (FragmentManager.m37520H0(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C1405x("FragmentManager"));
                m37368t("  ", printWriter);
                printWriter.close();
            }
            this.f3983r = true;
            if (this.f4103g) {
                this.f3984s = this.f3982q.m37456j();
            } else {
                this.f3984s = -1;
            }
            this.f3982q.m37485Z(this, z);
            return this.f3984s;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: t */
    public void m37368t(String str, PrintWriter printWriter) {
        m37367u(str, printWriter, true);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3984s >= 0) {
            sb2.append(" #");
            sb2.append(this.f3984s);
        }
        if (this.f4104h != null) {
            sb2.append(" ");
            sb2.append(this.f4104h);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* renamed from: u */
    public void m37367u(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4104h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3984s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3983r);
            if (this.f4102f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4102f));
            }
            if (this.f4098b != 0 || this.f4099c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4098b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4099c));
            }
            if (this.f4100d != 0 || this.f4101e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4100d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4101e));
            }
            if (this.f4105i != 0 || this.f4106j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4105i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4106j);
            }
            if (this.f4107k != 0 || this.f4108l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4107k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4108l);
            }
        }
        if (this.f4112a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f4112a.size();
        for (int i = 0; i < size; i++) {
            AbstractC1382r.C1383a c1383a = this.f4112a.get(i);
            switch (c1383a.f4114a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c1383a.f4114a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c1383a.f4115b);
            if (z) {
                if (c1383a.f4116c != 0 || c1383a.f4117d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c1383a.f4116c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c1383a.f4117d));
                }
                if (c1383a.f4118e != 0 || c1383a.f4119f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c1383a.f4118e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c1383a.f4119f));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m37366v() {
        int size = this.f4112a.size();
        for (int i = 0; i < size; i++) {
            AbstractC1382r.C1383a c1383a = this.f4112a.get(i);
            Fragment fragment = c1383a.f4115b;
            if (fragment != null) {
                fragment.m37606X1(false);
                fragment.m37612V1(this.f4102f);
                fragment.m37600a2(this.f4109m, this.f4110n);
            }
            switch (c1383a.f4114a) {
                case 1:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37439o1(fragment, false);
                    this.f3982q.m37465g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c1383a.f4114a);
                case 3:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37466f1(fragment);
                    break;
                case 4:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37526E0(fragment);
                    break;
                case 5:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37439o1(fragment, false);
                    this.f3982q.m37427s1(fragment);
                    break;
                case 6:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37412y(fragment);
                    break;
                case 7:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37439o1(fragment, false);
                    this.f3982q.m37450l(fragment);
                    break;
                case 8:
                    this.f3982q.m37433q1(fragment);
                    break;
                case 9:
                    this.f3982q.m37433q1(null);
                    break;
                case 10:
                    this.f3982q.m37436p1(fragment, c1383a.f4121h);
                    break;
            }
            if (!this.f4113o && c1383a.f4114a != 1 && fragment != null && !FragmentManager.f3896P) {
                this.f3982q.m37502Q0(fragment);
            }
        }
        if (this.f4113o || FragmentManager.f3896P) {
            return;
        }
        FragmentManager fragmentManager = this.f3982q;
        fragmentManager.m37500R0(fragmentManager.f3930q, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m37365w(boolean z) {
        for (int size = this.f4112a.size() - 1; size >= 0; size--) {
            AbstractC1382r.C1383a c1383a = this.f4112a.get(size);
            Fragment fragment = c1383a.f4115b;
            if (fragment != null) {
                fragment.m37606X1(true);
                fragment.m37612V1(FragmentManager.m37451k1(this.f4102f));
                fragment.m37600a2(this.f4110n, this.f4109m);
            }
            switch (c1383a.f4114a) {
                case 1:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37439o1(fragment, true);
                    this.f3982q.m37466f1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c1383a.f4114a);
                case 3:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37465g(fragment);
                    break;
                case 4:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37427s1(fragment);
                    break;
                case 5:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37439o1(fragment, true);
                    this.f3982q.m37526E0(fragment);
                    break;
                case 6:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37450l(fragment);
                    break;
                case 7:
                    fragment.m37636N1(c1383a.f4116c, c1383a.f4117d, c1383a.f4118e, c1383a.f4119f);
                    this.f3982q.m37439o1(fragment, true);
                    this.f3982q.m37412y(fragment);
                    break;
                case 8:
                    this.f3982q.m37433q1(null);
                    break;
                case 9:
                    this.f3982q.m37433q1(fragment);
                    break;
                case 10:
                    this.f3982q.m37436p1(fragment, c1383a.f4120g);
                    break;
            }
            if (!this.f4113o && c1383a.f4114a != 3 && fragment != null && !FragmentManager.f3896P) {
                this.f3982q.m37502Q0(fragment);
            }
        }
        if (this.f4113o || !z || FragmentManager.f3896P) {
            return;
        }
        FragmentManager fragmentManager = this.f3982q;
        fragmentManager.m37500R0(fragmentManager.f3930q, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public Fragment m37364x(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f4112a.size()) {
            AbstractC1382r.C1383a c1383a = this.f4112a.get(i);
            int i2 = c1383a.f4114a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = c1383a.f4115b;
                    int i3 = fragment3.f3817T;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.f3817T == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f4112a.add(i, new AbstractC1382r.C1383a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                AbstractC1382r.C1383a c1383a2 = new AbstractC1382r.C1383a(3, fragment4);
                                c1383a2.f4116c = c1383a.f4116c;
                                c1383a2.f4118e = c1383a.f4118e;
                                c1383a2.f4117d = c1383a.f4117d;
                                c1383a2.f4119f = c1383a.f4119f;
                                this.f4112a.add(i, c1383a2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f4112a.remove(i);
                        i--;
                    } else {
                        c1383a.f4114a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(c1383a.f4115b);
                    Fragment fragment5 = c1383a.f4115b;
                    if (fragment5 == fragment2) {
                        this.f4112a.add(i, new AbstractC1382r.C1383a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f4112a.add(i, new AbstractC1382r.C1383a(9, fragment2));
                        i++;
                        fragment2 = c1383a.f4115b;
                    }
                }
                i++;
            }
            arrayList.add(c1383a.f4115b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: y */
    public String m37363y() {
        return this.f4104h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean m37362z(int i) {
        int size = this.f4112a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f4112a.get(i2).f4115b;
            int i3 = fragment != null ? fragment.f3817T : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }
}
