package com.google.crypto.tink.subtle;

import com.google.crypto.tink.subtle.Ed25519;
import java.lang.reflect.Array;
import java.math.BigInteger;

/* loaded from: classes.dex */
final class Ed25519Constants {

    /* renamed from: B2 */
    static final Ed25519.CachedXYT[] f11367B2;
    static final Ed25519.CachedXYT[][] B_TABLE;

    /* renamed from: D */
    static final long[] f11368D;

    /* renamed from: D2 */
    static final long[] f11369D2;
    private static final BigInteger D2_BI;
    private static final BigInteger D_BI;
    private static final BigInteger P_BI;
    static final long[] SQRTM1;
    private static final BigInteger SQRTM1_BI;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class Point {

        /* renamed from: x */
        private BigInteger f11370x;

        /* renamed from: y */
        private BigInteger f11371y;

        private Point() {
        }
    }

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        P_BI = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        D_BI = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        D2_BI = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        SQRTM1_BI = modPow;
        Point point = new Point();
        point.f11371y = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        point.f11370x = recoverX(point.f11371y);
        f11368D = Field25519.expand(toLittleEndian(mod));
        f11369D2 = Field25519.expand(toLittleEndian(mod2));
        SQRTM1 = Field25519.expand(toLittleEndian(modPow));
        B_TABLE = (Ed25519.CachedXYT[][]) Array.newInstance(Ed25519.CachedXYT.class, 32, 8);
        Point point2 = point;
        for (int i = 0; i < 32; i++) {
            Point point3 = point2;
            for (int i2 = 0; i2 < 8; i2++) {
                B_TABLE[i][i2] = getCachedXYT(point3);
                point3 = edwards(point3, point2);
            }
            for (int i3 = 0; i3 < 8; i3++) {
                point2 = edwards(point2, point2);
            }
        }
        Point edwards = edwards(point, point);
        f11367B2 = new Ed25519.CachedXYT[8];
        for (int i4 = 0; i4 < 8; i4++) {
            f11367B2[i4] = getCachedXYT(point);
            point = edwards(point, edwards);
        }
    }

    Ed25519Constants() {
    }

    private static Point edwards(Point point, Point point2) {
        Point point3 = new Point();
        BigInteger multiply = D_BI.multiply(point.f11370x.multiply(point2.f11370x).multiply(point.f11371y).multiply(point2.f11371y));
        BigInteger bigInteger = P_BI;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = point.f11370x.multiply(point2.f11371y).add(point2.f11370x.multiply(point.f11371y));
        BigInteger bigInteger2 = BigInteger.ONE;
        point3.f11370x = add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger);
        point3.f11371y = point.f11371y.multiply(point2.f11371y).add(point.f11370x.multiply(point2.f11370x)).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return point3;
    }

    private static Ed25519.CachedXYT getCachedXYT(Point point) {
        BigInteger add = point.f11371y.add(point.f11370x);
        BigInteger bigInteger = P_BI;
        return new Ed25519.CachedXYT(Field25519.expand(toLittleEndian(add.mod(bigInteger))), Field25519.expand(toLittleEndian(point.f11371y.subtract(point.f11370x).mod(bigInteger))), Field25519.expand(toLittleEndian(D2_BI.multiply(point.f11370x).multiply(point.f11371y).mod(bigInteger))));
    }

    private static BigInteger recoverX(BigInteger bigInteger) {
        BigInteger pow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger subtract = pow.subtract(bigInteger2);
        BigInteger add = D_BI.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = P_BI;
        BigInteger multiply = subtract.multiply(add.modInverse(bigInteger3));
        BigInteger modPow = multiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!modPow.pow(2).subtract(multiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(SQRTM1_BI).mod(bigInteger3);
        }
        return modPow.testBit(0) ? bigInteger3.subtract(modPow) : modPow;
    }

    private static byte[] toLittleEndian(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = (32 - i) - 1;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
        return bArr;
    }
}
