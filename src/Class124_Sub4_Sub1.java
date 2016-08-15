public class Class124_Sub4_Sub1 extends Class124_Sub4 {
	int anInt1578;
	int anInt1580;
	boolean aBool1571;
	int anInt1581;
	int anInt1573;
	int anInt1574;
	int anInt1576;
	int anInt1575;
	int anInt1579;
	int anInt1577;
	int anInt1572;
	int anInt1583;
	int anInt1584;
	int anInt1585;
	int anInt1582;

	static int method781(final int var0, final int var1) {
		return var1 < 0 ? -var0 : (int) ((var0 * Math.sqrt(var1 * 1.220703125E-4D)) + 0.5D);
	}

	Class124_Sub4_Sub1(final Class124_Sub2_Sub1 var1, final int var2, final int var3) {
		aClass124_Sub2_962 = var1;
		anInt1578 = var1.anInt1588;
		anInt1580 = var1.anInt1587;
		aBool1571 = var1.aBool1589;
		anInt1581 = var2;
		anInt1573 = var3;
		anInt1574 = 8192;
		anInt1576 = 0;
		method784();
	}

	public static Class124_Sub4_Sub1 method782(final Class124_Sub2_Sub1 var0, final int var1, final int var2) {
		return (var0.aByteArray1586 != null) && (var0.aByteArray1586.length != 0) ? new Class124_Sub4_Sub1(var0,
				(int) ((var0.anInt1590 * 256L * var1) / (Class8.anInt94 * 100)), var2 << 6) : null;
	}

	public static Class124_Sub4_Sub1 method783(final Class124_Sub2_Sub1 var0, final int var1, final int var2,
			final int var3) {
		return (var0.aByteArray1586 != null) && (var0.aByteArray1586.length != 0)
				? new Class124_Sub4_Sub1(var0, var1, var2, var3) : null;
	}

	void method784() {
		anInt1575 = anInt1573;
		anInt1579 = method818(anInt1573, anInt1574);
		anInt1577 = method781(anInt1573, anInt1574);
	}

	public synchronized void method785(final int var1) {
		method817(var1 << 6, method788());
	}

	synchronized void method786(final int var1) {
		method817(var1, method788());
	}

	public synchronized int method787() {
		return anInt1573 == Integer.MIN_VALUE ? 0 : anInt1573;
	}

	public synchronized int method788() {
		return anInt1574 < 0 ? -1 : anInt1574;
	}

	public synchronized void method789(int var1) {
		final int var2 = ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586.length << 8;
		if (var1 < -1)
			var1 = -1;

		if (var1 > var2)
			var1 = var2;

		anInt1576 = var1;
	}

	public synchronized void method790(final boolean var1) {
		anInt1581 = (anInt1581 ^ (anInt1581 >> 31)) + (anInt1581 >>> 31);
		anInt1581 = -anInt1581;
	}

	void method791() {
		if (anInt1572 != 0) {
			if (anInt1573 == Integer.MIN_VALUE)
				anInt1573 = 0;

			anInt1572 = 0;
			method784();
		}

	}

	public synchronized void method792(final int var1, final int var2) {
		method815(var1, var2, method788());
	}

	static int method793(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			final int var7, int var8, final int var9, final int var10, final Class124_Sub4_Sub1 var11, final int var12,
			final int var13) {
		if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9))
			var8 = var9;

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			final byte var14 = var2[var1 - 1];
			var0 = (var14 << 8) + ((var2[var1] - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		if ((var12 == 0) || ((var8 = (var5 >> 1) + (((var10 - var4) + var12) / var12)) > var9))
			var8 = var9;

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + ((var2[var4 >> 8] - var1) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		var11.anInt1576 = var4;
		return var5 >> 1;
	}

	public synchronized void method794(int var1) {
		if (var1 == 0) {
			method786(0);
			method450();
		} else if ((anInt1579 == 0) && (anInt1577 == 0)) {
			anInt1572 = 0;
			anInt1573 = 0;
			anInt1575 = 0;
			method450();
		} else {
			int var2 = -anInt1575;
			if (anInt1575 > var2)
				var2 = anInt1575;

			if (-anInt1579 > var2)
				var2 = -anInt1579;

			if (anInt1579 > var2)
				var2 = anInt1579;

			if (-anInt1577 > var2)
				var2 = -anInt1577;

			if (anInt1577 > var2)
				var2 = anInt1577;

			if (var1 > var2)
				var1 = var2;

			anInt1572 = var1;
			anInt1573 = Integer.MIN_VALUE;
			anInt1583 = -anInt1575 / var1;
			anInt1584 = -anInt1579 / var1;
			anInt1585 = -anInt1577 / var1;
		}
	}

	public synchronized void method795(final int var1) {
		if (anInt1581 < 0)
			anInt1581 = -var1;
		else
			anInt1581 = var1;

	}

	public synchronized int method796() {
		return anInt1581 < 0 ? -anInt1581 : anInt1581;
	}

	@Override
	protected Class124_Sub4 method505() {
		return null;
	}

	@Override
	protected Class124_Sub4 method509() {
		return null;
	}

	@Override
	protected int method507() {
		return (anInt1573 == 0) && (anInt1572 == 0) ? 0 : 1;
	}

	@Override
	public synchronized void method506(int var1) {
		if (anInt1572 > 0)
			if (var1 >= anInt1572) {
				if (anInt1573 == Integer.MIN_VALUE) {
					anInt1573 = 0;
					anInt1577 = 0;
					anInt1579 = 0;
					anInt1575 = 0;
					method450();
					var1 = anInt1572;
				}

				anInt1572 = 0;
				method784();
			} else {
				anInt1575 += anInt1583 * var1;
				anInt1579 += anInt1584 * var1;
				anInt1577 += anInt1585 * var1;
				anInt1572 -= var1;
			}

		final Class124_Sub2_Sub1 var6 = (Class124_Sub2_Sub1) aClass124_Sub2_962;
		final int var5 = anInt1578 << 8;
		final int var3 = anInt1580 << 8;
		final int var7 = var6.aByteArray1586.length << 8;
		final int var4 = var3 - var5;
		if (var4 <= 0)
			anInt1582 = 0;

		if (anInt1576 < 0) {
			if (anInt1581 <= 0) {
				method791();
				method450();
				return;
			}

			anInt1576 = 0;
		}

		if (anInt1576 >= var7) {
			if (anInt1581 >= 0) {
				method791();
				method450();
				return;
			}

			anInt1576 = var7 - 1;
		}

		anInt1576 += anInt1581 * var1;
		if (anInt1582 < 0) {
			if (!aBool1571) {
				if (anInt1581 < 0) {
					if (anInt1576 >= var5)
						return;

					anInt1576 = var3 - 1 - ((var3 - 1 - anInt1576) % var4);
				} else {
					if (anInt1576 < var3)
						return;

					anInt1576 = var5 + ((anInt1576 - var5) % var4);
				}

			} else {
				if (anInt1581 < 0) {
					if (anInt1576 >= var5)
						return;

					anInt1576 = (var5 + var5) - 1 - anInt1576;
					anInt1581 = -anInt1581;
				}

				while (anInt1576 >= var3) {
					anInt1576 = (var3 + var3) - 1 - anInt1576;
					anInt1581 = -anInt1581;
					if (anInt1576 >= var5)
						return;

					anInt1576 = (var5 + var5) - 1 - anInt1576;
					anInt1581 = -anInt1581;
				}

			}
		} else {
			if (anInt1582 > 0)
				if (aBool1571)
					label163: {
						if (anInt1581 < 0) {
							if (anInt1576 >= var5)
								return;

							anInt1576 = (var5 + var5) - 1 - anInt1576;
							anInt1581 = -anInt1581;
							if (--anInt1582 == 0)
								break label163;
						}

						do {
							if (anInt1576 < var3)
								return;

							anInt1576 = (var3 + var3) - 1 - anInt1576;
							anInt1581 = -anInt1581;
							if (--anInt1582 == 0)
								break;

							if (anInt1576 >= var5)
								return;

							anInt1576 = (var5 + var5) - 1 - anInt1576;
							anInt1581 = -anInt1581;
						} while (--anInt1582 != 0);
					}
				else
					label195: {
						int var2;
						if (anInt1581 < 0) {
							if (anInt1576 >= var5)
								return;

							var2 = (var3 - 1 - anInt1576) / var4;
							if (var2 >= anInt1582) {
								anInt1576 += var4 * anInt1582;
								anInt1582 = 0;
								break label195;
							}

							anInt1576 += var4 * var2;
							anInt1582 -= var2;
						} else {
							if (anInt1576 < var3)
								return;

							var2 = (anInt1576 - var5) / var4;
							if (var2 >= anInt1582) {
								anInt1576 -= var4 * anInt1582;
								anInt1582 = 0;
								break label195;
							}

							anInt1576 -= var4 * var2;
							anInt1582 -= var2;
						}

						return;
					}

			if (anInt1581 < 0) {
				if (anInt1576 < 0) {
					anInt1576 = -1;
					method791();
					method450();
				}
			} else if (anInt1576 >= var7) {
				anInt1576 = var7;
				method791();
				method450();
			}

		}
	}

	int method797(final int[] var1, int var2, final int var3, final int var4, final int var5) {
		while (true) {
			if (anInt1572 > 0) {
				int var6 = var2 + anInt1572;
				if (var6 > var4)
					var6 = var4;

				anInt1572 += var2;
				if ((anInt1581 == 256) && ((anInt1576 & 255) == 0)) {
					if (Class8.aBool77)
						var2 = method806(0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576,
								var2, anInt1579, anInt1577, anInt1584, anInt1585, 0, var6, var3, this);
					else
						var2 = method805(((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576,
								var2, anInt1575, anInt1583, 0, var6, var3, this);
				} else if (Class8.aBool77)
					var2 = method811(0, 0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576,
							var2, anInt1579, anInt1577, anInt1584, anInt1585, 0, var6, var3, this, anInt1581, var5);
				else
					var2 = method816(0, 0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576,
							var2, anInt1575, anInt1583, 0, var6, var3, this, anInt1581, var5);

				anInt1572 -= var2;
				if (anInt1572 != 0)
					return var2;

				if (!method799())
					continue;

				return var4;
			}

			if ((anInt1581 == 256) && ((anInt1576 & 255) == 0)) {
				if (Class8.aBool77)
					return method801(0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576, var2,
							anInt1579, anInt1577, 0, var4, var3, this);

				return method800(((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576, var2,
						anInt1575, 0, var4, var3, this);
			}

			if (Class8.aBool77)
				return method803(0, 0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576, var2,
						anInt1579, anInt1577, 0, var4, var3, this, anInt1581, var5);

			return method813(0, 0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576, var2,
					anInt1575, 0, var4, var3, this, anInt1581, var5);
		}
	}

	int method798(final int[] var1, int var2, final int var3, final int var4, final int var5) {
		while (true) {
			if (anInt1572 > 0) {
				int var6 = var2 + anInt1572;
				if (var6 > var4)
					var6 = var4;

				anInt1572 += var2;
				if ((anInt1581 == -256) && ((anInt1576 & 255) == 0)) {
					if (Class8.aBool77)
						var2 = method808(0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576,
								var2, anInt1579, anInt1577, anInt1584, anInt1585, 0, var6, var3, this);
					else
						var2 = method807(((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576,
								var2, anInt1575, anInt1583, 0, var6, var3, this);
				} else if (Class8.aBool77)
					var2 = method810(0, 0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576,
							var2, anInt1579, anInt1577, anInt1584, anInt1585, 0, var6, var3, this, anInt1581, var5);
				else
					var2 = method809(0, 0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576,
							var2, anInt1575, anInt1583, 0, var6, var3, this, anInt1581, var5);

				anInt1572 -= var2;
				if (anInt1572 != 0)
					return var2;

				if (!method799())
					continue;

				return var4;
			}

			if ((anInt1581 == -256) && ((anInt1576 & 255) == 0)) {
				if (Class8.aBool77)
					return method802(0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576, var2,
							anInt1579, anInt1577, 0, var4, var3, this);

				return method820(((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576, var2,
						anInt1575, 0, var4, var3, this);
			}

			if (Class8.aBool77)
				return method793(0, 0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576, var2,
						anInt1579, anInt1577, 0, var4, var3, this, anInt1581, var5);

			return method804(0, 0, ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586, var1, anInt1576, var2,
					anInt1575, 0, var4, var3, this, anInt1581, var5);
		}
	}

	boolean method799() {
		int var1 = anInt1573;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var2 = 0;
			var3 = 0;
			var1 = 0;
		} else {
			var3 = method818(var1, anInt1574);
			var2 = method781(var1, anInt1574);
		}

		if ((anInt1575 == var1) && (anInt1579 == var3) && (anInt1577 == var2)) {
			if (anInt1573 == Integer.MIN_VALUE) {
				anInt1573 = 0;
				anInt1577 = 0;
				anInt1579 = 0;
				anInt1575 = 0;
				method450();
				return true;
			} else {
				method784();
				return false;
			}
		} else {
			if (anInt1575 < var1) {
				anInt1583 = 1;
				anInt1572 = var1 - anInt1575;
			} else if (anInt1575 > var1) {
				anInt1583 = -1;
				anInt1572 = anInt1575 - var1;
			} else
				anInt1583 = 0;

			if (anInt1579 < var3) {
				anInt1584 = 1;
				if ((anInt1572 == 0) || (anInt1572 > (var3 - anInt1579)))
					anInt1572 = var3 - anInt1579;
			} else if (anInt1579 > var3) {
				anInt1584 = -1;
				if ((anInt1572 == 0) || (anInt1572 > (anInt1579 - var3)))
					anInt1572 = anInt1579 - var3;
			} else
				anInt1584 = 0;

			if (anInt1577 < var2) {
				anInt1585 = 1;
				if ((anInt1572 == 0) || (anInt1572 > (var2 - anInt1577)))
					anInt1572 = var2 - anInt1577;
			} else if (anInt1577 > var2) {
				anInt1585 = -1;
				if ((anInt1572 == 0) || (anInt1572 > (anInt1577 - var2)))
					anInt1572 = anInt1577 - var2;
			} else
				anInt1585 = 0;

			return false;
		}
	}

	static int method800(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			int var7, final Class124_Sub4_Sub1 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = (var3 + var7) - var2) > var6)
			var5 = var6;

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4)
			var10001 = var3++;

		var8.anInt1576 = var2 << 8;
		return var3;
	}

	static int method801(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, final int var8, int var9, final Class124_Sub4_Sub1 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = (var4 + var9) - var3) > var8)
			var7 = var8;

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt1576 = var3 << 8;
		return var4 >> 1;
	}

	static int method802(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, final int var8, int var9, final Class124_Sub4_Sub1 var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = (var4 + var3) - (var9 - 1)) > var8)
			var7 = var8;

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.anInt1576 = var3 << 8;
		return var4 >> 1;
	}

	@Override
	int method510() {
		int var1 = (anInt1575 * 3) >> 6;
		var1 = (var1 ^ (var1 >> 31)) + (var1 >>> 31);
		if (anInt1582 != 0) {
			if (anInt1582 >= 0)
				var1 -= (var1 * anInt1578) / ((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586.length;
		} else
			var1 -= (var1 * anInt1576) / (((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586.length << 8);

		return var1 > 255 ? 255 : var1;
	}

	static int method803(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			final int var7, int var8, final int var9, final int var10, final Class124_Sub4_Sub1 var11, final int var12,
			final int var13) {
		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9))
			var8 = var9;

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + ((var2[var1 + 1] - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		if ((var12 == 0) || ((var8 = (var5 >> 1) + ((((var10 - var4) + var12) - 1) / var12)) > var9))
			var8 = var9;

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + ((var1 - var14) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
		}

		var11.anInt1576 = var4;
		return var5 >> 1;
	}

	static int method804(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, final int var6,
			int var7, final int var8, final int var9, final Class124_Sub4_Sub1 var10, final int var11,
			final int var12) {
		if ((var11 == 0) || ((var7 = var5 + ((((var9 + 256) - var4) + var11) / var11)) > var8))
			var7 = var8;

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			final byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var2[var1] - var13) * (var4 & 255))) * var6) >> 6;
			var4 += var11;
		}

		if ((var11 == 0) || ((var7 = var5 + (((var9 - var4) + var11) / var11)) > var8))
			var7 = var8;

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
		}

		var10.anInt1576 = var4;
		return var5;
	}

	static int method805(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			final int var7, int var8, final Class124_Sub4_Sub1 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var8) - var2) > var7)
			var6 = var7;

		var9.anInt1579 += var9.anInt1584 * (var6 - var3);
		var9.anInt1577 += var9.anInt1585 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.anInt1575 = var4 >> 2;
		var9.anInt1576 = var2 << 8;
		return var3;
	}

	static int method806(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, final int var10, int var11, final Class124_Sub4_Sub1 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var4 + var11) - var3) > var10)
			var9 = var10;

		var12.anInt1575 += var12.anInt1583 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt1579 = var5 >> 2;
		var12.anInt1577 = var6 >> 2;
		var12.anInt1576 = var3 << 8;
		return var4 >> 1;
	}

	static int method807(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, int var6,
			final int var7, int var8, final Class124_Sub4_Sub1 var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = (var3 + var2) - (var8 - 1)) > var7)
			var6 = var7;

		var9.anInt1579 += var9.anInt1584 * (var6 - var3);
		var9.anInt1577 += var9.anInt1585 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.anInt1575 = var4 >> 2;
		var9.anInt1576 = var2 << 8;
		return var3;
	}

	static int method808(final int var0, final byte[] var1, final int[] var2, int var3, int var4, int var5, int var6,
			int var7, int var8, int var9, final int var10, int var11, final Class124_Sub4_Sub1 var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = (var4 + var3) - (var11 - 1)) > var10)
			var9 = var10;

		var12.anInt1575 += var12.anInt1583 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.anInt1579 = var5 >> 2;
		var12.anInt1577 = var6 >> 2;
		var12.anInt1576 = var3 << 8;
		return var4 >> 1;
	}

	static int method809(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			final int var7, int var8, final int var9, final int var10, final Class124_Sub4_Sub1 var11, final int var12,
			final int var13) {
		var11.anInt1579 -= var11.anInt1584 * var5;
		var11.anInt1577 -= var11.anInt1585 * var5;
		if ((var12 == 0) || ((var8 = var5 + ((((var10 + 256) - var4) + var12) / var12)) > var9))
			var8 = var9;

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			final byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var2[var1] - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
			var4 += var12;
		}

		if ((var12 == 0) || ((var8 = var5 + (((var10 - var4) + var12) / var12)) > var9))
			var8 = var9;

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += (((var0 << 8) + ((var2[var4 >> 8] - var0) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
		}

		var11.anInt1579 += var11.anInt1584 * var5;
		var11.anInt1577 += var11.anInt1585 * var5;
		var11.anInt1575 = var6;
		var11.anInt1576 = var4;
		return var5;
	}

	static int method810(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			int var7, final int var8, final int var9, int var10, final int var11, final int var12,
			final Class124_Sub4_Sub1 var13, final int var14, final int var15) {
		var13.anInt1575 -= var13.anInt1583 * var5;
		if ((var14 == 0) || ((var10 = var5 + ((((var12 + 256) - var4) + var14) / var14)) > var11))
			var10 = var11;

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			final byte var16 = var2[var1 - 1];
			var0 = (var16 << 8) + ((var2[var1] - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		if ((var14 == 0) || ((var10 = (var5 >> 1) + (((var12 - var4) + var14) / var14)) > var11))
			var10 = var11;

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + ((var2[var4 >> 8] - var1) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt1575 += var13.anInt1583 * var5;
		var13.anInt1579 = var6;
		var13.anInt1577 = var7;
		var13.anInt1576 = var4;
		return var5;
	}

	static int method811(int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			int var7, final int var8, final int var9, int var10, final int var11, final int var12,
			final Class124_Sub4_Sub1 var13, final int var14, final int var15) {
		var13.anInt1575 -= var13.anInt1583 * var5;
		if ((var14 == 0) || ((var10 = var5 + ((((var12 - var4) + var14) - 257) / var14)) > var11))
			var10 = var11;

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + ((var2[var1 + 1] - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		if ((var14 == 0) || ((var10 = (var5 >> 1) + ((((var12 - var4) + var14) - 1) / var14)) > var11))
			var10 = var11;

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + ((var1 - var16) * (var4 & 255));
			var10001 = var5++;
			var3[var10001] += (var0 * var6) >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += (var0 * var7) >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.anInt1575 += var13.anInt1583 * var5;
		var13.anInt1579 = var6;
		var13.anInt1577 = var7;
		var13.anInt1576 = var4;
		return var5;
	}

	public synchronized void method812(final int var1) {
		anInt1582 = var1;
	}

	static int method813(final int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5,
			final int var6, int var7, final int var8, final int var9, final Class124_Sub4_Sub1 var10, final int var11,
			final int var12) {
		if ((var11 == 0) || ((var7 = var5 + ((((var9 - var4) + var11) - 257) / var11)) > var8))
			var7 = var8;

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var2[var1 + 1] - var13) * (var4 & 255))) * var6) >> 6;
			var4 += var11;
		}

		if ((var11 == 0) || ((var7 = var5 + ((((var9 - var4) + var11) - 1) / var11)) > var8))
			var7 = var8;

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += (((var13 << 8) + ((var1 - var13) * (var4 & 255))) * var6) >> 6;
		}

		var10.anInt1576 = var4;
		return var5;
	}

	public boolean method814() {
		return anInt1572 != 0;
	}

	public synchronized void method815(int var1, final int var2, final int var3) {
		if (var1 == 0)
			method817(var2, var3);
		else {
			final int var5 = method818(var2, var3);
			final int var6 = method781(var2, var3);
			if ((anInt1579 == var5) && (anInt1577 == var6))
				anInt1572 = 0;
			else {
				int var4 = var2 - anInt1575;
				if ((anInt1575 - var2) > var4)
					var4 = anInt1575 - var2;

				if ((var5 - anInt1579) > var4)
					var4 = var5 - anInt1579;

				if ((anInt1579 - var5) > var4)
					var4 = anInt1579 - var5;

				if ((var6 - anInt1577) > var4)
					var4 = var6 - anInt1577;

				if ((anInt1577 - var6) > var4)
					var4 = anInt1577 - var6;

				if (var1 > var4)
					var1 = var4;

				anInt1572 = var1;
				anInt1573 = var2;
				anInt1574 = var3;
				anInt1583 = (var2 - anInt1575) / var1;
				anInt1584 = (var5 - anInt1579) / var1;
				anInt1585 = (var6 - anInt1577) / var1;
			}
		}
	}

	static int method816(final int var0, int var1, final byte[] var2, final int[] var3, int var4, int var5, int var6,
			final int var7, int var8, final int var9, final int var10, final Class124_Sub4_Sub1 var11, final int var12,
			final int var13) {
		var11.anInt1579 -= var11.anInt1584 * var5;
		var11.anInt1577 -= var11.anInt1585 * var5;
		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 257) / var12)) > var9))
			var8 = var9;

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var2[var1 + 1] - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
			var4 += var12;
		}

		if ((var12 == 0) || ((var8 = var5 + ((((var10 - var4) + var12) - 1) / var12)) > var9))
			var8 = var9;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += (((var14 << 8) + ((var1 - var14) * (var4 & 255))) * var6) >> 6;
			var6 += var7;
		}

		var11.anInt1579 += var11.anInt1584 * var5;
		var11.anInt1577 += var11.anInt1585 * var5;
		var11.anInt1575 = var6;
		var11.anInt1576 = var4;
		return var5;
	}

	Class124_Sub4_Sub1(final Class124_Sub2_Sub1 var1, final int var2, final int var3, final int var4) {
		aClass124_Sub2_962 = var1;
		anInt1578 = var1.anInt1588;
		anInt1580 = var1.anInt1587;
		aBool1571 = var1.aBool1589;
		anInt1581 = var2;
		anInt1573 = var3;
		anInt1574 = var4;
		anInt1576 = 0;
		method784();
	}

	@Override
	public synchronized void method511(final int[] var1, final int var2, int var3) {
		if ((anInt1573 == 0) && (anInt1572 == 0))
			method506(var3);
		else {
			final Class124_Sub2_Sub1 var4 = (Class124_Sub2_Sub1) aClass124_Sub2_962;
			final int var5 = anInt1578 << 8;
			final int var6 = anInt1580 << 8;
			final int var7 = var4.aByteArray1586.length << 8;
			final int var8 = var6 - var5;
			if (var8 <= 0)
				anInt1582 = 0;

			int var9 = var2;
			var3 += var2;
			if (anInt1576 < 0) {
				if (anInt1581 <= 0) {
					method791();
					method450();
					return;
				}

				anInt1576 = 0;
			}

			if (anInt1576 >= var7) {
				if (anInt1581 >= 0) {
					method791();
					method450();
					return;
				}

				anInt1576 = var7 - 1;
			}

			if (anInt1582 < 0) {
				if (aBool1571) {
					if (anInt1581 < 0) {
						var9 = method798(var1, var2, var5, var3, var4.aByteArray1586[anInt1578]);
						if (anInt1576 >= var5)
							return;

						anInt1576 = (var5 + var5) - 1 - anInt1576;
						anInt1581 = -anInt1581;
					}

					while (true) {
						var9 = method797(var1, var9, var6, var3, var4.aByteArray1586[anInt1580 - 1]);
						if (anInt1576 < var6)
							return;

						anInt1576 = (var6 + var6) - 1 - anInt1576;
						anInt1581 = -anInt1581;
						var9 = method798(var1, var9, var5, var3, var4.aByteArray1586[anInt1578]);
						if (anInt1576 >= var5)
							return;

						anInt1576 = (var5 + var5) - 1 - anInt1576;
						anInt1581 = -anInt1581;
					}
				} else if (anInt1581 < 0)
					while (true) {
						var9 = method798(var1, var9, var5, var3, var4.aByteArray1586[anInt1580 - 1]);
						if (anInt1576 >= var5)
							return;

						anInt1576 = var6 - 1 - ((var6 - 1 - anInt1576) % var8);
					}
				else
					while (true) {
						var9 = method797(var1, var9, var6, var3, var4.aByteArray1586[anInt1578]);
						if (anInt1576 < var6)
							return;

						anInt1576 = var5 + ((anInt1576 - var5) % var8);
					}
			} else {
				if (anInt1582 > 0)
					if (aBool1571)
						label174: {
							if (anInt1581 < 0) {
								var9 = method798(var1, var2, var5, var3, var4.aByteArray1586[anInt1578]);
								if (anInt1576 >= var5)
									return;

								anInt1576 = (var5 + var5) - 1 - anInt1576;
								anInt1581 = -anInt1581;
								if (--anInt1582 == 0)
									break label174;
							}

							do {
								var9 = method797(var1, var9, var6, var3, var4.aByteArray1586[anInt1580 - 1]);
								if (anInt1576 < var6)
									return;

								anInt1576 = (var6 + var6) - 1 - anInt1576;
								anInt1581 = -anInt1581;
								if (--anInt1582 == 0)
									break;

								var9 = method798(var1, var9, var5, var3, var4.aByteArray1586[anInt1578]);
								if (anInt1576 >= var5)
									return;

								anInt1576 = (var5 + var5) - 1 - anInt1576;
								anInt1581 = -anInt1581;
							} while (--anInt1582 != 0);
						}
					else {
						int var10;
						if (anInt1581 < 0)
							while (true) {
								var9 = method798(var1, var9, var5, var3, var4.aByteArray1586[anInt1580 - 1]);
								if (anInt1576 >= var5)
									return;

								var10 = (var6 - 1 - anInt1576) / var8;
								if (var10 >= anInt1582) {
									anInt1576 += var8 * anInt1582;
									anInt1582 = 0;
									break;
								}

								anInt1576 += var8 * var10;
								anInt1582 -= var10;
							}
						else
							while (true) {
								var9 = method797(var1, var9, var6, var3, var4.aByteArray1586[anInt1578]);
								if (anInt1576 < var6)
									return;

								var10 = (anInt1576 - var5) / var8;
								if (var10 >= anInt1582) {
									anInt1576 -= var8 * anInt1582;
									anInt1582 = 0;
									break;
								}

								anInt1576 -= var8 * var10;
								anInt1582 -= var10;
							}
					}

				if (anInt1581 < 0) {
					method798(var1, var9, 0, var3, 0);
					if (anInt1576 < 0) {
						anInt1576 = -1;
						method791();
						method450();
					}
				} else {
					method797(var1, var9, var7, var3, 0);
					if (anInt1576 >= var7) {
						anInt1576 = var7;
						method791();
						method450();
					}
				}

			}
		}
	}

	synchronized void method817(final int var1, final int var2) {
		anInt1573 = var1;
		anInt1574 = var2;
		anInt1572 = 0;
		method784();
	}

	static int method818(final int var0, final int var1) {
		return var1 < 0 ? var0 : (int) ((var0 * Math.sqrt((16384 - var1) * 1.220703125E-4D)) + 0.5D);
	}

	public boolean method819() {
		return (anInt1576 < 0) || (anInt1576 >= (((Class124_Sub2_Sub1) aClass124_Sub2_962).aByteArray1586.length << 8));
	}

	static int method820(final byte[] var0, final int[] var1, int var2, int var3, int var4, int var5, final int var6,
			int var7, final Class124_Sub4_Sub1 var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = (var3 + var2) - (var7 - 1)) > var6)
			var5 = var6;

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4)
			var10001 = var3++;

		var8.anInt1576 = var2 << 8;
		return var3;
	}
}
