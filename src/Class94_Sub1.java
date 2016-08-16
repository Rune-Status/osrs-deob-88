import java.util.zip.CRC32;

public class Class94_Sub1 extends Class94 {
	volatile boolean aBool1116 = false;
	volatile boolean[] aBoolArray1118;
	int anInt1114 = -1;
	int anInt1120;
	int anInt1121;
	static CRC32 aCRC32_1119 = new CRC32();
	boolean aBool1117 = false;
	Class69 aClass69_1115;
	Class69 aClass69_1113;
	int anInt1122;

	public int method612() {
		if (aBool1116)
			return 100;
		else if (null != anObjectArray753)
			return 99;
		else {
			final int var1 = anInt1122;
			final long var2 = 16711680 + var1;
			int var5;
			if ((null != Class28.aClass124_Sub22_Sub21_311) && (Class28.aClass124_Sub22_Sub21_311.aLong874 == var2))
				var5 = 1 + ((Class67.aClass124_Sub14_569.pos * 99)
						/ (Class67.aClass124_Sub14_569.backing.length
								- Class28.aClass124_Sub22_Sub21_311.aByte1650));
			else
				var5 = 0;

			int var4 = var5;
			if (var5 >= 100)
				var4 = 99;

			return var4;
		}
	}

	@Override
	void method364(final int var1, final int var2) {
		Class86.method341(anInt1122, var1);
	}

	@Override
	void method381(final int var1, final short var2) {
		if ((null != aClass69_1115) && (null != aBoolArray1118) && aBoolArray1118[var1])
			Class124_Sub22_Sub19_Sub3.method896(var1, aClass69_1115, this);
		else
			Class102.method403(this, anInt1122, var1, anIntArray747[var1], (byte) 2, true);

	}

	public int method613() {
		int var1 = 0;
		int var2 = 0;

		int var3;
		for (var3 = 0; var3 < anObjectArray753.length; ++var3)
			if (anIntArray749[var3] > 0) {
				var1 += 100;
				var2 += method616(var3);
			}

		if (var1 == 0)
			return 100;
		else {
			var3 = (100 * var2) / var1;
			return var3;
		}
	}

	public void method614(final Class69 var1, final int var2, final byte[] var3, final boolean var4) {
		int var8;
		if (var1 == aClass69_1113) {
			if (aBool1116)
				throw new RuntimeException();

			if (var3 == null) {
				Class102.method403(this, 255, anInt1122, anInt1120, (byte) 0, true);
				return;
			}

			aCRC32_1119.reset();
			aCRC32_1119.update(var3, 0, var3.length);
			var8 = (int) aCRC32_1119.getValue();
			final RSBuf var5 = new RSBuf(Def14.method729(var3));
			final int var7 = var5.method558();
			if ((var7 != 5) && (var7 != 6))
				throw new RuntimeException(var7 + "," + anInt1122 + "," + var2);

			int var6 = 0;
			if (var7 >= 6)
				var6 = var5.method562(-1258873292);

			if ((var8 != anInt1120) || (var6 != anInt1121)) {
				Class102.method403(this, 255, anInt1122, anInt1120, (byte) 0, true);
				return;
			}

			method363(var3);
			method615();
		} else {
			if (!var4 && (anInt1114 == var2))
				aBool1116 = true;

			if ((var3 == null) || (var3.length <= 2)) {
				aBoolArray1118[var2] = false;
				if (aBool1117 || var4)
					Class102.method403(this, anInt1122, var2, anIntArray747[var2], (byte) 2, var4);

				return;
			}

			aCRC32_1119.reset();
			aCRC32_1119.update(var3, 0, var3.length - 2);
			var8 = (int) aCRC32_1119.getValue();
			final int var9 = (var3[var3.length - 1] & 255) + ((var3[var3.length - 2] & 255) << 8);
			if ((var8 != anIntArray747[var2]) || (anIntArray748[var2] != var9)) {
				aBoolArray1118[var2] = false;
				if (aBool1117 || var4)
					Class102.method403(this, anInt1122, var2, anIntArray747[var2], (byte) 2, var4);

				return;
			}

			aBoolArray1118[var2] = true;
			if (var4)
				anObjectArray753[var2] = Class9_Sub1.method493(var3, false);
		}

	}

	void method615() {
		aBoolArray1118 = new boolean[anObjectArray753.length];

		int var1;
		for (var1 = 0; var1 < aBoolArray1118.length; ++var1)
			aBoolArray1118[var1] = false;

		if (aClass69_1115 == null)
			aBool1116 = true;
		else {
			anInt1114 = -1;

			for (var1 = 0; var1 < aBoolArray1118.length; ++var1)
				if (anIntArray749[var1] > 0) {
					Class71.method307(var1, aClass69_1115, this);
					anInt1114 = var1;
				}

			if (anInt1114 == -1)
				aBool1116 = true;

		}
	}

	int method616(final int var1) {
		if (null != anObjectArray753[var1])
			return 100;
		else if (aBoolArray1118[var1])
			return 100;
		else {
			final int var3 = anInt1122;
			final long var4 = var1 + (var3 << 16);
			int var2;
			if ((Class28.aClass124_Sub22_Sub21_311 != null) && (var4 == Class28.aClass124_Sub22_Sub21_311.aLong874))
				var2 = ((Class67.aClass124_Sub14_569.pos * 99)
						/ (Class67.aClass124_Sub14_569.backing.length
								- Class28.aClass124_Sub22_Sub21_311.aByte1650))
						+ 1;
			else
				var2 = 0;

			return var2;
		}
	}

	public void method617(final int var1, final int var2) {
		anInt1120 = var1;
		anInt1121 = var2;
		if (aClass69_1113 != null)
			Class124_Sub22_Sub19_Sub3.method896(anInt1122, aClass69_1113, this);
		else
			Class102.method403(this, 255, anInt1122, anInt1120, (byte) 0, true);

	}

	public void method618(final int var1, final byte[] var2, final boolean var3, final boolean var4) {
		if (var3) {
			if (aBool1116)
				throw new RuntimeException();

			if (aClass69_1113 != null)
				Class124_Sub6.method518(anInt1122, var2, aClass69_1113);

			method363(var2);
			method615();
		} else {
			var2[var2.length - 2] = (byte) (anIntArray748[var1] >> 8);
			var2[var2.length - 1] = (byte) anIntArray748[var1];
			if (aClass69_1115 != null) {
				Class124_Sub6.method518(var1, var2, aClass69_1115);
				aBoolArray1118[var1] = true;
			}

			if (var4)
				anObjectArray753[var1] = Class9_Sub1.method493(var2, false);
		}

	}

	public Class94_Sub1(final Class69 var1, final Class69 var2, final int var3, final boolean var4, final boolean var5,
			final boolean var6) {
		super(var4, var5);
		aClass69_1115 = var1;
		aClass69_1113 = var2;
		anInt1122 = var3;
		aBool1117 = var6;
		Class58.method270(this, anInt1122);
	}
}
