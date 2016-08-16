public class Class93 {
	RSBuf aClass124_Sub14_742 = new RSBuf((byte[]) null);
	int anInt738;
	int anInt734;
	int[] anIntArray736;
	long aLong741;
	int[] anIntArray737;
	int[] anIntArray739;
	int[] anIntArray740;
	static byte[] aByteArray735 = new byte[] { (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1,
			(byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 1, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2,
			(byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 2, (byte) 0, (byte) 1, (byte) 2, (byte) 1, (byte) 0,
			(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0,
			(byte) 0 };

	Class93(final byte[] var1) {
		method348(var1);
	}

	void method348(final byte[] var1) {
		aClass124_Sub14_742.backing = var1;
		aClass124_Sub14_742.pos = 10;
		final int var2 = aClass124_Sub14_742.method560();
		anInt738 = aClass124_Sub14_742.method560();
		anInt734 = 500000;
		anIntArray736 = new int[var2];

		int var3;
		int var4;
		for (var4 = 0; var4 < var2; aClass124_Sub14_742.pos += var3) {
			final int var5 = aClass124_Sub14_742.method562(-1184822850);
			var3 = aClass124_Sub14_742.method562(-1855387018);
			if (var5 == 1297379947) {
				anIntArray736[var4] = aClass124_Sub14_742.pos;
				++var4;
			}
		}

		aLong741 = 0L;
		anIntArray737 = new int[var2];

		for (var4 = 0; var4 < var2; ++var4)
			anIntArray737[var4] = anIntArray736[var4];

		anIntArray739 = new int[var2];
		anIntArray740 = new int[var2];
	}

	void method349() {
		aClass124_Sub14_742.backing = null;
		anIntArray736 = null;
		anIntArray737 = null;
		anIntArray739 = null;
		anIntArray740 = null;
	}

	int method350() {
		return anIntArray737.length;
	}

	void method351(final int var1) {
		aClass124_Sub14_742.pos = anIntArray737[var1];
	}

	void method352(final int var1) {
		final int var2 = aClass124_Sub14_742.method570();
		anIntArray739[var1] += var2;
	}

	int method353(final int var1) {
		final int var2 = method354(var1);
		return var2;
	}

	int method354(final int var1) {
		final byte var2 = aClass124_Sub14_742.backing[aClass124_Sub14_742.pos];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			anIntArray740[var1] = var5;
			++aClass124_Sub14_742.pos;
		} else
			var5 = anIntArray740[var1];

		if ((var5 != 240) && (var5 != 247))
			return method355(var1, var5);
		else {
			final int var3 = aClass124_Sub14_742.method570();
			if ((var5 == 247) && (var3 > 0)) {
				final int var4 = aClass124_Sub14_742.backing[aClass124_Sub14_742.pos] & 255;
				if (((var4 >= 241) && (var4 <= 243)) || (var4 == 246) || (var4 == 248)
						|| ((var4 >= 250) && (var4 <= 252)) || (var4 == 254)) {
					++aClass124_Sub14_742.pos;
					anIntArray740[var1] = var4;
					return method355(var1, var4);
				}
			}

			aClass124_Sub14_742.pos += var3;
			return 0;
		}
	}

	Class93() {
	}

	int method355(final int var1, final int var2) {
		int var4;
		if (var2 == 255) {
			final int var7 = aClass124_Sub14_742.method558();
			var4 = aClass124_Sub14_742.method570();
			if (var7 == 47) {
				aClass124_Sub14_742.pos += var4;
				return 1;
			} else if (var7 == 81) {
				final int var5 = aClass124_Sub14_742.method557();
				var4 -= 3;
				final int var6 = anIntArray739[var1];
				aLong741 += (long) var6 * (long) (anInt734 - var5);
				anInt734 = var5;
				aClass124_Sub14_742.pos += var4;
				return 2;
			} else {
				aClass124_Sub14_742.pos += var4;
				return 3;
			}
		} else {
			final byte var3 = aByteArray735[var2 - 128];
			var4 = var2;
			if (var3 >= 1)
				var4 = var2 | (aClass124_Sub14_742.method558() << 8);

			if (var3 >= 2)
				var4 |= aClass124_Sub14_742.method558() << 16;

			return var4;
		}
	}

	boolean method356() {
		final int var1 = anIntArray737.length;

		for (int var2 = 0; var2 < var1; ++var2)
			if (anIntArray737[var2] >= 0)
				return false;

		return true;
	}

	void method357(final long var1) {
		aLong741 = var1;
		final int var4 = anIntArray737.length;

		for (int var3 = 0; var3 < var4; ++var3) {
			anIntArray739[var3] = 0;
			anIntArray740[var3] = 0;
			aClass124_Sub14_742.pos = anIntArray736[var3];
			method352(var3);
			anIntArray737[var3] = aClass124_Sub14_742.pos;
		}

	}

	boolean method358() {
		return aClass124_Sub14_742.backing != null;
	}

	void method359() {
		aClass124_Sub14_742.pos = -1;
	}

	long method360(final int var1) {
		return aLong741 + ((long) var1 * (long) anInt734);
	}

	int method361() {
		final int var1 = anIntArray737.length;
		int var4 = -1;
		int var2 = Integer.MAX_VALUE;

		for (int var3 = 0; var3 < var1; ++var3)
			if ((anIntArray737[var3] >= 0) && (anIntArray739[var3] < var2)) {
				var4 = var3;
				var2 = anIntArray739[var3];
			}

		return var4;
	}

	void method362(final int var1) {
		anIntArray737[var1] = aClass124_Sub14_742.pos;
	}
}
