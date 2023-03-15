package p426wg;

import am.TakeAwayProductsViewModel;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import androidx.viewpager2.widget.ViewPager2;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

/* renamed from: wg.k4 */
/* loaded from: classes2.dex */
public class C11850k4 extends AbstractC11830j4 {

    /* renamed from: F */
    private static final ViewDataBinding.C1263i f30759F;

    /* renamed from: G */
    private static final SparseIntArray f30760G;

    /* renamed from: B */
    private final CoordinatorLayout f30761B;

    /* renamed from: C */
    private final TextView f30762C;

    /* renamed from: D */
    private final TextView f30763D;

    /* renamed from: E */
    private long f30764E;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(8);
        f30759F = c1263i;
        c1263i.m37795a(0, new String[]{"bottomsheet_for_take_away_checkout"}, new int[]{3}, new int[]{C2336R.layout.bottomsheet_for_take_away_checkout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30760G = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.header_AppBarLayout, 4);
        sparseIntArray.put(C2336R.C2338id.toolbar, 5);
        sparseIntArray.put(C2336R.C2338id.category_TabLayout, 6);
        sparseIntArray.put(C2336R.C2338id.meals_ViewPager2, 7);
    }

    public C11850k4(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 8, f30759F, f30760G));
    }

    /* renamed from: Q */
    private boolean m4089Q(AbstractC11760f6 abstractC11760f6, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30764E |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4088R(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30764E |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4087S(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30764E |= 2;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                return m4089Q((AbstractC11760f6) obj, i2);
            }
            return m4087S((LiveData) obj, i2);
        }
        return m4088R((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30666x.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4086T((TakeAwayProductsViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public void m4086T(TakeAwayProductsViewModel takeAwayProductsViewModel) {
        this.f30665A = takeAwayProductsViewModel;
        synchronized (this) {
            this.f30764E |= 8;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058 A[ADDED_TO_REGION] */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            r17 = this;
            r1 = r17
            monitor-enter(r17)
            long r2 = r1.f30764E     // Catch: java.lang.Throwable -> L96
            r4 = 0
            r1.f30764E = r4     // Catch: java.lang.Throwable -> L96
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L96
            am.r r0 = r1.f30665A
            r6 = 27
            long r6 = r6 & r2
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r7 = 26
            r9 = 25
            r11 = 24
            r13 = 0
            if (r6 == 0) goto L65
            long r14 = r2 & r9
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 == 0) goto L35
            if (r0 == 0) goto L27
            androidx.lifecycle.LiveData r6 = r0.m16440O0()
            goto L28
        L27:
            r6 = r13
        L28:
            r14 = 0
            r1.m37818O(r14, r6)
            if (r6 == 0) goto L35
            java.lang.Object r6 = r6.mo172f()
            java.lang.String r6 = (java.lang.String) r6
            goto L36
        L35:
            r6 = r13
        L36:
            long r14 = r2 & r7
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 == 0) goto L51
            if (r0 == 0) goto L43
            androidx.lifecycle.LiveData r14 = r0.m16439P0()
            goto L44
        L43:
            r14 = r13
        L44:
            r15 = 1
            r1.m37818O(r15, r14)
            if (r14 == 0) goto L51
            java.lang.Object r14 = r14.mo172f()
            java.lang.String r14 = (java.lang.String) r14
            goto L52
        L51:
            r14 = r13
        L52:
            long r15 = r2 & r11
            int r15 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r15 == 0) goto L63
            if (r0 == 0) goto L63
            android.view.View$OnClickListener r13 = r0.m16432W0()
            android.view.View$OnClickListener r15 = r0.m16430Y0()
            goto L68
        L63:
            r15 = r13
            goto L68
        L65:
            r6 = r13
            r14 = r6
            r15 = r14
        L68:
            long r11 = r11 & r2
            int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r11 == 0) goto L7c
            wg.f6 r11 = r1.f30666x
            r11.mo4266Q(r0)
            android.widget.TextView r0 = r1.f30762C
            r0.setOnClickListener(r13)
            android.widget.TextView r0 = r1.f30763D
            r0.setOnClickListener(r15)
        L7c:
            long r9 = r9 & r2
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L86
            android.widget.TextView r0 = r1.f30762C
            p246n2.C7629e.m17885g(r0, r6)
        L86:
            long r2 = r2 & r7
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L90
            android.widget.TextView r0 = r1.f30763D
            p246n2.C7629e.m17885g(r0, r14)
        L90:
            wg.f6 r0 = r1.f30666x
            androidx.databinding.ViewDataBinding.m37808m(r0)
            return
        L96:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L96
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11850k4.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30764E != 0) {
                return true;
            }
            return this.f30666x.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30764E = 16L;
        }
        this.f30666x.mo3579w();
        m37826E();
    }

    private C11850k4(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 3, (AbstractC11760f6) objArr[3], (TabLayout) objArr[6], (AppBarLayout) objArr[4], (ViewPager2) objArr[7], (Toolbar) objArr[5]);
        this.f30764E = -1L;
        m37821J(this.f30666x);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30761B = coordinatorLayout;
        coordinatorLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f30762C = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f30763D = textView2;
        textView2.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
