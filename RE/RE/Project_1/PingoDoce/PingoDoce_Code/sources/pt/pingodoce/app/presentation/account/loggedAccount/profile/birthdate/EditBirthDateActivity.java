package pt.pingodoce.app.presentation.account.loggedAccount.profile.birthdate;

import android.view.View;
import androidx.lifecycle.AbstractC1423a;
import id.InterfaceC6097a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import ke.ViewModelFactoryByInjection;
import kh.EditBirthDateViewModel;
import li.BirthdateActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p221le.UiWidgets;
import p314qd.InterfaceC9717b;
import p426wg.AbstractC11879m;
import p468yc.C13182l;
import p468yc.C13195u;
import pt.pingodoce.app.presentation.account.loggedAccount.profile.birthdate.EditBirthDateActivity;

/* compiled from: EditBirthDateActivity.kt */
/* loaded from: classes2.dex */
public final class EditBirthDateActivity extends BirthdateActivity {

    /* renamed from: g0 */
    public ViewModelFactoryByInjection f23459g0;

    /* compiled from: EditBirthDateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.birthdate.EditBirthDateActivity$a */
    /* loaded from: classes2.dex */
    static final class C8869a extends AbstractC6438m implements InterfaceC6097a {
        C8869a() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            ViewModelFactoryByInjection m13383u1 = EditBirthDateActivity.this.m13383u1();
            EditBirthDateActivity editBirthDateActivity = EditBirthDateActivity.this;
            return m13383u1.m20377b(editBirthDateActivity, editBirthDateActivity.getIntent().getExtras());
        }
    }

    /* compiled from: EditBirthDateActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.account.loggedAccount.profile.birthdate.EditBirthDateActivity$b */
    /* loaded from: classes2.dex */
    public static final class C8870b implements UiWidgets.InterfaceC7045b {

        /* renamed from: a */
        final /* synthetic */ AbstractC11879m f23461a;

        C8870b(AbstractC11879m abstractC11879m) {
            this.f23461a = abstractC11879m;
        }

        /* renamed from: a */
        public void m13379a(String str) {
            Intrinsics.isThisObjectNull(str, "date");
            this.f23461a.f30895x.setText(str);
        }
    }

    /* renamed from: t1 */
    public static /* synthetic */ void m13384t1(EditBirthDateActivity editBirthDateActivity, SimpleDateFormat simpleDateFormat, AbstractC11879m abstractC11879m, View view) {
        m13381w1(editBirthDateActivity, simpleDateFormat, abstractC11879m, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w1 */
    public static final void m13381w1(EditBirthDateActivity editBirthDateActivity, SimpleDateFormat simpleDateFormat, AbstractC11879m abstractC11879m, View view) {
        Intrinsics.isThisObjectNull(editBirthDateActivity, "this$0");
        Intrinsics.isThisObjectNull(simpleDateFormat, "$formatter");
        Intrinsics.isThisObjectNull(abstractC11879m, "$binding");
        UiWidgets m22759H0 = editBirthDateActivity.m22759H0();
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, -120);
        C13195u c13195u = C13195u.f34156a;
        UiWidgets.m19491r(m22759H0, simpleDateFormat, null, calendar.getTimeInMillis(), System.currentTimeMillis(), new C8870b(abstractC11879m), 2, null);
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m13391J0() {
        return C6450z.m20906b(EditBirthDateViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m13390K0() {
        return new C8869a();
    }

    /* renamed from: m1 */
    public void m13388m1(C13182l c13182l) {
        Intrinsics.isThisObjectNull(c13182l, "pair");
    }

    /* renamed from: n */
    public boolean m13387n() {
        return true;
    }

    /* renamed from: u1 */
    public final ViewModelFactoryByInjection m13383u1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23459g0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v1 */
    public void m13385s1(final AbstractC11879m abstractC11879m, EditBirthDateViewModel editBirthDateViewModel) {
        Intrinsics.isThisObjectNull(abstractC11879m, "binding");
        Intrinsics.isThisObjectNull(editBirthDateViewModel, "viewModel");
        super.m19417s1(abstractC11879m, editBirthDateViewModel);
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        abstractC11879m.f30897z.setOnClickListener(new View.OnClickListener() { // from class: kh.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditBirthDateActivity.m13381w1(EditBirthDateActivity.this, simpleDateFormat, abstractC11879m, view);
            }
        });
    }
}
