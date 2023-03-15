package p426wg;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.clubs.ClubBaby;

/* renamed from: wg.cc */
/* loaded from: classes2.dex */
public class C11715cc extends AbstractC11697bc {

    /* renamed from: G */
    private static final ViewDataBinding.C1263i f30027G = null;

    /* renamed from: H */
    private static final SparseIntArray f30028H;

    /* renamed from: A */
    private final LinearLayout f30029A;

    /* renamed from: B */
    private final TextView f30030B;

    /* renamed from: C */
    private final TextView f30031C;

    /* renamed from: D */
    private final TextView f30032D;

    /* renamed from: E */
    private final TextView f30033E;

    /* renamed from: F */
    private long f30034F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30028H = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.baby_name, 5);
        sparseIntArray.put(C2336R.C2338id.const_name, 6);
        sparseIntArray.put(C2336R.C2338id.birthdate, 7);
        sparseIntArray.put(C2336R.C2338id.id_number, 8);
        sparseIntArray.put(C2336R.C2338id.const_id_number, 9);
        sparseIntArray.put(C2336R.C2338id.remove_baby, 10);
        sparseIntArray.put(C2336R.C2338id.const_bottom_separator, 11);
    }

    public C11715cc(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 12, f30027G, f30028H));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (5 == i) {
            mo4418S((ClubBaby) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11697bc
    /* renamed from: S */
    public void mo4418S(ClubBaby clubBaby) {
        this.f29957z = clubBaby;
        synchronized (this) {
            this.f30034F |= 1;
        }
        m37781c(5);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        String str2;
        synchronized (this) {
            j = this.f30034F;
            this.f30034F = 0L;
        }
        ClubBaby clubBaby = this.f29957z;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        String str3 = null;
        if (i == 0 || clubBaby == null) {
            str = null;
            str2 = null;
        } else {
            String m14633c = clubBaby.m14633c();
            String m14630f = clubBaby.m14630f();
            str2 = clubBaby.m14632d();
            str = m14633c;
            str3 = m14630f;
        }
        if (i != 0) {
            C7629e.m17885g(this.f30030B, str3);
            C7629e.m17885g(this.f30031C, str3);
            C7629e.m17885g(this.f30032D, str);
            C7629e.m17885g(this.f30033E, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f30034F != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30034F = 2L;
        }
        m37826E();
    }

    private C11715cc(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ConstraintLayout) objArr[5], (TextView) objArr[7], (View) objArr[11], (TextView) objArr[9], (TextView) objArr[6], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[10]);
        this.f30034F = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.f30029A = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.f30030B = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.f30031C = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[3];
        this.f30032D = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArr[4];
        this.f30033E = textView4;
        textView4.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
