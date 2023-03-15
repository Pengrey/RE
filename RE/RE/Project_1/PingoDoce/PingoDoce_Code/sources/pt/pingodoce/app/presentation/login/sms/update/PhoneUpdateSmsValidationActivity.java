package pt.pingodoce.app.presentation.login.sms.update;

import android.widget.TextView;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.LifecycleOwner;
import bd.InterfaceC1886d;
import cd.C2116d;
import ci.C2136a;
import ci.InterfaceC2154o;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6112p;
import java.util.Arrays;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p343rk.SmsTokenActivity;
import p426wg.AbstractC11944p3;
import p468yc.C13182l;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.CollectionsJVM;
import pe.C8618e;
import pt.pingodoce.app.data.local.flows.UpdatePhoneFlowData;
import sk.PhoneUpdateSmsValidationViewModel;
import td.InterfaceC10524i0;

/* compiled from: PhoneUpdateSmsValidationActivity.kt */
/* loaded from: classes2.dex */
public final class PhoneUpdateSmsValidationActivity extends SmsTokenActivity {

    /* renamed from: i0 */
    public ViewModelFactoryByInjection f24529i0;

    /* renamed from: j0 */
    private AbstractC9725a f24530j0 = m9687y1();

    /* compiled from: PhoneUpdateSmsValidationActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.login.sms.update.PhoneUpdateSmsValidationActivity$a */
    /* loaded from: classes2.dex */
    static final class C9322a extends AbstractC6438m implements InterfaceC6097a {
        C9322a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(PhoneUpdateSmsValidationActivity.this.m11711C1(), PhoneUpdateSmsValidationActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhoneUpdateSmsValidationActivity.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.login.sms.update.PhoneUpdateSmsValidationActivity$initViews$1", m20196f = "PhoneUpdateSmsValidationActivity.kt", m20195l = {}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.login.sms.update.PhoneUpdateSmsValidationActivity$b */
    /* loaded from: classes2.dex */
    public static final class C9323b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f24532x;

        /* renamed from: y */
        final /* synthetic */ PhoneUpdateSmsValidationViewModel f24533y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9323b(PhoneUpdateSmsValidationViewModel phoneUpdateSmsValidationViewModel, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f24533y = phoneUpdateSmsValidationViewModel;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9323b(this.f24533y, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9323b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            C2116d.m34636d();
            if (this.f24532x == 0) {
                C13186n.m1453b(obj);
                this.f24533y.m8438x0();
                return C13195u.f34156a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: C1 */
    public final ViewModelFactoryByInjection m11711C1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f24529i0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: D1 */
    public void m11702z1(AbstractC11944p3 abstractC11944p3, PhoneUpdateSmsValidationViewModel phoneUpdateSmsValidationViewModel) {
        Intrinsics.isThisObjectNull(abstractC11944p3, "binding");
        Intrinsics.isThisObjectNull(phoneUpdateSmsValidationViewModel, "viewModel");
        super.m9686z1(abstractC11944p3, phoneUpdateSmsValidationViewModel);
        TextView textView = abstractC11944p3.f31198D;
        C6429c0 c6429c0 = C6429c0.f17515a;
        String string = getString(C2336R.string.lbl_insert_sms_code);
        Intrinsics.checkIfNull(string, "getString(R.string.lbl_insert_sms_code)");
        String format = String.format(string, Arrays.copyOf(new Object[]{((UpdatePhoneFlowData) phoneUpdateSmsValidationViewModel.m34578S()).m14684d()}, 1));
        Intrinsics.checkIfNull(format, "format(format, *args)");
        textView.setText(format);
        LifecycleOwner.m36965a(this).m36984i(new C9323b(phoneUpdateSmsValidationViewModel, null));
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m11709J0() {
        return C6450z.m20906b(PhoneUpdateSmsValidationViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m11708K0() {
        return new C9322a();
    }

    public void finish() {
        super.finish();
        C13195u c13195u = C13195u.f34156a;
        overridePendingTransition(this.f24530j0.m10117a(), this.f24530j0.m10116b());
    }

    /* renamed from: k1 */
    protected List m11706k1() {
        List m202b;
        m202b = CollectionsJVM.m202b(C2136a.f6171a);
        return m202b;
    }

    /* renamed from: l1 */
    protected void m11705l1(InterfaceC2154o interfaceC2154o) {
        Intrinsics.isThisObjectNull(interfaceC2154o, "flow");
        this.f24530j0 = new C8618e();
    }

    /* renamed from: m1 */
    public void m11704m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }
}
