package org.threeten.p283bp;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.threeten.bp.k */
/* loaded from: classes2.dex */
public final class C8273k implements Externalizable {

    /* renamed from: w */
    private byte f21475w;

    /* renamed from: x */
    private Object f21476x;

    public C8273k() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m15965a(DataInput dataInput) throws IOException {
        return m15964b(dataInput.readByte(), dataInput);
    }

    /* renamed from: b */
    private static Object m15964b(byte b, DataInput dataInput) throws IOException {
        if (b != 64) {
            switch (b) {
                case 1:
                    return C8170b.m16401h(dataInput);
                case 2:
                    return C8171c.m16379z(dataInput);
                case 3:
                    return C8213d.m16184X(dataInput);
                case 4:
                    return C8216e.m16142R(dataInput);
                case 5:
                    return C8219f.m16119F(dataInput);
                case 6:
                    return C8285q.m15901I(dataInput);
                case 7:
                    return C8284p.m15910q(dataInput);
                case 8:
                    return C8282o.m15920w(dataInput);
                default:
                    switch (b) {
                        case 66:
                            return C8270j.m15972n(dataInput);
                        case 67:
                            return C8274l.m15955o(dataInput);
                        case 68:
                            return C8277m.m15942p(dataInput);
                        case 69:
                            return C8266i.m15988p(dataInput);
                        default:
                            throw new StreamCorruptedException("Unknown serialized type");
                    }
            }
        }
        return C8263h.m16001m(dataInput);
    }

    /* renamed from: c */
    static void m15963c(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b != 64) {
            switch (b) {
                case 1:
                    ((C8170b) obj).m16400i(dataOutput);
                    return;
                case 2:
                    ((C8171c) obj).m16395F(dataOutput);
                    return;
                case 3:
                    ((C8213d) obj).m16176f0(dataOutput);
                    return;
                case 4:
                    ((C8216e) obj).m16137W(dataOutput);
                    return;
                case 5:
                    ((C8219f) obj).m16110O(dataOutput);
                    return;
                case 6:
                    ((C8285q) obj).m15890T(dataOutput);
                    return;
                case 7:
                    ((C8284p) obj).m15909r(dataOutput);
                    return;
                case 8:
                    ((C8282o) obj).m15917z(dataOutput);
                    return;
                default:
                    switch (b) {
                        case 66:
                            ((C8270j) obj).m15967s(dataOutput);
                            return;
                        case 67:
                            ((C8274l) obj).m15952r(dataOutput);
                            return;
                        case 68:
                            ((C8277m) obj).m15936x(dataOutput);
                            return;
                        case 69:
                            ((C8266i) obj).m15997B(dataOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        }
        ((C8263h) obj).m16000n(dataOutput);
    }

    private Object readResolve() {
        return this.f21476x;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte readByte = objectInput.readByte();
        this.f21475w = readByte;
        this.f21476x = m15964b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        m15963c(this.f21475w, this.f21476x, objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8273k(byte b, Object obj) {
        this.f21475w = b;
        this.f21476x = obj;
    }
}
