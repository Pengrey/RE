package ai;

import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.app.DialogC0323b;
import androidx.core.app.ActivityC0904g;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.InterfaceC1440f0;
import androidx.lifecycle.LiveData;
import com.google.android.play.core.review.InterfaceC3954c;
import com.google.android.play.core.review.ReviewInfo;
import jm.C6537a;
import p101f9.AbstractC5433d;
import p101f9.InterfaceC5430a;
import p181jd.Intrinsics;
import p426wg.AbstractC11727d7;
import p468yc.C13195u;

/* renamed from: ai.f */
/* loaded from: classes2.dex */
public final class AppRating implements InterfaceC0149g {

    /* renamed from: a */
    private final ActivityC0904g f323a;

    /* renamed from: b */
    private final InterfaceC3954c f324b;

    /* renamed from: c */
    private boolean f325c;

    /* renamed from: d */
    private final C1436e0 f326d;

    /* renamed from: e */
    private final LiveData f327e;

    /* renamed from: f */
    private final DialogC0323b f328f;

    public AppRating(ActivityC0904g activityC0904g, InterfaceC3954c interfaceC3954c) {
        Intrinsics.isThisObjectNull(activityC0904g, "context");
        Intrinsics.isThisObjectNull(interfaceC3954c, "reviewManager");
        this.f323a = activityC0904g;
        this.f324b = interfaceC3954c;
        C1436e0 c1436e0 = new C1436e0();
        this.f326d = c1436e0;
        this.f327e = c1436e0;
        m41754j().mo171i(activityC0904g, new InterfaceC1440f0() { // from class: ai.c
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                AppRating.m41757g(AppRating.this, (C13195u) obj);
            }
        });
        final DialogC0323b m41279a = new DialogC0323b.C0324a(activityC0904g).m41276d(false).m41279a();
        AbstractC11727d7 m4408Q = AbstractC11727d7.m4408Q(LayoutInflater.from(m41279a.getContext()));
        Intrinsics.checkIfNull(m4408Q, "inflate(LayoutInflater.from(context))");
        m4408Q.f30097x.setOnClickListener(new View.OnClickListener() { // from class: ai.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppRating.m41756h(DialogC0323b.this, view);
            }
        });
        m4408Q.f30099z.setOnClickListener(new View.OnClickListener() { // from class: ai.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppRating.m41755i(AppRating.this, view);
            }
        });
        m41279a.m41280h(m4408Q.m37802s());
        Intrinsics.checkIfNull(m41279a, "Builder(context).setCanc…tView(binding.root)\n    }");
        this.f328f = m41279a;
    }

    /* renamed from: b */
    public static /* synthetic */ void m41762b(AppRating appRating, AbstractC5433d abstractC5433d) {
        m41751m(appRating, abstractC5433d);
    }

    /* renamed from: c */
    public static /* synthetic */ void m41761c(DialogC0323b dialogC0323b, View view) {
        m41756h(dialogC0323b, view);
    }

    /* renamed from: d */
    public static /* synthetic */ void m41760d(AppRating appRating, AbstractC5433d abstractC5433d) {
        m41752l(appRating, abstractC5433d);
    }

    /* renamed from: e */
    public static /* synthetic */ void m41759e(AppRating appRating, View view) {
        m41755i(appRating, view);
    }

    /* renamed from: f */
    public static /* synthetic */ void m41758f(AppRating appRating, C13195u c13195u) {
        m41757g(appRating, c13195u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m41757g(AppRating appRating, C13195u c13195u) {
        Intrinsics.isThisObjectNull(appRating, "this$0");
        appRating.f328f.cancel();
        appRating.f328f.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m41756h(DialogC0323b dialogC0323b, View view) {
        Intrinsics.isThisObjectNull(dialogC0323b, "$this_apply");
        dialogC0323b.cancel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m41755i(AppRating appRating, View view) {
        Intrinsics.isThisObjectNull(appRating, "this$0");
        appRating.m41753k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m41752l(AppRating appRating, AbstractC5433d abstractC5433d) {
        Intrinsics.isThisObjectNull(appRating, "this$0");
        Intrinsics.isThisObjectNull(abstractC5433d, "task");
        if (abstractC5433d.mo24367g()) {
            appRating.f324b.mo28524a(appRating.f323a, (ReviewInfo) abstractC5433d.mo24369e()).mo24373a(new InterfaceC5430a() { // from class: ai.d
                @Override // p101f9.InterfaceC5430a
                /* renamed from: a */
                public final void mo24376a(AbstractC5433d abstractC5554d2) {
                    AppRating.m41751m(AppRating.this, abstractC5554d2);
                }
            });
            return;
        }
        C6537a.m20674e(abstractC5433d.mo24370d());
        appRating.f325c = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m41751m(AppRating appRating, AbstractC5433d abstractC5433d) {
        Intrinsics.isThisObjectNull(appRating, "this$0");
        Intrinsics.isThisObjectNull(abstractC5433d, "it");
        appRating.f325c = false;
    }

    /* renamed from: a */
    public void mo41750a() {
        this.f326d.mo169m(C13195u.f34156a);
    }

    /* renamed from: j */
    public LiveData m41754j() {
        return this.f327e;
    }

    /* renamed from: k */
    public void m41753k() {
        if (this.f325c) {
            return;
        }
        this.f325c = true;
        this.f328f.cancel();
        this.f324b.mo28523b().mo24373a(new InterfaceC5430a() { // from class: ai.e
            @Override // p101f9.InterfaceC5430a
            /* renamed from: a */
            public final void mo24376a(AbstractC5433d abstractC5554d) {
                AppRating.m41752l(AppRating.this, abstractC5554d);
            }
        });
    }
}
