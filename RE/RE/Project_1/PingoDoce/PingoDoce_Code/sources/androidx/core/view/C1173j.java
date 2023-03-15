package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.j */
/* loaded from: classes.dex */
public class C1173j {

    /* renamed from: a */
    private final CopyOnWriteArrayList<InterfaceC1182m> f3533a = new CopyOnWriteArrayList<>();

    public C1173j(Runnable runnable) {
        new HashMap();
    }

    /* renamed from: a */
    public void m38145a(Menu menu, MenuInflater menuInflater) {
        Iterator<InterfaceC1182m> it = this.f3533a.iterator();
        while (it.hasNext()) {
            it.next().m38114b(menu, menuInflater);
        }
    }

    /* renamed from: b */
    public boolean m38144b(MenuItem menuItem) {
        Iterator<InterfaceC1182m> it = this.f3533a.iterator();
        while (it.hasNext()) {
            if (it.next().m38115a(menuItem)) {
                return true;
            }
        }
        return false;
    }
}
