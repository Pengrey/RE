package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p246n2.C7629e;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;

/* renamed from: wg.ue */
/* loaded from: classes2.dex */
public class C12056ue extends AbstractC12031te {

    /* renamed from: L */
    private static final ViewDataBinding.C1263i f31685L = null;

    /* renamed from: M */
    private static final SparseIntArray f31686M;

    /* renamed from: C */
    private final LinearLayout f31687C;

    /* renamed from: D */
    private final TextView f31688D;

    /* renamed from: E */
    private final TextView f31689E;

    /* renamed from: F */
    private final TextView f31690F;

    /* renamed from: G */
    private final TextView f31691G;

    /* renamed from: H */
    private final TextView f31692H;

    /* renamed from: I */
    private final TextView f31693I;

    /* renamed from: J */
    private final TextView f31694J;

    /* renamed from: K */
    private long f31695K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f31686M = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.const_total, 9);
        sparseIntArray.put(C2336R.C2338id.store_ConstraintLayout, 10);
        sparseIntArray.put(C2336R.C2338id.const_pin, 11);
        sparseIntArray.put(C2336R.C2338id.day_ConstraintLayout, 12);
        sparseIntArray.put(C2336R.C2338id.const_day, 13);
        sparseIntArray.put(C2336R.C2338id.time_ConstraintLayout, 14);
        sparseIntArray.put(C2336R.C2338id.const_time, 15);
        sparseIntArray.put(C2336R.C2338id.const_name, 16);
        sparseIntArray.put(C2336R.C2338id.const_phone, 17);
        sparseIntArray.put(C2336R.C2338id.const_email, 18);
        sparseIntArray.put(C2336R.C2338id.const_email_arrow, 19);
    }

    public C12056ue(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 20, f31685L, f31686M));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (102 == i) {
            mo3705S((TakeAwayCheckout) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC12031te
    /* renamed from: S */
    public void mo3705S(TakeAwayCheckout takeAwayCheckout) {
        this.f31565B = takeAwayCheckout;
        synchronized (this) {
            this.f31695K |= 1;
        }
        m37781c(C0868i.f2748C0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        synchronized (this) {
            j = this.f31695K;
            this.f31695K = 0L;
        }
        TakeAwayCheckout takeAwayCheckout = this.f31565B;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str11 = null;
        if (i != 0) {
            if (takeAwayCheckout != null) {
                String m10861j = takeAwayCheckout.m10861j();
                String m10853w = takeAwayCheckout.m10853w();
                str8 = takeAwayCheckout.m10859m();
                str4 = takeAwayCheckout.m10864f();
                String m10866d = takeAwayCheckout.m10866d();
                str6 = takeAwayCheckout.m10862i();
                str10 = takeAwayCheckout.m10858n();
                str7 = takeAwayCheckout.m10863h();
                str = m10861j;
                str11 = m10866d;
                str5 = takeAwayCheckout.m10860k();
                str9 = m10853w;
            } else {
                str = null;
                str8 = null;
                str9 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str10 = null;
                str7 = null;
            }
            String format = String.format(this.f31692H.getResources().getString(C2336R.string.lbl_take_away_pickup_note), str11);
            str2 = String.format(this.f31689E.getResources().getString(C2336R.string.lbl_profile_store_format), str10, str8);
            String str12 = str9;
            str3 = format;
            str11 = str12;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
        }
        if (i != 0) {
            C7629e.m17885g(this.f31688D, str11);
            C7629e.m17885g(this.f31689E, str2);
            C7629e.m17885g(this.f31690F, str5);
            C7629e.m17885g(this.f31691G, str);
            C7629e.m17885g(this.f31692H, str3);
            C7629e.m17885g(this.f31693I, str4);
            C7629e.m17885g(this.f31694J, str6);
            C7629e.m17885g(this.f31567y, str7);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31695K != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31695K = 2L;
        }
        m37826E();
    }

    private C12056ue(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (TextView) objArr[13], (TextView) objArr[18], (ImageView) objArr[19], (TextView) objArr[16], (TextView) objArr[17], (ImageView) objArr[11], (TextView) objArr[15], (TextView) objArr[9], (ConstraintLayout) objArr[12], (TextView) objArr[8], (ConstraintLayout) objArr[10], (ConstraintLayout) objArr[14]);
        this.f31695K = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f31687C = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f31688D = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f31689E = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[3];
        this.f31690F = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[4];
        this.f31691G = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArr[5];
        this.f31692H = textView5;
        textView5.setTag(null);
        TextView textView6 = (TextView) objArr[6];
        this.f31693I = textView6;
        textView6.setTag(null);
        TextView textView7 = (TextView) objArr[7];
        this.f31694J = textView7;
        textView7.setTag(null);
        this.f31567y.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
