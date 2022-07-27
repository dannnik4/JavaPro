package com.hillel.Homework07.Exceptions;

public class Task1 {
}

class App {
    public static void main(String[] args) throws Throwable {
    }
}

class App1 {
}

class App2 {
    public static void main(String[] args) {
        try {
        } catch (Throwable t) {
        }
    }
}

class App3 {
    public static void main(String[] args) {
    }
}

class App4 {
    public static void main(String[] args) {
        throw new Error();
    }
}

class App5 {
    public static void main(String[] args) {
    }
}

class App6 {
    public static void main(String[] args) {
        throw null;
    }
}

class App7 {
    public static void main(String[] args) {
        Error ref = new Error();
        throw ref;
    }
}

class App8 {
    public static void main(String[] args) {
        f(null);
    }

    public static void f(NullPointerException e) {
        try {
            throw e;
        } catch (NullPointerException npe) {
            f(npe);
        }
    }
}

class App9 {
    public static void main(String[] args) {
        System.out.println("sout");
        throw new Error();
    }
}

class App10 {
    public static void main(String[] args) {
        System.out.println("sout");
        throw new Error();
    }
}

class App11 {
    public double sqr(double arg) {
        return arg * arg;
    }
}


class App12 {
    public double sqr(double arg) {
        int k = 1;
        return k;
    }
}

class App13 {
    public double sqr(double arg) {
        int k = 1;
        return (double) k;
    }
}

class App14 {
}

class App15 {
}

class App16 {
}

class App17 {
    public static void main(String[] args) {
    }
}

class App18 {
    public static double sqr(double arg) {
        while (true) ;
    }
}

class App19 {
    public static void main(String[] args) {
        double d = sqr(10.0);
        System.out.println(d);
    }

    public static double sqr(double arg) {
        while (true) ;
    }
}

class App20 {
    public static double sqr(double arg) {
        if (System.currentTimeMillis() % 2 == 0) {
            return arg * arg;
        } else {
            while (true) ;
        }
    }
}

class App21 {
    public static double sqr(double arg) {
        throw new RuntimeException();
    }
}

class App22 {
    public static double sqr(double arg) {
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;
        } else if (time % 2 == 1) {
            while (true) ;
        } else {
            throw new RuntimeException();
        }
    }
}

class App23 {
    public static void main(String[] args) {
        double d = sqr(10.0);
        System.out.println(d);
    }

    public static double sqr(double arg) {
        throw new RuntimeException();
    }
}

class App24 {
    public static void main(String[] args) {
        int x = 42;
        int y = x * x;
        x = x * y;
    }
}


class App25 {
    public static void main(String[] args) {
        if (args.length > 2) {
        } else {
        }
    }


    class App26 {
        public static void main(String[] args) {
            int x = 1;
            do {
            } while (x++ < 10);
        }
    }

    class App27 {
        public static void main(String[] args) {
            System.err.println("#1.in");
            f();
            System.err.println("#1.out");
        }

        public static void f() {
            System.err.println(".   #2.in");
            g();
            System.err.println(".   #2.out");
        }

        public static void g() {
            System.err.println(".   .   #3.in");
            h();
            System.err.println(".   .   #3.out");
        }

        public static void h() {
            System.err.println(".   .   .   #4.in");
            if (true) {
                System.err.println(".   .   .   #4.RETURN");
                return;
            }
            System.err.println(".   .   .   #4.out");
        }
    }

    class App28 {
        public static void main(String[] args) {
            System.err.println("#1.in");
            f();
            System.err.println("#1.out");
        }

        public static void f() {
            System.err.println(".   #2.in");
            g();
            System.err.println(".   #2.out");
        }

        public static void g() {
            System.err.println(".   .   #3.in");
            h();
            System.err.println(".   .   #3.out");
        }

        public static void h() {
            System.err.println(".   .   .   #4.in");
            if (true) {
                System.err.println(".   .   .   #4.THROW");
                throw new Error();
            }
            System.err.println(".   .   .   #4.out");
        }
    }

    class App29 {
        public static void main(String[] args) {
            System.err.println("#1.in");
            try {
                f();
            } catch (Error e) {
                System.err.println("#1.CATCH");
            }
            System.err.println("#1.out");
        }

        public static void f() {
            System.err.println(".   #2.in");
            g();
            System.err.println(".   #2.out");
        }

        public static void g() {
            System.err.println(".   .   #3.in");
            h();
            System.err.println(".   .   #3.out");
        }

        public static void h() {
            System.err.println(".   .   .   #4.in");
            if (true) {
                System.err.println(".   .   .   #4.THROW");
                throw new Error();
            }
            System.err.println(".   .   .   #4.out");
        }
    }

    class App30 {
        public static void main(String[] args) {
            System.err.println("#1.in");
            f();
            System.err.println("#1.out");
        }

        public static void f() {
            System.err.println(".   #2.in");
            try {
                g();
            } catch (Error e) {
                System.err.println(".   #2.CATCH");
            }
            System.err.println(".   #2.out");
        }

        public static void g() {
            System.err.println(".   .   #3.in");
            h(); //
            System.err.println(".   .   #3.out");
        }

        public static void h() {
            System.err.println(".   .   .   #4.in");
            if (true) {
                System.err.println(".   .   .   #4.THROW");
                throw new Error();
            }
            System.err.println(".   .   .   #4.out");
        }
    }

    class App31 {
        public static void main(String[] args) {
            System.err.println("#1.in");
            f();
            System.err.println("#1.out");
        }

        public static void f() {
            System.err.println(".   #2.in");
            g();
            System.err.println(".   #2.out");
        }

        public static void g() {
            System.err.println(".   .   #3.in");
            try {
                h();
            } catch (Error e) {
                System.err.println(".   .   #3.CATCH");
            }
            System.err.println(".   .   #3.out");
        }

        public static void h() {
            System.err.println(".   .   .   #4.in");
            if (true) {
                System.err.println(".   .   .   #4.THROW");
                throw new Error();
            }
            System.err.println(".   .   .   #4.out");
        }
    }

    class App32 {
        public static void main(String[] args) {
            System.err.println(" 3");
        }
    }

    class App33 {
        public static void main(String[] args) {
        }
    }

    class App34 {
    }

    class App35 {
        public static void main(String[] args) {
            System.err.print(" 3");
        }
    }

    class App36 {
        public static void main(String[] args) {
            try {
                System.err.print(" 0");
                if (true) {
                    throw new RuntimeException();
                }
                System.err.print(" 1");
            } catch (RuntimeException e) {
                System.err.print(" 2");
                if (true) {
                    throw new Error();
                }
            }
            System.err.println(" 3");
        }
    }

    class App37 {
        public static void main(String[] args) {
            try {
                System.err.print(" 0");
                if (true) {
                    throw new RuntimeException();
                }
                System.err.print(" 1");
            } catch (RuntimeException e) {
                System.err.print(" 2");
                if (true) {
                    throw e;
                }
            }
            System.err.println(" 3");
        }
    }

    class App38 {
        public static void main(String[] args) {
            try {
                System.err.print(" 0");
                if (true) {
                    throw new RuntimeException();
                }
                System.err.print(" 1");
            } catch (RuntimeException e) {
                System.err.print(" 2");
                if (true) {
                    throw new Error();
                }
            } catch (Error e) {
                System.err.print(" 3");
            }
            System.err.println(" 4");
        }
    }

    class App39 {
        public static void main(String[] args) {
            try {
                System.err.print(" 0");
                if (true) {
                    throw new RuntimeException();
                }
                System.err.print(" 1");
            } catch (RuntimeException e) {
                System.err.print(" 2.1");
                try {
                    System.err.print(" 2.2");
                    if (true) {
                        throw new Error();
                    }
                    System.err.print(" 2.3");
                } catch (Throwable t) {
                    System.err.print(" 2.4");
                }
                System.err.print(" 2.5");
            } catch (Error e) {
                System.err.print(" 3");
            }
            System.err.println(" 4");
        }
    }

    class App40 {
        public static void main(String[] args) {
        }
    }

    class App41 {
        public static void main(String[] args) {
            try {
            } catch (Error e) {
            } catch (RuntimeException e) {
            }
        }
    }

    class App42 {
        public static void main(String[] args) {
            System.err.println("next statement");
        }
    }

    class App43 {
        public static void main(String[] args) {
            System.err.println("next statement");
        }
    }

    class App44 {
        public static void main(String[] args) {
            try {
                System.err.println("try");
            } finally {
                System.err.println("finally");
            }
        }
    }

    class App45 {
        public static void main(String[] args) {
            try {
                throw new RuntimeException();
            } finally {
                System.err.println("finally");
            }
        }
    }

    class App46 {
        public static void main(String[] args) {
            try {
                return;
            } finally {
                System.err.println("finally");
            }
        }
    }

    class App47 {
        public static void main(String[] args) {
            try {
                System.exit(42);
            } finally {
                System.err.println("finally");
            }
        }
    }

    class App48 {
        public static void main(String[] args) {
            try {
                Runtime.getRuntime().exit(42);
            } finally {
                System.err.println("finally");
            }
        }
    }

    class App49 {
        public static void main(String[] args) {
            try {
                Runtime.getRuntime().halt(42);
            } finally {
                System.err.println("finally");
            }
        }
    }

    class App50 {
        public static void main(String[] args) {
            try {
                System.err.println("try");
                if (true) {
                    throw new RuntimeException();
                }
            } finally {
                System.err.println("finally");
            }
            System.err.println("more");
        }
    }

    class App51 {
        public static void main(String[] args) {
            try {
                System.err.println("try");
                throw new RuntimeException();
            } finally {
                System.err.println("finally");
            }
        }
    }

    class App52 {
        public static void main(String[] args) {
            try {
                System.err.println("try");
                if (true) {
                    return;
                }
            } finally {
                System.err.println("finally");
            }
            System.err.println("more");
        }
    }

    class App53 {
        public static void main(String[] args) {
            System.err.println(f());
        }

        public static int f() {
            try {
                return 0;
            } finally {
                return 1;
            }
        }
    }

    class App54 {
        public static void main(String[] args) {
            System.err.println(f());
        }

        public static int f() {
            try {
                throw new RuntimeException();
            } finally {
                return 1;
            }
        }
    }

    class App55 {
        public static void main(String[] args) {
            System.err.println(f());
        }

        public static int f() {
            try {
                return 0;
            } finally {
                throw new RuntimeException();
            }
        }
    }

    class App56 {
        public static void main(String[] args) {
            System.err.println(f());
        }

        public static int f() {
            try {
                throw new Error();
            } finally {
                throw new RuntimeException();
            }
        }
    }

    class App57 {
    }

    class App58 {
        public static void main(String[] args) {
            try {
                System.err.print(" 0");
                // nothing
                System.err.print(" 1");
            } catch (Error e) {
                System.err.print(" 2");
            } finally {
                System.err.print(" 3");
            }
            System.err.print(" 4");
        }
    }

    class App59 {
        public static void main(String[] args) {
            try {
                System.err.print(" 0");
                if (true) {
                    throw new Error();
                }
                System.err.print(" 1");
            } catch (Error e) {
                System.err.print(" 2");
            } finally {
                System.err.print(" 3");
            }
            System.err.print(" 4");
        }
    }

    class App60 {
        public static void main(String[] args) {
            try {
                System.err.print(" 0");
                if (true) {
                    throw new RuntimeException();
                }
                System.err.print(" 1");
            } catch (Error e) {
                System.err.print(" 2");
            } finally {
                System.err.print(" 3");
            }
            System.err.print(" 4");
        }
    }

    class App61 {
        public static void main(String[] args) {
            if (args.length > 1) {
                if (args.length > 2) {
                    if (args.length > 3) {
                    }
                }
            }
        }
    }

    class App62 {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; i++) {
                    for (int k = 0; k < 10; k++) {
                    }
                }
            }
        }
    }

    class App63 {
    }

    class App64 {
    }

    class App65 {
        public static void main(String[] args) {
            System.err.print(" 8");
        }
    }

    class App66 {
        public static void main(String[] args) {
            System.err.print(" 8");
        }
    }

    class App67 {
        public static void main(String[] args) {
            System.err.print(" 8");
        }
    }

    class App68 {
        public static void main(String[] args) {
            System.err.print(" 8");
        }
    }
}