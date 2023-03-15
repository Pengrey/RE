package p401v8;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: v8.a */
/* loaded from: classes.dex */
public final class C11135a implements InterfaceC11137c {

    /* renamed from: a */
    private final float f28567a;

    public C11135a(float f) {
        this.f28567a = f;
    }

    @Override // p401v8.InterfaceC11137c
    /* renamed from: a */
    public float mo5959a(RectF rectF) {
        return this.f28567a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11135a) && this.f28567a == ((C11135a) obj).f28567a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f28567a)});
    }
}
