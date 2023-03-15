package p160ic;

import android.graphics.Rect;
import android.util.Log;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p138hc.C5905q;

/* renamed from: ic.q */
/* loaded from: classes2.dex */
public abstract class AbstractC6095q {

    /* renamed from: a */
    private static final String f16797a = "q";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreviewScalingStrategy.java */
    /* renamed from: ic.q$a */
    /* loaded from: classes2.dex */
    public class C6096a implements Comparator<C5905q> {

        /* renamed from: w */
        final /* synthetic */ C5905q f16798w;

        C6096a(C5905q c5905q) {
            this.f16798w = c5905q;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C5905q c5905q, C5905q c5905q2) {
            return Float.compare(AbstractC6095q.this.mo22160c(c5905q2, this.f16798w), AbstractC6095q.this.mo22160c(c5905q, this.f16798w));
        }
    }

    /* renamed from: a */
    public List<C5905q> m22162a(List<C5905q> list, C5905q c5905q) {
        if (c5905q == null) {
            return list;
        }
        Collections.sort(list, new C6096a(c5905q));
        return list;
    }

    /* renamed from: b */
    public C5905q m22161b(List<C5905q> list, C5905q c5905q) {
        List<C5905q> m22162a = m22162a(list, c5905q);
        String str = f16797a;
        Log.i(str, "Viewfinder size: " + c5905q);
        Log.i(str, "Preview in order of preference: " + m22162a);
        return m22162a.get(0);
    }

    /* renamed from: c */
    protected abstract float mo22160c(C5905q c5905q, C5905q c5905q2);

    /* renamed from: d */
    public abstract Rect mo22159d(C5905q c5905q, C5905q c5905q2);
}
