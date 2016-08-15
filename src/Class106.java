public class Class106 {
	Class121 aClass121_806;
	Class121 aClass121_807 = new Class121();

	public Class121 method406() {
		final Class121 var1 = aClass121_807.aClass121_853;
		if (var1 == aClass121_807) {
			aClass121_806 = null;
			return null;
		} else {
			aClass121_806 = var1.aClass121_853;
			return var1;
		}
	}

	public Class121 method407() {
		final Class121 var1 = aClass121_806;
		if (var1 == aClass121_807) {
			aClass121_806 = null;
			return null;
		} else {
			aClass121_806 = var1.aClass121_853;
			return var1;
		}
	}

	public void method408(final Class121 var1) {
		if (var1.aClass121_854 != null)
			var1.method447();

		var1.aClass121_854 = aClass121_807.aClass121_854;
		var1.aClass121_853 = aClass121_807;
		var1.aClass121_854.aClass121_853 = var1;
		var1.aClass121_853.aClass121_854 = var1;
	}

	public Class106() {
		aClass121_807.aClass121_853 = aClass121_807;
		aClass121_807.aClass121_854 = aClass121_807;
	}
}
