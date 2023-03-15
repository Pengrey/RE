package ai;

import ai.AbstractC0151j;
import java.util.List;
import mg.AppRatingManager;
import p181jd.Intrinsics;
import p489zc.C13780s;

/* renamed from: ai.h */
/* loaded from: classes2.dex */
public final class AppRatingRational implements InterfaceC0150i {

    /* renamed from: a */
    private final AppRatingManager f329a;

    /* renamed from: b */
    private final InterfaceC0149g f330b;

    /* renamed from: c */
    private final List f331c;

    public AppRatingRational(AppRatingManager appRatingManager, InterfaceC0149g interfaceC0149g) {
        List m194j;
        Intrinsics.isThisObjectNull(appRatingManager, "manager");
        Intrinsics.isThisObjectNull(interfaceC0149g, "behavior");
        this.f329a = appRatingManager;
        this.f330b = interfaceC0149g;
        m194j = C13780s.m194j(AbstractC0151j.C0154c.f334a, AbstractC0151j.C0155d.f335a, AbstractC0151j.C0156e.f336a);
        this.f331c = m194j;
    }

    /* renamed from: a */
    public void mo41749a(AbstractC0151j abstractC0151j) {
        Intrinsics.isThisObjectNull(abstractC0151j, "event");
        if (abstractC0151j.m41747b()) {
            this.f329a.m18947c(abstractC0151j);
        }
        if (this.f329a.m18948b() || !abstractC0151j.m41746c()) {
            return;
        }
        for (AbstractC0151j abstractC0151j2 : this.f331c) {
            if (this.f329a.m18949a(abstractC0151j2) >= abstractC0151j2.m41748a()) {
                this.f329a.m18946d();
                this.f330b.mo41750a();
            }
        }
    }
}
