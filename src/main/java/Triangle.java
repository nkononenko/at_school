
public class Triangle {
    //стороны треугольника
    public double a, b, c;//стороны треугольника

    public double P;//периметр
    public double S;//площадь

    //вычисляем периметр
    public double perimeter(double a, double b, double c) {
        P = a + b + c;
        return P;
    }

    //площадь по формуле Герона
    public double square(double a, double b, double c) {
        P = perimeter(a, b, c);
        S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
        return S;
    }


    //проверяем базовые условия треугольника
    public boolean is_ThisTriangle(double a, double b, double c) {
        if ((a > 0 && b > 0 && c > 0) && ((a + b) > c && (a + c) > b && (c + b) > a)) {
            return true;
        } else {
            return false;
        }
    }

    //проверяем равносторонний ли
    public boolean is_equilateral(double a, double b, double c) {
        if (a == b && b == c) {
            return true;
        } else {
            return false;
        }
    }

    //проверяем равнобедренность
    public boolean is_isosceles(double a, double b, double c) {
        if ((a == b && a != c) || (a == c && a != b) || (b == c && a != b)) {
            return true;
        } else {
            return false;
        }
    }

    //проверяем разносторонность
    public boolean is_scalene(double a, double b, double c) {
        if (a != b && a != c && b != c) {
            return true;
        } else {
            return false;
        }
    }

    //проверяем является ли прямоугольным
    public boolean is_rectangular(double a, double b, double c) {
        if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(b, 2)) ||
                Math.pow(b, 2) == (Math.pow(c, 2) + Math.pow(a, 2)) ||
                Math.pow(c, 2) == (Math.pow(b, 2) + Math.pow(a, 2))) {
            return true;
        } else {
            return false;
        }
    }
}



