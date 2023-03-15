package p426wg;

import ae.BindingAdapters;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import kg.FriendImage;
import p111g.C5586a;
import p361t3.InterfaceC10379c;

/* renamed from: wg.sc */
/* loaded from: classes2.dex */
public class C12012sc extends AbstractC11993rc {

    /* renamed from: C */
    private static final ViewDataBinding.C1263i f31477C = null;

    /* renamed from: D */
    private static final SparseIntArray f31478D = null;

    /* renamed from: A */
    private final ImageView f31479A;

    /* renamed from: B */
    private long f31480B;

    /* renamed from: z */
    private final FrameLayout f31481z;

    public C12012sc(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 3, f31477C, f31478D));
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (41 == i) {
            mo3777Q((FriendImage) obj);
            return true;
        }
        return false;
    }

    @Override // p426wg.AbstractC11993rc
    /* renamed from: Q */
    public void mo3777Q(FriendImage friendImage) {
        this.f31391y = friendImage;
        synchronized (this) {
            this.f31480B |= 1;
        }
        m37781c(41);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    protected void mo3581k() {
        long j;
        String str;
        InterfaceC10379c interfaceC10379c;
        synchronized (this) {
            j = this.f31480B;
            this.f31480B = 0L;
        }
        FriendImage friendImage = this.f31391y;
        boolean z = false;
        int i = ((j & 3) > 0L ? 1 : ((j & 3) == 0L ? 0 : -1));
        if (i == 0 || friendImage == null) {
            str = null;
            interfaceC10379c = null;
        } else {
            z = friendImage.m20364b();
            str = friendImage.m20365a();
            interfaceC10379c = friendImage.m20363c();
        }
        if (i != 0) {
            ImageView imageView = this.f31390x;
            BindingAdapters.m41781j(imageView, str, null, null, C5586a.m23699b(imageView.getContext(), C2336R.C2337drawable.ic_avatar_small), interfaceC10379c);
            BindingAdapters.m41779l(this.f31479A, Boolean.valueOf(z), null);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            return this.f31480B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f31480B = 2L;
        }
        m37826E();
    }

    private C12012sc(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 0, (ImageView) objArr[1]);
        this.f31480B = -1L;
        this.f31390x.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.f31481z = frameLayout;
        frameLayout.setTag(null);
        ImageView imageView = (ImageView) objArr[2];
        this.f31479A = imageView;
        imageView.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
