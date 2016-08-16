import java.awt.Canvas;
import java.awt.Color;
import java.math.BigInteger;

public class RSBuf extends Node {
	public int pos;
	public byte[] backing;
	static int[] anIntArray1074 = new int[256];

	public int method544() {
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

	public int method546() {
		pos += 2;
		int var1 = ((backing[pos - 2] & 255) << 8) + (backing[pos - 1] & 255);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void method547(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
	}

	public void method548(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 24);
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
	}

	public void method549(final long var1) {
		backing[++pos - 1] = (byte) ((int) (var1 >> 40));
		backing[++pos - 1] = (byte) ((int) (var1 >> 32));
		backing[++pos - 1] = (byte) ((int) (var1 >> 24));
		backing[++pos - 1] = (byte) ((int) (var1 >> 16));
		backing[++pos - 1] = (byte) ((int) (var1 >> 8));
		backing[++pos - 1] = (byte) ((int) var1);
	}

	public void method550(final String var1) {
		final int var2 = var1.indexOf(0);
		if (var2 >= 0)
			throw new IllegalArgumentException("");
		else {
			pos += Class32.method184(var1, 0, var1.length(), backing, pos);
			backing[++pos - 1] = 0;
		}
	}

	public void method551(final CharSequence var1) {
		final int var2 = Def8.method703(var1);
		backing[++pos - 1] = 0;
		method599(var2);
		pos += Class95.method386(backing, pos, var1);
	}

	public void dorsa(final BigInteger var1, final BigInteger var2) {
		final int var3 = pos;
		pos = 0;
		final byte[] var6 = new byte[var3];
		method598(var6, 0, var3);
		final BigInteger var4 = new BigInteger(var6);
		final BigInteger var5 = var4; //.modPow(var1, var2);
		final byte[] var7 = var5.toByteArray();
		pos = 0;
		writeShort(var7.length);
		method568(var7, 0, var7.length);
	}

	public void method553(final int var1) {
		backing[pos - var1 - 4] = (byte) (var1 >> 24);
		backing[pos - var1 - 3] = (byte) (var1 >> 16);
		backing[pos - var1 - 2] = (byte) (var1 >> 8);
		backing[pos - var1 - 1] = (byte) var1;
	}

	public void method554(final int var1) {
		backing[pos - var1 - 2] = (byte) (var1 >> 8);
		backing[pos - var1 - 1] = (byte) var1;
	}

	public void method555(final int var1) {
		backing[pos - var1 - 1] = (byte) var1;
	}

	public void method556(final int var1) {
		if ((var1 >= 0) && (var1 < 128))
			writeByte(var1);
		else if ((var1 >= 0) && (var1 < '\u8000'))
			writeShort(var1 + '\u8000');
		else
			throw new IllegalArgumentException();
	}

	public int method557() {
		pos += 3;
		return ((backing[pos - 3] & 255) << 16) + ((backing[pos - 2] & 255) << 8)
				+ (backing[pos - 1] & 255);
	}

	public int method558() {
		return backing[++pos - 1] & 255;
	}

	public byte method559() {
		return backing[++pos - 1];
	}

	public int method560() {
		pos += 2;
		return (backing[pos - 1] & 255) + ((backing[pos - 2] & 255) << 8);
	}

	public void method561(final long var1) {
		backing[++pos - 1] = (byte) ((int) (var1 >> 56));
		backing[++pos - 1] = (byte) ((int) (var1 >> 48));
		backing[++pos - 1] = (byte) ((int) (var1 >> 40));
		backing[++pos - 1] = (byte) ((int) (var1 >> 32));
		backing[++pos - 1] = (byte) ((int) (var1 >> 24));
		backing[++pos - 1] = (byte) ((int) (var1 >> 16));
		backing[++pos - 1] = (byte) ((int) (var1 >> 8));
		backing[++pos - 1] = (byte) ((int) var1);
	}

	public int method562(final int var1) {
		pos += 4;
		return (backing[pos - 1] & 255) + ((backing[pos - 3] & 255) << 16)
				+ ((backing[pos - 4] & 255) << 24) + ((backing[pos - 2] & 255) << 8);
	}

	public long method563() {
		final long var1 = method562(2076325408) & 4294967295L;
		final long var3 = method562(-1284272039) & 4294967295L;
		return (var1 << 32) + var3;
	}

	public String method564() {
		if (backing[pos] == 0) {
			++pos;
			return null;
		} else
			return method597();
	}

	public String method565() {
		final byte var1 = backing[++pos - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int var2 = pos;

			while (backing[++pos - 1] != 0)
				;

			final int var3 = pos - var2 - 1;
			return var3 == 0 ? "" : Class1.method16(backing, var2, var3);
		}
	}

	public String method566() {
		final byte var1 = backing[++pos - 1];
		if (var1 != 0)
			throw new IllegalStateException("");
		else {
			final int var3 = method570();
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

	public boolean method567() {
		pos -= 4;
		final int var1 = Class41.method213(backing, 0, pos);
		final int var2 = method562(-923603984);
		return var1 == var2;
	}

	public RSBuf(final int var1) {
		backing = Class62.method277(var1, (byte) -64);
		pos = 0;
	}

	public void method568(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var2 + var3); ++var4)
			backing[++pos - 1] = var1[var4];

	}

	public int method569() {
		return backing[pos] < 0 ? method562(-266900692) & Integer.MAX_VALUE : method560();
	}

	public int method570() {
		byte var1 = backing[++pos - 1];

		int var2;
		for (var2 = 0; var1 < 0; var1 = backing[++pos - 1])
			var2 = (var2 | (var1 & 127)) << 7;

		return var2 | var1;
	}

	public void method571(final int[] var1) {
		final int var2 = pos / 8;
		pos = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var8 = method562(136116459);
			int var4 = method562(634114711);
			int var5 = 0;
			final int var6 = -1640531527;

			for (int var7 = 32; var7-- > 0; var4 += (var8 + ((var8 << 4) ^ (var8 >>> 5)))
					^ (var5 + var1[(var5 >>> 11) & 3])) {
				var8 += (var4 + ((var4 << 4) ^ (var4 >>> 5))) ^ (var5 + var1[var5 & 3]);
				var5 += var6;
			}

			pos -= 8;
			method548(var8);
			method548(var4);
		}

	}

	public void method572(final int[] var1) {
		final int var2 = pos / 8;
		pos = 0;

		for (int var3 = 0; var3 < var2; ++var3) {
			int var4 = method562(-736189881);
			int var7 = method562(-1144348664);
			int var5 = -957401312;
			final int var6 = -1640531527;

			for (int var8 = 32; var8-- > 0; var4 -= (var7 + ((var7 << 4) ^ (var7 >>> 5))) ^ (var1[var5 & 3] + var5)) {
				var7 -= (((var4 << 4) ^ (var4 >>> 5)) + var4) ^ (var1[(var5 >>> 11) & 3] + var5);
				var5 -= var6;
			}

			pos -= 8;
			method548(var4);
			method548(var7);
		}

	}

	public void method573(final int[] var1, final int var2, final int var3) {
		final int var4 = pos;
		pos = var2;
		final int var9 = (var3 - var2) / 8;

		for (int var6 = 0; var6 < var9; ++var6) {
			int var8 = method562(1784886672);
			int var11 = method562(1812761007);
			int var7 = 0;
			final int var5 = -1640531527;

			for (int var10 = 32; var10-- > 0; var11 += (((var8 << 4) ^ (var8 >>> 5)) + var8)
					^ (var7 + var1[(var7 >>> 11) & 3])) {
				var8 += (((var11 << 4) ^ (var11 >>> 5)) + var11) ^ (var7 + var1[var7 & 3]);
				var7 += var5;
			}

			pos -= 8;
			method548(var8);
			method548(var11);
		}

		pos = var4;
	}

	static Somet2 method574(final int var0) {
		Somet2 var1 = (Somet2) Somet2.aClass113_1600.method434(var0);
		if (var1 != null)
			return var1;
		else {
			final byte[] var3 = Class88.aClass94_Sub1_695.decode(var0, 0);
			if (var3 == null)
				return null;
			else {
				var1 = new Somet2();
				final RSBuf var2 = new RSBuf(var3);
				var2.pos = var2.backing.length - 12;
				final int var5 = var2.method562(1291183748);
				var1.anInt1599 = var2.method560();
				var1.anInt1602 = var2.method560();
				var1.anInt1597 = var2.method560();
				var1.anInt1601 = var2.method560();
				var2.pos = 0;
				var2.method564();
				var1.anIntArray1596 = new int[var5];
				var1.anIntArray1603 = new int[var5];
				var1.aStringArray1598 = new String[var5];

				int var4;
				for (int var6 = 0; var2.pos < (var2.backing.length
						- 12); var1.anIntArray1596[var6++] = var4) {
					var4 = var2.method560();
					if (var4 == 3)
						var1.aStringArray1598[var6] = var2.method597();
					else if ((var4 < 100) && (var4 != 21) && (var4 != 38) && (var4 != 39))
						var1.anIntArray1603[var6] = var2.method562(-1869568387);
					else
						var1.anIntArray1603[var6] = var2.method558();
				}

				Somet2.aClass113_1600.method435(var1, var0);
				return var1;
			}
		}
	}

	public int method575(final int var1) {
		final int var2 = Class41.method213(backing, var1, pos);
		method548(var2);
		return var2;
	}

	public void method576(final int var1) {
		backing[++pos - 1] = (byte) (var1 + 128);
	}

	public void method577(final int var1) {
		backing[++pos - 1] = (byte) (0 - var1);
	}

	public void method578(final int var1) {
		backing[++pos - 1] = (byte) (128 - var1);
	}

	public byte method579() {
		return (byte) (backing[++pos - 1] - 128);
	}

	public void method580(final int var1) {
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 8);
	}

	public void method581(final int var1) {
		backing[++pos - 1] = (byte) (var1 + 128);
		backing[++pos - 1] = (byte) (var1 >> 8);
	}

	public int method582() {
		pos += 2;
		return ((backing[pos - 1] - 128) & 255) + ((backing[pos - 2] & 255) << 8);
	}

	public int method583() {
		pos += 2;
		return ((backing[pos - 2] - 128) & 255) + ((backing[pos - 1] & 255) << 8);
	}

	public int method584() {
		pos += 2;
		int var1 = (backing[pos - 2] & 255) + ((backing[pos - 1] & 255) << 8);
		if (var1 > 32767)
			var1 -= 65536;

		return var1;
	}

	public void method585(final int[] var1, final int var2, final int var3) {
		final int var4 = pos;
		pos = var2;
		final int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = method562(-698783297);
			int var5 = method562(-1155644384);
			int var9 = -957401312;
			final int var10 = -1640531527;

			for (int var11 = 32; var11-- > 0; var8 -= (((var5 << 4) ^ (var5 >>> 5)) + var5) ^ (var1[var9 & 3] + var9)) {
				var5 -= (var8 + ((var8 << 4) ^ (var8 >>> 5))) ^ (var9 + var1[(var9 >>> 11) & 3]);
				var9 -= var10;
			}

			pos -= 8;
			method548(var8);
			method548(var5);
		}

		pos = var4;
	}

	public void method586(final int var1) {
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) (var1 >> 16);
		backing[++pos - 1] = (byte) (var1 >> 24);
	}

	public void method587(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) (var1 + 128);
	}

	public void method588(final int var1) {
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

	public int method594() {
		return (backing[++pos - 1] - 128) & 255;
	}

	public int getIntv1() {
		pos += 4;
		return ((backing[pos - 2] & 255) << 16) + ((backing[pos - 1] & 255) << 24)
				+ ((backing[pos - 3] & 255) << 8) + (backing[pos - 4] & 255);
	}

	public int getsmart(final byte var1) {
		final int var2 = backing[pos] & 255;
		return var2 < 128 ? method558() : method560() - '\u8000';
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

	public String method597() {
		final int var1 = pos;

		while (backing[++pos - 1] != 0)
			;

		final int var2 = pos - var1 - 1;
		return var2 == 0 ? "" : Class1.method16(backing, var1, var2);
	}

	public void method598(final byte[] var1, final int var2, final int var3) {
		for (int var4 = var2; var4 < (var2 + var3); ++var4)
			var1[var4] = backing[++pos - 1];

	}

	public void method599(final int var1) {
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

	public void method600(final String var1) {
		final int var2 = var1.indexOf(0);
		if (var2 >= 0)
			throw new IllegalArgumentException("");
		else {
			backing[++pos - 1] = 0;
			pos += Class32.method184(var1, 0, var1.length(), backing, pos);
			backing[++pos - 1] = 0;
		}
	}

	public int method601() {
		final int var1 = backing[pos] & 255;
		return var1 >= 128 ? method560() - '\uc000' : method558() - 64;
	}

	public int method602() {
		return (0 - backing[++pos - 1]) & 255;
	}

	public void method603(final int var1) {
		backing[++pos - 1] = (byte) (var1 >> 8);
		backing[++pos - 1] = (byte) var1;
		backing[++pos - 1] = (byte) (var1 >> 24);
		backing[++pos - 1] = (byte) (var1 >> 16);
	}

	public int method604() {
		return (128 - backing[++pos - 1]) & 255;
	}

	static void method605(final int var0) {
		Class31.method182(Class124_Sub5.aCanvas990);
		final Canvas var2 = Class124_Sub5.aCanvas990;
		var2.removeMouseListener(Class81.aClass81_649);
		var2.removeMouseMotionListener(Class81.aClass81_649);
		var2.removeFocusListener(Class81.aClass81_649);
		Class81.anInt663 = 0;
		if (null != Class47.aClass66_473)
			Class47.aClass66_473.method290(Class124_Sub5.aCanvas990, (byte) -67);

		Class80.aclient645.method1050();
		Class124_Sub5.aCanvas990.setBackground(Color.black);
		final Canvas var1 = Class124_Sub5.aCanvas990;
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(Class84.aClass84_683);
		var1.addFocusListener(Class84.aClass84_683);
		Class82.method329(Class124_Sub5.aCanvas990);
		if (null != Class47.aClass66_473)
			Class47.aClass66_473.method293(Class124_Sub5.aCanvas990, (byte) 123);

		if (client.anInt2142 != -1)
			Class122.method449(client.anInt2142, Class56_Sub2.anInt1083, Class81.anInt662, false);

		Applet_Sub1.aBool1976 = true;
	}

	static final void method606(final byte var0) {
		for (int var1 = 0; var1 < client.anInt2022; ++var1) {
			final int var2 = client.anIntArray2023[var1];
			final Class124_Sub22_Sub19_Sub3_Sub1 var3 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var2];
			if (var3 != null) {
				Class53.method257(var3);
			}
		}

	}
}
