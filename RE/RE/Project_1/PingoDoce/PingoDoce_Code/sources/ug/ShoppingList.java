package ug;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kg.FriendImage;
import p181jd.Intrinsics;
import p361t3.C10377a;
import pt.pingodoce.app.data.local.models.shoppinglist.Friend;
import pt.pingodoce.app.data.local.models.shoppinglist.FriendLight;

/* renamed from: ug.a */
/* loaded from: classes2.dex */
public final class ShoppingList {
    /* renamed from: a */
    public static final List m6794a(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new FriendImage(((Friend) it.next()).m14398e(), new C10377a(), false, 4, null));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List m6793b(List list) {
        Intrinsics.isThisObjectNull(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Friend friend = (Friend) it.next();
            arrayList.add(new FriendLight(friend.m14399d(), friend.m14400c()));
        }
        return arrayList;
    }
}
