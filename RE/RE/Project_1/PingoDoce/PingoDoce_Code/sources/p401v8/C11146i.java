package p401v8;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: v8.i */
/* loaded from: classes.dex */
public final class C11146i implements InterfaceC11137c {

    /* renamed from: a */
    private final float f28620a;

    public C11146i(float f) {
        this.f28620a = f;
    }

    @Override // p401v8.InterfaceC11137c
    /* renamed from: a */
    public float mo5959a(RectF rectF) {
        return this.f28620a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11146i) && this.f28620a == ((C11146i) obj).f28620a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f28620a)});
    }
}
