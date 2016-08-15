import java.util.Iterator;

public class Class110 implements Iterable {
	Class124 aClass124_815 = new Class124();

	public void method420(final Class124 var1) {
		if (var1.aClass124_876 != null)
			var1.method450();

		var1.aClass124_876 = aClass124_815.aClass124_876;
		var1.aClass124_875 = aClass124_815;
		var1.aClass124_876.aClass124_875 = var1;
		var1.aClass124_875.aClass124_876 = var1;
	}

	public Class124 method421() {
		return method422((Class124) null);
	}

	public Class110() {
		aClass124_815.aClass124_875 = aClass124_815;
		aClass124_815.aClass124_876 = aClass124_815;
	}

	@Override
	public Iterator iterator() {
		return new Class115(this);
	}

	Class124 method422(final Class124 var1) {
		Class124 var2;
		if (var1 == null)
			var2 = aClass124_815.aClass124_875;
		else
			var2 = var1;

		return var2 == aClass124_815 ? null : var2;
	}
}
