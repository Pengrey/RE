package p426wg;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.C0868i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.InterfaceC1274e;
import androidx.databinding.InterfaceC1276g;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1491v;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.guilhe.views.PlaceHolderRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;
import p246n2.C7629e;
import pt.pingodoce.app.data.local.models.takeaway.TakeAwayOrder;
import pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel;

/* renamed from: wg.k3 */
/* loaded from: classes2.dex */
public class C11847k3 extends AbstractC11829j3 {

    /* renamed from: o0 */
    private static final ViewDataBinding.C1263i f30742o0;

    /* renamed from: p0 */
    private static final SparseIntArray f30743p0;

    /* renamed from: b0 */
    private final CoordinatorLayout f30744b0;

    /* renamed from: c0 */
    private final ConstraintLayout f30745c0;

    /* renamed from: d0 */
    private final TextView f30746d0;

    /* renamed from: e0 */
    private final AbstractC11873la f30747e0;

    /* renamed from: f0 */
    private final ConstraintLayout f30748f0;

    /* renamed from: g0 */
    private final Group f30749g0;

    /* renamed from: h0 */
    private final ConstraintLayout f30750h0;

    /* renamed from: i0 */
    private final TextView f30751i0;

    /* renamed from: j0 */
    private final AbstractC11995re f30752j0;

    /* renamed from: k0 */
    private final TextView f30753k0;

    /* renamed from: l0 */
    private InterfaceC1276g f30754l0;

    /* renamed from: m0 */
    private InterfaceC1276g f30755m0;

    /* renamed from: n0 */
    private long f30756n0;

    /* compiled from: ActivityShoppingListBindingImpl.java */
    /* renamed from: wg.k3$a */
    /* loaded from: classes2.dex */
    class C11848a implements InterfaceC1276g {
        C11848a() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11847k3.this.f30653S);
            ShoppingListViewModel shoppingListViewModel = C11847k3.this.f30661a0;
            if (shoppingListViewModel != null) {
                C1436e0 m11106m1 = shoppingListViewModel.m11106m1();
                if (m11106m1 != null) {
                    m11106m1.mo166p(m17891a);
                }
            }
        }
    }

    /* compiled from: ActivityShoppingListBindingImpl.java */
    /* renamed from: wg.k3$b */
    /* loaded from: classes2.dex */
    class C11849b implements InterfaceC1276g {
        C11849b() {
        }

        @Override // androidx.databinding.InterfaceC1276g
        /* renamed from: c */
        public void mo3578c() {
            String m17891a = C7629e.m17891a(C11847k3.this.f30656V);
            ShoppingListViewModel shoppingListViewModel = C11847k3.this.f30661a0;
            if (shoppingListViewModel != null) {
                C1430c0 m11085t1 = shoppingListViewModel.m11085t1();
                if (m11085t1 != null) {
                    m11085t1.mo166p(m17891a);
                }
            }
        }
    }

    static {
        ViewDataBinding.C1263i c1263i = new ViewDataBinding.C1263i(47);
        f30742o0 = c1263i;
        c1263i.m37795a(1, new String[]{"view_overlay"}, new int[]{28}, new int[]{C2336R.layout.view_overlay});
        c1263i.m37795a(4, new String[]{"view_row_for_take_away_order"}, new int[]{25}, new int[]{C2336R.layout.view_row_for_take_away_order});
        c1263i.m37795a(11, new String[]{"view_for_empty", "view_row_for_shopping_list_item"}, new int[]{26, 27}, new int[]{C2336R.layout.view_for_empty, C2336R.layout.view_row_for_shopping_list_item});
        c1263i.m37795a(13, new String[]{"view_loading_small"}, new int[]{29}, new int[]{C2336R.layout.view_loading_small});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30743p0 = sparseIntArray;
        sparseIntArray.put(C2336R.C2338id.header_AppBarLayout, 30);
        sparseIntArray.put(C2336R.C2338id.header_CollapsingToolbarLayout, 31);
        sparseIntArray.put(C2336R.C2338id.mode_toggle_ConstraintLayout, 32);
        sparseIntArray.put(C2336R.C2338id.const_toggle_center_guideline, 33);
        sparseIntArray.put(C2336R.C2338id.const_toggle_edit, 34);
        sparseIntArray.put(C2336R.C2338id.const_toggle_store, 35);
        sparseIntArray.put(C2336R.C2338id.toggle_btn_ConstraintLayout, 36);
        sparseIntArray.put(C2336R.C2338id.toggle_btn_TextView, 37);
        sparseIntArray.put(C2336R.C2338id.const_order, 38);
        sparseIntArray.put(C2336R.C2338id.const_order_by, 39);
        sparseIntArray.put(C2336R.C2338id.order_by_AppCompatSpinner, 40);
        sparseIntArray.put(C2336R.C2338id.toolbar, 41);
        sparseIntArray.put(C2336R.C2338id.lists_ImageButton, 42);
        sparseIntArray.put(C2336R.C2338id.shopping_list_PlaceHolderRecyclerView, 43);
        sparseIntArray.put(C2336R.C2338id.bottom_input_FrameLayout, 44);
        sparseIntArray.put(C2336R.C2338id.const_btn_edit, 45);
        sparseIntArray.put(C2336R.C2338id.const_disclaimer, 46);
    }

    public C11847k3(InterfaceC1274e interfaceC1274e, View view) {
        this(interfaceC1274e, view, ViewDataBinding.m37797z(interfaceC1274e, view, 47, f30742o0, f30743p0));
    }

    /* renamed from: Q */
    private boolean m4118Q(AbstractC11799h8 abstractC11799h8, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 134217728;
            }
            return true;
        }
        return false;
    }

    /* renamed from: R */
    private boolean m4117R(AbstractC11695ba abstractC11695ba, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 67108864;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    private boolean m4116S(AbstractC11734de abstractC11734de, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 1;
            }
            return true;
        }
        return false;
    }

    /* renamed from: T */
    private boolean m4115T(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 16;
            }
            return true;
        }
        return false;
    }

    /* renamed from: U */
    private boolean m4114U(LiveData<ShoppingListViewModel.EnumC9455e> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 16384;
            }
            return true;
        }
        return false;
    }

    /* renamed from: V */
    private boolean m4113V(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 524288;
            }
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private boolean m4112W(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 8192;
            }
            return true;
        }
        return false;
    }

    /* renamed from: X */
    private boolean m4111X(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 8388608;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private boolean m4110Y(C1430c0<Boolean> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 4;
            }
            return true;
        }
        return false;
    }

    /* renamed from: Z */
    private boolean m4109Z(LiveData<Drawable> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 4096;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    private boolean m4108a0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 33554432;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b0 */
    private boolean m4107b0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 1024;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c0 */
    private boolean m4106c0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 256;
            }
            return true;
        }
        return false;
    }

    /* renamed from: d0 */
    private boolean m4105d0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 512;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e0 */
    private boolean m4104e0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 64;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    private boolean m4103f0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 8;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    private boolean m4102g0(LiveData<Integer> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 4194304;
            }
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    private boolean m4101h0(LiveData<Integer> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 131072;
            }
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    private boolean m4100i0(C1436e0<String> c1436e0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 32;
            }
            return true;
        }
        return false;
    }

    /* renamed from: j0 */
    private boolean m4099j0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 32768;
            }
            return true;
        }
        return false;
    }

    /* renamed from: k0 */
    private boolean m4098k0(LiveData<Integer> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 1048576;
            }
            return true;
        }
        return false;
    }

    /* renamed from: l0 */
    private boolean m4097l0(C1430c0<String> c1430c0, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 16777216;
            }
            return true;
        }
        return false;
    }

    /* renamed from: m0 */
    private boolean m4096m0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 65536;
            }
            return true;
        }
        return false;
    }

    /* renamed from: n0 */
    private boolean m4095n0(LiveData<Boolean> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 262144;
            }
            return true;
        }
        return false;
    }

    /* renamed from: o0 */
    private boolean m4094o0(LiveData<String> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 2048;
            }
            return true;
        }
        return false;
    }

    /* renamed from: p0 */
    private boolean m4093p0(LiveData<TakeAwayOrder> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 2097152;
            }
            return true;
        }
        return false;
    }

    /* renamed from: q0 */
    private boolean m4092q0(LiveData<Float> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 2;
            }
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    private boolean m4091r0(LiveData<Float> liveData, int i) {
        if (i == 0) {
            synchronized (this) {
                this.f30756n0 |= 128;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: A */
    protected boolean mo3595A(int i, Object obj, int i2) {
        switch (i) {
            case 0:
                return m4116S((AbstractC11734de) obj, i2);
            case 1:
                return m4092q0((LiveData) obj, i2);
            case 2:
                return m4110Y((C1430c0) obj, i2);
            case 3:
                return m4103f0((LiveData) obj, i2);
            case 4:
                return m4115T((LiveData) obj, i2);
            case 5:
                return m4100i0((C1436e0) obj, i2);
            case 6:
                return m4104e0((LiveData) obj, i2);
            case 7:
                return m4091r0((LiveData) obj, i2);
            case 8:
                return m4106c0((LiveData) obj, i2);
            case 9:
                return m4105d0((LiveData) obj, i2);
            case 10:
                return m4107b0((LiveData) obj, i2);
            case 11:
                return m4094o0((LiveData) obj, i2);
            case 12:
                return m4109Z((LiveData) obj, i2);
            case 13:
                return m4112W((LiveData) obj, i2);
            case 14:
                return m4114U((LiveData) obj, i2);
            case 15:
                return m4099j0((LiveData) obj, i2);
            case 16:
                return m4096m0((LiveData) obj, i2);
            case 17:
                return m4101h0((LiveData) obj, i2);
            case 18:
                return m4095n0((LiveData) obj, i2);
            case 19:
                return m4113V((LiveData) obj, i2);
            case 20:
                return m4098k0((LiveData) obj, i2);
            case 21:
                return m4093p0((LiveData) obj, i2);
            case 22:
                return m4102g0((LiveData) obj, i2);
            case 23:
                return m4111X((LiveData) obj, i2);
            case 24:
                return m4097l0((C1430c0) obj, i2);
            case 25:
                return m4108a0((LiveData) obj, i2);
            case 26:
                return m4117R((AbstractC11695ba) obj, i2);
            case 27:
                return m4118Q((AbstractC11799h8) obj, i2);
            default:
                return false;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: K */
    public void mo3594K(InterfaceC1491v interfaceC1491v) {
        super.mo3594K(interfaceC1491v);
        this.f30752j0.mo3594K(interfaceC1491v);
        this.f30638D.mo3594K(interfaceC1491v);
        this.f30659Y.mo3594K(interfaceC1491v);
        this.f30747e0.mo3594K(interfaceC1491v);
        this.f30639E.mo3594K(interfaceC1491v);
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: M */
    public boolean mo3593M(int i, Object obj) {
        if (109 == i) {
            m4090s0((ShoppingListViewModel) obj);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b1  */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [android.animation.TimeInterpolator, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v21 */
    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo3581k() {
        /*
            Method dump skipped, instructions count: 2174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p426wg.C11847k3.mo3581k():void");
    }

    /* renamed from: s0 */
    public void m4090s0(ShoppingListViewModel shoppingListViewModel) {
        this.f30661a0 = shoppingListViewModel;
        synchronized (this) {
            this.f30756n0 |= 268435456;
        }
        m37781c(C0868i.f2778I0);
        super.m37826E();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: u */
    public boolean mo3580u() {
        synchronized (this) {
            if (this.f30756n0 != 0) {
                return true;
            }
            return this.f30752j0.mo3580u() || this.f30638D.mo3580u() || this.f30659Y.mo3580u() || this.f30747e0.mo3580u() || this.f30639E.mo3580u();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* renamed from: w */
    public void mo3579w() {
        synchronized (this) {
            this.f30756n0 = 536870912L;
        }
        this.f30752j0.mo3579w();
        this.f30638D.mo3579w();
        this.f30659Y.mo3579w();
        this.f30747e0.mo3579w();
        this.f30639E.mo3579w();
        m37826E();
    }

    private C11847k3(InterfaceC1274e interfaceC1274e, View view, Object[] objArr) {
        super(interfaceC1274e, view, 28, (MaterialButton) objArr[16], (FrameLayout) objArr[44], (MaterialButton) objArr[24], (MaterialButton) objArr[19], (MaterialButton) objArr[23], (ImageView) objArr[45], (ImageButton) objArr[18], (TextView) objArr[46], (AbstractC11799h8) objArr[26], (AbstractC11695ba) objArr[29], (ImageButton) objArr[9], (ConstraintLayout) objArr[38], (TextView) objArr[39], (TextView) objArr[3], (Guideline) objArr[33], (ConstraintLayout) objArr[5], (TextView) objArr[34], (Guideline) objArr[7], (Guideline) objArr[6], (TextView) objArr[35], (AppBarLayout) objArr[30], (CollapsingToolbarLayout) objArr[31], (MaterialButton) objArr[12], (ConstraintLayout) objArr[11], (ImageButton) objArr[42], (ConstraintLayout) objArr[32], (AppCompatSpinner) objArr[40], (ImageButton) objArr[17], (EditText) objArr[15], (PlaceHolderRecyclerView) objArr[43], (FrameLayout) objArr[4], (EditText) objArr[2], (ConstraintLayout) objArr[36], (TextView) objArr[37], (Toolbar) objArr[41], (AbstractC11734de) objArr[27], (MaterialButton) objArr[22]);
        this.f30754l0 = new C11848a();
        this.f30755m0 = new C11849b();
        this.f30756n0 = -1L;
        this.f30662x.setTag(null);
        this.f30663y.setTag(null);
        this.f30664z.setTag(null);
        this.f30635A.setTag(null);
        this.f30636B.setTag(null);
        m37821J(this.f30638D);
        m37821J(this.f30639E);
        this.f30640F.setTag(null);
        this.f30641G.setTag(null);
        this.f30642H.setTag(null);
        this.f30643I.setTag(null);
        this.f30644J.setTag(null);
        this.f30647M.setTag(null);
        this.f30648N.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.f30744b0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.f30745c0 = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[10];
        this.f30746d0 = textView;
        textView.setTag(null);
        AbstractC11873la abstractC11873la = (AbstractC11873la) objArr[28];
        this.f30747e0 = abstractC11873la;
        m37821J(abstractC11873la);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[13];
        this.f30748f0 = constraintLayout2;
        constraintLayout2.setTag(null);
        Group group = (Group) objArr[14];
        this.f30749g0 = group;
        group.setTag(null);
        ConstraintLayout constraintLayout3 = (ConstraintLayout) objArr[20];
        this.f30750h0 = constraintLayout3;
        constraintLayout3.setTag(null);
        TextView textView2 = (TextView) objArr[21];
        this.f30751i0 = textView2;
        textView2.setTag(null);
        AbstractC11995re abstractC11995re = (AbstractC11995re) objArr[25];
        this.f30752j0 = abstractC11995re;
        m37821J(abstractC11995re);
        TextView textView3 = (TextView) objArr[8];
        this.f30753k0 = textView3;
        textView3.setTag(null);
        this.f30652R.setTag(null);
        this.f30653S.setTag(null);
        this.f30655U.setTag(null);
        this.f30656V.setTag(null);
        m37821J(this.f30659Y);
        this.f30660Z.setTag(null);
        m37820L(view);
        mo3579w();
    }
}
