package p397v4;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p397v4.ModelManager;
import p468yc.C13191r;
import p489zc.C13769l0;
import p489zc.C13778q0;

/* renamed from: v4.b */
/* loaded from: classes.dex */
public final class Model {

    /* renamed from: m */
    private static final Map f28520m;

    /* renamed from: n */
    public static final C11115a f28521n = new C11115a(null);

    /* renamed from: a */
    private final MTensor f28522a;

    /* renamed from: b */
    private final MTensor f28523b;

    /* renamed from: c */
    private final MTensor f28524c;

    /* renamed from: d */
    private final MTensor f28525d;

    /* renamed from: e */
    private final MTensor f28526e;

    /* renamed from: f */
    private final MTensor f28527f;

    /* renamed from: g */
    private final MTensor f28528g;

    /* renamed from: h */
    private final MTensor f28529h;

    /* renamed from: i */
    private final MTensor f28530i;

    /* renamed from: j */
    private final MTensor f28531j;

    /* renamed from: k */
    private final MTensor f28532k;

    /* renamed from: l */
    private final Map f28533l;

    /* compiled from: Model.kt */
    /* renamed from: v4.b$a */
    /* loaded from: classes.dex */
    public static final class C11115a {
        private C11115a() {
        }

        /* renamed from: b */
        private final Map m6098b(File file) {
            Map m6048c = C11126g.m6048c(file);
            if (m6048c != null) {
                HashMap hashMap = new HashMap();
                Map m6101a = Model.m6101a();
                for (Map.Entry entry : m6048c.entrySet()) {
                    String str = (String) entry.getKey();
                    if (m6101a.containsKey(entry.getKey()) && (str = (String) m6101a.get(entry.getKey())) == null) {
                        return null;
                    }
                    hashMap.put(str, entry.getValue());
                }
                return hashMap;
            }
            return null;
        }

        /* renamed from: a */
        public final Model m6099a(File file) {
            Intrinsics.isThisObjectNull(file, "file");
            Map m6098b = m6098b(file);
            if (m6098b != null) {
                try {
                    return new Model(m6098b, null);
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public /* synthetic */ C11115a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        HashMap m332g;
        m332g = C13769l0.m332g(C13191r.m1447a("embedding.weight", "embed.weight"), C13191r.m1447a("dense1.weight", "fc1.weight"), C13191r.m1447a("dense2.weight", "fc2.weight"), C13191r.m1447a("dense3.weight", "fc3.weight"), C13191r.m1447a("dense1.bias", "fc1.bias"), C13191r.m1447a("dense2.bias", "fc2.bias"), C13191r.m1447a("dense3.bias", "fc3.bias"));
        f28520m = m332g;
    }

    private Model(Map map) {
        Set<String> m204f;
        Object obj = map.get("embed.weight");
        if (obj != null) {
            this.f28522a = (MTensor) obj;
            Object obj2 = map.get("convs.0.weight");
            if (obj2 != null) {
                this.f28523b = Operator.m6051l((MTensor) obj2);
                Object obj3 = map.get("convs.1.weight");
                if (obj3 != null) {
                    this.f28524c = Operator.m6051l((MTensor) obj3);
                    Object obj4 = map.get("convs.2.weight");
                    if (obj4 != null) {
                        this.f28525d = Operator.m6051l((MTensor) obj4);
                        Object obj5 = map.get("convs.0.bias");
                        if (obj5 != null) {
                            this.f28526e = (MTensor) obj5;
                            Object obj6 = map.get("convs.1.bias");
                            if (obj6 != null) {
                                this.f28527f = (MTensor) obj6;
                                Object obj7 = map.get("convs.2.bias");
                                if (obj7 != null) {
                                    this.f28528g = (MTensor) obj7;
                                    Object obj8 = map.get("fc1.weight");
                                    if (obj8 != null) {
                                        this.f28529h = Operator.m6052k((MTensor) obj8);
                                        Object obj9 = map.get("fc2.weight");
                                        if (obj9 != null) {
                                            this.f28530i = Operator.m6052k((MTensor) obj9);
                                            Object obj10 = map.get("fc1.bias");
                                            if (obj10 != null) {
                                                this.f28531j = (MTensor) obj10;
                                                Object obj11 = map.get("fc2.bias");
                                                if (obj11 != null) {
                                                    this.f28532k = (MTensor) obj11;
                                                    this.f28533l = new HashMap();
                                                    m204f = C13778q0.m204f(ModelManager.EnumC11117a.MTML_INTEGRITY_DETECT.toKey(), ModelManager.EnumC11117a.MTML_APP_EVENT_PREDICTION.toKey());
                                                    for (String str : m204f) {
                                                        String str2 = str + ".weight";
                                                        String str3 = str + ".bias";
                                                        MTensor mTensor = (MTensor) map.get(str2);
                                                        MTensor mTensor2 = (MTensor) map.get(str3);
                                                        if (mTensor != null) {
                                                            this.f28533l.put(str2, Operator.m6052k(mTensor));
                                                        }
                                                        if (mTensor2 != null) {
                                                            this.f28533l.put(str3, mTensor2);
                                                        }
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.".toString());
                                            }
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: a */
    public static final /* synthetic */ Map m6101a() {
        if (CrashShieldHandler.m25963d(Model.class)) {
            return null;
        }
        try {
            return f28520m;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, Model.class);
            return null;
        }
    }

    /* renamed from: b */
    public final MTensor m6100b(MTensor mTensor, String[] strArr, String str) {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(mTensor, "dense");
            Intrinsics.isThisObjectNull(strArr, "texts");
            Intrinsics.isThisObjectNull(str, "task");
            MTensor m6060c = Operator.m6060c(Operator.m6058e(strArr, 128, this.f28522a), this.f28523b);
            Operator.m6062a(m6060c, this.f28526e);
            Operator.m6054i(m6060c);
            MTensor m6060c2 = Operator.m6060c(m6060c, this.f28524c);
            Operator.m6062a(m6060c2, this.f28527f);
            Operator.m6054i(m6060c2);
            MTensor m6056g = Operator.m6056g(m6060c2, 2);
            MTensor m6060c3 = Operator.m6060c(m6056g, this.f28525d);
            Operator.m6062a(m6060c3, this.f28528g);
            Operator.m6054i(m6060c3);
            MTensor m6056g2 = Operator.m6056g(m6060c, m6060c.m6106b(1));
            MTensor m6056g3 = Operator.m6056g(m6056g, m6056g.m6106b(1));
            MTensor m6056g4 = Operator.m6056g(m6060c3, m6060c3.m6106b(1));
            Operator.m6057f(m6056g2, 1);
            Operator.m6057f(m6056g3, 1);
            Operator.m6057f(m6056g4, 1);
            MTensor m6059d = Operator.m6059d(Operator.m6061b(new MTensor[]{m6056g2, m6056g3, m6056g4, mTensor}), this.f28529h, this.f28531j);
            Operator.m6054i(m6059d);
            MTensor m6059d2 = Operator.m6059d(m6059d, this.f28530i, this.f28532k);
            Operator.m6054i(m6059d2);
            Map map = this.f28533l;
            MTensor mTensor2 = (MTensor) map.get(str + ".weight");
            Map map2 = this.f28533l;
            MTensor mTensor3 = (MTensor) map2.get(str + ".bias");
            if (mTensor2 != null && mTensor3 != null) {
                MTensor m6059d3 = Operator.m6059d(m6059d2, mTensor2, mTensor3);
                Operator.m6053j(m6059d3);
                return m6059d3;
            }
            return null;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    public /* synthetic */ Model(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }
}
