package p138hc;

import android.graphics.Bitmap;
import com.google.zxing.C4409m;
import com.google.zxing.C4411o;
import com.google.zxing.EnumC4392a;
import com.google.zxing.EnumC4410n;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: hc.c */
/* loaded from: classes2.dex */
public class C5888c {

    /* renamed from: a */
    protected C4409m f16318a;

    /* renamed from: b */
    protected C5906r f16319b;

    public C5888c(C4409m c4409m, C5906r c5906r) {
        this.f16318a = c4409m;
        this.f16319b = c5906r;
    }

    /* renamed from: e */
    public static List<C4411o> m22813e(List<C4411o> list, C5906r c5906r) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C4411o c4411o : list) {
            arrayList.add(c5906r.m22769f(c4411o));
        }
        return arrayList;
    }

    /* renamed from: a */
    public EnumC4392a m22817a() {
        return this.f16318a.m27649b();
    }

    /* renamed from: b */
    public Bitmap m22816b() {
        return this.f16319b.m22773b(null, 2);
    }

    /* renamed from: c */
    public byte[] m22815c() {
        return this.f16318a.m27648c();
    }

    /* renamed from: d */
    public Map<EnumC4410n, Object> m22814d() {
        return this.f16318a.m27647d();
    }

    public String toString() {
        return this.f16318a.m27645f();
    }
}
