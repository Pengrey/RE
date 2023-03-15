package p401v8;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: v8.b */
/* loaded from: classes.dex */
public final class C11136b implements InterfaceC11137c {

    /* renamed from: a */
    private final InterfaceC11137c f28568a;

    /* renamed from: b */
    private final float f28569b;

    public C11136b(float f, InterfaceC11137c interfaceC11137c) {
        while (interfaceC11137c instanceof C11136b) {
            interfaceC11137c = ((C11136b) interfaceC11137c).f28568a;
            f += ((C11136b) interfaceC11137c).f28569b;
        }
        this.f28568a = interfaceC11137c;
        this.f28569b = f;
    }

    @Override // p401v8.InterfaceC11137c
    /* renamed from: a */
    public float mo5959a(RectF rectF) {
        return Math.max(0.0f, this.f28568a.mo5959a(rectF) + this.f28569b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11136b) {
            C11136b c11136b = (C11136b) obj;
            return this.f28568a.equals(c11136b.f28568a) && this.f28569b == c11136b.f28569b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28568a, Float.valueOf(this.f28569b)});
    }
}
