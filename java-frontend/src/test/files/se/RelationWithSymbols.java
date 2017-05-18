class A {


  void f1(Object b) {
    Object a = null; // flow@f1 {{'a' is assigned null.}}
    if (a == b) { // flow@f1 {{Implies 'b' has the same value as 'a'.}}
      b.bar(); // Noncompliant [[flows=f1]] flow@f1 {{'b' is dereferenced.}}
    }
  }

  void f2(Object b) {
    Object a = null; // flow@f2 {{'a' is assigned null.}}
    if (a != b) { // flow@f2 {{Implies 'b' has the same value as 'a'.}}

    } else {
      b.bar(); // Noncompliant [[flows=f2]] flow@f2 {{'b' is dereferenced.}}
    }
  }


  void f3(Object b) {
    Object a = null; // flow@f3 {{'a' is assigned null.}}
    if (a != b) { // flow@f3 {{Implies 'b' is true.}} flow@f3 {{Implies 'b' doesn't have the same value as 'a'.}}
      if (b != null) { // Noncompliant [[flows=f3]] flow@f3 {{Expression is always true.}}

      }
    }
  }

  void f4(Object b) {
    Object a = null; // flow@f4 {{'a' is assigned null.}}
    if (a == b) { // flow@f4 {{Implies 'b' doesn't have the same value as 'a'.}}  flow@f4 {{Implies 'b' is true.}}

    } else {
      if (b != null) { // Noncompliant [[flows=f4]] flow@f4 {{Expression is always true.}}

      }
    }
  }

  void f5(Object a, Object b) {
    if (a == null) { // flow@f5 {{Implies 'a' can be null.}}
      if (b == a) { // flow@f5 {{Implies 'b' has the same value as 'a'.}}
        b.toString(); // Noncompliant [[flows=f5]] flow@f5 {{'b' is dereferenced.}}

      }
    }
  }


}
