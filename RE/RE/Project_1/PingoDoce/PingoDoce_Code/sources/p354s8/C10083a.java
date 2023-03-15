package p354s8;

import android.graphics.Typeface;

/* renamed from: s8.a */
/* loaded from: classes.dex */
public final class C10083a extends AbstractC10091f {

    /* renamed from: a */
    private final Typeface f26340a;

    /* renamed from: b */
    private final InterfaceC10084a f26341b;

    /* renamed from: c */
    private boolean f26342c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: s8.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC10084a {
        /* renamed from: a */
        void mo9235a(Typeface typeface);
    }

    public C10083a(InterfaceC10084a interfaceC10084a, Typeface typeface) {
        this.f26340a = typeface;
        this.f26341b = interfaceC10084a;
    }

    /* renamed from: d */
    private void m9236d(Typeface typeface) {
        if (this.f26342c) {
            return;
        }
        this.f26341b.mo9235a(typeface);
    }

    @Override // p354s8.AbstractC10091f
    /* renamed from: a */
    public void mo9200a(int i) {
        m9236d(this.f26340a);
    }

    @Override // p354s8.AbstractC10091f
    /* renamed from: b */
    public void mo9199b(Typeface typeface, boolean z) {
        m9236d(typeface);
    }

    /* renamed from: c */
    public void m9237c() {
        this.f26342c = true;
    }
}
