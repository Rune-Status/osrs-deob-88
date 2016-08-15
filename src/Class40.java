public class Class40 {
	static void method200(final Class23[] var0, final int var1, final int var2, final int[] var3, final int[] var4) {
		if (var1 < var2) {
			int var10 = var1 - 1;
			int var7 = 1 + var2;
			final int var8 = (var1 + var2) / 2;
			final Class23 var9 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var9;

			while (var10 < var7) {
				boolean var6 = true;

				int var5;
				int var11;
				int var12;
				do {
					--var7;

					for (var5 = 0; var5 < 4; ++var5) {
						if (var3[var5] == 2) {
							var11 = var0[var7].anInt265;
							var12 = var9.anInt265;
						} else if (var3[var5] == 1) {
							var11 = var0[var7].anInt261;
							var12 = var9.anInt261;
							if ((var11 == -1) && (var4[var5] == 1))
								var11 = 2001;

							if ((var12 == -1) && (var4[var5] == 1))
								var12 = 2001;
						} else if (var3[var5] == 3) {
							var11 = var0[var7].method152() ? 1 : 0;
							var12 = var9.method152() ? 1 : 0;
						} else {
							var11 = var0[var7].anInt262;
							var12 = var9.anInt262;
						}

						if (var12 != var11) {
							if (((var4[var5] != 1) || (var11 <= var12)) && ((var4[var5] != 0) || (var11 >= var12)))
								var6 = false;
							break;
						}

						if (var5 == 3)
							var6 = false;
					}
				} while (var6);

				var6 = true;

				do {
					++var10;

					for (var5 = 0; var5 < 4; ++var5) {
						if (var3[var5] == 2) {
							var11 = var0[var10].anInt265;
							var12 = var9.anInt265;
						} else if (var3[var5] == 1) {
							var11 = var0[var10].anInt261;
							var12 = var9.anInt261;
							if ((var11 == -1) && (var4[var5] == 1))
								var11 = 2001;

							if ((var12 == -1) && (var4[var5] == 1))
								var12 = 2001;
						} else if (var3[var5] == 3) {
							var11 = var0[var10].method152() ? 1 : 0;
							var12 = var9.method152() ? 1 : 0;
						} else {
							var11 = var0[var10].anInt262;
							var12 = var9.anInt262;
						}

						if (var12 != var11) {
							if (((var4[var5] != 1) || (var11 >= var12)) && ((var4[var5] != 0) || (var11 <= var12)))
								var6 = false;
							break;
						}

						if (var5 == 3)
							var6 = false;
					}
				} while (var6);

				if (var10 < var7) {
					final Class23 var13 = var0[var10];
					var0[var10] = var0[var7];
					var0[var7] = var13;
				}
			}

			method200(var0, var1, var7, var3, var4);
			method200(var0, 1 + var7, var2, var3, var4);
		}

	}
}
