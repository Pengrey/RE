package p231m2;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: m2.b */
/* loaded from: classes.dex */
class C7104b {

    /* compiled from: FocusStrategy.java */
    /* renamed from: m2.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7105a<T> {
        /* renamed from: a */
        void mo19245a(T t, Rect rect);
    }

    /* compiled from: FocusStrategy.java */
    /* renamed from: m2.b$b */
    /* loaded from: classes.dex */
    public interface InterfaceC7106b<T, V> {
        /* renamed from: a */
        V mo19244a(T t, int i);

        /* renamed from: b */
        int mo19243b(T t);
    }

    /* compiled from: FocusStrategy.java */
    /* renamed from: m2.b$c */
    /* loaded from: classes.dex */
    private static class C7107c<T> implements Comparator<T> {

        /* renamed from: w */
        private final Rect f18850w = new Rect();

        /* renamed from: x */
        private final Rect f18851x = new Rect();

        /* renamed from: y */
        private final boolean f18852y;

        /* renamed from: z */
        private final InterfaceC7105a<T> f18853z;

        C7107c(boolean z, InterfaceC7105a<T> interfaceC7105a) {
            this.f18852y = z;
            this.f18853z = interfaceC7105a;
        }

        @Override // java.util.Comparator
        public int compare(T t, T t2) {
            Rect rect = this.f18850w;
            Rect rect2 = this.f18851x;
            this.f18853z.mo19245a(t, rect);
            this.f18853z.mo19245a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f18852y ? 1 : -1;
            } else if (i3 > i4) {
                return this.f18852y ? -1 : 1;
            } else {
                int i5 = rect.bottom;
                int i6 = rect2.bottom;
                if (i5 < i6) {
                    return -1;
                }
                if (i5 > i6) {
                    return 1;
                }
                int i7 = rect.right;
                int i8 = rect2.right;
                if (i7 < i8) {
                    return this.f18852y ? 1 : -1;
                } else if (i7 > i8) {
                    return this.f18852y ? -1 : 1;
                } else {
                    return 0;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m19260a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean m19259b = m19259b(i, rect, rect2);
        if (m19259b(i, rect, rect3) || !m19259b) {
            return false;
        }
        return !m19251j(i, rect, rect3) || i == 17 || i == 66 || m19250k(i, rect, rect2) < m19248m(i, rect, rect3);
    }

    /* renamed from: b */
    private static boolean m19259b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: c */
    public static <L, T> T m19258c(L l, InterfaceC7106b<L, T> interfaceC7106b, InterfaceC7105a<T> interfaceC7105a, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int mo19243b = interfaceC7106b.mo19243b(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < mo19243b; i2++) {
            T mo19244a = interfaceC7106b.mo19244a(l, i2);
            if (mo19244a != t) {
                interfaceC7105a.mo19245a(mo19244a, rect3);
                if (m19253h(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = mo19244a;
                }
            }
        }
        return t2;
    }

    /* renamed from: d */
    public static <L, T> T m19257d(L l, InterfaceC7106b<L, T> interfaceC7106b, InterfaceC7105a<T> interfaceC7105a, T t, int i, boolean z, boolean z2) {
        int mo19243b = interfaceC7106b.mo19243b(l);
        ArrayList arrayList = new ArrayList(mo19243b);
        for (int i2 = 0; i2 < mo19243b; i2++) {
            arrayList.add(interfaceC7106b.mo19244a(l, i2));
        }
        Collections.sort(arrayList, new C7107c(z, interfaceC7105a));
        if (i != 1) {
            if (i == 2) {
                return (T) m19256e(t, arrayList, z2);
            }
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
        return (T) m19255f(t, arrayList, z2);
    }

    /* renamed from: e */
    private static <T> T m19256e(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    private static <T> T m19255f(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    private static int m19254g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    private static boolean m19253h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (m19252i(rect, rect2, i)) {
            if (m19252i(rect, rect3, i) && !m19260a(i, rect, rect2, rect3)) {
                return !m19260a(i, rect, rect3, rect2) && m19254g(m19250k(i, rect, rect2), m19246o(i, rect, rect2)) < m19254g(m19250k(i, rect, rect3), m19246o(i, rect, rect3));
            }
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private static boolean m19252i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    private static boolean m19251j(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        } else if (i == 33) {
            return rect.top >= rect2.bottom;
        } else if (i == 66) {
            return rect.right <= rect2.left;
        } else if (i == 130) {
            return rect.bottom <= rect2.top;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: k */
    private static int m19250k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m19249l(i, rect, rect2));
    }

    /* renamed from: l */
    private static int m19249l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: m */
    private static int m19248m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m19247n(i, rect, rect2));
    }

    /* renamed from: n */
    private static int m19247n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: o */
    private static int m19246o(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
