public class Widget extends Node {
	public Object[] anObjectArray1144;
	public static CacheArch aClass94_1145;
	public static CacheArch aClass94_1146;
	public Object[] anObjectArray1184;
	public Object[] anObjectArray1231;
	public Object[] anObjectArray1247;
	public Object[] anObjectArray1253;
	public Object[] anObjectArray1254;
	public Object[] anObjectArray1255;
	public Object[] anObjectArray1258;
	public Object[] anObjectArray1261;
	public Object[] anObjectArray1262;
	public Widget[] aClass124_Sub17Array1263;
	public static boolean[] widgetLoaded;
	public boolean aBool1152 = false;
	public int anInt1191;
	public int anInt1156 = 0;
	public int anInt1157 = 0;
	public int anInt1216 = 0;
	public int anInt1163 = 0;
	public int anInt1257 = 0;
	public int anInt1165 = 0;
	public int anInt1183 = 0;
	public int anInt1259 = -1;
	public int anInt1266 = -1;
	public int[] anIntArray1264;
	public int[] anIntArray1241;
	public int[][] anIntArrayArray1278;
	public int anInt1177 = 0;
	public boolean aBool1173 = false;
	public int[] anIntArray1269;
	public int[] anIntArray1270;
	public int anInt1190 = 0;
	public int anInt1214 = 0;
	public int anInt1215 = 0;
	public int anInt1213 = 0;
	public int anInt1155 = -1;
	public boolean aBool1218 = false;
	public int anInt1217 = 0;
	public int anInt1180 = 0;
	public int[] anIntArray1219;
	public int[] anIntArray1220;
	public int[] anIntArray1221;
	public String aString1185 = "";
	public String aString1212 = "";
	public int anInt1178 = 0;
	public boolean aBool1211 = false;
	public String[] aStringArray1172;
	public int anInt1179 = 0;
	public int anInt1242 = 0;
	public int anInt1181 = 0;
	public int anInt1186 = -1;
	public int anInt1187 = -1;
	public int anInt1229 = 1;
	public int anInt1197 = -1;
	int anInt1196 = 1;
	int anInt1265 = -1;
	public int anInt1222 = -1;
	public int anInt1199 = -1;
	public String aString1230 = "";
	public String aString1240 = "";
	public int anInt1205 = 100;
	public int anInt1202 = 0;
	public int anInt1203 = 0;
	public String aString1268 = "Ok";
	public int anInt1210 = 0;
	public int anInt1161 = 0;
	public int anInt1158 = 0;
	public int anInt1148 = 0;
	public int anInt1176 = 0;
	public int anInt1188 = 0;
	public boolean aBool1260 = false;
	public boolean aBool1189 = false;
	public int anInt1167 = 0;
	public int anInt1280 = 0;
	public int anInt1200 = 0;
	public int anInt1201 = 0;
	public int anInt1204 = 0;
	public boolean aBool1192;
	public int anInt1237 = 1;
	public String aString1224 = "";
	public boolean aBool1208 = false;
	public String[] aStringArray1225;
	public int anInt1227 = 0;
	public int anInt1228 = 0;
	public boolean aBool1193;
	public int anInt1206 = 0;
	public boolean aBool1182 = false;
	public boolean aBool1153 = false;
	public Object[] anObjectArray1232;
	public Object[] anObjectArray1226;
	public Object[] anObjectArray1160;
	public Object[] anObjectArray1243;
	public Object[] anObjectArray1236;
	public Object[] anObjectArray1244;
	public Object[] anObjectArray1246;
	public Object[] anObjectArray1248;
	public Object[] anObjectArray1250;
	public Object[] anObjectArray1198;
	public Object[] anObjectArray1238;
	public Object[] anObjectArray1233;
	public Object[] anObjectArray1234;
	public Object[] anObjectArray1235;
	public Object[] anObjectArray1194;
	public Object[] anObjectArray1256;
	public Object[] anObjectArray1159;
	public Object[] anObjectArray1252;
	public int[] anIntArray1281;
	public int[] anIntArray1282;
	public int[] anIntArray1249;
	public boolean aBool1195 = false;
	public static boolean aBool1151 = false;
	public static Class113 aClass113_1147 = new Class113(200);
	public static Class113 aClass113_1164 = new Class113(50);
	public static Class113 aClass113_1149 = new Class113(20);
	public static Class113 aClass113_1150 = new Class113(8);
	public int anInt1284 = -1;
	public int anInt1154 = -1;
	public int anInt1166 = 0;
	public int anInt1223 = 0;
	public int anInt1168 = 0;
	public int anInt1169 = 0;
	public int anInt1170 = 1;
	public int anInt1171 = 1;
	public int anInt1174 = 0;
	public int anInt1175 = 0;
	public int anInt1207 = 0;
	public int anInt1209 = 2;
	public Widget aClass124_Sub17_1251 = null;
	public int anInt1271 = -1;
	public int anInt1272 = 0;
	public int anInt1273 = 0;
	public int anInt1274 = 0;
	public boolean aBool1276 = false;
	public boolean aBool1277 = false;
	public int anInt1162 = -1;
	public int anInt1279 = 0;
	public int anInt1275 = 0;
	public int anInt1245 = 0;
	public int anInt1239 = -1;
	public int anInt1283 = -1;
	public boolean aBool1285 = false;

	void method620(final RSBuf var1) {
		aBool1152 = false;
		anInt1191 = var1.readByteU();
		anInt1156 = var1.readByteU();
		anInt1157 = var1.readShortU();
		anInt1216 = var1.readShort();
		anInt1163 = var1.readShort();
		anInt1257 = var1.readShortU();
		anInt1165 = var1.readShortU();
		anInt1183 = var1.readByteU();
		anInt1259 = var1.readShortU();
		if (anInt1259 == '\uffff')
			anInt1259 = -1;
		else
			anInt1259 += anInt1284 & -65536;

		anInt1266 = var1.readShortU();
		if (anInt1266 == '\uffff')
			anInt1266 = -1;

		final int var4 = var1.readByteU();
		int var5;
		if (var4 > 0) {
			anIntArray1264 = new int[var4];
			anIntArray1241 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				anIntArray1264[var5] = var1.readByteU();
				anIntArray1241[var5] = var1.readShortU();
			}
		}

		var5 = var1.readByteU();
		int var2;
		int var6;
		int var7;
		if (var5 > 0) {
			anIntArrayArray1278 = new int[var5][];

			for (var6 = 0; var6 < var5; ++var6) {
				var7 = var1.readShortU();
				anIntArrayArray1278[var6] = new int[var7];

				for (var2 = 0; var2 < var7; ++var2) {
					anIntArrayArray1278[var6][var2] = var1.readShortU();
					if (anIntArrayArray1278[var6][var2] == '\uffff')
						anIntArrayArray1278[var6][var2] = -1;
				}
			}
		}

		if (anInt1191 == 0) {
			anInt1177 = var1.readShortU();
			aBool1173 = var1.readByteU() == 1;
		}

		if (anInt1191 == 1) {
			var1.readShortU();
			var1.readByteU();
		}

		if (anInt1191 == 2) {
			anIntArray1269 = new int[anInt1257 * anInt1165];
			anIntArray1270 = new int[anInt1257 * anInt1165];
			var6 = var1.readByteU();
			if (var6 == 1)
				anInt1190 |= 268435456;

			var7 = var1.readByteU();
			if (var7 == 1)
				anInt1190 |= 1073741824;

			var2 = var1.readByteU();
			if (var2 == 1)
				anInt1190 |= Integer.MIN_VALUE;

			final int var8 = var1.readByteU();
			if (var8 == 1)
				anInt1190 |= 536870912;

			anInt1217 = var1.readByteU();
			anInt1180 = var1.readByteU();
			anIntArray1219 = new int[20];
			anIntArray1220 = new int[20];
			anIntArray1221 = new int[20];

			int var3;
			for (var3 = 0; var3 < 20; ++var3) {
				final int var9 = var1.readByteU();
				if (var9 == 1) {
					anIntArray1219[var3] = var1.readShort();
					anIntArray1220[var3] = var1.readShort();
					anIntArray1221[var3] = var1.readInt2(-373401819);
				} else
					anIntArray1221[var3] = -1;
			}

			aStringArray1172 = new String[5];

			for (var3 = 0; var3 < 5; ++var3) {
				final String var10 = var1.readStr2();
				if (var10.length() > 0) {
					aStringArray1172[var3] = var10;
					anInt1190 |= 1 << (23 + var3);
				}
			}
		}

		if (anInt1191 == 3)
			aBool1218 = var1.readByteU() == 1;

		if ((anInt1191 == 4) || (anInt1191 == 1)) {
			anInt1214 = var1.readByteU();
			anInt1215 = var1.readByteU();
			anInt1213 = var1.readByteU();
			anInt1155 = var1.readShortU();
			if (anInt1155 == '\uffff')
				anInt1155 = -1;

			aBool1211 = var1.readByteU() == 1;
		}

		if (anInt1191 == 4) {
			aString1185 = var1.readStr2();
			aString1212 = var1.readStr2();
		}

		if ((anInt1191 == 1) || (anInt1191 == 3) || (anInt1191 == 4))
			anInt1178 = var1.readInt2(1998904538);

		if ((anInt1191 == 3) || (anInt1191 == 4)) {
			anInt1179 = var1.readInt2(-445169034);
			anInt1242 = var1.readInt2(494585686);
			anInt1181 = var1.readInt2(-1316045891);
		}

		if (anInt1191 == 5) {
			anInt1186 = var1.readInt2(-1008048148);
			anInt1187 = var1.readInt2(-1002976715);
		}

		if (anInt1191 == 6) {
			anInt1229 = 1;
			anInt1197 = var1.readShortU();
			if (anInt1197 == '\uffff')
				anInt1197 = -1;

			anInt1196 = 1;
			anInt1265 = var1.readShortU();
			if (anInt1265 == '\uffff')
				anInt1265 = -1;

			anInt1222 = var1.readShortU();
			if (anInt1222 == '\uffff')
				anInt1222 = -1;

			anInt1199 = var1.readShortU();
			if (anInt1199 == '\uffff')
				anInt1199 = -1;

			anInt1205 = var1.readShortU();
			anInt1202 = var1.readShortU();
			anInt1203 = var1.readShortU();
		}

		if (anInt1191 == 7) {
			anIntArray1269 = new int[anInt1165 * anInt1257];
			anIntArray1270 = new int[anInt1165 * anInt1257];
			anInt1214 = var1.readByteU();
			anInt1155 = var1.readShortU();
			if (anInt1155 == '\uffff')
				anInt1155 = -1;

			aBool1211 = var1.readByteU() == 1;
			anInt1178 = var1.readInt2(1311246097);
			anInt1217 = var1.readShort();
			anInt1180 = var1.readShort();
			var6 = var1.readByteU();
			if (var6 == 1)
				anInt1190 |= 1073741824;

			aStringArray1172 = new String[5];

			for (var7 = 0; var7 < 5; ++var7) {
				final String var11 = var1.readStr2();
				if (var11.length() > 0) {
					aStringArray1172[var7] = var11;
					anInt1190 |= 1 << (var7 + 23);
				}
			}
		}

		if (anInt1191 == 8)
			aString1185 = var1.readStr2();

		if ((anInt1156 == 2) || (anInt1191 == 2)) {
			aString1230 = var1.readStr2();
			aString1240 = var1.readStr2();
			var6 = var1.readShortU() & 63;
			anInt1190 |= var6 << 11;
		}

		if ((anInt1156 == 1) || (anInt1156 == 4) || (anInt1156 == 5) || (anInt1156 == 6)) {
			aString1268 = var1.readStr2();
			if (aString1268.length() == 0) {
				if (anInt1156 == 1)
					aString1268 = "Ok";

				if (anInt1156 == 4)
					aString1268 = "Select";

				if (anInt1156 == 5)
					aString1268 = "Select";

				if (anInt1156 == 6)
					aString1268 = "Continue";
			}
		}

		if ((anInt1156 == 1) || (anInt1156 == 4) || (anInt1156 == 5))
			anInt1190 |= 4194304;

		if (anInt1156 == 6)
			anInt1190 |= 1;

	}

	void method621(final RSBuf var1) {
		var1.readByteU();
		aBool1152 = true;
		anInt1191 = var1.readByteU();
		anInt1157 = var1.readShortU();
		anInt1216 = var1.readShort();
		anInt1163 = var1.readShort();
		anInt1257 = var1.readShortU();
		if (anInt1191 == 9)
			anInt1165 = var1.readShort();
		else
			anInt1165 = var1.readShortU();

		anInt1210 = var1.readByte();
		anInt1161 = var1.readByte();
		anInt1158 = var1.readByte();
		anInt1148 = var1.readByte();
		anInt1259 = var1.readShortU();
		if (anInt1259 == '\uffff')
			anInt1259 = -1;
		else
			anInt1259 += anInt1284 & -65536;

		aBool1173 = var1.readByteU() == 1;
		if (anInt1191 == 0) {
			anInt1176 = var1.readShortU();
			anInt1177 = var1.readShortU();
			aBool1260 = var1.readByteU() == 1;
		}

		if (anInt1191 == 5) {
			anInt1186 = var1.readInt2(652651391);
			anInt1188 = var1.readShortU();
			aBool1189 = var1.readByteU() == 1;
			anInt1183 = var1.readByteU();
			anInt1167 = var1.readByteU();
			anInt1280 = var1.readInt2(-72929628);
			aBool1192 = var1.readByteU() == 1;
			aBool1193 = var1.readByteU() == 1;
		}

		if (anInt1191 == 6) {
			anInt1229 = 1;
			anInt1197 = var1.readShortU();
			if (anInt1197 == '\uffff')
				anInt1197 = -1;

			anInt1200 = var1.readShort();
			anInt1201 = var1.readShort();
			anInt1202 = var1.readShortU();
			anInt1203 = var1.readShortU();
			anInt1204 = var1.readShortU();
			anInt1205 = var1.readShortU();
			anInt1222 = var1.readShortU();
			if (anInt1222 == '\uffff')
				anInt1222 = -1;

			aBool1208 = var1.readByteU() == 1;
			var1.readShortU();
			if (anInt1210 != 0)
				anInt1206 = var1.readShortU();

			if (anInt1161 != 0)
				var1.readShortU();
		}

		if (anInt1191 == 4) {
			anInt1155 = var1.readShortU();
			if (anInt1155 == '\uffff')
				anInt1155 = -1;

			aString1185 = var1.readStr2();
			anInt1213 = var1.readByteU();
			anInt1214 = var1.readByteU();
			anInt1215 = var1.readByteU();
			aBool1211 = var1.readByteU() == 1;
			anInt1178 = var1.readInt2(703575280);
		}

		if (anInt1191 == 3) {
			anInt1178 = var1.readInt2(110244804);
			aBool1218 = var1.readByteU() == 1;
			anInt1183 = var1.readByteU();
		}

		if (anInt1191 == 9) {
			anInt1237 = var1.readByteU();
			anInt1178 = var1.readInt2(829487585);
			aBool1182 = var1.readByteU() == 1;
		}

		anInt1190 = var1.readTri();
		aString1224 = var1.readStr2();
		final int var2 = var1.readByteU();
		if (var2 > 0) {
			aStringArray1225 = new String[var2];

			for (int var3 = 0; var3 < var2; ++var3)
				aStringArray1225[var3] = var1.readStr2();
		}

		anInt1227 = var1.readByteU();
		anInt1228 = var1.readByteU();
		aBool1153 = var1.readByteU() == 1;
		aString1230 = var1.readStr2();
		anObjectArray1232 = method622(var1);
		anObjectArray1226 = method622(var1);
		anObjectArray1160 = method622(var1);
		anObjectArray1243 = method622(var1);
		anObjectArray1236 = method622(var1);
		anObjectArray1244 = method622(var1);
		anObjectArray1246 = method622(var1);
		anObjectArray1248 = method622(var1);
		anObjectArray1250 = method622(var1);
		anObjectArray1198 = method622(var1);
		anObjectArray1238 = method622(var1);
		anObjectArray1233 = method622(var1);
		anObjectArray1234 = method622(var1);
		anObjectArray1235 = method622(var1);
		anObjectArray1194 = method622(var1);
		anObjectArray1256 = method622(var1);
		anObjectArray1159 = method622(var1);
		anObjectArray1252 = method622(var1);
		anIntArray1281 = method623(var1);
		anIntArray1282 = method623(var1);
		anIntArray1249 = method623(var1);
	}

	Object[] method622(final RSBuf var1) {
		final int var2 = var1.readByteU();
		if (var2 == 0)
			return null;
		else {
			final Object[] var4 = new Object[var2];

			for (int var5 = 0; var5 < var2; ++var5) {
				final int var3 = var1.readByteU();
				if (var3 == 0)
					var4[var5] = new Integer(var1.readInt2(1847496091));
				else if (var3 == 1)
					var4[var5] = var1.readStr2();
			}

			aBool1195 = true;
			return var4;
		}
	}

	int[] method623(final RSBuf var1) {
		final int var2 = var1.readByteU();
		if (var2 == 0)
			return null;
		else {
			final int[] var3 = new int[var2];

			for (int var4 = 0; var4 < var2; ++var4)
				var3[var4] = var1.readInt2(-884078844);

			return var3;
		}
	}

	public void method624(final int var1, final int var2) {
		int var3 = anIntArray1269[var2];
		anIntArray1269[var2] = anIntArray1269[var1];
		anIntArray1269[var1] = var3;
		var3 = anIntArray1270[var2];
		anIntArray1270[var2] = anIntArray1270[var1];
		anIntArray1270[var1] = var3;
	}

	public Class124_Sub22_Sub16_Sub1 method625(final boolean var1) {
		aBool1151 = false;
		int var5;
		if (var1)
			var5 = anInt1187;
		else
			var5 = anInt1186;

		if (var5 == -1)
			return null;
		else {
			final long var3 = ((aBool1193 ? 1L : 0L) << 39) + var5 + ((long) anInt1167 << 36)
					+ ((aBool1192 ? 1L : 0L) << 38) + ((long) anInt1280 << 40);
			Class124_Sub22_Sub16_Sub1 var2 = (Class124_Sub22_Sub16_Sub1) aClass113_1147.forId(var3);
			if (null != var2)
				return var2;
			else {
				var2 = Class124_Sub22_Sub19_Sub6.method962(aClass94_1146, var5, 0);
				if (var2 == null) {
					aBool1151 = true;
					return null;
				} else {
					if (aBool1192)
						var2.method905();

					if (aBool1193)
						var2.method904();

					if (anInt1167 > 0)
						var2.method898(anInt1167);

					if (anInt1167 >= 1)
						var2.method924(1);

					if (anInt1167 >= 2)
						var2.method924(16777215);

					if (anInt1280 != 0)
						var2.method906(anInt1280);

					aClass113_1147.map(var2, var3);
					return var2;
				}
			}
		}
	}

	public Class124_Sub22_Sub16_Sub1 method626(final int var1) {
		aBool1151 = false;
		if ((var1 >= 0) && (var1 < anIntArray1221.length)) {
			final int var3 = anIntArray1221[var1];
			if (var3 == -1)
				return null;
			else {
				Class124_Sub22_Sub16_Sub1 var2 = (Class124_Sub22_Sub16_Sub1) aClass113_1147.forId(var3);
				if (null != var2)
					return var2;
				else {
					var2 = Class124_Sub22_Sub19_Sub6.method962(aClass94_1146, var3, 0);
					if (null != var2)
						aClass113_1147.map(var2, var3);
					else
						aBool1151 = true;

					return var2;
				}
			}
		} else
			return null;
	}

	public Class124_Sub22_Sub19_Sub7 method627(final Def12 var1, final int var2, final boolean var3,
			final Class100 var4) {
		aBool1151 = false;
		int var6;
		int var7;
		if (var3) {
			var6 = anInt1196;
			var7 = anInt1265;
		} else {
			var6 = anInt1229;
			var7 = anInt1197;
		}

		if (var6 == 0)
			return null;
		else if ((var6 == 1) && (var7 == -1))
			return null;
		else {
			Class124_Sub22_Sub19_Sub7 var8 = (Class124_Sub22_Sub19_Sub7) aClass113_1164.forId(var7 + (var6 << 16));
			if (null == var8) {
				Model var5;
				if (var6 == 1) {
					var5 = Model.method943(Class124_Sub7.aClass94_1014, var7, 0);
					if (null == var5) {
						aBool1151 = true;
						return null;
					}

					var8 = var5.method945(64, 768, -50, -10, -50);
				}

				if (var6 == 2) {
					var5 = Class34.method188(var7, 1475058221).method641();
					if (null == var5) {
						aBool1151 = true;
						return null;
					}

					var8 = var5.method945(64, 768, -50, -10, -50);
				}

				if (var6 == 3) {
					if (null == var4)
						return null;

					var5 = var4.method400();
					if (null == var5) {
						aBool1151 = true;
						return null;
					}

					var8 = var5.method945(64, 768, -50, -10, -50);
				}

				if (var6 == 4) {
					final Class124_Sub22_Sub10 var9 = Class124_Sub22_Sub10.method724(var7);
					var5 = var9.method715(10);
					if (null == var5) {
						aBool1151 = true;
						return null;
					}

					var8 = var5.method945(var9.anInt1499 + 64, 768 + var9.anInt1496, -50, -10, -50);
				}

				aClass113_1164.map(var8, var7 + (var6 << 16));
			}

			if (null != var1)
				var8 = var1.method744(var8, var2);

			return var8;
		}
	}

	public void method628(final int var1, final String var2) {
		if ((aStringArray1225 == null) || (aStringArray1225.length <= var1)) {
			final String[] var4 = new String[var1 + 1];
			if (aStringArray1225 != null)
				for (int var3 = 0; var3 < aStringArray1225.length; ++var3)
					var4[var3] = aStringArray1225[var3];

			aStringArray1225 = var4;
		}

		aStringArray1225[var1] = var2;
	}

	public Class124_Sub22_Sub20 method629(boolean var1) {
		if (anInt1187 == -1)
			var1 = false;

		final int var2 = var1 ? anInt1187 : anInt1186;
		if (var2 == -1)
			return null;
		else {
			final long var8 = ((long) anInt1280 << 40) + ((aBool1193 ? 1L : 0L) << 39) + ((aBool1192 ? 1L : 0L) << 38)
					+ ((long) anInt1167 << 36) + var2;
			Class124_Sub22_Sub20 var7 = (Class124_Sub22_Sub20) aClass113_1150.forId(var8);
			if (var7 != null)
				return var7;
			else {
				final Class124_Sub22_Sub16_Sub1 var10 = method625(var1);
				if (null == var10)
					return null;
				else {
					final Class124_Sub22_Sub16_Sub1 var4 = var10.method923();
					final int[] var6 = new int[var4.anInt1730];
					final int[] var5 = new int[var4.anInt1730];

					for (int var11 = 0; var11 < var4.anInt1730; ++var11) {
						int var13 = 0;
						int var12 = var4.anInt1729;

						int var3;
						for (var3 = 0; var3 < var4.anInt1729; ++var3)
							if (var4.anIntArray1735[(var4.anInt1729 * var11) + var3] == 0) {
								var13 = var3;
								break;
							}

						for (var3 = var4.anInt1729 - 1; var3 >= var13; --var3)
							if (var4.anIntArray1735[(var4.anInt1729 * var11) + var3] == 0) {
								var12 = var3 + 1;
								break;
							}

						var6[var11] = var13;
						var5[var11] = var12 - var13;
					}

					var7 = new Class124_Sub22_Sub20(var4.anInt1729, var4.anInt1730, var5, var6, var2);
					aClass113_1150.map(var7, var8);
					return var7;
				}
			}
		}
	}

	static void method630() {
		for (Class124_Sub7 var0 = (Class124_Sub7) client.aClass107_2143
				.method411(); var0 != null; var0 = (Class124_Sub7) client.aClass107_2143.method413()) {
			final int var3 = var0.anInt1012;
			if (Class89.loadwidget(var3)) {
				boolean var4 = true;
				final Widget[] var1 = Class124_Sub22_Sub10.widgets[var3];

				int var2;
				for (var2 = 0; var2 < var1.length; ++var2)
					if (var1[var2] != null) {
						var4 = var1[var2].aBool1152;
						break;
					}

				if (!var4) {
					var2 = (int) var0.aLong874;
					final Widget var5 = Class10.method55(var2);
					if (null != var5)
						Class124_Sub22_Sub10.method723(var5);
				}
			}
		}

	}

	public Somet1 method631() {
		aBool1151 = false;
		if (anInt1155 == -1)
			return null;
		else {
			final Somet1 var3 = (Somet1) aClass113_1149
					.forId(anInt1155);
			if (null != var3)
				return var3;
			else {
				final CacheArch var1 = aClass94_1146;
				final CacheArch var4 = Class69.aClass94_581;
				final int var2 = anInt1155;
				Somet1 var5;
				if (!Def3.loaded(var1, var2, 0))
					var5 = null;
				else
					var5 = Def5.method707(var4.decode(var2, 0));

				aBool1151 = true;
				return var5;
			}
		}
	}
}
