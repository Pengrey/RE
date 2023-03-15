package p048cj;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.result.AbstractC0304b;
import androidx.appcompat.app.ActivityC0325c;
import androidx.core.app.C0890c;
import androidx.core.content.C0928a;
import androidx.core.util.C1072d;
import mg.TransactionCacheManager;
import p106fe.CommonUtils;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.local.models.products.CatalogProduct;

/* renamed from: cj.g */
/* loaded from: classes2.dex */
public final class ProductDetailActivity {
    /* renamed from: a */
    public static final void m34575a(AbstractC0304b abstractC0304b, Activity activity, CatalogProduct catalogProduct, View view, boolean z, TransactionCacheManager transactionCacheManager) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(catalogProduct, "product");
        Intrinsics.isThisObjectNull(transactionCacheManager, "cache");
        transactionCacheManager.m18589a(catalogProduct);
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.common.product.ProductDetailActivity.class);
        intent.putExtra("EXTRA_FOR_TRADE", z);
        if (view == null) {
            abstractC0304b.m41324a(intent);
            return;
        }
        C0890c m39251a = C0890c.m39251a(activity, new C1072d(view, "TRANSITION_IMAGE"));
        Intrinsics.checkIfNull(m39251a, "makeSceneTransitionAnima…image, TRANSITION_IMAGE))");
        Bundle mo39250b = m39251a.mo39250b();
        if (mo39250b == null) {
            abstractC0304b.m41324a(intent);
        } else if (CommonUtils.f15361a.m24299c(mo39250b)) {
            abstractC0304b.m41324a(intent);
        } else {
            abstractC0304b.mo37539b(intent, m39251a);
        }
    }

    /* renamed from: b */
    public static final void m34574b(ActivityC0325c activityC0325c, CatalogProduct catalogProduct, View view, boolean z, TransactionCacheManager transactionCacheManager) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(catalogProduct, "product");
        Intrinsics.isThisObjectNull(transactionCacheManager, "cache");
        transactionCacheManager.m18589a(catalogProduct);
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.common.product.ProductDetailActivity.class);
        intent.putExtra("EXTRA_FOR_TRADE", z);
        if (view == null) {
            activityC0325c.startActivity(intent);
            return;
        }
        Bundle mo39250b = C0890c.m39251a(activityC0325c, new C1072d(view, "TRANSITION_IMAGE")).mo39250b();
        if (mo39250b == null) {
            activityC0325c.startActivity(intent);
        } else if (CommonUtils.f15361a.m24299c(mo39250b)) {
            activityC0325c.startActivity(intent);
        } else {
            C0928a.m39104m(activityC0325c, intent, mo39250b);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m34573c(AbstractC0304b abstractC0304b, Activity activity, CatalogProduct catalogProduct, View view, boolean z, TransactionCacheManager transactionCacheManager, int i, Object obj) {
        if ((i & 4) != 0) {
            view = null;
        }
        View view2 = view;
        if ((i & 8) != 0) {
            z = false;
        }
        m34575a(abstractC0304b, activity, catalogProduct, view2, z, transactionCacheManager);
    }

    /* renamed from: d */
    public static /* synthetic */ void m34572d(ActivityC0325c activityC0325c, CatalogProduct catalogProduct, View view, boolean z, TransactionCacheManager transactionCacheManager, int i, Object obj) {
        if ((i & 2) != 0) {
            view = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        m34574b(activityC0325c, catalogProduct, view, z, transactionCacheManager);
    }
}
