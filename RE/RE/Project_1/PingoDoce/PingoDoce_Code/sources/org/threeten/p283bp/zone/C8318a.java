package org.threeten.p283bp.zone;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.p283bp.C8282o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.threeten.bp.zone.a */
/* loaded from: classes2.dex */
public final class C8318a implements Externalizable {

    /* renamed from: w */
    private byte f21535w;

    /* renamed from: x */
    private Object f21536x;

    public C8318a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Object m15823a(DataInput dataInput) throws IOException, ClassNotFoundException {
        return m15821c(dataInput.readByte(), dataInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static long m15822b(DataInput dataInput) throws IOException {
        int readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return ((((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    /* renamed from: c */
    private static Object m15821c(byte b, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    return C8323e.m15787c(dataInput);
                }
                throw new StreamCorruptedException("Unknown serialized type");
            }
            return C8322d.m15792l(dataInput);
        }
        return C8319b.m15811m(dataInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static C8282o m15820d(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? C8282o.m15922u(dataInput.readInt()) : C8282o.m15922u(readByte * 900);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m15819e(long j, DataOutput dataOutput) throws IOException {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    /* renamed from: f */
    private static void m15818f(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b == 1) {
            ((C8319b) obj).m15810n(dataOutput);
        } else if (b == 2) {
            ((C8322d) obj).m15790n(dataOutput);
        } else if (b == 3) {
            ((C8323e) obj).m15786d(dataOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static void m15817g(C8282o c8282o, DataOutput dataOutput) throws IOException {
        int m15925r = c8282o.m15925r();
        int i = m15925r % 900 == 0 ? m15925r / 900 : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(m15925r);
        }
    }

    private Object readResolve() {
        return this.f21536x;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.f21535w = readByte;
        this.f21536x = m15821c(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        m15818f(this.f21535w, this.f21536x, objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8318a(byte b, Object obj) {
        this.f21535w = b;
        this.f21536x = obj;
    }
}
