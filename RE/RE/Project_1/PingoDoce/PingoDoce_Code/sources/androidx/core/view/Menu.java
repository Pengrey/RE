package androidx.core.view;

import android.view.MenuItem;
import java.util.Iterator;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;

/* renamed from: androidx.core.view.l */
/* loaded from: classes.dex */
public final class Menu {

    /* compiled from: Menu.kt */
    /* renamed from: androidx.core.view.l$a */
    /* loaded from: classes.dex */
    public static final class C1178a implements Iterator, InterfaceC6650a {

        /* renamed from: w */
        private int f3534w;

        /* renamed from: x */
        final /* synthetic */ android.view.Menu f3535x;

        C1178a(android.view.Menu menu) {
            this.f3535x = menu;
        }

        /* renamed from: a */
        public MenuItem mo37183a() {
            android.view.Menu menu = this.f3535x;
            int i = this.f3534w;
            this.f3534w = i + 1;
            MenuItem item = menu.getItem(i);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.f3534w < this.f3535x.size();
        }

        public void remove() {
            android.view.Menu menu = this.f3535x;
            int i = this.f3534w - 1;
            this.f3534w = i;
            menu.removeItem(i);
        }
    }

    /* renamed from: a */
    public static final Iterator m38121a(android.view.Menu menu) {
        Intrinsics.isThisObjectNull(menu, "<this>");
        return new C1178a(menu);
    }
}
