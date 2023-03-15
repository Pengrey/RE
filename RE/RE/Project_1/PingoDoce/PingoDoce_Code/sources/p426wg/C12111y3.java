package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.google.android.material.button.MaterialButton;
import p246n2.C7629e;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;
import sl.TakeAwayCheckoutSuccessViewModel;

/* renamed from: wg.y3 */
/* loaded from: classes2.dex */
public class C12111y3 extends AbstractC12095x3 {

    /* renamed from: I */
    private static final ViewDataBinding.C1263i f31936I = null;

    /* renamed from: J */
    private static final SparseIntArray f31937J;

    /* renamed from: C */
    private final ConstraintLayout f31938C;

    /* renamed from: D */
    private final TextView f31939D;

    /* renamed from: E */
    private final TextView f31940E;

    /* renamed from: F */
    private final TextView f31941F;

    /* renamed from: G */
    private final TextView f31942G;

    /* renamed from: H */
    private long f31943H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31937J = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_image, 6);
        sparseIntArray.put(C2336R.C2338id.const_title, 7);
        sparseIntArray.put(C2336R.C2338id.const_number_ConstraintLayout, 8);
        sparseIntArray.put(C2336R.C2338id.const_number, 9);
        sparseIntArray.put(C2336R.C2338id.store_ConstraintLayout, 10);
        sparseIntArray.put(C2336R.C2338id.const_pin, 11);
        sparseIntArray.put(C2336R.C2338id.day_ConstraintLayout, 12);
        sparseIntArray.put(C2336R.C2338id.const_day, 13);
        sparseIntArray.put(C2336R.C2338id.time_ConstraintLayout, 14);
        sparseIntArray.put(C2336R.C2338id.const_time, 15);
    }

    public C12111y3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 16, f31936I, f31937J));
    }

    /* renamed from: Q */
    private boolean m3625Q(LiveData<TakeAwayCheckout> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f31943H |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return m3625Q((LiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m3624R((TakeAwayCheckoutSuccessViewModel) obj);
            return true;
        }
        return false;
    }

    /* renamed from: R */
    public void m3624R(TakeAwayCheckoutSuccessViewModel takeAwayCheckoutSuccessViewModel) {
        this.f31854B = takeAwayCheckoutSuccessViewModel;
        synchronized (this) {
            this.f31943H |= 2;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        View.OnClickListener onClickListener;
        String str3;
        String str4;
        String str5;
        String str6;
        synchronized (this) {
            j = this.f31943H;
            this.f31943H = 0L;
        }
        TakeAwayCheckoutSuccessViewModel takeAwayCheckoutSuccessViewModel = this.f31854B;
        int i = ((7 & j) > 0L ? 1 : ((7 & j) == 0L ? 0 : -1));
        String str7 = null;
        if (i != 0) {
            onClickListener = ((j & 6) == 0 || takeAwayCheckoutSuccessViewModel == null) ? null : takeAwayCheckoutSuccessViewModel.m8394N();
            LiveData m8395M = takeAwayCheckoutSuccessViewModel != null ? takeAwayCheckoutSuccessViewModel.m8395M() : null;
            m37818O(0, m8395M);
            TakeAwayCheckout takeAwayCheckout = m8395M != null ? (TakeAwayCheckout) m8395M.mo172f() : null;
            if (takeAwayCheckout != null) {
                String m10861j = takeAwayCheckout.m10861j();
                str5 = takeAwayCheckout.m10859m();
                str3 = takeAwayCheckout.m10860k();
                String m10858n = takeAwayCheckout.m10858n();
                str6 = takeAwayCheckout.m10865e();
                str4 = m10861j;
                str7 = m10858n;
            } else {
                str4 = null;
                str5 = null;
                str3 = null;
                str6 = null;
            }
            str2 = str4;
            str = String.format(this.f31940E.getResources().getString(C2336R.string.lbl_profile_store_format), str7, str5);
            str7 = str6;
        } else {
            str = null;
            str2 = null;
            onClickListener = null;
            str3 = null;
        }
        if (i != 0) {
            C7629e.m17885g(this.f31939D, str7);
            C7629e.m17885g(this.f31940E, str);
            C7629e.m17885g(this.f31941F, str3);
            C7629e.m17885g(this.f31942G, str2);
        }
        if ((j & 6) != 0) {
            this.f31856y.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31943H != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31943H = 4L;
        }
        m37826E();
    }

    private C12111y3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 1, (TextView) objArr[13], (ImageView) objArr[6], (TextView) objArr[9], (ConstraintLayout) objArr[8], (ImageView) objArr[11], (TextView) objArr[15], (TextView) objArr[7], (ConstraintLayout) objArr[12], (MaterialButton) objArr[5], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[14]);
        this.f31943H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.f31938C = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f31939D = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f31940E = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[3];
        this.f31941F = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[4];
        this.f31942G = textView4;
        textView4.setTag(null);
        this.f31856y.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
