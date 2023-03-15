package p039c3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.C1112b0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p301q.C9545a;
import p301q.C9556e;

/* renamed from: c3.m */
/* loaded from: classes.dex */
public abstract class AbstractC2037m implements Cloneable {

    /* renamed from: c0 */
    private static final int[] f5899c0 = {2, 1, 3, 4};

    /* renamed from: d0 */
    private static final AbstractC2022g f5900d0 = new C2038a();

    /* renamed from: e0 */
    private static ThreadLocal<C9545a<Animator, C2041d>> f5901e0 = new ThreadLocal<>();

    /* renamed from: P */
    private ArrayList<C2054s> f5917P;

    /* renamed from: Q */
    private ArrayList<C2054s> f5918Q;

    /* renamed from: Y */
    AbstractC2049p f5926Y;

    /* renamed from: Z */
    private AbstractC2042e f5927Z;

    /* renamed from: a0 */
    private C9545a<String, String> f5928a0;

    /* renamed from: w */
    private String f5930w = getClass().getName();

    /* renamed from: x */
    private long f5931x = -1;

    /* renamed from: y */
    long f5932y = -1;

    /* renamed from: z */
    private TimeInterpolator f5933z = null;

    /* renamed from: A */
    ArrayList<Integer> f5902A = new ArrayList<>();

    /* renamed from: B */
    ArrayList<View> f5903B = new ArrayList<>();

    /* renamed from: C */
    private ArrayList<String> f5904C = null;

    /* renamed from: D */
    private ArrayList<Class<?>> f5905D = null;

    /* renamed from: E */
    private ArrayList<Integer> f5906E = null;

    /* renamed from: F */
    private ArrayList<View> f5907F = null;

    /* renamed from: G */
    private ArrayList<Class<?>> f5908G = null;

    /* renamed from: H */
    private ArrayList<String> f5909H = null;

    /* renamed from: I */
    private ArrayList<Integer> f5910I = null;

    /* renamed from: J */
    private ArrayList<View> f5911J = null;

    /* renamed from: K */
    private ArrayList<Class<?>> f5912K = null;

    /* renamed from: L */
    private C2055t f5913L = new C2055t();

    /* renamed from: M */
    private C2055t f5914M = new C2055t();

    /* renamed from: N */
    C2050q f5915N = null;

    /* renamed from: O */
    private int[] f5916O = f5899c0;

    /* renamed from: R */
    boolean f5919R = false;

    /* renamed from: S */
    ArrayList<Animator> f5920S = new ArrayList<>();

    /* renamed from: T */
    private int f5921T = 0;

    /* renamed from: U */
    private boolean f5922U = false;

    /* renamed from: V */
    private boolean f5923V = false;

    /* renamed from: W */
    private ArrayList<InterfaceC2043f> f5924W = null;

    /* renamed from: X */
    private ArrayList<Animator> f5925X = new ArrayList<>();

    /* renamed from: b0 */
    private AbstractC2022g f5929b0 = f5900d0;

    /* compiled from: Transition.java */
    /* renamed from: c3.m$a */
    /* loaded from: classes.dex */
    static class C2038a extends AbstractC2022g {
        C2038a() {
        }

        @Override // p039c3.AbstractC2022g
        /* renamed from: a */
        public Path mo34857a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* renamed from: c3.m$b */
    /* loaded from: classes.dex */
    public class C2039b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C9545a f5934a;

        C2039b(C9545a c9545a) {
            this.f5934a = c9545a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5934a.remove(animator);
            AbstractC2037m.this.f5920S.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC2037m.this.f5920S.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Transition.java */
    /* renamed from: c3.m$c */
    /* loaded from: classes.dex */
    public class C2040c extends AnimatorListenerAdapter {
        C2040c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC2037m.this.m34865p();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Transition.java */
    /* renamed from: c3.m$d */
    /* loaded from: classes.dex */
    public static class C2041d {

        /* renamed from: a */
        View f5937a;

        /* renamed from: b */
        String f5938b;

        /* renamed from: c */
        C2054s f5939c;

        /* renamed from: d */
        InterfaceC2044m0 f5940d;

        /* renamed from: e */
        AbstractC2037m f5941e;

        C2041d(View view, String str, AbstractC2037m abstractC2037m, InterfaceC2044m0 interfaceC2044m0, C2054s c2054s) {
            this.f5937a = view;
            this.f5938b = str;
            this.f5939c = c2054s;
            this.f5940d = interfaceC2044m0;
            this.f5941e = abstractC2037m;
        }
    }

    /* compiled from: Transition.java */
    /* renamed from: c3.m$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2042e {
    }

    /* compiled from: Transition.java */
    /* renamed from: c3.m$f */
    /* loaded from: classes.dex */
    public interface InterfaceC2043f {
        /* renamed from: a */
        void mo34856a(AbstractC2037m abstractC2037m);

        /* renamed from: b */
        void mo34855b(AbstractC2037m abstractC2037m);

        /* renamed from: c */
        void mo34817c(AbstractC2037m abstractC2037m);

        /* renamed from: d */
        void mo34854d(AbstractC2037m abstractC2037m);

        /* renamed from: e */
        void mo34816e(AbstractC2037m abstractC2037m);
    }

    /* renamed from: A */
    private static C9545a<Animator, C2041d> m34890A() {
        C9545a<Animator, C2041d> c9545a = f5901e0.get();
        if (c9545a == null) {
            C9545a<Animator, C2041d> c9545a2 = new C9545a<>();
            f5901e0.set(c9545a2);
            return c9545a2;
        }
        return c9545a;
    }

    /* renamed from: L */
    private static boolean m34880L(C2054s c2054s, C2054s c2054s2, String str) {
        Object obj = c2054s.f5959a.get(str);
        Object obj2 = c2054s2.f5959a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: M */
    private void m34879M(C9545a<View, C2054s> c9545a, C9545a<View, C2054s> c9545a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && m34881K(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && m34881K(view)) {
                C2054s c2054s = c9545a.get(valueAt);
                C2054s c2054s2 = c9545a2.get(view);
                if (c2054s != null && c2054s2 != null) {
                    this.f5917P.add(c2054s);
                    this.f5918Q.add(c2054s2);
                    c9545a.remove(valueAt);
                    c9545a2.remove(view);
                }
            }
        }
    }

    /* renamed from: N */
    private void m34878N(C9545a<View, C2054s> c9545a, C9545a<View, C2054s> c9545a2) {
        C2054s remove;
        for (int size = c9545a.size() - 1; size >= 0; size--) {
            View m10614m = c9545a.m10614m(size);
            if (m10614m != null && m34881K(m10614m) && (remove = c9545a2.remove(m10614m)) != null && m34881K(remove.f5960b)) {
                this.f5917P.add(c9545a.m10612o(size));
                this.f5918Q.add(remove);
            }
        }
    }

    /* renamed from: O */
    private void m34877O(C9545a<View, C2054s> c9545a, C9545a<View, C2054s> c9545a2, C9556e<View> c9556e, C9556e<View> c9556e2) {
        View m10644f;
        int m10636o = c9556e.m10636o();
        for (int i = 0; i < m10636o; i++) {
            View m10635p = c9556e.m10635p(i);
            if (m10635p != null && m34881K(m10635p) && (m10644f = c9556e2.m10644f(c9556e.m10640k(i))) != null && m34881K(m10644f)) {
                C2054s c2054s = c9545a.get(m10635p);
                C2054s c2054s2 = c9545a2.get(m10644f);
                if (c2054s != null && c2054s2 != null) {
                    this.f5917P.add(c2054s);
                    this.f5918Q.add(c2054s2);
                    c9545a.remove(m10635p);
                    c9545a2.remove(m10644f);
                }
            }
        }
    }

    /* renamed from: P */
    private void m34876P(C9545a<View, C2054s> c9545a, C9545a<View, C2054s> c9545a2, C9545a<String, View> c9545a3, C9545a<String, View> c9545a4) {
        View view;
        int size = c9545a3.size();
        for (int i = 0; i < size; i++) {
            View m10610q = c9545a3.m10610q(i);
            if (m10610q != null && m34881K(m10610q) && (view = c9545a4.get(c9545a3.m10614m(i))) != null && m34881K(view)) {
                C2054s c2054s = c9545a.get(m10610q);
                C2054s c2054s2 = c9545a2.get(view);
                if (c2054s != null && c2054s2 != null) {
                    this.f5917P.add(c2054s);
                    this.f5918Q.add(c2054s2);
                    c9545a.remove(m10610q);
                    c9545a2.remove(view);
                }
            }
        }
    }

    /* renamed from: Q */
    private void m34875Q(C2055t c2055t, C2055t c2055t2) {
        C9545a<View, C2054s> c9545a = new C9545a<>(c2055t.f5962a);
        C9545a<View, C2054s> c9545a2 = new C9545a<>(c2055t2.f5962a);
        int i = 0;
        while (true) {
            int[] iArr = this.f5916O;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m34878N(c9545a, c9545a2);
                } else if (i2 == 2) {
                    m34876P(c9545a, c9545a2, c2055t.f5965d, c2055t2.f5965d);
                } else if (i2 == 3) {
                    m34879M(c9545a, c9545a2, c2055t.f5963b, c2055t2.f5963b);
                } else if (i2 == 4) {
                    m34877O(c9545a, c9545a2, c2055t.f5964c, c2055t2.f5964c);
                }
                i++;
            } else {
                m34872c(c9545a, c9545a2);
                return;
            }
        }
    }

    /* renamed from: W */
    private void m34873W(Animator animator, C9545a<Animator, C2041d> c9545a) {
        if (animator != null) {
            animator.addListener(new C2039b(c9545a));
            m34870e(animator);
        }
    }

    /* renamed from: c */
    private void m34872c(C9545a<View, C2054s> c9545a, C9545a<View, C2054s> c9545a2) {
        for (int i = 0; i < c9545a.size(); i++) {
            C2054s m10610q = c9545a.m10610q(i);
            if (m34881K(m10610q.f5960b)) {
                this.f5917P.add(m10610q);
                this.f5918Q.add(null);
            }
        }
        for (int i2 = 0; i2 < c9545a2.size(); i2++) {
            C2054s m10610q2 = c9545a2.m10610q(i2);
            if (m34881K(m10610q2.f5960b)) {
                this.f5918Q.add(m10610q2);
                this.f5917P.add(null);
            }
        }
    }

    /* renamed from: d */
    private static void m34871d(C2055t c2055t, View view, C2054s c2054s) {
        c2055t.f5962a.put(view, c2054s);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (c2055t.f5963b.indexOfKey(id2) >= 0) {
                c2055t.f5963b.put(id2, null);
            } else {
                c2055t.f5963b.put(id2, view);
            }
        }
        String m38458N = C1112b0.m38458N(view);
        if (m38458N != null) {
            if (c2055t.f5965d.containsKey(m38458N)) {
                c2055t.f5965d.put(m38458N, null);
            } else {
                c2055t.f5965d.put(m38458N, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c2055t.f5964c.m10642i(itemIdAtPosition) >= 0) {
                    View m10644f = c2055t.f5964c.m10644f(itemIdAtPosition);
                    if (m10644f != null) {
                        C1112b0.m38481B0(m10644f, false);
                        c2055t.f5964c.m10639l(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C1112b0.m38481B0(view, true);
                c2055t.f5964c.m10639l(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: g */
    private void m34868g(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f5906E;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList2 = this.f5907F;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.f5908G;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f5908G.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C2054s c2054s = new C2054s(view);
                    if (z) {
                        mo29509j(c2054s);
                    } else {
                        mo29511f(c2054s);
                    }
                    c2054s.f5961c.add(this);
                    mo34831i(c2054s);
                    if (z) {
                        m34871d(this.f5913L, view, c2054s);
                    } else {
                        m34871d(this.f5914M, view, c2054s);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.f5910I;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id2))) {
                        ArrayList<View> arrayList5 = this.f5911J;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.f5912K;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.f5912K.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m34868g(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: B */
    public long m34889B() {
        return this.f5931x;
    }

    /* renamed from: C */
    public List<Integer> m34888C() {
        return this.f5902A;
    }

    /* renamed from: D */
    public List<String> m34887D() {
        return this.f5904C;
    }

    /* renamed from: F */
    public List<Class<?>> m34886F() {
        return this.f5905D;
    }

    /* renamed from: G */
    public List<View> m34885G() {
        return this.f5903B;
    }

    /* renamed from: H */
    public String[] mo34884H() {
        return null;
    }

    /* renamed from: I */
    public C2054s m34883I(View view, boolean z) {
        C2050q c2050q = this.f5915N;
        if (c2050q != null) {
            return c2050q.m34883I(view, z);
        }
        return (z ? this.f5913L : this.f5914M).f5962a.get(view);
    }

    /* renamed from: J */
    public boolean mo34882J(C2054s c2054s, C2054s c2054s2) {
        if (c2054s == null || c2054s2 == null) {
            return false;
        }
        String[] mo34884H = mo34884H();
        if (mo34884H != null) {
            for (String str : mo34884H) {
                if (!m34880L(c2054s, c2054s2, str)) {
                }
            }
            return false;
        }
        for (String str2 : c2054s.f5959a.keySet()) {
            if (m34880L(c2054s, c2054s2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean m34881K(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f5906E;
        if (arrayList3 == null || !arrayList3.contains(Integer.valueOf(id2))) {
            ArrayList<View> arrayList4 = this.f5907F;
            if (arrayList4 == null || !arrayList4.contains(view)) {
                ArrayList<Class<?>> arrayList5 = this.f5908G;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f5908G.get(i).isInstance(view)) {
                            return false;
                        }
                    }
                }
                if (this.f5909H == null || C1112b0.m38458N(view) == null || !this.f5909H.contains(C1112b0.m38458N(view))) {
                    if ((this.f5902A.size() == 0 && this.f5903B.size() == 0 && (((arrayList = this.f5905D) == null || arrayList.isEmpty()) && ((arrayList2 = this.f5904C) == null || arrayList2.isEmpty()))) || this.f5902A.contains(Integer.valueOf(id2)) || this.f5903B.contains(view)) {
                        return true;
                    }
                    ArrayList<String> arrayList6 = this.f5904C;
                    if (arrayList6 == null || !arrayList6.contains(C1112b0.m38458N(view))) {
                        if (this.f5905D != null) {
                            for (int i2 = 0; i2 < this.f5905D.size(); i2++) {
                                if (this.f5905D.get(i2).isInstance(view)) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* renamed from: R */
    public void mo34847R(View view) {
        if (this.f5923V) {
            return;
        }
        C9545a<Animator, C2041d> m34890A = m34890A();
        int size = m34890A.size();
        InterfaceC2044m0 m34946d = C2007c0.m34946d(view);
        for (int i = size - 1; i >= 0; i--) {
            C2041d m10610q = m34890A.m10610q(i);
            if (m10610q.f5937a != null && m34946d.equals(m10610q.f5940d)) {
                C1990a.m34969b(m34890A.m10614m(i));
            }
        }
        ArrayList<InterfaceC2043f> arrayList = this.f5924W;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f5924W.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC2043f) arrayList2.get(i2)).mo34856a(this);
            }
        }
        this.f5922U = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: S */
    public void m34874S(ViewGroup viewGroup) {
        C2041d c2041d;
        this.f5917P = new ArrayList<>();
        this.f5918Q = new ArrayList<>();
        m34875Q(this.f5913L, this.f5914M);
        C9545a<Animator, C2041d> m34890A = m34890A();
        int size = m34890A.size();
        InterfaceC2044m0 m34946d = C2007c0.m34946d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator m10614m = m34890A.m10614m(i);
            if (m10614m != null && (c2041d = m34890A.get(m10614m)) != null && c2041d.f5937a != null && m34946d.equals(c2041d.f5940d)) {
                C2054s c2054s = c2041d.f5939c;
                View view = c2041d.f5937a;
                C2054s m34883I = m34883I(view, true);
                C2054s m34861u = m34861u(view, true);
                if (m34883I == null && m34861u == null) {
                    m34861u = this.f5914M.f5962a.get(view);
                }
                if (!(m34883I == null && m34861u == null) && c2041d.f5941e.mo34882J(c2054s, m34861u)) {
                    if (!m10614m.isRunning() && !m10614m.isStarted()) {
                        m34890A.remove(m10614m);
                    } else {
                        m10614m.cancel();
                    }
                }
            }
        }
        mo34823o(viewGroup, this.f5913L, this.f5914M, this.f5917P, this.f5918Q);
        mo34843X();
    }

    /* renamed from: T */
    public AbstractC2037m mo34846T(InterfaceC2043f interfaceC2043f) {
        ArrayList<InterfaceC2043f> arrayList = this.f5924W;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC2043f);
        if (this.f5924W.size() == 0) {
            this.f5924W = null;
        }
        return this;
    }

    /* renamed from: U */
    public AbstractC2037m mo34845U(View view) {
        this.f5903B.remove(view);
        return this;
    }

    /* renamed from: V */
    public void mo34844V(View view) {
        if (this.f5922U) {
            if (!this.f5923V) {
                C9545a<Animator, C2041d> m34890A = m34890A();
                int size = m34890A.size();
                InterfaceC2044m0 m34946d = C2007c0.m34946d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C2041d m10610q = m34890A.m10610q(i);
                    if (m10610q.f5937a != null && m34946d.equals(m10610q.f5940d)) {
                        C1990a.m34968c(m34890A.m10614m(i));
                    }
                }
                ArrayList<InterfaceC2043f> arrayList = this.f5924W;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f5924W.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC2043f) arrayList2.get(i2)).mo34854d(this);
                    }
                }
            }
            this.f5922U = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public void mo34843X() {
        m34869e0();
        C9545a<Animator, C2041d> m34890A = m34890A();
        Iterator<Animator> it = this.f5925X.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m34890A.containsKey(next)) {
                m34869e0();
                m34873W(next, m34890A);
            }
        }
        this.f5925X.clear();
        m34865p();
    }

    /* renamed from: Y */
    public AbstractC2037m mo34842Y(long j) {
        this.f5932y = j;
        return this;
    }

    /* renamed from: Z */
    public void mo34841Z(AbstractC2042e abstractC2042e) {
        this.f5927Z = abstractC2042e;
    }

    /* renamed from: a */
    public AbstractC2037m mo34840a(InterfaceC2043f interfaceC2043f) {
        if (this.f5924W == null) {
            this.f5924W = new ArrayList<>();
        }
        this.f5924W.add(interfaceC2043f);
        return this;
    }

    /* renamed from: a0 */
    public AbstractC2037m mo34839a0(TimeInterpolator timeInterpolator) {
        this.f5933z = timeInterpolator;
        return this;
    }

    /* renamed from: b */
    public AbstractC2037m mo34838b(View view) {
        this.f5903B.add(view);
        return this;
    }

    /* renamed from: b0 */
    public void mo34837b0(AbstractC2022g abstractC2022g) {
        if (abstractC2022g == null) {
            this.f5929b0 = f5900d0;
        } else {
            this.f5929b0 = abstractC2022g;
        }
    }

    /* renamed from: c0 */
    public void mo34836c0(AbstractC2049p abstractC2049p) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f5920S.size() - 1; size >= 0; size--) {
            this.f5920S.get(size).cancel();
        }
        ArrayList<InterfaceC2043f> arrayList = this.f5924W;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f5924W.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((InterfaceC2043f) arrayList2.get(i)).mo34855b(this);
        }
    }

    /* renamed from: d0 */
    public AbstractC2037m mo34835d0(long j) {
        this.f5931x = j;
        return this;
    }

    /* renamed from: e */
    protected void m34870e(Animator animator) {
        if (animator == null) {
            m34865p();
            return;
        }
        if (m34864q() >= 0) {
            animator.setDuration(m34864q());
        }
        if (m34889B() >= 0) {
            animator.setStartDelay(m34889B() + animator.getStartDelay());
        }
        if (m34862s() != null) {
            animator.setInterpolator(m34862s());
        }
        animator.addListener(new C2040c());
        animator.start();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e0 */
    public void m34869e0() {
        if (this.f5921T == 0) {
            ArrayList<InterfaceC2043f> arrayList = this.f5924W;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5924W.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC2043f) arrayList2.get(i)).mo34817c(this);
                }
            }
            this.f5923V = false;
        }
        this.f5921T++;
    }

    /* renamed from: f */
    public abstract void mo29511f(C2054s c2054s);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public String mo34834f0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f5932y != -1) {
            str2 = str2 + "dur(" + this.f5932y + ") ";
        }
        if (this.f5931x != -1) {
            str2 = str2 + "dly(" + this.f5931x + ") ";
        }
        if (this.f5933z != null) {
            str2 = str2 + "interp(" + this.f5933z + ") ";
        }
        if (this.f5902A.size() > 0 || this.f5903B.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f5902A.size() > 0) {
                for (int i = 0; i < this.f5902A.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f5902A.get(i);
                }
            }
            if (this.f5903B.size() > 0) {
                for (int i2 = 0; i2 < this.f5903B.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f5903B.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo34831i(C2054s c2054s) {
    }

    /* renamed from: j */
    public abstract void mo29509j(C2054s c2054s);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m34867k(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C9545a<String, String> c9545a;
        m34866l(z);
        if ((this.f5902A.size() <= 0 && this.f5903B.size() <= 0) || (((arrayList = this.f5904C) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f5905D) != null && !arrayList2.isEmpty()))) {
            m34868g(viewGroup, z);
        } else {
            for (int i = 0; i < this.f5902A.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f5902A.get(i).intValue());
                if (findViewById != null) {
                    C2054s c2054s = new C2054s(findViewById);
                    if (z) {
                        mo29509j(c2054s);
                    } else {
                        mo29511f(c2054s);
                    }
                    c2054s.f5961c.add(this);
                    mo34831i(c2054s);
                    if (z) {
                        m34871d(this.f5913L, findViewById, c2054s);
                    } else {
                        m34871d(this.f5914M, findViewById, c2054s);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f5903B.size(); i2++) {
                View view = this.f5903B.get(i2);
                C2054s c2054s2 = new C2054s(view);
                if (z) {
                    mo29509j(c2054s2);
                } else {
                    mo29511f(c2054s2);
                }
                c2054s2.f5961c.add(this);
                mo34831i(c2054s2);
                if (z) {
                    m34871d(this.f5913L, view, c2054s2);
                } else {
                    m34871d(this.f5914M, view, c2054s2);
                }
            }
        }
        if (z || (c9545a = this.f5928a0) == null) {
            return;
        }
        int size = c9545a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.f5913L.f5965d.remove(this.f5928a0.m10614m(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.f5913L.f5965d.put(this.f5928a0.m10610q(i4), view2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m34866l(boolean z) {
        if (z) {
            this.f5913L.f5962a.clear();
            this.f5913L.f5963b.clear();
            this.f5913L.f5964c.m10648b();
            return;
        }
        this.f5914M.f5962a.clear();
        this.f5914M.f5963b.clear();
        this.f5914M.f5964c.m10648b();
    }

    @Override // 
    /* renamed from: m */
    public AbstractC2037m clone() {
        try {
            AbstractC2037m abstractC2037m = (AbstractC2037m) super.clone();
            abstractC2037m.f5925X = new ArrayList<>();
            abstractC2037m.f5913L = new C2055t();
            abstractC2037m.f5914M = new C2055t();
            abstractC2037m.f5917P = null;
            abstractC2037m.f5918Q = null;
            return abstractC2037m;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: n */
    public Animator mo29508n(ViewGroup viewGroup, C2054s c2054s, C2054s c2054s2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public void mo34823o(ViewGroup viewGroup, C2055t c2055t, C2055t c2055t2, ArrayList<C2054s> arrayList, ArrayList<C2054s> arrayList2) {
        int i;
        View view;
        Animator animator;
        C2054s c2054s;
        Animator animator2;
        C2054s c2054s2;
        C9545a<Animator, C2041d> m34890A = m34890A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C2054s c2054s3 = arrayList.get(i2);
            C2054s c2054s4 = arrayList2.get(i2);
            if (c2054s3 != null && !c2054s3.f5961c.contains(this)) {
                c2054s3 = null;
            }
            if (c2054s4 != null && !c2054s4.f5961c.contains(this)) {
                c2054s4 = null;
            }
            if (c2054s3 != null || c2054s4 != null) {
                if (c2054s3 == null || c2054s4 == null || mo34882J(c2054s3, c2054s4)) {
                    Animator mo29508n = mo29508n(viewGroup, c2054s3, c2054s4);
                    if (mo29508n != null) {
                        if (c2054s4 != null) {
                            View view2 = c2054s4.f5960b;
                            String[] mo34884H = mo34884H();
                            if (mo34884H != null && mo34884H.length > 0) {
                                c2054s2 = new C2054s(view2);
                                C2054s c2054s5 = c2055t2.f5962a.get(view2);
                                if (c2054s5 != null) {
                                    int i3 = 0;
                                    while (i3 < mo34884H.length) {
                                        c2054s2.f5959a.put(mo34884H[i3], c2054s5.f5959a.get(mo34884H[i3]));
                                        i3++;
                                        mo29508n = mo29508n;
                                        size = size;
                                        c2054s5 = c2054s5;
                                    }
                                }
                                Animator animator3 = mo29508n;
                                i = size;
                                int size2 = m34890A.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C2041d c2041d = m34890A.get(m34890A.m10614m(i4));
                                    if (c2041d.f5939c != null && c2041d.f5937a == view2 && c2041d.f5938b.equals(m34860w()) && c2041d.f5939c.equals(c2054s2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                i = size;
                                animator2 = mo29508n;
                                c2054s2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            c2054s = c2054s2;
                        } else {
                            i = size;
                            view = c2054s3.f5960b;
                            animator = mo29508n;
                            c2054s = null;
                        }
                        if (animator != null) {
                            m34890A.put(animator, new C2041d(view, m34860w(), this, C2007c0.m34946d(viewGroup), c2054s));
                            this.f5925X.add(animator);
                        }
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator4 = this.f5925X.get(sparseIntArray.keyAt(i5));
                animator4.setStartDelay((sparseIntArray.valueAt(i5) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public void m34865p() {
        int i = this.f5921T - 1;
        this.f5921T = i;
        if (i == 0) {
            ArrayList<InterfaceC2043f> arrayList = this.f5924W;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5924W.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC2043f) arrayList2.get(i2)).mo34816e(this);
                }
            }
            for (int i3 = 0; i3 < this.f5913L.f5964c.m10636o(); i3++) {
                View m10635p = this.f5913L.f5964c.m10635p(i3);
                if (m10635p != null) {
                    C1112b0.m38481B0(m10635p, false);
                }
            }
            for (int i4 = 0; i4 < this.f5914M.f5964c.m10636o(); i4++) {
                View m10635p2 = this.f5914M.f5964c.m10635p(i4);
                if (m10635p2 != null) {
                    C1112b0.m38481B0(m10635p2, false);
                }
            }
            this.f5923V = true;
        }
    }

    /* renamed from: q */
    public long m34864q() {
        return this.f5932y;
    }

    /* renamed from: r */
    public AbstractC2042e m34863r() {
        return this.f5927Z;
    }

    /* renamed from: s */
    public TimeInterpolator m34862s() {
        return this.f5933z;
    }

    public String toString() {
        return mo34834f0(BuildConfig.VERSION_NAME);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public C2054s m34861u(View view, boolean z) {
        C2050q c2050q = this.f5915N;
        if (c2050q != null) {
            return c2050q.m34861u(view, z);
        }
        ArrayList<C2054s> arrayList = z ? this.f5917P : this.f5918Q;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C2054s c2054s = arrayList.get(i2);
            if (c2054s == null) {
                return null;
            }
            if (c2054s.f5960b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.f5918Q : this.f5917P).get(i);
        }
        return null;
    }

    /* renamed from: w */
    public String m34860w() {
        return this.f5930w;
    }

    /* renamed from: x */
    public AbstractC2022g m34859x() {
        return this.f5929b0;
    }

    /* renamed from: z */
    public AbstractC2049p m34858z() {
        return this.f5926Y;
    }
}
