package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.QuantityPickerView;
import com.google.android.material.card.MaterialCardView;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;
import pt.pingodoce.app.data.local.models.products.Promotion;

/* renamed from: wg.id */
/* loaded from: classes2.dex */
public class C11822id extends AbstractC11804hd {

    /* renamed from: Q */
    private static final ViewDataBinding.C1263i f30596Q = null;

    /* renamed from: R */
    private static final SparseIntArray f30597R;

    /* renamed from: O */
    private final ImageView f30598O;

    /* renamed from: P */
    private long f30599P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30597R = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.guideline, 14);
    }

    public C11822id(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 15, f30596Q, f30597R));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (39 == i) {
            mo4183S((Boolean) obj);
        } else if (79 == i) {
            mo4181U((CatalogProduct) obj);
        } else if (80 == i) {
            mo4180V((Promotion) obj);
        } else if (77 != i) {
            return false;
        } else {
            mo4182T((String) obj);
        }
        return true;
    }

    @Override // p426wg.AbstractC11804hd
    /* renamed from: S */
    public void mo4183S(Boolean bool) {
        this.f30488N = bool;
        synchronized (this) {
            this.f30599P |= 1;
        }
        m37781c(39);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11804hd
    /* renamed from: T */
    public void mo4182T(String str) {
        this.f30487M = str;
        synchronized (this) {
            this.f30599P |= 8;
        }
        m37781c(77);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11804hd
    /* renamed from: U */
    public void mo4181U(CatalogProduct catalogProduct) {
        this.f30485K = catalogProduct;
        synchronized (this) {
            this.f30599P |= 2;
        }
        m37781c(79);
        super.m37826E();
    }

    @Override // p426wg.AbstractC11804hd
    /* renamed from: V */
    public void mo4180V(Promotion promotion) {
        this.f30486L = promotion;
        synchronized (this) {
            this.f30599P |= 4;
        }
        m37781c(80);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11822id.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30599P != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30599P = 16L;
        }
        m37826E();
    }

    private C11822id(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ConstraintLayout) objArr[4], (ImageView) objArr[13], (ImageView) objArr[7], (TextView) objArr[8], (FrameLayout) objArr[11], (Guideline) objArr[14], (TextView) objArr[9], (TextView) objArr[6], (ImageView) objArr[1], (ImageView) objArr[10], (MaterialCardView) objArr[0], (TextView) objArr[5], (QuantityPickerView) objArr[12], (TextView) objArr[3]);
        this.f30599P = -1L;
        this.f30489x.setTag(null);
        this.f30490y.setTag(null);
        this.f30491z.setTag(null);
        this.f30475A.setTag(null);
        this.f30476B.setTag(null);
        this.f30477C.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f30598O = imageView;
        imageView.setTag(null);
        this.f30478D.setTag(null);
        this.f30479E.setTag(null);
        this.f30480F.setTag(null);
        this.f30481G.setTag(null);
        this.f30482H.setTag(null);
        this.f30483I.setTag(null);
        this.f30484J.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
