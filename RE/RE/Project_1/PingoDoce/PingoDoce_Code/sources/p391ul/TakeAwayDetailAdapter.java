package p391ul;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import java.util.List;
import je.TouchableViewHolder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC12031te;
import p426wg.AbstractC12072ve;
import p426wg.AbstractC12106xe;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayProduct;
import pt.pingodoce.app.presentation.takeaway.models.TakeAwayCheckout;

/* renamed from: ul.a */
/* loaded from: classes2.dex */
public class TakeAwayDetailAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final TakeAwayCheckout f28260e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TakeAwayDetailAdapter.kt */
    /* renamed from: ul.a$a */
    /* loaded from: classes2.dex */
    public static final class C10963a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C10963a f28261w = new C10963a();

        C10963a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(TakeAwayProduct takeAwayProduct, TakeAwayProduct takeAwayProduct2) {
            Intrinsics.isThisObjectNull(takeAwayProduct, "old");
            Intrinsics.isThisObjectNull(takeAwayProduct2, "new");
            return Boolean.valueOf(takeAwayProduct.m14244i() == takeAwayProduct2.m14244i());
        }
    }

    /* compiled from: TakeAwayDetailAdapter.kt */
    /* renamed from: ul.a$b */
    /* loaded from: classes2.dex */
    public static final class C10964b {
        private C10964b() {
        }

        public /* synthetic */ C10964b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: TakeAwayDetailAdapter.kt */
    /* renamed from: ul.a$c */
    /* loaded from: classes2.dex */
    public static final class C10965c extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10965c(AbstractC12031te abstractC12031te) {
            super(abstractC12031te);
            Intrinsics.isThisObjectNull(abstractC12031te, "binding");
        }
    }

    /* compiled from: TakeAwayDetailAdapter.kt */
    /* renamed from: ul.a$d */
    /* loaded from: classes2.dex */
    public static final class C10966d extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10966d(AbstractC12072ve abstractC12072ve) {
            super(abstractC12072ve);
            Intrinsics.isThisObjectNull(abstractC12072ve, "binding");
        }
    }

    /* compiled from: TakeAwayDetailAdapter.kt */
    /* renamed from: ul.a$e */
    /* loaded from: classes2.dex */
    public static final class C10967e extends TouchableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10967e(AbstractC12106xe abstractC12106xe) {
            super(abstractC12106xe);
            Intrinsics.isThisObjectNull(abstractC12106xe, "binding");
        }

        /* renamed from: S */
        public ImageView m6705O() {
            ImageView imageView = ((AbstractC12106xe) m22151M()).f31910x;
            Intrinsics.checkIfNull(imageView, "binding.backgroundIconImageView");
            return imageView;
        }

        /* renamed from: T */
        public ConstraintLayout m6704P() {
            ConstraintLayout constraintLayout = ((AbstractC12106xe) m22151M()).f31911y;
            Intrinsics.checkIfNull(constraintLayout, "binding.foregroundConstraintLayout");
            return constraintLayout;
        }
    }

    static {
        new C10964b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakeAwayDetailAdapter(List list, TakeAwayCheckout takeAwayCheckout) {
        super(C10963a.f28261w);
        Intrinsics.isThisObjectNull(list, "products");
        Intrinsics.isThisObjectNull(takeAwayCheckout, "status");
        this.f28260e = takeAwayCheckout;
        m22154E().addAll(list);
    }

    /* renamed from: I */
    private final int m6713I() {
        return mo29834f() - 1;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: J */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        if (i == 0) {
            ((AbstractC12072ve) ((C10966d) bindableViewHolder).m22151M()).mo3660S(this.f28260e.m10865e());
        } else if (i == m6713I()) {
            ((AbstractC12031te) ((C10965c) bindableViewHolder).m22151M()).mo3705S(this.f28260e);
        } else {
            TakeAwayProduct takeAwayProduct = (TakeAwayProduct) m22155D(i - 1);
            if (takeAwayProduct != null) {
                C10967e c10967e = (C10967e) bindableViewHolder;
                ((AbstractC12106xe) c10967e.m22151M()).mo3596S(takeAwayProduct);
                ((AbstractC12106xe) c10967e.m22151M()).f31905B.setClickable(false);
            }
        }
    }

    /* renamed from: K */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        if (i == -2) {
            AbstractC12031te m3765Q = AbstractC12031te.m3765Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m3765Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C10965c(m3765Q);
        } else if (i != -1) {
            AbstractC12106xe m3651Q = AbstractC12106xe.m3651Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m3651Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C10967e(m3651Q);
        } else {
            AbstractC12072ve m3695Q = AbstractC12072ve.m3695Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            Intrinsics.checkIfNull(m3695Q, "inflate(LayoutInflater.f….context), parent, false)");
            return new C10966d(m3695Q);
        }
    }

    /* renamed from: f */
    public int mo29834f() {
        return super.mo29834f() + 2;
    }

    /* renamed from: h */
    public int mo36545h(int i) {
        if (i == 0) {
            return -1;
        }
        if (i == m6713I()) {
            return -2;
        }
        return i;
    }
}
