package p451xi;

import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;
import p489zc.C13780s;
import p489zc.Iterables;
import pt.pingodoce.app.data.local.models.loyaltyCard.LoyaltyCardProvisory;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.C14956OnboardingResumeInfoRowItem;

/* compiled from: LoyaltyCardResumeViewModel.kt */
/* renamed from: xi.f */
/* loaded from: classes2.dex */
public final class C12997f {
    /* renamed from: a */
    public static final List m1964a(List list) {
        int m186r;
        C14956OnboardingResumeInfoRowItem c14956OnboardingResumeInfoRowItem;
        Intrinsics.isThisObjectNull(list, "<this>");
        m186r = Iterables.m186r(list, 10);
        ArrayList arrayList = new ArrayList(m186r);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                C13780s.m187q();
            }
            LoyaltyCardProvisory loyaltyCardProvisory = (LoyaltyCardProvisory) obj;
            if (i == 0) {
                c14956OnboardingResumeInfoRowItem = new C14956OnboardingResumeInfoRowItem(loyaltyCardProvisory.m14566e(), true);
            } else {
                c14956OnboardingResumeInfoRowItem = new C14956OnboardingResumeInfoRowItem(loyaltyCardProvisory.m14566e(), false, 2, null);
            }
            arrayList.add(c14956OnboardingResumeInfoRowItem);
            i = i2;
        }
        return arrayList;
    }
}
