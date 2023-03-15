package p207kl;

import java.util.Comparator;
import pt.pingodoce.app.data.local.models.shoppinglist.ShoppingListProduct;
import pt.pingodoce.app.presentation.shoppinglist.ShoppingListViewModel;

/* renamed from: kl.t0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6741t0 implements Comparator {

    /* renamed from: w */
    public static final /* synthetic */ C6741t0 f18103w = new C6741t0();

    private /* synthetic */ C6741t0() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ShoppingListViewModel.m11128f0((ShoppingListProduct) obj, (ShoppingListProduct) obj2);
    }
}
