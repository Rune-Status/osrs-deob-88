public class Class124_Sub8 extends Node {
	int[] anIntArray1015;
	static int[] anIntArray1025;
	boolean aBool1024 = false;
	int anInt1017;
	boolean aBool1019;
	int[] anIntArray1016;
	int[] anIntArray1018;
	int[] anIntArray1021;
	int[] anIntArray1020;
	int anInt1022;
	int anInt1023;

	boolean method529(final double var1, final int var3, final Class94 var4) {
		int var5;
		for (var5 = 0; var5 < anIntArray1016.length; ++var5)
			if (var4.method370(anIntArray1016[var5]) == null)
				return false;

		var5 = var3 * var3;
		anIntArray1015 = new int[var5];

		for (int var6 = 0; var6 < anIntArray1016.length; ++var6) {
			final Class124_Sub22_Sub16_Sub2 var8 = Def1.method660(var4, anIntArray1016[var6]);
			var8.method925();
			final byte[] var9 = var8.aByteArray1740;
			final int[] var10 = var8.anIntArray1742;
			final int var11 = anIntArray1020[var6];
			if ((var11 & -16777216) == 16777216)
				;

			if ((var11 & -16777216) == 33554432)
				;

			int var7;
			int var12;
			int var13;
			int var14;
			if ((var11 & -16777216) == 50331648) {
				var14 = var11 & 16711935;
				var12 = (var11 >> 8) & 255;

				for (var7 = 0; var7 < var10.length; ++var7) {
					var13 = var10[var7];
					if ((var13 & '\uffff') == (var13 >> 8)) {
						var13 &= 255;
						var10[var7] = (((var14 * var13) >> 8) & 16711935) | ((var12 * var13) & '\uff00');
					}
				}
			}

			for (var14 = 0; var14 < var10.length; ++var14)
				var10[var14] = Class124_Sub22_Sub16_Sub3.method974(var10[var14], var1);

			if (var6 == 0)
				var14 = 0;
			else
				var14 = anIntArray1018[var6 - 1];

			if (var6 == 0)
				;

			if (var14 == 0)
				if (var8.anInt1738 == var3)
					for (var12 = 0; var12 < var5; ++var12)
						anIntArray1015[var12] = var10[var9[var12] & 255];
				else if ((var8.anInt1738 == 64) && (var3 == 128)) {
					var12 = 0;

					for (var7 = 0; var7 < var3; ++var7)
						for (var13 = 0; var13 < var3; ++var13)
							anIntArray1015[var12++] = var10[var9[(var13 >> 1) + ((var7 >> 1) << 6)] & 255];
				} else {
					if ((var8.anInt1738 != 128) || (var3 != 64))
						throw new RuntimeException();

					var12 = 0;

					for (var7 = 0; var7 < var3; ++var7)
						for (var13 = 0; var13 < var3; ++var13)
							anIntArray1015[var12++] = var10[var9[(var13 << 1) + (var7 << 1 << 7)] & 255];
				}

			if (var14 == 1)
				;

			if (var14 == 2)
				;

			if (var14 == 3)
				;
		}

		return true;
	}

	void method530() {
		anIntArray1015 = null;
	}

	void method531(final int var1) {
		if (anIntArray1015 != null) {
			int var2;
			short var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var9;
			if ((anInt1022 == 1) || (anInt1022 == 3)) {
				if ((anIntArray1025 == null) || (anIntArray1025.length < anIntArray1015.length))
					anIntArray1025 = new int[anIntArray1015.length];

				if (anIntArray1015.length == 4096)
					var3 = 64;
				else
					var3 = 128;

				var5 = anIntArray1015.length;
				var2 = var3 * var1 * anInt1023;
				var6 = var5 - 1;
				if (anInt1022 == 1)
					var2 = -var2;

				for (var4 = 0; var4 < var5; ++var4) {
					var7 = (var4 + var2) & var6;
					anIntArray1025[var4] = anIntArray1015[var7];
				}

				var9 = anIntArray1015;
				anIntArray1015 = anIntArray1025;
				anIntArray1025 = var9;
			}

			if ((anInt1022 == 2) || (anInt1022 == 4)) {
				if ((anIntArray1025 == null) || (anIntArray1025.length < anIntArray1015.length))
					anIntArray1025 = new int[anIntArray1015.length];

				if (anIntArray1015.length == 4096)
					var3 = 64;
				else
					var3 = 128;

				var5 = anIntArray1015.length;
				var2 = var1 * anInt1023;
				var6 = var3 - 1;
				if (anInt1022 == 2)
					var2 = -var2;

				for (var4 = 0; var4 < var5; var4 += var3)
					for (var7 = 0; var7 < var3; ++var7) {
						final int var10 = var4 + var7;
						final int var8 = var4 + ((var7 + var2) & var6);
						anIntArray1025[var10] = anIntArray1015[var8];
					}

				var9 = anIntArray1015;
				anIntArray1015 = anIntArray1025;
				anIntArray1025 = var9;
			}

		}
	}

	Class124_Sub8(final RSBuf var1) {
		anInt1017 = var1.method560();
		aBool1019 = var1.method558() == 1;
		final int var3 = var1.method558();
		if ((var3 >= 1) && (var3 <= 4)) {
			anIntArray1016 = new int[var3];

			int var2;
			for (var2 = 0; var2 < var3; ++var2)
				anIntArray1016[var2] = var1.method560();

			if (var3 > 1) {
				anIntArray1018 = new int[var3 - 1];

				for (var2 = 0; var2 < (var3 - 1); ++var2)
					anIntArray1018[var2] = var1.method558();
			}

			if (var3 > 1) {
				anIntArray1021 = new int[var3 - 1];

				for (var2 = 0; var2 < (var3 - 1); ++var2)
					anIntArray1021[var2] = var1.method558();
			}

			anIntArray1020 = new int[var3];

			for (var2 = 0; var2 < var3; ++var2)
				anIntArray1020[var2] = var1.method562(-369636873);

			anInt1022 = var1.method558();
			anInt1023 = var1.method558();
			anIntArray1015 = null;
		} else
			throw new RuntimeException();
	}
}
