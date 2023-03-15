package p193k3;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bd.InterfaceC1886d;
import p095f3.InterfaceC5359e;
import p129h3.EnumC5826d;
import p193k3.InterfaceC6580h;
import p305q3.C9635k;
import p396v3.C11098i;
import p396v3.C11101k;

/* renamed from: k3.e */
/* loaded from: classes.dex */
public final class C6576e implements InterfaceC6580h {

    /* renamed from: a */
    private final Drawable f17810a;

    /* renamed from: b */
    private final C9635k f17811b;

    /* compiled from: DrawableFetcher.kt */
    /* renamed from: k3.e$a */
    /* loaded from: classes.dex */
    public static final class C6577a implements InterfaceC6580h.InterfaceC6581a<Drawable> {
        @Override // p193k3.InterfaceC6580h.InterfaceC6581a
        /* renamed from: b */
        public InterfaceC6580h mo20560b(Drawable drawable, C9635k c9635k, InterfaceC5359e interfaceC5359e) {
            return new C6576e(drawable, c9635k);
        }
    }

    public C6576e(Drawable drawable, C9635k c9635k) {
        this.f17810a = drawable;
        this.f17811b = c9635k;
    }

    @Override // p193k3.InterfaceC6580h
    /* renamed from: a */
    public Object mo20548a(InterfaceC1886d<? super AbstractC6579g> interfaceC1886d) {
        Drawable drawable;
        boolean m6134v = C11098i.m6134v(this.f17810a);
        if (m6134v) {
            drawable = new BitmapDrawable(this.f17811b.m10324g().getResources(), C11101k.f28493a.m6128a(this.f17810a, this.f17811b.m10325f(), this.f17811b.m10317n(), this.f17811b.m10318m(), this.f17811b.m10328c()));
        } else {
            drawable = this.f17810a;
        }
        return new C6578f(drawable, m6134v, EnumC5826d.MEMORY);
    }
}
