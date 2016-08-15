public class Class130 {
	int anInt891 = 0;
	int anInt893 = 0;
	int anInt890;
	int anInt892;
	public int[][] anIntArrayArray894;

	public void method463() {
		for (int var1 = 0; var1 < anInt890; ++var1)
			for (int var2 = 0; var2 < anInt892; ++var2)
				if ((var1 != 0) && (var2 != 0) && (var1 < (anInt890 - 5)) && (var2 < (anInt892 - 5)))
					anIntArrayArray894[var1][var2] = 16777216;
				else
					anIntArrayArray894[var1][var2] = 16777215;

	}

	public void method464(int var1, int var2, final int var3, final int var4, final boolean var5) {
		var1 -= anInt891;
		var2 -= anInt893;
		if (var3 == 0) {
			if (var4 == 0) {
				method465(var1, var2, 128);
				method465(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				method465(var1, var2, 2);
				method465(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				method465(var1, var2, 8);
				method465(1 + var1, var2, 128);
			}

			if (var4 == 3) {
				method465(var1, var2, 32);
				method465(var1, var2 - 1, 2);
			}
		}

		if ((var3 == 1) || (var3 == 3)) {
			if (var4 == 0) {
				method465(var1, var2, 1);
				method465(var1 - 1, var2 + 1, 16);
			}

			if (var4 == 1) {
				method465(var1, var2, 4);
				method465(var1 + 1, var2 + 1, 64);
			}

			if (var4 == 2) {
				method465(var1, var2, 16);
				method465(var1 + 1, var2 - 1, 1);
			}

			if (var4 == 3) {
				method465(var1, var2, 64);
				method465(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method465(var1, var2, 130);
				method465(var1 - 1, var2, 8);
				method465(var1, 1 + var2, 32);
			}

			if (var4 == 1) {
				method465(var1, var2, 10);
				method465(var1, 1 + var2, 32);
				method465(var1 + 1, var2, 128);
			}

			if (var4 == 2) {
				method465(var1, var2, 40);
				method465(1 + var1, var2, 128);
				method465(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				method465(var1, var2, 160);
				method465(var1, var2 - 1, 2);
				method465(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method465(var1, var2, 65536);
					method465(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					method465(var1, var2, 1024);
					method465(var1, var2 + 1, 16384);
				}

				if (var4 == 2) {
					method465(var1, var2, 4096);
					method465(1 + var1, var2, 65536);
				}

				if (var4 == 3) {
					method465(var1, var2, 16384);
					method465(var1, var2 - 1, 1024);
				}
			}

			if ((var3 == 1) || (var3 == 3)) {
				if (var4 == 0) {
					method465(var1, var2, 512);
					method465(var1 - 1, 1 + var2, 8192);
				}

				if (var4 == 1) {
					method465(var1, var2, 2048);
					method465(var1 + 1, var2 + 1, '\u8000');
				}

				if (var4 == 2) {
					method465(var1, var2, 8192);
					method465(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					method465(var1, var2, '\u8000');
					method465(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method465(var1, var2, 66560);
					method465(var1 - 1, var2, 4096);
					method465(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					method465(var1, var2, 5120);
					method465(var1, var2 + 1, 16384);
					method465(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					method465(var1, var2, 20480);
					method465(1 + var1, var2, 65536);
					method465(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					method465(var1, var2, 81920);
					method465(var1, var2 - 1, 1024);
					method465(var1 - 1, var2, 4096);
				}
			}
		}

	}

	void method465(final int var1, final int var2, final int var3) {
		anIntArrayArray894[var1][var2] |= var3;
	}

	public void method466(int var1, int var2, final int var3, final int var4, final boolean var5) {
		int var6 = 256;
		if (var5)
			var6 += 131072;

		var1 -= anInt891;
		var2 -= anInt893;

		for (int var8 = var1; var8 < (var1 + var3); ++var8)
			if ((var8 >= 0) && (var8 < anInt890))
				for (int var7 = var2; var7 < (var2 + var4); ++var7)
					if ((var7 >= 0) && (var7 < anInt892))
						method465(var8, var7, var6);

	}

	public void method467(int var1, int var2, int var3, int var4, final int var5, final boolean var6) {
		int var7 = 256;
		if (var6)
			var7 += 131072;

		var1 -= anInt891;
		var2 -= anInt893;
		int var8;
		if ((var5 == 1) || (var5 == 3)) {
			var8 = var3;
			var3 = var4;
			var4 = var8;
		}

		for (var8 = var1; var8 < (var3 + var1); ++var8)
			if ((var8 >= 0) && (var8 < anInt890))
				for (int var9 = var2; var9 < (var2 + var4); ++var9)
					if ((var9 >= 0) && (var9 < anInt892))
						method468(var8, var9, var7);

	}

	void method468(final int var1, final int var2, final int var3) {
		anIntArrayArray894[var1][var2] &= ~var3;
	}

	public void method469(int var1, int var2) {
		var1 -= anInt891;
		var2 -= anInt893;
		anIntArrayArray894[var1][var2] &= -262145;
	}

	public void method470(int var1, int var2) {
		var1 -= anInt891;
		var2 -= anInt893;
		anIntArrayArray894[var1][var2] |= 262144;
	}

	public Class130(final int var1, final int var2) {
		anInt890 = var1;
		anInt892 = var2;
		anIntArrayArray894 = new int[anInt890][anInt892];
		method463();
	}

	public void method471(int var1, int var2) {
		var1 -= anInt891;
		var2 -= anInt893;
		anIntArrayArray894[var1][var2] |= 2097152;
	}

	public void method472(int var1, int var2, final int var3, final int var4, final boolean var5) {
		var1 -= anInt891;
		var2 -= anInt893;
		if (var3 == 0) {
			if (var4 == 0) {
				method468(var1, var2, 128);
				method468(var1 - 1, var2, 8);
			}

			if (var4 == 1) {
				method468(var1, var2, 2);
				method468(var1, var2 + 1, 32);
			}

			if (var4 == 2) {
				method468(var1, var2, 8);
				method468(var1 + 1, var2, 128);
			}

			if (var4 == 3) {
				method468(var1, var2, 32);
				method468(var1, var2 - 1, 2);
			}
		}

		if ((var3 == 1) || (var3 == 3)) {
			if (var4 == 0) {
				method468(var1, var2, 1);
				method468(var1 - 1, 1 + var2, 16);
			}

			if (var4 == 1) {
				method468(var1, var2, 4);
				method468(1 + var1, 1 + var2, 64);
			}

			if (var4 == 2) {
				method468(var1, var2, 16);
				method468(1 + var1, var2 - 1, 1);
			}

			if (var4 == 3) {
				method468(var1, var2, 64);
				method468(var1 - 1, var2 - 1, 4);
			}
		}

		if (var3 == 2) {
			if (var4 == 0) {
				method468(var1, var2, 130);
				method468(var1 - 1, var2, 8);
				method468(var1, var2 + 1, 32);
			}

			if (var4 == 1) {
				method468(var1, var2, 10);
				method468(var1, 1 + var2, 32);
				method468(1 + var1, var2, 128);
			}

			if (var4 == 2) {
				method468(var1, var2, 40);
				method468(1 + var1, var2, 128);
				method468(var1, var2 - 1, 2);
			}

			if (var4 == 3) {
				method468(var1, var2, 160);
				method468(var1, var2 - 1, 2);
				method468(var1 - 1, var2, 8);
			}
		}

		if (var5) {
			if (var3 == 0) {
				if (var4 == 0) {
					method468(var1, var2, 65536);
					method468(var1 - 1, var2, 4096);
				}

				if (var4 == 1) {
					method468(var1, var2, 1024);
					method468(var1, 1 + var2, 16384);
				}

				if (var4 == 2) {
					method468(var1, var2, 4096);
					method468(var1 + 1, var2, 65536);
				}

				if (var4 == 3) {
					method468(var1, var2, 16384);
					method468(var1, var2 - 1, 1024);
				}
			}

			if ((var3 == 1) || (var3 == 3)) {
				if (var4 == 0) {
					method468(var1, var2, 512);
					method468(var1 - 1, 1 + var2, 8192);
				}

				if (var4 == 1) {
					method468(var1, var2, 2048);
					method468(1 + var1, 1 + var2, '\u8000');
				}

				if (var4 == 2) {
					method468(var1, var2, 8192);
					method468(var1 + 1, var2 - 1, 512);
				}

				if (var4 == 3) {
					method468(var1, var2, '\u8000');
					method468(var1 - 1, var2 - 1, 2048);
				}
			}

			if (var3 == 2) {
				if (var4 == 0) {
					method468(var1, var2, 66560);
					method468(var1 - 1, var2, 4096);
					method468(var1, var2 + 1, 16384);
				}

				if (var4 == 1) {
					method468(var1, var2, 5120);
					method468(var1, 1 + var2, 16384);
					method468(var1 + 1, var2, 65536);
				}

				if (var4 == 2) {
					method468(var1, var2, 20480);
					method468(1 + var1, var2, 65536);
					method468(var1, var2 - 1, 1024);
				}

				if (var4 == 3) {
					method468(var1, var2, 81920);
					method468(var1, var2 - 1, 1024);
					method468(var1 - 1, var2, 4096);
				}
			}
		}

	}
}
