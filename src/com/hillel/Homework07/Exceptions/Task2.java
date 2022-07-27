package com.hillel.Homework07.Exceptions;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
}
class App69 {
    public static void main(String[] args) {
    }
}

class App70 {
    public static void main(String[] args) throws IOException {
    }
}

class App71 {
    public static void main(String[] args) throws Exception {
        throw new Exception();
    }
}

class App72 {
    public static void main(String[] args) throws Throwable {
        throw new Exception();
    }
}

class App73 {
    public static void main(String[] args) throws Exception {
    }
}

class App74 {
    public static void main(String[] args) {
    }

    public static void f() throws Exception {
    }
}

class App75 {
    public static void main(String[] args) throws Throwable {
        f();
    }

    public static void f() throws Exception {
    }
}

class App76 {
    public static void main(String[] args) {
        f();
    }

    public static void f() throws RuntimeException {
    }
}

class App77 {
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}

class App78 {
    public static void main(String[] args) throws EOFException, FileNotFoundException {
        f0();
        f1();
    }

    public static void f0() throws EOFException {
    }

    public static void f1() throws FileNotFoundException {
    }
}

class App79 {
    public static void main(String[] args) throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {
            throw new EOFException();
        } else {
            throw new FileNotFoundException();
        }
    }
}

class App80 {
    public static void main(String[] args) throws IOException {
        f0();
        f1();
    }

    public static void f0() throws EOFException {
    }

    public static void f1() throws FileNotFoundException {
    }
}

class App81 {
    public static void main(String[] args) throws IOException, InterruptedException {
        f0();
        f1();
        f2();
    }

    public static void f0() throws EOFException {
    }

    public static void f1() throws FileNotFoundException {
    }

    public static void f2() throws InterruptedException {
    }
}

class App82 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
        }
    }
}

class App83 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Throwable e) {
        }
    }
}

class App84 {
    public static void main(String[] args) {
        try {
        } catch (Exception e) {
        }
    }
}

class App85 {
    public static void main(String[] args) {
        try {
        } catch (Error e) {
        }
    }
}

class App86 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new EOFException();
            } else {
                throw new FileNotFoundException();
            }
        } catch (EOFException e) {
        }
    }
}

class App87 {
    // пугаем Exception
    public static void main(String[] args) throws Exception {
        Throwable t = new Exception();
    }
}

class App88 {
    public static void main(String[] args) throws Exception {
        Object ref = "Hello!";
    }
}

class App89 {
    public static void f0(Throwable t) throws Exception {
    }

    public static void f1(Object ref) {
    }
}

class App90 {
    public static void main(String[] args) throws Exception {
        try {
            Throwable t = new Exception();
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }
}

class App91 {
    public static void main(String[] args) throws Throwable {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }
}

class Parent92 {
    public void f() throws IOException, InterruptedException {
    }
}

class Child extends Parent92 {
    @Override
    public void f() throws FileNotFoundException {
    }
}

class Parent93 {
    public void f() throws IOException, InterruptedException {
    }
}

class ChildB extends Parent93 {
}

class Parent94 {
    public void f() throws Exception {
    }
}

class Demo {
    public static void test(Parent94 ref) {
        try {
            ref.f();
        } catch (Exception e) {
        }
    }
}

class App95 {
    public static void main(String[] args) {
    }
}