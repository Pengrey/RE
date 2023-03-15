package p436x3;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p130h4.C5852h;

/* renamed from: x3.b */
/* loaded from: classes.dex */
public class C12263b {

    /* renamed from: a */
    private List<C12282s> f32331a = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m3174a(C12282s c12282s) {
        this.f32331a.add(c12282s);
    }

    /* renamed from: b */
    public void m3173b(Path path) {
        for (int size = this.f32331a.size() - 1; size >= 0; size--) {
            C5852h.m22889b(path, this.f32331a.get(size));
        }
    }
}
