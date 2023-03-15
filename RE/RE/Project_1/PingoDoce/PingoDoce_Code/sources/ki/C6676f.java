package ki;

import android.graphics.drawable.Drawable;
import com.github.razir.progressbutton.C2373c;
import com.github.razir.progressbutton.C2375d;
import com.github.razir.progressbutton.C2381h;
import com.google.android.material.button.MaterialButton;
import id.InterfaceC6108l;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p468yc.C13195u;

/* compiled from: SubmitAnimatedViewModel.kt */
/* renamed from: ki.f */
/* loaded from: classes2.dex */
public final class C6676f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubmitAnimatedViewModel.kt */
    /* renamed from: ki.f$a */
    /* loaded from: classes2.dex */
    public static final class C6677a extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C2381h f17993w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6677a(C2381h c2381h) {
            super(1);
            this.f17993w = c2381h;
        }

        /* renamed from: a */
        public final void m20307a(C2381h c2381h) {
            Intrinsics.isThisObjectNull(c2381h, "$this$showProgress");
            C2381h c2381h2 = this.f17993w;
            if (c2381h2 != null) {
                c2381h.m33752h(c2381h2.m33757c());
                c2381h.m33754f(c2381h2.m33759a());
                c2381h.m33753g(c2381h2.m33758b());
                c2381h.m33751i(c2381h2.m33756d());
                c2381h.m33750j(c2381h2.m33755e());
                c2381h.m33730r(c2381h2.m33737k());
                c2381h.m33728t(c2381h2.m33735m());
                c2381h.m33729s(c2381h2.m33736l());
                c2381h.m33727u(c2381h2.m33734n());
                c2381h.m33726v(c2381h2.m33733o());
                c2381h.m33725w(c2381h2.m33732p());
                c2381h.m33724x(c2381h2.m33731q());
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20307a((C2381h) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubmitAnimatedViewModel.kt */
    /* renamed from: ki.f$b */
    /* loaded from: classes2.dex */
    public static final class C6678b extends AbstractC6438m implements InterfaceC6108l {

        /* renamed from: w */
        final /* synthetic */ C2381h f17994w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6678b(C2381h c2381h) {
            super(1);
            this.f17994w = c2381h;
        }

        /* renamed from: a */
        public final void m20306a(C2375d c2375d) {
            Intrinsics.isThisObjectNull(c2375d, "$this$showDrawable");
            C2381h c2381h = this.f17994w;
            if (c2381h != null) {
                c2375d.m33752h(c2381h.m33757c());
                c2375d.m33754f(c2381h.m33759a());
                c2375d.m33753g(c2381h.m33758b());
                c2375d.m33751i(c2381h.m33756d());
                c2375d.m33750j(c2381h.m33755e());
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m20306a((C2375d) obj);
            return C13195u.f34156a;
        }
    }

    static {
        new C6676f();
    }

    private C6676f() {
    }

    /* renamed from: a */
    public static final void m20308a(MaterialButton materialButton, Drawable drawable, C2381h c2381h, boolean z, boolean z2) {
        String obj;
        Integer m33758b;
        Intrinsics.isThisObjectNull(materialButton, "view");
        materialButton.setEnabled(z2);
        if (z) {
            C2373c.m33760l(materialButton, new C6677a(c2381h));
        } else if (drawable != null) {
            C2373c.m33763i(materialButton, drawable, new C6678b(c2381h));
        } else {
            int intValue = (c2381h == null || (m33758b = c2381h.m33758b()) == null) ? -1 : m33758b.intValue();
            if (intValue != -1) {
                C2373c.m33768d(materialButton, intValue);
                return;
            }
            if (c2381h == null || (obj = c2381h.m33759a()) == null) {
                obj = materialButton.getText().toString();
            }
            C2373c.m33767e(materialButton, obj);
        }
    }
}
