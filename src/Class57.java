public class Class57 {
	static long aLong536;
	static byte[][][] aByteArrayArrayArray537;
	static Class22 aClass22_538;
	static String aString539;
	static long aLong540;

	static final void packetFor(final int var0, final int var1, int opc, final int var3, final String var4,
			final String var5, final int var6, final int var7) {
		if (opc >= 2000)
			opc -= 2000;

		Class124_Sub22_Sub19_Sub3_Sub2 var8;
		if (opc == 47) {
			var8 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var3];
			if (null != var8) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(139); // player option
				client.secbuf.writeShort(var3);
				client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
			}
		}

		Class124_Sub22_Sub19_Sub3_Sub1 var21;
		if (opc == 8) {
			var21 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var3];
			if (var21 != null) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(83); // magic on npc
				client.secbuf.writeShort(client.anInt2138);
				client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
				client.secbuf.writeIntV1(Class124_Sub10.anInt1033);
				client.secbuf.writeShort(var3);
			}
		}

		Widget var22;
		if (opc == 1005) {
			var22 = Class10.getwidget(var1);
			if ((var22 != null) && (var22.anIntArray1270[var0] >= 100000))
				Class20.method95(27, "",
						var22.anIntArray1270[var0] + " x " + Def10.method724(var3).aString1472);
			else {
				client.secbuf.writeOpcode(65); // ?
				client.secbuf.writeShortU(var3);
			}

			client.anInt2010 = 0;
			Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
			client.anInt2092 = var0;
		}

		if (opc == 36) {
			client.secbuf.writeOpcode(53); // item option
			client.secbuf.writeAShort(var3);
			client.secbuf.writeShortA(var0);
			client.secbuf.writeIntV1(var1);
			client.anInt2010 = 0;
			Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
			client.anInt2092 = var0;
		}

		if (opc == 1002) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.secbuf.writeOpcode(161); // examine object
			client.secbuf.writeShort((var3 >> 14) & 32767);
		}

		if (opc == 1) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.anInt2194 = var0;
			client.anInt2217 = var1;
			client.secbuf.writeOpcode(8); // item on object
			client.secbuf.writeShort((var3 >> 14) & 32767);
			client.secbuf.writeInt2(Class38.anInt398);
			client.secbuf.writeShort(Class124_Sub19.anInt1299);
			client.secbuf.writeByte(Class84.aBoolArray676[82] ? 1 : 0);
			client.secbuf.writeShortA(Class9.anInt102 + var0);
			client.secbuf.writeShortA(var1 + Class95.anInt762);
			client.secbuf.writeAShort(Class87.anInt692);
		}

		if (opc == 19) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.anInt2194 = var0;
			client.anInt2217 = var1;
			client.secbuf.writeOpcode(200); // ground item option
			client.secbuf.writeShortA(var3);
			client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
			client.secbuf.writeShort(Class9.anInt102 + var0);
			client.secbuf.writeShort(Class95.anInt762 + var1);
		}

		int var9;
		if (opc == 28) {
			client.secbuf.writeOpcode(125); // action button
			client.secbuf.writeInt(var1);
			var22 = Class10.getwidget(var1);
			if ((var22.anIntArrayArray1278 != null) && (var22.anIntArrayArray1278[0][0] == 5)) {
				var9 = var22.anIntArrayArray1278[0][1];
				Class91.anIntArray711[var9] = 1 - Class91.anIntArray711[var9];
				Class124_Sub11.method539(var9);
			}
		}

		if (opc == 48) {
			var8 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var3];
			if (var8 != null) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(179); // player option
				client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
				client.secbuf.writeShortU(var3);
			}
		}

		if (opc == 4) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.anInt2194 = var0;
			client.anInt2217 = var1;
			client.secbuf.writeOpcode(124);
			client.secbuf.writeByteA(Class84.aBoolArray676[82] ? 1 : 0);
			client.secbuf.writeShort(var1 + Class95.anInt762);
			client.secbuf.writeAShort((var3 >> 14) & 32767);
			client.secbuf.writeAShort(var0 + Class9.anInt102);
		}

		if (opc == 7) {
			var21 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var3];
			if (null != var21) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(25);
				client.secbuf.writeShortU(Class87.anInt692);
				client.secbuf.writeAShort(var3);
				client.secbuf.writeShortU(Class124_Sub19.anInt1299);
				client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
				client.secbuf.writeInt(Class38.anInt398);
			}
		}

		if (opc == 43) {
			client.secbuf.writeOpcode(4);
			client.secbuf.writeInt2(var1);
			client.secbuf.writeShortA(var3);
			client.secbuf.writeAShort(var0);
			client.anInt2010 = 0;
			Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
			client.anInt2092 = var0;
		}

		if (opc == 34) {
			client.secbuf.writeOpcode(169);
			client.secbuf.writeShortA(var3);
			client.secbuf.readInt(var1);
			client.secbuf.writeShort(var0);
			client.anInt2010 = 0;
			Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
			client.anInt2092 = var0;
		}

		if (opc == 17) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.anInt2194 = var0;
			client.anInt2217 = var1;
			client.secbuf.writeOpcode(12);
			client.secbuf.writeShortU(var3);
			client.secbuf.writeIntV1(Class124_Sub10.anInt1033);
			client.secbuf.writeShortA(client.anInt2138);
			client.secbuf.writeAShort(var1 + Class95.anInt762);
			client.secbuf.writeShortU(Class9.anInt102 + var0);
			client.secbuf.writeByteS(Class84.aBoolArray676[82] ? 1 : 0);
		}

		if (opc == 21) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.anInt2194 = var0;
			client.anInt2217 = var1;
			client.secbuf.writeOpcode(10);
			client.secbuf.writeShortU(var1 + Class95.anInt762);
			client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
			client.secbuf.writeAShort(Class9.anInt102 + var0);
			client.secbuf.writeShortU(var3);
		}

		if (opc == 41) {
			client.secbuf.writeOpcode(60);
			client.secbuf.writeAShort(var3);
			client.secbuf.readInt(var1);
			client.secbuf.writeAShort(var0);
			client.anInt2010 = 0;
			Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
			client.anInt2092 = var0;
		}

		if (opc == 1004) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.secbuf.writeOpcode(65);
			client.secbuf.writeShortU(var3);
		}

		if (opc == 16) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.anInt2194 = var0;
			client.anInt2217 = var1;
			client.secbuf.writeOpcode(87);
			client.secbuf.writeShort(var3);
			client.secbuf.writeShortA(Class87.anInt692);
			client.secbuf.writeShortU(Class95.anInt762 + var1);
			client.secbuf.writeShortA(Class124_Sub19.anInt1299);
			client.secbuf.writeShortA(Class9.anInt102 + var0);
			client.secbuf.readInt(Class38.anInt398);
			client.secbuf.writeByteS(Class84.aBoolArray676[82] ? 1 : 0);
		}

		if (opc == 1001) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.anInt2194 = var0;
			client.anInt2217 = var1;
			client.secbuf.writeOpcode(69);
			client.secbuf.writeShort((var3 >> 14) & 32767);
			client.secbuf.writeShortU(var1 + Class95.anInt762);
			client.secbuf.writeByte(Class84.aBoolArray676[82] ? 1 : 0);
			client.secbuf.writeShort(Class9.anInt102 + var0);
		}

		if ((opc == 30) && (client.aClass124_Sub17_2042 == null)) {
			client.secbuf.writeOpcode(198); // action button
			client.secbuf.writeInt(var1);
			client.secbuf.writeShort(var0);
			client.aClass124_Sub17_2042 = RuntimeException_Sub1.method1010(var1, var0, 172659367);
			Def10.settrue(client.aClass124_Sub17_2042);
		}

		if (opc == 6) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.anInt2194 = var0;
			client.anInt2217 = var1;
			client.secbuf.writeOpcode(240);
			client.secbuf.writeAShort(var0 + Class9.anInt102);
			client.secbuf.writeShortA(Class95.anInt762 + var1);
			client.secbuf.writeByte(Class84.aBoolArray676[82] ? 1 : 0);
			client.secbuf.writeShort((var3 >> 14) & 32767);
		}

		if (opc == 20) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.anInt2194 = var0;
			client.anInt2217 = var1;
			client.secbuf.writeOpcode(195);
			client.secbuf.writeShortA(Class95.anInt762 + var1);
			client.secbuf.writeShortU(var3);
			client.secbuf.writeShort(var0 + Class9.anInt102);
			client.secbuf.writeByte(Class84.aBoolArray676[82] ? 1 : 0);
		}

		if (opc == 46) {
			var8 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var3];
			if (var8 != null) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(64);
				client.secbuf.writeByteS(Class84.aBoolArray676[82] ? 1 : 0);
				client.secbuf.writeShort(var3);
			}
		}

		if (opc == 10) {
			var21 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var3];
			if (var21 != null) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(190);
				client.secbuf.writeByte(Class84.aBoolArray676[82] ? 1 : 0);
				client.secbuf.writeShort(var3);
			}
		}

		if (opc == 9) {
			var21 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var3];
			if (var21 != null) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(31);
				client.secbuf.writeByte(Class84.aBoolArray676[82] ? 1 : 0);
				client.secbuf.writeAShort(var3);
			}
		}

		if (opc == 42) {
			client.secbuf.writeOpcode(74);
			client.secbuf.writeInt2(var1);
			client.secbuf.writeShortU(var3);
			client.secbuf.writeShortA(var0);
			client.anInt2010 = 0;
			Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
			client.anInt2092 = var0;
		}

		if (opc == 5) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.anInt2194 = var0;
			client.anInt2217 = var1;
			client.secbuf.writeOpcode(189);
			client.secbuf.writeShortU(Class95.anInt762 + var1);
			client.secbuf.writeAShort(var0 + Class9.anInt102);
			client.secbuf.writeShort((var3 >> 14) & 32767);
			client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
		}

		int var12;
		if ((opc == 57) || (opc == 1007)) {
			var22 = RuntimeException_Sub1.method1010(var1, var0, 172659367);
			if (var22 != null) {
				var9 = var22.anInt1271;
				final Widget var11 = RuntimeException_Sub1.method1010(var1, var0, 172659367);
				if (var11 != null) {
					if (null != var11.anObjectArray1198) {
						final CSD var16 = new CSD();
						var16.aClass124_Sub17_994 = var11;
						var16.anInt997 = var3;
						var16.aString1002 = var5;
						var16.anObjectArray995 = var11.anObjectArray1198;
						Class124_Sub22_Sub19_Sub3_Sub2.fullCS(var16);
					}

					boolean var10 = true;
					if (var11.anInt1157 > 0)
						var10 = Class7.method33(var11);

					if (var10) {
						final int var17 = Class124_Sub22_Sub19_Sub6.method963(var11);
						var12 = var3 - 1;
						final boolean var14 = ((var17 >> (1 + var12)) & 1) != 0;
						if (var14) {
							if (var3 == 1) {
								client.secbuf.writeOpcode(182);
								client.secbuf.writeInt(var1);
								client.secbuf.writeShort(var0);
								client.secbuf.writeShort(var9);
							}

							if (var3 == 2) {
								client.secbuf.writeOpcode(253);
								client.secbuf.writeInt(var1);
								client.secbuf.writeShort(var0);
								client.secbuf.writeShort(var9);
							}

							if (var3 == 3) {
								client.secbuf.writeOpcode(209);
								client.secbuf.writeInt(var1);
								client.secbuf.writeShort(var0);
								client.secbuf.writeShort(var9);
							}

							if (var3 == 4) {
								client.secbuf.writeOpcode(197);
								client.secbuf.writeInt(var1);
								client.secbuf.writeShort(var0);
								client.secbuf.writeShort(var9);
							}

							if (var3 == 5) {
								client.secbuf.writeOpcode(118);
								client.secbuf.writeInt(var1);
								client.secbuf.writeShort(var0);
								client.secbuf.writeShort(var9);
							}

							if (var3 == 6) {
								client.secbuf.writeOpcode(230);
								client.secbuf.writeInt(var1);
								client.secbuf.writeShort(var0);
								client.secbuf.writeShort(var9);
							}

							if (var3 == 7) {
								client.secbuf.writeOpcode(183);
								client.secbuf.writeInt(var1);
								client.secbuf.writeShort(var0);
								client.secbuf.writeShort(var9);
							}

							if (var3 == 8) {
								client.secbuf.writeOpcode(152);
								client.secbuf.writeInt(var1);
								client.secbuf.writeShort(var0);
								client.secbuf.writeShort(var9);
							}

							if (var3 == 9) {
								client.secbuf.writeOpcode(23);
								client.secbuf.writeInt(var1);
								client.secbuf.writeShort(var0);
								client.secbuf.writeShort(var9);
							}

							if (var3 == 10) {
								client.secbuf.writeOpcode(59);
								client.secbuf.writeInt(var1);
								client.secbuf.writeShort(var0);
								client.secbuf.writeShort(var9);
							}
						}
					}
				}
			}
		}

		if (opc == 37) {
			client.secbuf.writeOpcode(174);
			client.secbuf.writeAShort(var3);
			client.secbuf.writeShortA(var0);
			client.secbuf.writeInt(var1);
			client.anInt2010 = 0;
			Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
			client.anInt2092 = var0;
		}

		if (opc == 18) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			client.anInt2194 = var0;
			client.anInt2217 = var1;
			client.secbuf.writeOpcode(116);
			client.secbuf.writeShortA(var3);
			client.secbuf.writeByteA(Class84.aBoolArray676[82] ? 1 : 0);
			client.secbuf.writeShortA(Class95.anInt762 + var1);
			client.secbuf.writeShortA(Class9.anInt102 + var0);
		}

		if (opc == 40) {
			client.secbuf.writeOpcode(1);
			client.secbuf.readInt(var1);
			client.secbuf.writeAShort(var3);
			client.secbuf.writeShort(var0);
			client.anInt2010 = 0;
			Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
			client.anInt2092 = var0;
		}

		if (opc == 31) {
			client.secbuf.writeOpcode(54);
			client.secbuf.writeInt(var1);
			client.secbuf.writeAShort(Class124_Sub19.anInt1299);
			client.secbuf.writeShortA(var3);
			client.secbuf.readInt(Class38.anInt398);
			client.secbuf.writeShortA(var0);
			client.secbuf.writeAShort(Class87.anInt692);
			client.anInt2010 = 0;
			Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
			client.anInt2092 = var0;
		}

		if (opc == 32) {
			client.secbuf.writeOpcode(11);
			client.secbuf.writeIntV1(var1);
			client.secbuf.writeShort(var3);
			client.secbuf.writeShort(client.anInt2138);
			client.secbuf.writeShortA(var0);
			client.secbuf.writeInt(Class124_Sub10.anInt1033);
			client.anInt2010 = 0;
			Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
			client.anInt2092 = var0;
		}

		if (opc == 33) {
			client.secbuf.writeOpcode(208);
			client.secbuf.writeShort(var3);
			client.secbuf.writeAShort(var0);
			client.secbuf.writeInt(var1);
			client.anInt2010 = 0;
			Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
			client.anInt2092 = var0;
		}

		if (opc == 49) {
			var8 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var3];
			if (null != var8) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(192);
				client.secbuf.writeShortA(var3);
				client.secbuf.writeByteA(Class84.aBoolArray676[82] ? 1 : 0);
			}
		}

		if (opc == 44) {
			var8 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var3];
			if (null != var8) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(177);
				client.secbuf.writeShortU(var3);
				client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
			}
		}

		if (opc == 15) {
			var8 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var3];
			if (null != var8) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(231);
				client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
				client.secbuf.writeShort(client.anInt2138);
				client.secbuf.writeAShort(var3);
				client.secbuf.readInt(Class124_Sub10.anInt1033);
			}
		}

		if (opc == 1003) {
			client.anInt2087 = var6;
			client.anInt2088 = var7;
			client.anInt2141 = 2;
			client.anInt2089 = 0;
			var21 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var3];
			if (var21 != null) {
				Def9 var13 = var21.aClass124_Sub22_Sub1_1941;
				if (null != var13.anIntArray1342)
					var13 = var13.method644();

				if (var13 != null) {
					client.secbuf.writeOpcode(178);
					client.secbuf.writeShortU(var13.anInt1318);
				}
			}
		}

		if (opc == 25) {
			var22 = RuntimeException_Sub1.method1010(var1, var0, 172659367);
			if (null != var22) {
				Class31.method180();
				final int var19 = Class124_Sub22_Sub19_Sub6.method963(var22);
				var9 = (var19 >> 11) & 63;
				final int var24 = var22.anInt1271;
				final Widget var18 = RuntimeException_Sub1.method1010(var1, var0, 172659367);
				if ((var18 != null) && (null != var18.anObjectArray1236)) {
					final CSD var20 = new CSD();
					var20.aClass124_Sub17_994 = var18;
					var20.anObjectArray995 = var18.anObjectArray1236;
					Class124_Sub22_Sub19_Sub3_Sub2.fullCS(var20);
				}

				client.anInt2082 = var24;
				client.aBool2137 = true;
				Class124_Sub10.anInt1033 = var1;
				client.anInt2138 = var0;
				Class9_Sub1.anInt922 = var9;
				Def10.settrue(var18);
				client.anInt2135 = 0;
				final int var15 = Class124_Sub22_Sub19_Sub6.method963(var22);
				var12 = (var15 >> 11) & 63;
				String var26;
				if (var12 == 0)
					var26 = null;
				else if ((null != var22.aString1230) && (var22.aString1230.trim().length() != 0))
					var26 = var22.aString1230;
				else
					var26 = null;

				client.aString1983 = var26;
				if (null == client.aString1983)
					client.aString1983 = "Null";

				if (var22.aBool1152)
					client.aString2035 = var22.aString1224 + Class124_Sub4_Sub3.method874(16777215);
				else
					client.aString2035 = Class124_Sub4_Sub3.method874('\uff00') + var22.aString1240
							+ Class124_Sub4_Sub3.method874(16777215);
			}

		} else {
			if (opc == 50) {
				var8 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var3];
				if (null != var8) {
					client.anInt2087 = var6;
					client.anInt2088 = var7;
					client.anInt2141 = 2;
					client.anInt2089 = 0;
					client.anInt2194 = var0;
					client.anInt2217 = var1;
					client.secbuf.writeOpcode(153);
					client.secbuf.writeShortA(var3);
					client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
				}
			}

			if (opc == 3) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(119);
				client.secbuf.writeAShort(var1 + Class95.anInt762);
				client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
				client.secbuf.writeShort(Class9.anInt102 + var0);
				client.secbuf.writeShortA((var3 >> 14) & 32767);
			}

			if (opc == 11) {
				var21 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var3];
				if (var21 != null) {
					client.anInt2087 = var6;
					client.anInt2088 = var7;
					client.anInt2141 = 2;
					client.anInt2089 = 0;
					client.anInt2194 = var0;
					client.anInt2217 = var1;
					client.secbuf.writeOpcode(82);
					client.secbuf.writeAShort(var3);
					client.secbuf.writeByteA(Class84.aBoolArray676[82] ? 1 : 0);
				}
			}

			if (opc == 2) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(99);
				client.secbuf.writeByteS(Class84.aBoolArray676[82] ? 1 : 0);
				client.secbuf.writeShortU(Class9.anInt102 + var0);
				client.secbuf.writeShortA((var3 >> 14) & 32767);
				client.secbuf.writeShortA(client.anInt2138);
				client.secbuf.writeIntV1(Class124_Sub10.anInt1033);
				client.secbuf.writeShortU(var1 + Class95.anInt762);
			}

			if (opc == 24) {
				var22 = Class10.getwidget(var1);
				boolean var23 = true;
				if (var22.anInt1157 > 0)
					var23 = Class7.method33(var22);

				if (var23) {
					client.secbuf.writeOpcode(125);
					client.secbuf.writeInt(var1);
				}
			}

			if (opc == 22) {
				client.anInt2087 = var6;
				client.anInt2088 = var7;
				client.anInt2141 = 2;
				client.anInt2089 = 0;
				client.anInt2194 = var0;
				client.anInt2217 = var1;
				client.secbuf.writeOpcode(97);
				client.secbuf.writeByteS(Class84.aBoolArray676[82] ? 1 : 0);
				client.secbuf.writeShortA(Class95.anInt762 + var1);
				client.secbuf.writeAShort(Class9.anInt102 + var0);
				client.secbuf.writeAShort(var3);
			}

			if (opc == 51) {
				var8 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var3];
				if (null != var8) {
					client.anInt2087 = var6;
					client.anInt2088 = var7;
					client.anInt2141 = 2;
					client.anInt2089 = 0;
					client.anInt2194 = var0;
					client.anInt2217 = var1;
					client.secbuf.writeOpcode(228);
					client.secbuf.writeByteS(Class84.aBoolArray676[82] ? 1 : 0);
					client.secbuf.writeAShort(var3);
				}
			}

			if (opc == 45) {
				var8 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var3];
				if (var8 != null) {
					client.anInt2087 = var6;
					client.anInt2088 = var7;
					client.anInt2141 = 2;
					client.anInt2089 = 0;
					client.anInt2194 = var0;
					client.anInt2217 = var1;
					client.secbuf.writeOpcode(105);
					client.secbuf.writeByteS(Class84.aBoolArray676[82] ? 1 : 0);
					client.secbuf.writeShortU(var3);
				}
			}

			if (opc == 13) {
				var21 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var3];
				if (var21 != null) {
					client.anInt2087 = var6;
					client.anInt2088 = var7;
					client.anInt2141 = 2;
					client.anInt2089 = 0;
					client.anInt2194 = var0;
					client.anInt2217 = var1;
					client.secbuf.writeOpcode(186);
					client.secbuf.writeByteA(Class84.aBoolArray676[82] ? 1 : 0);
					client.secbuf.writeShort(var3);
				}
			}

			if (opc == 35) {
				client.secbuf.writeOpcode(43);
				client.secbuf.writeShortU(var3);
				client.secbuf.writeInt2(var1);
				client.secbuf.writeAShort(var0);
				client.anInt2010 = 0;
				Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
				client.anInt2092 = var0;
			}

			if (opc == 26) {
				client.secbuf.writeOpcode(180);

				for (Class124_Sub7 var25 = (Class124_Sub7) client.aClass107_2143
						.method411(); null != var25; var25 = (Class124_Sub7) client.aClass107_2143.method413())
					if ((var25.anInt1008 == 0) || (var25.anInt1008 == 3))
						Def4.method760(var25, true);

				if (null != client.aClass124_Sub17_2042) {
					Def10.settrue(client.aClass124_Sub17_2042);
					client.aClass124_Sub17_2042 = null;
				}
			}

			if (opc == 58) {
				var22 = RuntimeException_Sub1.method1010(var1, var0, 172659367);
				if (var22 != null) {
					client.secbuf.writeOpcode(66);
					client.secbuf.writeShortA(client.anInt2138);
					client.secbuf.writeInt(Class124_Sub10.anInt1033);
					client.secbuf.writeShortA(var0);
					client.secbuf.writeAShort(client.anInt2082);
					client.secbuf.writeShortU(var22.anInt1271);
					client.secbuf.writeIntV1(var1);
				}
			}

			if (opc == 29) {
				client.secbuf.writeOpcode(125);
				client.secbuf.writeInt(var1);
				var22 = Class10.getwidget(var1);
				if ((var22.anIntArrayArray1278 != null) && (var22.anIntArrayArray1278[0][0] == 5)) {
					var9 = var22.anIntArrayArray1278[0][1];
					if (var22.anIntArray1241[0] != Class91.anIntArray711[var9]) {
						Class91.anIntArray711[var9] = var22.anIntArray1241[0];
						Class124_Sub11.method539(var9);
					}
				}
			}

			if (opc == 12) {
				var21 = client.aClass124_Sub22_Sub19_Sub3_Sub1Array2254[var3];
				if (null != var21) {
					client.anInt2087 = var6;
					client.anInt2088 = var7;
					client.anInt2141 = 2;
					client.anInt2089 = 0;
					client.anInt2194 = var0;
					client.anInt2217 = var1;
					client.secbuf.writeOpcode(236);
					client.secbuf.writeShortA(var3);
					client.secbuf.writeByteN(Class84.aBoolArray676[82] ? 1 : 0);
				}
			}

			if (opc == 38) {
				Class31.method180();
				var22 = Class10.getwidget(var1);
				client.anInt2135 = 1;
				Class87.anInt692 = var0;
				Class38.anInt398 = var1;
				Class124_Sub19.anInt1299 = var3;
				Def10.settrue(var22);
				client.aString2136 = Class124_Sub4_Sub3.method874(16748608)
						+ Def10.method724(var3).aString1472 + Class124_Sub4_Sub3.method874(16777215);
				if (client.aString2136 == null)
					client.aString2136 = "null";

			} else {
				if (opc == 23)
					Class36.aClass21_380.method127(Class134.anInt906, var0, var1);

				if (opc == 39) {
					client.secbuf.writeOpcode(77);
					client.secbuf.writeAShort(var0);
					client.secbuf.writeShortU(var3);
					client.secbuf.writeInt(var1);
					client.anInt2010 = 0;
					Class72.aClass124_Sub17_598 = Class10.getwidget(var1);
					client.anInt2092 = var0;
				}

				if (opc == 14) {
					var8 = client.aClass124_Sub22_Sub19_Sub3_Sub2Array2100[var3];
					if (var8 != null) {
						client.anInt2087 = var6;
						client.anInt2088 = var7;
						client.anInt2141 = 2;
						client.anInt2089 = 0;
						client.anInt2194 = var0;
						client.anInt2217 = var1;
						client.secbuf.writeOpcode(244);
						client.secbuf.writeAShort(Class87.anInt692);
						client.secbuf.writeByteA(Class84.aBoolArray676[82] ? 1 : 0);
						client.secbuf.writeShortA(Class124_Sub19.anInt1299);
						client.secbuf.writeInt(Class38.anInt398);
						client.secbuf.writeAShort(var3);
					}
				}

				if (client.anInt2135 != 0) {
					client.anInt2135 = 0;
					Def10.settrue(Class10.getwidget(Class38.anInt398));
				}

				if (client.aBool2137)
					Class31.method180();

				if ((Class72.aClass124_Sub17_598 != null) && (client.anInt2010 == 0))
					Def10.settrue(Class72.aClass124_Sub17_598);

			}
		}
	}

	public static void method268() {
		final Class84 var0 = Class84.aClass84_683;
		synchronized (var0) {
			++Class84.anInt685;
			Class84.anInt672 = Class84.anInt684;
			Class84.anInt681 = 0;
			int var1;
			if (Class84.anInt682 < 0) {
				for (var1 = 0; var1 < 112; ++var1)
					Class84.aBoolArray676[var1] = false;

				Class84.anInt682 = Class84.anInt675;
			} else
				while (Class84.anInt682 != Class84.anInt675) {
					var1 = Class84.anIntArray677[Class84.anInt675];
					Class84.anInt675 = (Class84.anInt675 + 1) & 127;
					if (var1 < 0)
						Class84.aBoolArray676[~var1] = false;
					else {
						if (!Class84.aBoolArray676[var1] && (Class84.anInt681 < (Class84.anIntArray687.length - 1)))
							Class84.anIntArray687[++Class84.anInt681 - 1] = var1;

						Class84.aBoolArray676[var1] = true;
					}
				}

			Class84.anInt684 = Class84.anInt680;
		}
	}
}
