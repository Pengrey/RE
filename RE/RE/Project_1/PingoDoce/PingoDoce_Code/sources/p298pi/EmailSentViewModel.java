package p298pi;

import android.graphics.drawable.Drawable;
import androidx.core.content.C0928a;
import androidx.lifecycle.C1430c0;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import com.github.razir.progressbutton.C2381h;
import ki.SubmitAnimatedViewModel;
import mg.EmailManager;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.flows.FlowData;

/* renamed from: pi.a */
/* loaded from: classes2.dex */
public abstract class EmailSentViewModel<F extends FlowData> extends SubmitAnimatedViewModel {

    /* renamed from: C */
    private final EmailManager f22249C;

    /* renamed from: D */
    private C2381h f22250D;

    /* renamed from: E */
    private final Void f22251E;

    /* renamed from: F */
    private final C1436e0 f22252F;

    /* renamed from: G */
    private final C1436e0 f22253G;

    /* renamed from: H */
    private final C1436e0 f22254H;

    /* renamed from: I */
    private final C1430c0 f22255I;

    /* renamed from: J */
    private final C1436e0 f22256J;

    /* renamed from: K */
    private final C1436e0 f22257K;

    /* renamed from: L */
    private final LiveData f22258L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailSentViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, EmailManager emailManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(emailManager, "emailManager");
        this.f22249C = emailManager;
        C2381h c2381h = new C2381h();
        c2381h.m33752h(2);
        c2381h.m33753g(Integer.valueOf((int) C2336R.string.btn_advance));
        this.f22250D = c2381h;
        C1436e0 m37003d = c1459l0.m37003d("_isErrorEnabled", Boolean.FALSE);
        Intrinsics.checkIfNull(m37003d, "stateHandle.getLiveData<…\"_isErrorEnabled\", false)");
        this.f22252F = m37003d;
        C1436e0 c1436e0 = new C1436e0(C0928a.m39111f(resourcesProvider.m6899a(), C2336R.C2337drawable.ic_email));
        this.f22253G = c1436e0;
        C1436e0 m37003d2 = c1459l0.m37003d("_errorLabel", BuildConfig.VERSION_NAME);
        Intrinsics.checkIfNull(m37003d2, "stateHandle.getLiveData<String>(\"_errorLabel\", \"\")");
        this.f22254H = m37003d2;
        this.f22255I = new C1430c0();
        this.f22256J = new C1436e0(Boolean.TRUE);
        String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_insert_email_subtitle);
        Intrinsics.checkIfNull(string, "ctx.getString(id)");
        this.f22257K = new C1436e0(string);
        this.f22258L = c1436e0;
        Intrinsics.checkIfNull(c1459l0.m37003d("EXTRA_FOR_EMAIL", BuildConfig.VERSION_NAME), "stateHandle.getLiveData<…ing>(EXTRA_FOR_EMAIL, \"\")");
    }

    /* renamed from: y0 */
    static /* synthetic */ Object m14965y0(EmailSentViewModel emailSentViewModel, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m14964z0 = emailSentViewModel.m14964z0(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m14964z0 == m34636d ? m14964z0 : C13195u.f34156a;
    }

    /* renamed from: f0 */
    public /* bridge */ /* synthetic */ Drawable m14972f0() {
        return (Drawable) m14967w0();
    }

    /* renamed from: g0 */
    protected C2381h m14971g0() {
        return this.f22250D;
    }

    /* renamed from: n0 */
    protected Object m14970n0(InterfaceC1886d interfaceC1886d) {
        return m14965y0(this, interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u0 */
    public final EmailManager m14969u0() {
        return this.f22249C;
    }

    /* renamed from: v0 */
    public final LiveData m14968v0() {
        return this.f22258L;
    }

    /* renamed from: w0 */
    protected Void m14967w0() {
        return this.f22251E;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x0 */
    public final C1436e0 m14966x0() {
        return this.f22256J;
    }

    /* renamed from: z0 */
    public abstract Object m14964z0(InterfaceC1886d interfaceC1886d);
}
