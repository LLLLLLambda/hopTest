package src;

public class Geometrie {

    public static Boolean isCarre(int a, int b) {
        boolean _isCarre = false;

        if (a > 0 && b > 0) {
            _isCarre = a == b;
        }

        return _isCarre;
    }

    public static float aireCarre(float a, float b) {
        float aire = 0;

        if (a > 0 && b > 0) {
            aire = a * b;
        }

        return aire;
    }

    public static float aireTriangle(float base, float hauteur) {
        float aire = 0;

        if (base > 0 && hauteur > 0) {
            aire = (base * hauteur) / 2;
        }

        return aire;
    }

    public static Boolean isIsocele(int ab, int bc, int ca) {
        boolean _isIsocele = false;

        if (ab > 0 && bc > 0 && ca > 0) {
            _isIsocele = ab == bc || bc == ca || ab == ca;
        }

        return _isIsocele;
    }

    public static Boolean isEquilateral(int ab, int bc, int ca) {
        boolean _isEquilateral = false;

        if (ab > 0 && bc > 0 && ca > 0) {
            _isEquilateral = ab == bc && ab == ca;
        }

        return _isEquilateral;
    }

    public static Boolean isRectangle(int ab, int bc, int ca) {
        boolean _isRectangle = false;

        if (ab > 0 && bc > 0 && ca > 0) {
            _isRectangle = (ab * ab == (bc * bc) + (ca * ca)) ||
                    (bc * bc == (ab * ab) + (ca * ca)) ||
                    (ca * ca == (ab * ab) + (bc * bc));
        }

        return _isRectangle;
    }
}
