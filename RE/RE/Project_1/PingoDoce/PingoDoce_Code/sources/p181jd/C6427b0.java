package p181jd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: jd.b0 */
/* loaded from: classes2.dex */
public class C6427b0 {

    /* renamed from: a */
    private final ArrayList<Object> f17514a;

    public C6427b0(int i) {
        this.f17514a = new ArrayList<>(i);
    }

    /* renamed from: a */
    public void m20962a(Object obj) {
        this.f17514a.add(obj);
    }

    /* renamed from: b */
    public void m20961b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f17514a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f17514a, objArr);
            }
        } else if (obj instanceof Collection) {
            this.f17514a.addAll((Collection) obj);
        } else if (obj instanceof Iterable) {
            for (Object obj2 : (Iterable) obj) {
                this.f17514a.add(obj2);
            }
        } else if (obj instanceof Iterator) {
            Iterator it = (Iterator) obj;
            while (it.hasNext()) {
                this.f17514a.add(it.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    /* renamed from: c */
    public int m20960c() {
        return this.f17514a.size();
    }

    /* renamed from: d */
    public Object[] m20959d(Object[] objArr) {
        return this.f17514a.toArray(objArr);
    }
}
