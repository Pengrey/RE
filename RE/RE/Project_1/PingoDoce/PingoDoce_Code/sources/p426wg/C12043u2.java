package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import module.network.data.remote.models.user.User;
import p361t3.InterfaceC10379c;
import pt.pingodoce.app.presentation.account.loggedAccount.profile.ProfileViewModel;

/* renamed from: wg.u2 */
/* loaded from: classes2.dex */
public class C12043u2 extends AbstractC12019t2 {

    /* renamed from: Q */
    private static final ViewDataBinding.C1263i f31615Q;

    /* renamed from: R */
    private static final SparseIntArray f31616R;

    /* renamed from: D */
    private final FrameLayout f31617D;

    /* renamed from: E */
    private final AbstractC12136z9 f31618E;

    /* renamed from: F */
    private final LinearLayout f31619F;

    /* renamed from: G */
    private final ImageView f31620G;

    /* renamed from: H */
    private final AbstractC11917nf f31621H;

    /* renamed from: I */
    private final TextView f31622I;

    /* renamed from: J */
    private final TextView f31623J;

    /* renamed from: K */
    private final ConstraintLayout f31624K;

    /* renamed from: L */
    private final TextView f31625L;

    /* renamed from: M */
    private final ConstraintLayout f31626M;

    /* renamed from: N */
    private final TextView f31627N;

    /* renamed from: O */
    private final TextView f31628O;

    /* renamed from: P */
    private long f31629P;

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(25);
        f31615Q = c1263i;
        c1263i.m37795a(0, new String[]{"view_loading"}, new int[]{16}, new int[]{C2336R.layout.view_loading});
        c1263i.m37795a(1, new String[]{"view_toolbar"}, new int[]{15}, new int[]{C2336R.layout.view_toolbar});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31616R = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_name, 17);
        sparseIntArray.put(C2336R.C2338id.const_phone, 18);
        sparseIntArray.put(C2336R.C2338id.const_email, 19);
        sparseIntArray.put(C2336R.C2338id.const_email_arrow, 20);
        sparseIntArray.put(C2336R.C2338id.const_nif, 21);
        sparseIntArray.put(C2336R.C2338id.const_nif_arrow, 22);
        sparseIntArray.put(C2336R.C2338id.const_birthdate, 23);
        sparseIntArray.put(C2336R.C2338id.const_birthdate_arrow, 24);
    }

    public C12043u2(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 25, f31615Q, f31616R));
    }

    /* renamed from: Q */
    private boolean m3736Q(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31629P |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m3735R(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31629P |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m3734S(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31629P |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m3733T(LiveData<User> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31629P |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m3732U(LiveData<InterfaceC10379c> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31629P |= 8;
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
                    if (i != 3) {
                        if (i != 4) {
                            return false;
                        }
                        return m3735R((LiveData) obj, i2);
                    }
                    return m3732U((LiveData) obj, i2);
                }
                return m3734S((LiveData) obj, i2);
            }
            return m3733T((LiveData) obj, i2);
        }
        return m3736Q((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f31621H.mo3594K(interfaceC1491v);
        this.f31618E.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3731V((ProfileViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: V */
    public void m3731V(ProfileViewModel profileViewModel) {
        this.f31508C = profileViewModel;
        synchronized (this) {
            this.f31629P |= 32;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0240  */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C12043u2.mo3581k():void");
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f31629P != 0) {
                return true;
            }
            return this.f31621H.mo3580u() || this.f31618E.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31629P = 64L;
        }
        this.f31621H.mo3579w();
        this.f31618E.mo3579w();
        m37826E();
    }

    private C12043u2(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 5, (TextView) objArr[23], (ImageView) objArr[24], (TextView) objArr[19], (ImageView) objArr[20], (ImageView) objArr[9], (TextView) objArr[17], (TextView) objArr[21], (ImageView) objArr[22], (TextView) objArr[18], (ConstraintLayout) objArr[13], (ConstraintLayout) objArr[7], (ImageView) objArr[2], (ConstraintLayout) objArr[11]);
        this.f31629P = -1L;
        this.f31509x.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f31617D = frameLayout;
        frameLayout.setTag(null);
        AbstractC12136z9 abstractC12136z9 = (AbstractC12136z9) objArr[16];
        this.f31618E = abstractC12136z9;
        m37821J(abstractC12136z9);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.f31619F = linearLayout;
        linearLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[10];
        this.f31620G = imageView;
        imageView.setTag(null);
        AbstractC11917nf abstractC11917nf = (AbstractC11917nf) objArr[15];
        this.f31621H = abstractC11917nf;
        m37821J(abstractC11917nf);
        TextView textView = (TextView) objArr[12];
        this.f31622I = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[14];
        this.f31623J = textView2;
        textView2.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[3];
        this.f31624K = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView3 = (TextView) objArr[4];
        this.f31625L = textView3;
        textView3.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[5];
        this.f31626M = constraintLayout2;
        constraintLayout2.setTag(null);
        TextView textView4 = (TextView) objArr[6];
        this.f31627N = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[8];
        this.f31628O = textView5;
        textView5.setTag(null);
        this.f31510y.setTag(null);
        this.f31511z.setTag(null);
        this.f31506A.setTag(null);
        this.f31507B.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
