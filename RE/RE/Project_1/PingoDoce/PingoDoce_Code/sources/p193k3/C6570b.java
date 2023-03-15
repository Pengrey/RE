package p193k3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import bd.InterfaceC1886d;
import p095f3.InterfaceC5359e;
import p129h3.EnumC5826d;
import p193k3.InterfaceC6580h;
import p305q3.C9635k;

/* renamed from: k3.b */
/* loaded from: classes.dex */
public final class C6570b implements InterfaceC6580h {

    /* renamed from: a */
    private final Bitmap f17804a;

    /* renamed from: b */
    private final C9635k f17805b;

    /* compiled from: BitmapFetcher.kt */
    /* renamed from: k3.b$a */
    /* loaded from: classes.dex */
    public static final class C6571a implements InterfaceC6580h.InterfaceC6581a<Bitmap> {
        @Override // p193k3.InterfaceC6580h.InterfaceC6581a
        /* renamed from: b */
        public InterfaceC6580h mo20560b(Bitmap bitmap, C9635k c9635k, InterfaceC5359e interfaceC5359e) {
            return new C6570b(bitmap, c9635k);
        }
    }

    public C6570b(Bitmap bitmap, C9635k c9635k) {
        this.f17804a = bitmap;
        this.f17805b = c9635k;
    }

    @Override // p193k3.InterfaceC6580h
    /* renamed from: a */
    public Object mo20548a(InterfaceC1886d<? super AbstractC6579g> interfaceC1886d) {
        return new C6578f(new BitmapDrawable(this.f17805b.m10324g().getResources(), this.f17804a), false, EnumC5826d.MEMORY);
    }
}
