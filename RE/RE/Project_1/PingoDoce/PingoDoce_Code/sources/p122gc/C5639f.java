package p122gc;

import com.google.zxing.qrcode.decoder.C4432j;
import com.google.zxing.qrcode.decoder.EnumC4428f;
import com.google.zxing.qrcode.decoder.EnumC4430h;

/* renamed from: gc.f */
/* loaded from: classes2.dex */
public final class C5639f {

    /* renamed from: a */
    private EnumC4430h f15891a;

    /* renamed from: b */
    private EnumC4428f f15892b;

    /* renamed from: c */
    private C4432j f15893c;

    /* renamed from: d */
    private int f15894d = -1;

    /* renamed from: e */
    private C5634b f15895e;

    /* renamed from: b */
    public static boolean m23462b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public C5634b m23463a() {
        return this.f15895e;
    }

    /* renamed from: c */
    public void m23461c(EnumC4428f enumC4428f) {
        this.f15892b = enumC4428f;
    }

    /* renamed from: d */
    public void m23460d(int i) {
        this.f15894d = i;
    }

    /* renamed from: e */
    public void m23459e(C5634b c5634b) {
        this.f15895e = c5634b;
    }

    /* renamed from: f */
    public void m23458f(EnumC4430h enumC4430h) {
        this.f15891a = enumC4430h;
    }

    /* renamed from: g */
    public void m23457g(C4432j c4432j) {
        this.f15893c = c4432j;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f15891a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f15892b);
        sb2.append("\n version: ");
        sb2.append(this.f15893c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f15894d);
        if (this.f15895e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f15895e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
