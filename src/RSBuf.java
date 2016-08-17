import java.math.BigInteger;

public class RSBuf extends Node {
	public int pos;
	public byte[] backing;
	static int[] anIntArray1074 = new int[256];

	public int readUShort() {
		pos += 2;
		return (backing[pos - 2] & 255) + ((backing[pos - 1] & 255) << 8);
	}

	public RSBuf(final byte[] var1) {
		backing = var1;
		pos = 0;
	}

	public void writeByte(final int var1) {
		backing[++pos - 1] = (byte) var1;
	}

	public int readShort() {
		pos += 2;
		int var1 = ((backing[pos - 2] & 255) << 8) + (backing[pos - 1] & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void writeTrib(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
	}

	public void writeInt(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 24);
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
	}

	public void writeMidint(final long var1) {
		backing[++pos - 1] = (byte) ((int) (var1 >> 40));
		backing[++pos - 1] = (byte) ((int) (var1 >> 32));
		backing[++pos - 1] = (byte) ((int) (var1 >> 24));
		backing[++pos - 1] = (byte) ((int) (var1 >> 16));
		backing[++pos - 1] = (byte) ((int) (var1 >> 8));
		backing[++pos - 1] = (byte) ((int) var1);
	}

	public void writestr(final String var1) {
		final int var2 = var1.indexOf(0);
		if (var2 >= 0)
			throw new IllegalArgumentException("");
		else {
			pos += Class32.strConvert(var1, 0, var1.length(), backing, pos);
			backing[++pos - 1] = 0;
		}
	}

	public void method551(final CharSequence var1) {
		final int var2 = Def8.method703(var1);
		backing[++pos - 1] = 0;
		writesmart(var2);
		pos += Class95.method386(backing, pos, var1);
	}

	public void dorsa(final BigInteger var1, final BigInteger var2) {
		final int var3 = pos;
		pos = 0;
		final byte[] var6 = new byte[var3];
		readReverse(var6, 0, var3);
		final BigInteger var4 = new BigInteger(var6);
		final BigInteger var5 = var4; //.modPow(var1, var2);
		final byte[] var7 = var5.toByteArray();
		pos = 0;
		writeShort(var7.length);
		writeReverse(var7, 0, var7.length);
	}

	public void endSizeInt(final int var1) {
		backing[pos - var1 - 4] = (byte) (var1 >> 24);
		backing[pos - var1 - 3] = (byte) (var1 >> 16);
		backing[pos - var1 - 2] = (byte) (var1 >> 8);
		backing[pos - var1 - 1] = (byte) var1;
	}

	public void endShortSize(final int var1) {
		backing[pos - var1 - 2] = (byte) (var1 >> 8);
		backing[pos - var1 - 1] = (byte) var1;
	}

	public void endByteSize(final int var1) {
		backing[pos - var1 - 1] = (byte) var1;
	}

	public void writeSmart(final int var1) {
		if ((var1 >= 0) && (var1 < 128))
			writeByte(var1);
		else if ((var1 >= 0) && (var1 < '\u8000'))
			writeShort(var1 + '\u8000');
		else
			throw new IllegalArgumentException();
	}

	public int readTri() {
		pos += 3;
		return ((backing[pos - 3] & 255) << 16) + ((backing[pos - 2] & 255) << 8)
				+ (backing[pos - 1] & 255);
	}

	public int readByteU() {
		return backing[++pos - 1] & 255;
	}

	public byte readByte() {
		return backing[++pos - 1];
	}

	public int readShortU() {
		pos += 2;
		return (backing[pos - 1] & 255) + ((backing[pos - 2] & 255) << 8);
	}

	public void writeULong(final long var1) {
		backing[++pos - 1] = (byte) ((int) (var1 >> 56));
		backing[++pos - 1] = (byte) ((int) (var1 >> 48));
		backing[++pos - 1] = (byte) ((int) (var1 >> 40));
		backing[++pos - 1] = (byte) ((int) (var1 >> 32));
		backing[++pos - 1] = (byte) ((int) (var1 >> 24));
		backing[++pos - 1] = (byte) ((int) (var1 >> 16));
		backing[++pos - 1] = (byte) ((int) (var1 >> 8));
		backing[++pos - 1] = (byte) ((int) var1);
	}

	public int readInt2(final int var1) {
		pos += 4;
		return (backing[pos - 1] & 255) + ((backing[pos - 3] & 255) << 16)
				+ ((backing[pos - 4] & 255) << 24) + ((backing[pos - 2] & 255) << 8);
	}

	public long readLong2() {
		final long var1 = readInt2(2076325408) & 4294967295L;
		final long var3 = readInt2(-1284272039) & 4294967295L;
		return (var1 << 32) + var3;
	}

	public String readStr() {
		if (backing[pos] == 0) {
			++pos;
			return null;
		} else
			return readStr2();
	}

	public String readStr3() {
		final byte var1 = backing[++pos - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int var2 = pos;

			while (backing[++pos - 1] != 0)
				;

			final int var3 = pos - var2 - 1;
			return var3 == 0 ? "" : Class1.toString(backing, var2, var3);
		}
	}

	public String decodeStr() {
		final byte var1 = backing[++pos - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int var3 = packed();
			if ((pos + var3) > backing.length)
				throw new IllegalStateException("");
			else {
				final byte[] var6 = backing;
				final int var7 = pos;
				final char[] var5 = new char[var3];
				int var11 = 0;
				int var8 = var7;

				int var2;
				for (final int var9 = var7 + var3; var8 < var9; var5[var11++] = (char) var2) {
					final int var10 = var6[var8++] & 255;
					if (var10 < 128) {
						if (var10 == 0)
							var2 = '\ufffd';
						else
							var2 = var10;
					} else if (var10 < 192)
						var2 = '\ufffd';
					else if (var10 < 224) {
						if ((var8 < var9) && ((var6[var8] & 192) == 128)) {
							var2 = ((var10 & 31) << 6) | (var6[var8++] & 63);
							if (var2 < 128)
								var2 = '\ufffd';
						} else
							var2 = '\ufffd';
					} else if (var10 < 240) {
						if (((var8 + 1) < var9) && ((var6[var8] & 192) == 128) && ((var6[1 + var8] & 192) == 128)) {
							var2 = ((var10 & 15) << 12) | ((var6[var8++] & 63) << 6) | (var6[var8++] & 63);
							if (var2 < 2048)
								var2 = '\ufffd';
						} else
							var2 = '\ufffd';
					} else if (var10 < 248) {
						if (((2 + var8) < var9) && ((var6[var8] & 192) == 128) && ((var6[var8 + 1] & 192) == 128)
								&& ((var6[2 + var8] & 192) == 128)) {
							var2 = ((var10 & 7) << 18) | ((var6[var8++] & 63) << 12) | ((var6[var8++] & 63) << 6)
									| (var6[var8++] & 63);
							if ((var2 >= 65536) && (var2 <= 1114111))
								var2 = '\ufffd';
							else
								var2 = '\ufffd';
						} else
							var2 = '\ufffd';
					} else
						var2 = '\ufffd';
				}

				final String var4 = new String(var5, 0, var11);
				pos += var3;
				return var4;
			}
		}
	}

	public boolean matches() {
		pos -= 4;
		final int var1 = Class41.clever(backing, 0, pos);
		final int var2 = readInt2(-923603984);
		return var1 == var2;
	}

	public RSBuf(final int var1) {
		backing = Class62.forSize(var1, (byte) -64);
		pos = 0;
	}

	public void writeReverse(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var2 + var3); ++var4)
			backing[++pos - 1] = var1[var4];

	}

	public int readUSmart() {
		return backing[pos] < 0 ? readInt2(-266900692) & Integer.MAX_VALUE : readShortU();
	}

	public int packed() {
		byte var1 = backing[++pos - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = backing[++pos - 1])
			var2 = (var2 | (var1 & 127)) << 7;

		return var2 | var1;
	}

	public void xtea(final int[] var1) {
		final int var2 = pos / 8;
		pos = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var8 = readInt2(136116459);
			int var4 = readInt2(634114711);
			int var5 = 0;
			final int var6 = -1640531527;

			for (int var7 = 32; var7-- > 0; var4 += (var8 + ((var8 << 4) ^ (var8 >>> 5)))
					^ (var5 + var1[(var5 >>> 11) & 3])) {
				var8 += (var4 + ((var4 << 4) ^ (var4 >>> 5))) ^ (var5 + var1[var5 & 3]);
				var5 += var6;
			}

			pos -= 8;
			writeInt(var8);
			writeInt(var4);
		}

	}

	public void xtea2(final int[] var1) {
		final int var2 = pos / 8;
		pos = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = readInt2(-736189881);
			int var7 = readInt2(-1144348664);
			int var5 = -957401312;
			final int var6 = -1640531527;

			for (int var8 = 32; var8-- > 0; var4 -= (var7 + ((var7 << 4) ^ (var7 >>> 5))) ^ (var1[var5 & 3] + var5)) {
				var7 -= (((var4 << 4) ^ (var4 >>> 5)) + var4) ^ (var1[(var5 >>> 11) & 3] + var5);
				var5 -= var6;
			}

			pos -= 8;
			writeInt(var4);
			writeInt(var7);
		}

	}

	public void xtea3(final int[] var1, final int var2, final int var3) {
		final int var4 = pos;
		pos = var2;
		final int var9 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var9; ++var6) {
			int var8 = readInt2(1784886672);
			int var11 = readInt2(1812761007);
			int var7 = 0;
			final int var5 = -1640531527;

			for (int var10 = 32; var10-- > 0; var11 += (((var8 << 4) ^ (var8 >>> 5)) + var8)
					^ (var7 + var1[(var7 >>> 11) & 3])) {
				var8 += (((var11 << 4) ^ (var11 >>> 5)) + var11) ^ (var7 + var1[var7 & 3]);
				var7 += var5;
			}

			pos -= 8;
			writeInt(var8);
			writeInt(var11);
		}

		pos = var4;
	}

	public int writeclever(final int var1) {
		final int var2 = Class41.clever(backing, var1, pos);
		writeInt(var2);
		return var2;
	}

	public void writeByteA(final int var1) {
		backing[++pos - 1] = (byte) (var1 + 128);
	}

	public void writeByteN(final int var1) {
		backing[++pos - 1] = (byte) (0 - var1);
	}

	public void writeByteS(final int var1) {
		backing[++pos - 1] = (byte) (128 - var1);
	}

	public byte readByteS() {
		return (byte) (backing[++pos - 1] - 128);
	}

	public void writeShortU(final int var1) {
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 8);
	}

	public void writeAShort(final int var1) {
		backing[++pos - 1] = (byte) (var1 + 128);
		backing[++pos - 1] = (byte) (var1 >> 8);
	}

	public int readUShortS() {
		pos += 2;
		return ((backing[pos - 1] - 128) & 255) + ((backing[pos - 2] & 255) << 8);
	}

	public int readShortS() {
		pos += 2;
		return ((backing[pos - 2] - 128) & 255) + ((backing[pos - 1] & 255) << 8);
	}

	public int readShortSmart() {
		pos += 2;
		int var1 = (backing[pos - 2] & 255) + ((backing[pos - 1] & 255) << 8);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void xtea5(final int[] var1, final int var2, final int var3) {
		final int var4 = pos;
		pos = var2;
		final int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = readInt2(-698783297);
			int var5 = readInt2(-1155644384);
			int var9 = -957401312;
			final int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 -= (((var5 << 4) ^ (var5 >>> 5)) + var5) ^ (var1[var9 & 3] + var9)) {
				var5 -= (var8 + ((var8 << 4) ^ (var8 >>> 5))) ^ (var9 + var1[(var9 >>> 11) & 3]);
				var9 -= var10;
			}

			pos -= 8;
			writeInt(var8);
			writeInt(var5);
		}

		pos = var4;
	}

	public void readInt(final int var1) {
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 24);
	}

	public void writeShortA(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) (var1 + 128);
	}

	public void writeIntV1(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 24);
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 8);
	}

	public int method589() {
		pos += 4;
		return (backing[pos - 3] & 255) + ((backing[pos - 4] & 255) << 8)
				+ ((backing[pos - 2] & 255) << 24) + ((backing[pos - 1] & 255) << 16);
	}

	public int method590() {
		pos += 4;
		return ((backing[pos - 4] & 255) << 16) + ((backing[pos - 3] & 255) << 24)
				+ ((backing[pos - 1] & 255) << 8) + (backing[pos - 2] & 255);
	}

	public void method591(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var3 + var2); ++var4)
			var1[var4] = (byte) (backing[++pos - 1] - 128);

	}

	public void writeShort(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
	}

	public int getcompact() {
		pos += 2;
		int var1 = ((backing[pos - 1] & 255) << 8) + ((backing[pos - 2] - 128) & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public int readByteA() {
		return (backing[++pos - 1] - 128) & 255;
	}

	public int getIntv1() {
		pos += 4;
		return ((backing[pos - 2] & 255) << 16) + ((backing[pos - 1] & 255) << 24)
				+ ((backing[pos - 3] & 255) << 8) + (backing[pos - 4] & 255);
	}

	public int getsmart(final byte var1) {
		final int var2 = backing[pos] & 255;
		return var2 < 128 ? readByteU() : readShortU() - '\u8000';
	}

	static {
		for (int var0 = 0; var0 < 256; ++var0) {
			int var2 = var0;

			for (int var1 = 0; var1 < 8; ++var1)
				if ((var2 & 1) == 1)
					var2 = (var2 >>> 1) ^ -306674912;
				else
					var2 >>>= 1;

			anIntArray1074[var0] = var2;
		}

	}

	public String readStr2() {
		final int var1 = pos;

		while (backing[++pos - 1] != 0)
			;

		final int var2 = pos - var1 - 1;
		return var2 == 0 ? "" : Class1.toString(backing, var1, var2);
	}

	public void readReverse(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var2 + var3); ++var4)
			var1[var4] = backing[++pos - 1];

	}

	public void writesmart(final int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0)
						writeByte((var1 >>> 28) | 128);

					writeByte((var1 >>> 21) | 128);
				}

				writeByte((var1 >>> 14) | 128);
			}

			writeByte((var1 >>> 7) | 128);
		}

		writeByte(var1 & 127);
	}

	public void writeStr4(final String var1) {
		final int var2 = var1.indexOf(0);
		if (var2 >= 0)
			throw new IllegalArgumentException("");
		else {
			backing[++pos - 1] = 0;
			pos += Class32.strConvert(var1, 0, var1.length(), backing, pos);
			backing[++pos - 1] = 0;
		}
	}

	public int readcompact4() {
		final int var1 = backing[pos] & 255;
		return var1 >= 128 ? readShortU() - '\uc000' : readByteU() - 64;
	}

	public int readByteN() {
		return (0 - backing[++pos - 1]) & 255;
	}

	public void writeInt2(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 24);
		backing[++pos - 1] = (byte) (var1 >> 16);
	}

	public int readUByteS() {
		return (128 - backing[++pos - 1]) & 255;
	}
}
