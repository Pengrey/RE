package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.card.MaterialCardView;
import ki.PingoDoceBindingAdapters;

/* renamed from: wg.ob */
/* loaded from: classes2.dex */
public class C11935ob extends AbstractC11913nb {

    /* renamed from: B */
    private static final ViewDataBinding.C1263i f31148B = null;

    /* renamed from: C */
    private static final SparseIntArray f31149C;

    /* renamed from: A */
    private long f31150A;

    /* renamed from: y */
    private final FrameLayout f31151y;

    /* renamed from: z */
    private final ShimmerFrameLayout f31152z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31149C = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_card1, 2);
        sparseIntArray.put(C2336R.C2338id.const_card2, 3);
        sparseIntArray.put(C2336R.C2338id.const_card3, 4);
        sparseIntArray.put(C2336R.C2338id.const_card4, 5);
    }

    public C11935ob(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 6, f31148B, f31149C));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (110 == i) {
            mo3920Q(((Boolean) obj).booleanValue());
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11913nb
    /* renamed from: Q */
    public void mo3920Q(boolean z) {
        this.f31058x = z;
        synchronized (this) {
            this.f31150A |= 1;
        }
        m37781c(110);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        synchronized (this) {
            j = this.f31150A;
            this.f31150A = 0L;
        }
        boolean z = this.f31058x;
        if ((j & 3) != 0) {
            BindingAdapters.m41779l(this.f31151y, Boolean.valueOf(z), Boolean.TRUE);
            PingoDoceBindingAdapters.m20345b(this.f31152z, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31150A != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31150A = 2L;
        }
        m37826E();
    }

    private C11935ob(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (MaterialCardView) objArr[2], (MaterialCardView) objArr[3], (MaterialCardView) objArr[4], (MaterialCardView) objArr[5]);
        this.f31150A = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f31151y = frameLayout;
        frameLayout.setTag(null);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) objArr[1];
        this.f31152z = shimmerFrameLayout;
        shimmerFrameLayout.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
