package okhttp3.internal.http2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: okhttp3.internal.http2.a */
/* loaded from: classes2.dex */
public enum EnumC8112a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public static final C8113a Companion = new C8113a(null);
    private final int httpCode;

    /* compiled from: ErrorCode.kt */
    /* renamed from: okhttp3.internal.http2.a$a */
    /* loaded from: classes2.dex */
    public static final class C8113a {
        private C8113a() {
        }

        public /* synthetic */ C8113a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EnumC8112a m16774a(int i) {
            EnumC8112a[] values;
            for (EnumC8112a enumC8112a : EnumC8112a.values()) {
                if (enumC8112a.getHttpCode() == i) {
                    return enumC8112a;
                }
            }
            return null;
        }
    }

    EnumC8112a(int i) {
        this.httpCode = i;
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
