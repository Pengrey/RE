package p313qc;

import com.squareup.moshi.AbstractC4470f;
import com.squareup.moshi.AbstractC4476h;
import com.squareup.moshi.AbstractC4483m;
import java.io.IOException;
import javax.annotation.Nullable;

/* renamed from: qc.a */
/* loaded from: classes2.dex */
public final class C9711a<T> extends AbstractC4470f<T> {

    /* renamed from: a */
    private final AbstractC4470f<T> f25567a;

    public C9711a(AbstractC4470f<T> abstractC4470f) {
        this.f25567a = abstractC4470f;
    }

    @Override // com.squareup.moshi.AbstractC4470f
    @Nullable
    /* renamed from: b */
    public T mo10144b(AbstractC4476h abstractC4476h) throws IOException {
        if (abstractC4476h.mo27440X() == AbstractC4476h.EnumC4478b.NULL) {
            return (T) abstractC4476h.mo27442P();
        }
        return this.f25567a.mo10144b(abstractC4476h);
    }

    @Override // com.squareup.moshi.AbstractC4470f
    /* renamed from: i */
    public void mo10143i(AbstractC4483m abstractC4483m, @Nullable T t) throws IOException {
        if (t == null) {
            abstractC4483m.mo27416H();
        } else {
            this.f25567a.mo10143i(abstractC4483m, t);
        }
    }

    public String toString() {
        return this.f25567a + ".nullSafe()";
    }
}
